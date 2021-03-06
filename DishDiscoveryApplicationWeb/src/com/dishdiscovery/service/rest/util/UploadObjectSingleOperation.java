package com.dishdiscovery.service.rest.util;

import java.io.IOException;
import java.io.InputStream;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.SystemPropertiesCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.util.IOUtils;

public class UploadObjectSingleOperation {
	private static String bucketName = "dishdbimages";

	public static boolean uploadFile(InputStream imageContent, String fileName)
			throws IOException {

		AmazonS3 s3client = new AmazonS3Client(
				new SystemPropertiesCredentialsProvider());
		try {
			System.out.println("Uploading a new object to S3 from a file\n");
			byte[] contentBytes = IOUtils.toByteArray(imageContent);
			Long contentLength = Long.valueOf(contentBytes.length);

			ObjectMetadata metadata = new ObjectMetadata();
			metadata.setContentLength(contentLength);
			s3client.putObject(new PutObjectRequest(bucketName, fileName,
					imageContent, metadata));
			return true;

		} catch (AmazonServiceException ase) {
			System.out.println("Caught an AmazonServiceException, which "
					+ "means your request made it "
					+ "to Amazon S3, but was rejected with an error response"
					+ " for some reason.");
			System.out.println("Error Message:    " + ase.getMessage());
			System.out.println("HTTP Status Code: " + ase.getStatusCode());
			System.out.println("AWS Error Code:   " + ase.getErrorCode());
			System.out.println("Error Type:       " + ase.getErrorType());
			System.out.println("Request ID:       " + ase.getRequestId());
		} catch (AmazonClientException ace) {
			System.out.println("Caught an AmazonClientException, which "
					+ "means the client encountered "
					+ "an internal error while trying to "
					+ "communicate with S3, "
					+ "such as not being able to access the network.");
			System.out.println("Error Message: " + ace.getMessage());
		}
		return false;
	}
}
