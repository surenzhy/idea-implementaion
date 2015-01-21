package com.dishdiscovery.service.rest;

import java.io.InputStream;

import com.dishdiscovery.service.rest.response.data.ImageUploadResponse;
import com.sun.jersey.core.header.FormDataContentDisposition;

public interface IDishDicoveryImageProcessService {
	public ImageUploadResponse uploadFile(InputStream fileInputStream,
			FormDataContentDisposition contentDispositionHeader/*, String dishId*/);
}
