package com.playerinfo.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;
/*
* Controller class to fetch and manage background images from the
Unsplash API.
*/
public class BackgroundImageController {
/*
* Method to get response data from the Unsplash API.
* @return URL of the small-sized image or a default image
path in case of failure.
* @throws IOException If an input or output exception
occurred.
*/
public String getResponseData() throws IOException {
// API URL to fetch a random cricket ground image from Unsplash

String playerinfo_pi_url ="https://unsplash.com/photos/a-baseball-field-with-a-tall-metal-pole-KT_CRfRZeZw";

// Open connection to the API URL
HttpURLConnection playerinfo_pi_httpClient = (HttpURLConnection) new URL(playerinfo_pi_url).openConnection();
playerinfo_pi_httpClient.setRequestMethod("GET"); // Set request method to GET

StringBuffer playerinfo_pi_response = new StringBuffer();
// Get response code from the HTTP request
int playerinfo_pi_responseCode = playerinfo_pi_httpClient.getResponseCode();

if (playerinfo_pi_responseCode == HttpURLConnection.HTTP_OK) {

// If response code is 200 (OK)

// Read the response from the API
BufferedReader playerinfo_pi_in = new BufferedReader(new
InputStreamReader(playerinfo_pi_httpClient.getInputStream()));

String playerinfo_pi_inputLine;
// Append each line of the response to the response buffer

while ((playerinfo_pi_inputLine = playerinfo_pi_in.readLine()) !=

null) {

    playerinfo_pi_response.append(playerinfo_pi_inputLine);
}
playerinfo_pi_in.close(); // Close the BufferedReader
// Parse the response JSON object
JSONObject playerinfo_pi_obj = new JSONObject(playerinfo_pi_response.toString());
JSONObject playerinfo_pi_urlObject =playerinfo_pi_obj.getJSONObject("1\\demo\\src\\main\\resources\\java-fx-firebase-store1-firebase-adminsdk-9cdcs-9713a46d49.json"); // Get the "urls" object
// Return the URL of the small-sized image
return playerinfo_pi_urlObject.getString("small");
} else {
// Return default image path if response code is not 200

return "1\\demo\\src\\main\\resources\\images\\Default.jpeg";
}
}
/*
* Method to fetch image data URL.
* @return URL of the fetched image or a default image path
in case of failure.
*/
public String imageData() {
String playerinfo_pi_response = null;
try {
    playerinfo_pi_response = getResponseData(); // Fetch response data from the API

} catch (IOException ie) {
ie.printStackTrace(); // Print stack trace for debugging
}
return playerinfo_pi_response; // Return the image URL or default path
}}