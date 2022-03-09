package com.fersoft.peopledatalabs.exceptions;

import jakarta.ws.rs.core.Response;

public class ServiceException extends Exception {
    private final int status;

    public ServiceException(Response response) {
        super(response.readEntity(String.class));
        this.status = response.getStatus();
    }

    public int getStatus() {
        return status;
    }
}
