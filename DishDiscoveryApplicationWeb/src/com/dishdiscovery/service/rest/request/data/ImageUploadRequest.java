package com.dishdiscovery.service.rest.request.data;

import java.io.InputStream;

import com.dishdiscovery.service.rest.request.GenericRequest;

public class ImageUploadRequest extends GenericRequest {
	InputStream imageContent;

	public InputStream getImageContent() {
		return imageContent;
	}

	public void setImageContent(InputStream imageContent) {
		this.imageContent = imageContent;
	}
}
