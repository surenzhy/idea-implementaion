package com.dishdiscovery.service.rest.validators;

import java.util.Map;

import com.dishdiscovery.service.rest.util.ErrorCodes;

public interface IRequestValidator<T> {

	public Map<ErrorCodes, String> validateRequest(T request);
}
