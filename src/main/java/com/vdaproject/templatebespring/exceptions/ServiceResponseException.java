package com.vdaproject.templatebespring.exceptions;

import com.vdaproject.templatebespring.util.ServiceResponse;
import lombok.Getter;

public class ServiceResponseException extends Exception {
    @Getter
    private ServiceResponse<?> serviceResponse;

    public ServiceResponseException(String message) {
        super(message);
    }

    public ServiceResponseException(ServiceResponse<?> serviceResponse) {
        this.serviceResponse = serviceResponse;
    }
}
