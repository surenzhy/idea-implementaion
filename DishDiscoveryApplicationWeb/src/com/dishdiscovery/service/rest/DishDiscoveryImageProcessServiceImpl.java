package com.dishdiscovery.service.rest;

import java.io.InputStream;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dishdiscovery.service.rest.handlers.ImageUploadHandler;
import com.dishdiscovery.service.rest.request.data.ImageUploadRequest;
import com.dishdiscovery.service.rest.response.data.ImageUploadResponse;
import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

@Component
@Path("/image")
public class DishDiscoveryImageProcessServiceImpl implements
		IDishDicoveryImageProcessService {

	/**
	 * Upload a File
	 */

	@Autowired
	private ImageUploadHandler uploadFileHandler;

	@POST
	@Path("/dish")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	public ImageUploadResponse uploadFile(
			@FormDataParam("file") InputStream fileInputStream,
			@FormDataParam("file") FormDataContentDisposition contentDispositionHeader/*,
			@FormParam("dishId") String dishId*/) {

		ImageUploadRequest request = new ImageUploadRequest();
		request.setImageContent(fileInputStream);
		return uploadFileHandler.execute(request);
	}
}
