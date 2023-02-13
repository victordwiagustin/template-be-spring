package com.vdaproject.templatebespring.util;

import com.vdaproject.templatebespring.enums.ServiceResponseStatus;
import lombok.Getter;
import lombok.Setter;

public class ServiceResponse<T> {
    @Getter
    @Setter
    private T payload;
    @Getter
    @Setter
    private ServiceResponseStatus status;

    public ServiceResponse(T payload, ServiceResponseStatus status) {
        this.payload = payload;
        this.status = status;
    }

    public ServiceResponse(ServiceResponseStatus status) {
        this.status = status;
    }
}
