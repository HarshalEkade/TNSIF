package com.playerinfo.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.storage.Acl;
import com.google.cloud.storage.BlobId;
import com.google.cloud.storage.BlobInfo;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
public class ImageUpload {
private static final String BUCKET_NAME ="java-fx-firebase-store1.appspot.com"; // Replace with your Google Cloud Storage bucket name
/*
* Uploads an image file to Google Cloud Storage and returns
the publicly accessible URL.
* @param c2w_pi_localFilePath The local file path of the
image to upload.
* @param c2w_pi_uploadFileName The name of the file to be
uploaded.
* @return The publicly accessible URL of the uploaded image.
*/
public static String uploadImage(String playerinfo_pi_localFilePath,String playerinfo_pi_uploadFileName) {

try {
// Read service account credentials from a JSON file
FileInputStream playerinfo_pi_serviceAccount = new FileInputStream("1\\demo\\src\\main\\resources\\java-fx-firebase-store1-firebase-adminsdk-9cdcs-9713a46d49.json");

// Authenticate and create a storage instance
Storage playerinfo_pi_storage = StorageOptions.newBuilder().setCredentials(GoogleCredentials.fromStream(playerinfo_pi_serviceAccount)).build().getService();

// Read bytes from the local file
Path playerinfo_pi_path = Paths.get(playerinfo_pi_localFilePath);
byte[] playerinfo_pi_bytes =Files.readAllBytes(playerinfo_pi_path);

// Define Blob ID and BlobInfo
BlobId playerinfo_pi_blobId = BlobId.of(BUCKET_NAME,playerinfo_pi_uploadFileName);

BlobInfo playerinfo_pi_blobInfo =BlobInfo.newBuilder(playerinfo_pi_blobId).setContentType("image/jpeg") // Set content type

.setAcl(Arrays.asList(Acl.of(Acl.User.ofAllUsers(),Acl.Role.READER))) // Make file publicly accessible
.build();
// Upload the image bytes to Google Cloud Storage
playerinfo_pi_storage.create(playerinfo_pi_blobInfo, playerinfo_pi_bytes);
// Return the URL of the uploaded image
return "https://storage.googleapis.com/" +BUCKET_NAME + "/" + playerinfo_pi_uploadFileName;

} catch (IOException e) {
e.printStackTrace();
return null; // Return null if there's an exception
}
}
}
