package com.dishdiscovery.service.rest.validators;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.dishdiscovery.service.rest.request.GenericRequest;
import com.dishdiscovery.service.rest.util.ErrorCodes;

@Component
public class GenericRequestValidator implements IRequestValidator<GenericRequest> {

	@Override
	public Map<ErrorCodes, String> validateRequest(GenericRequest request) {
		return null;
	}

}
