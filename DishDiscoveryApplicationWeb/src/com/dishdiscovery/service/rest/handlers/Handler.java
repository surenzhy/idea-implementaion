package com.dishdiscovery.service.rest.handlers;

public interface Handler<T, V> {

	V execute(T request);
}
