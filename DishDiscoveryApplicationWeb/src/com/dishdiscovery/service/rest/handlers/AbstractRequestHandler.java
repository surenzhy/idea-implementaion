package com.dishdiscovery.service.rest.handlers;

import java.util.Map;

import com.dishdiscovery.service.rest.util.ErrorCodes;

public abstract class AbstractRequestHandler<T, V> implements Handler<T, V> {

	@Override
	public V execute(T request) {
		if (isValidRequest(validate(request))) {
			return processRequest(request);
		}
		return null;
	}

	protected abstract Map<ErrorCodes, String> validate(T request);

	protected abstract V processRequest(T request);

	private boolean isValidRequest(Map<ErrorCodes, String> validateResponse) {
		if (validateResponse != null && !validateResponse.isEmpty()) {
			return false;
		}
		return true;
	}
}
