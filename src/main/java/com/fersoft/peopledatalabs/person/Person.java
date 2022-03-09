package com.fersoft.peopledatalabs.person;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fersoft.peopledatalabs.enrichment.BulkRequest;
import com.fersoft.peopledatalabs.enrichment.EnrichmentParams;
import com.fersoft.peopledatalabs.enrichment.EnrichmentResponse;
import com.fersoft.peopledatalabs.exceptions.ServiceException;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/**
 *
 * <b>Person API</b>
*
 * @link https://docs.peopledatalabs.com/docs/enrichment-api
 */
public class Person {
    private static final String AUTH_HEADER = "X-Api-Key";
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private final WebTarget webTarget;
    private final String apiKey;
    private Logger logger = Logger.getLogger(Person.class.getName());

    public Person(WebTarget webTarget, String apiKey) {
        this.webTarget = webTarget.path("person");
        this.apiKey = apiKey;
    }

    /**
     *   The person enrichment API provides a one to one match, providing up to date information on a unique individual.
     *   The endpoint for the person enrichment api is https://api.peopledatalabs.com/v5/person/enrich.
     *   When an API request is executed, the queried data points are preprocessed and built into a query,
     *   which is then executed against our api dataset. If the query yields 1 or more matching persons from the dataset,
     *   the person returned in the API response is the one who is most likely to be the same person as the person
     *   requested and it will return a 200 HTTP response code. If we do not find a match we will return a 404 HTTP
     *   response code.
     *
     * @param enrichmentParams query params
     * @return person matched
     * @throws ServiceException in case of error
     * @link https://docs.peopledatalabs.com/docs/enrichment-api
     */
    public EnrichmentResponse enrich(EnrichmentParams enrichmentParams) throws ServiceException {
        WebTarget callTarget = prepareQueryTarget(enrichmentParams);
        Invocation.Builder invocationBuilder = callTarget.request(MediaType.APPLICATION_JSON).header(AUTH_HEADER, apiKey);
        Response response = invocationBuilder.buildGet().invoke();
        checkResponse(response);
        return response.readEntity(EnrichmentResponse.class);
    }

    private WebTarget prepareQueryTarget(EnrichmentParams enrichmentParams) {
        WebTarget callTarget = webTarget.path("enrich");
        Map<String, Object> map = objectMapper.convertValue(enrichmentParams, new TypeReference<>() {
        });
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getValue() instanceof List) {
                for (Object val : (List) entry.getValue()) {
                    callTarget = callTarget.queryParam(entry.getKey(), val.toString());
                }
            } else if (entry.getValue() != null) {
                callTarget.queryParam(entry.getKey(), entry.getValue().toString());
            }
        }
        return callTarget;
    }

    private void checkResponse(Response response) throws ServiceException {
        if (response.getStatusInfo().getFamily() != Response.Status.Family.SUCCESSFUL) {
            throw new ServiceException(response);
        }
    }

    /**
     * <b>Bulk Person Enrichment API</b>
     * The endpoint for the bulk enrichment api is /v5/person/bulk
     *
     * @param bulkRequest
     * @return matched person list
     * @throws ServiceException
     * @link https://docs.peopledatalabs.com/docs/bulk-enrichment-api
     */
    public List<EnrichmentResponse> bulk(BulkRequest bulkRequest) throws ServiceException {
        Response bulkResponse = webTarget.path("bulk").request(MediaType.APPLICATION_JSON).header(AUTH_HEADER, apiKey).post(Entity.entity(bulkRequest, MediaType.APPLICATION_JSON));
        checkResponse(bulkResponse);
        return bulkResponse.readEntity(new GenericType<>() {
        });
    }
}
