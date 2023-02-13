package com.vdaproject.templatebespring.exceptions;

import com.vdaproject.templatebespring.enums.ServiceResponseStatus;
import lombok.Getter;

public class ServiceResponseException extends Exception {
    @Getter
    private ServiceResponseStatus serviceResponseStatus;

    public ServiceResponseException(String message) {
        super(message);
    }

    public ServiceResponseException(ServiceResponseStatus serviceResponseStatus) {
        this.serviceResponseStatus = serviceResponseStatus;
    }
}
