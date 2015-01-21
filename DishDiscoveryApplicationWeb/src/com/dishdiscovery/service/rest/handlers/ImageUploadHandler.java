package com.dishdiscovery.service.rest.handlers;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.dishdiscovery.business.service.IDishDiscoveryService;
import com.dishdiscovery.service.rest.request.GenericRequest;
import com.dishdiscovery.service.rest.request.data.ImageUploadRequest;
import com.dishdiscovery.service.rest.response.data.ImageUploadResponse;
import com.dishdiscovery.service.rest.util.ServiceResponseStatus;
import com.dishdiscovery.service.rest.validators.IRequestValidator;

@Component
public class ImageUploadHandler extends
		DefaultRequestHandler<ImageUploadRequest, ImageUploadResponse> {

	@Autowired
	IDishDiscoveryService dishService;
	@Autowired
	IRequestValidator<GenericRequest> requestValidator;

	/*private @Value("#{fileAccessId}") String fileAccessKeyId;
	private @Value("#{fileAccessKey}") String fileAccessKey;
*/
	@Override
	protected ImageUploadResponse processRequest(ImageUploadRequest request) {
		Properties uploadFileProperties = new Properties();
		uploadFileProperties.put("aws.accessKeyId", "AKIAINBSXQFTP5K6VT5A");
		uploadFileProperties.put("aws.secretKey",
				"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");
		ImageUploadResponse uploadResponse = new ImageUploadResponse();
		if (!dishService.uploadImage(uploadFileProperties,
				request.getImageContent())) {
			uploadResponse.setServiceResult(ServiceResponseStatus.FAILURE);
		}

		return uploadResponse;
	}

}
