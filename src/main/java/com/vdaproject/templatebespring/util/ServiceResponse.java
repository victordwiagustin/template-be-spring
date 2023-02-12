package com.vdaproject.templatebespring.util;

import com.vdaproject.templatebespring.enums.ServiceResponseStatusEnum;
import lombok.Getter;
import lombok.Setter;

public class ServiceResponse<T> {
    @Getter
    @Setter
    private T payload;
    @Getter
    @Setter
    private ServiceResponseStatusEnum status;

    public ServiceResponse(T payload, ServiceResponseStatusEnum status) {
        this.payload = payload;
        this.status = status;
    }

    public ServiceResponse(ServiceResponseStatusEnum status) {
        this.status = status;
    }
}
