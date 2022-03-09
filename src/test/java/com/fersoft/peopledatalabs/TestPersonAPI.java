package com.fersoft.peopledatalabs;


import com.fersoft.peopledatalabs.enrichment.BulkRequest;
import com.fersoft.peopledatalabs.enrichment.EnrichmentParams;
import com.fersoft.peopledatalabs.enrichment.EnrichmentResponse;
import com.fersoft.peopledatalabs.enrichment.Params;
import com.fersoft.peopledatalabs.exceptions.ServiceException;
import com.fersoft.peopledatalabs.person.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class TestPersonAPI {
    private static final String BASE_PATH = "https://api.peopledatalabs.com";
    private static final String VERSION = "v5";
    private static final String API_KEY = "YOUR API KEY HERE";
    private PDLClient pdlClient;

    @BeforeEach
    public void setUp() {
        pdlClient = new PDLClient(BASE_PATH, VERSION, API_KEY);
    }

    @Test
    public void testEnrich() throws ServiceException {

        EnrichmentParams enrichmentParams = new EnrichmentParams();
        enrichmentParams.setEmail(Collections.singletonList("sean@peopledatalabs.com"));
        Person person = pdlClient.person();
        EnrichmentResponse response = person.enrich(enrichmentParams);
        assertThat(response.getData().getFirstName(), is(equalTo("sean")));
    }

    @Test
    public void testBulk() throws ServiceException {
        //Add first search parameter
        List<Params> paramsList = new ArrayList<>();
        EnrichmentParams enrichmentParam = new EnrichmentParams();
        enrichmentParam.setEmail(Collections.singletonList("sean@peopledatalabs.com"));
        Params params = new Params();
        params.setParams(enrichmentParam);
        paramsList.add(params);

        //Add second search parameter with meta-data
        enrichmentParam = new EnrichmentParams();
        enrichmentParam.setProfile(Collections.singletonList("https://www.linkedin.com/in/haydenconrad/"));
        Map<String, Object> metaData = new HashMap<>();
        metaData.put("user_id", "1234");
        params = new Params();
        params.setParams(enrichmentParam);
        params.setMetadata(metaData);
        paramsList.add(params);

        BulkRequest bulkRequest = new BulkRequest();
        bulkRequest.setRequests(paramsList);

        Person person = pdlClient.person();
        List<EnrichmentResponse> response = person.bulk(bulkRequest);

        assertThat(response.get(0).getData().getFullName(), is(equalTo("sean thorne")));
        assertThat(response.get(1).getData().getFullName(), is(equalTo("hayden conrad")));
        assertThat(response.get(1).getMetadata().get("user_id"), is(equalTo("1234")));
    }

}
