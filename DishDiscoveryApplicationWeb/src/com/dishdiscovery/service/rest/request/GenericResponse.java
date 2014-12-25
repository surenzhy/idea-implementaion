package com.dishdiscovery.service.rest.request;

import com.dishdiscovery.service.rest.util.ServiceResponseStatus;

public class GenericResponse {

	public GenericResponse() {
		serviceResult = ServiceResponseStatus.SUCCESS;
	}

	private ServiceResponseStatus serviceResult;

	public ServiceResponseStatus getServiceResult() {
		return serviceResult;
	}

	public void setServiceResult(ServiceResponseStatus serviceResult) {
		this.serviceResult = serviceResult;
	}

}
