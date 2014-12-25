package com.dishdiscovery.service.rest.handlers;

import java.util.Map;

import com.dishdiscovery.service.rest.util.ErrorCodes;

public abstract class DefaultRequestHandler<T, V> extends
		AbstractRequestHandler<T, V> {

	protected Map<ErrorCodes, String> validate(T request) {
		return null;
	}

}
