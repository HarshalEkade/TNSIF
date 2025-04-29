
package com.playerinfo.configuration;
import com.playerinfo.dao.PlayerDao;
import com.playerinfo.dao.UserDao;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
/**
* Class for initializing Firebase configuration.
*/
public class FirebaseInitialization {
// Static block to initialize Firebase upon class loading
static {
    try {
        initializeFirebase(); // Call method to initialize Firebase
        
        } catch (IOException e) {
        e.printStackTrace(); // Handle IOException if thrown
        }
        }
        /*
        * Method to initialize Firebase.
        * @throws IOException if there is an issue reading the
        service account file.
        */
        private static void initializeFirebase() throws IOException {
        // Load Firebase service account credentials from a JSON  File
        
        FileInputStream playerinfo_pi_serviceAccount = new FileInputStream("1\\demo\\src\\main\\resources\\java-fx-firebase-store1-firebase-adminsdk-9cdcs-9713a46d49.json");
        
        // Create FirebaseOptions object to configure Firebase App with credentials
        
        FirebaseOptions playerinfo_pi_options = new
        
        FirebaseOptions.Builder()
        .setCredentials(GoogleCredentials.fromStream(playerinfo_pi_serviceAccount)) // Set credentials from JSON file
        
        .build();
        
        // Initialize Firebase App with the configured playerinfo_pi_options
        
        FirebaseApp.initializeApp(playerinfo_pi_options);
        // Access Firestore database instance
        Firestore playerinfo_pi_db = FirestoreClient.getFirestore();
        // Set Firestore instance in PlayerDao and UserDao for database operations

PlayerDao.playerinfo_pi_db = playerinfo_pi_db;
UserDao.playerinfo_pi_db = playerinfo_pi_db;
        }
}
