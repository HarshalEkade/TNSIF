package com.playerinfo.dao;

import java.util.Map;
import java.util.concurrent.ExecutionException;
import com.playerinfo.model.UserDetail;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
/**
* Data Access Object (DAO) class for UserDetail entities.
*/
public class UserDao {
    public static Firestore playerinfo_pi_db; // Firestore instance to interact with the database
    /*
    * Method to add data to a specific document in a collection.
    * @param c2w_pi_collection The name of the collection.
    * @param c2w_pi_document The name of the document.
    * @param data The data to add as a map of key-value pairs.
    * @throws ExecutionException If there is an issue executing
    the write operation.
    * @throws InterruptedException If the thread is interrupted
    while waiting for the operation to complete.
    */
    public void addData(String playerinfo_pi_collection, String
    playerinfo_pi_document, Map<String, Object> data) throws
    ExecutionException, InterruptedException {
    DocumentReference playerinfo_pi_docRef = playerinfo_pi_db.collection(playerinfo_pi_collection).document(playerinfo_pi_document); // Reference to the document
    
    ApiFuture<WriteResult> playerinfo_pi_result = playerinfo_pi_docRef.set(data); // Set data in the document
    
    playerinfo_pi_result.get(); // Block until the operation is complete
    }
    /*
    * Method to retrieve a single UserDetail object from a
    document in a collection.
    * @param c2w_pi_collection The name of the collection.
    * @param c2w_pi_document The name of the document.
    * @return The UserDetail object.* @throws ExecutionException If there is an issue executing
    the read operation.
    * @throws InterruptedException If the thread is interrupted
    while waiting for the operation to complete.
    */
public UserDetail getData(String playerinfo_pi_collection, String playerinfo_pi_document) throws ExecutionException, InterruptedException
{

try {
DocumentReference playerinfo_pi_docRef =playerinfo_pi_db.collection(playerinfo_pi_collection).document(playerinfo_pi_document); // Reference to the document

ApiFuture<DocumentSnapshot> playerinfo_pi_future =playerinfo_pi_docRef.get(); // Asynchronously retrieve document snapshot

return

playerinfo_pi_future.get().toObject(UserDetail.class); // Convert document snapshot to UserDetail object
} catch (Exception e) {
e.printStackTrace(); // Print stack trace for debugging

throw e; // Re-throw the exception or handle it based on your application's needs

}
}}
