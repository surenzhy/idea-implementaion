package com.dishdiscovery.business.service.test;

public class UploadObjectSingleOperation {
	/*private static String bucketName = "dishdbimages";
	private static String keyName = "B 304.pdf";
	private static String uploadFileName = "C:\\Users\\Admin\\Downloads\\B 304.pdf";

	public static void main(String[] args) throws IOException {
		System.setProperty("aws.accessKeyId","AKIAINBSXQFTP5K6VT5A");
		System.setProperty("aws.secretKey","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");
		
		AmazonS3 s3client = new AmazonS3Client(new SystemPropertiesCredentialsProvider());
		try {
			System.out.println("Uploading a new object to S3 from a file\n");
			File file = new File(uploadFileName);
			s3client.putObject(new PutObjectRequest(bucketName, keyName, file));

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
	}*/
}
