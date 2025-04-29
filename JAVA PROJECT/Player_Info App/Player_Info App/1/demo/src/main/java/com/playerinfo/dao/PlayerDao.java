package com.playerinfo.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import com.playerinfo.model.Player;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.Query;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
/**
* Data Access Object (DAO) class for Player entities.
*/
public class PlayerDao {
public static Firestore playerinfo_pi_db; // Firestore instance to interact with the database
/**
* Constructor for PlayerDao.
* (Currently empty, but can be used for initialization if
needed)
*/
public PlayerDao() {
// Constructor (if needed for any initialization)
}
/* Method to add data to a specific document in a collection.
* @param playerinfo_pi_collection The name of the collection.
* @param playerinfo_pi_document The name of the document.
* @param playerinfo_pi_data The Player object to add.
* @throws ExecutionException If there is an issue executing
the write operation.
* @throws InterruptedException If the thread is interrupted
while waiting for the operation to complete.
*/
public void addData(String playerinfo_pi_collection, String
playerinfo_pi_document, Player playerinfo_pi_data) throws ExecutionException,
InterruptedException {

DocumentReference playerinfo_pi_docRef = playerinfo_pi_db.collection(playerinfo_pi_collection).document(playerinfo_pi_document); // Reference to the document
ApiFuture<WriteResult> playerinfo_pi_result = playerinfo_pi_docRef.set(playerinfo_pi_data); // Set data in the document
playerinfo_pi_result.get(); // Block until operation is complete
}
/*
* Method to retrieve a single Player object from a document
in a collection.
* @param playerinfo_pi_collection The name of the collection.
* @param playerinfo_pi_document The name of the document.
* @return The Player object.
* @throws ExecutionException If there is an issue executing
the read operation.
* @throws InterruptedException If the thread is interrupted
while waiting for the operation to complete.
*/
public Player getData(String playerinfo_pi_collection, String playerinfo_pi_document) throws ExecutionException, InterruptedException{
try {
    DocumentReference playerinfo_pi_docRef =playerinfo_pi_db.collection(playerinfo_pi_collection).document(playerinfo_pi_document); // Reference to the document

ApiFuture<DocumentSnapshot> playerinfo_pi_future =playerinfo_pi_docRef.get(); // Asynchronously retrieve document snapshot
return playerinfo_pi_future.get().toObject(Player.class); //Convert document snapshot to Player object

} catch (Exception e) {
e.printStackTrace(); // Print stack trace for debugging

throw e; // Re-throw exception or handle based on application's needs

}
}
/*
* Method to retrieve a list of Player objects from a
collection.
* @param c2w_pi_collection The name of the collection.
* @return A list of Player objects.
* @throws ExecutionException If there is an issue executing
the read operation.
* @throws InterruptedException If the thread is interrupted
while waiting for the operation to complete.
*/
public List<Player> getDataList(String playerinfo_pi_collection)
throws ExecutionException, InterruptedException {

try { 
CollectionReference playerinfo_pi_colRef = playerinfo_pi_db.collection(playerinfo_pi_collection); // Reference to the collection
ApiFuture<QuerySnapshot> playerinfo_pi_future = playerinfo_pi_colRef.get(); // Asynchronously retrieve all documents in collection 
QuerySnapshot playerinfo_pi_querySnapshot =playerinfo_pi_future.get(); // Get query snapshot containing all documents
List<QueryDocumentSnapshot> playerinfo_pi_documents =playerinfo_pi_querySnapshot.getDocuments(); // Extract list of document snapshots

List<Player> playerinfo_pi_dataList = new ArrayList<>();
for (QueryDocumentSnapshot playerinfo_pi_document :playerinfo_pi_documents) {

Player playerinfo_pi_object =playerinfo_pi_document.toObject(Player.class); // Convert each documentvsnapshot to Player object

playerinfo_pi_dataList.add(playerinfo_pi_object); // Add Player object to list
}
return playerinfo_pi_dataList; // Return list of Player objects

} catch (Exception e) {
e.printStackTrace(); // Print stack trace for debugging

throw e; // Re-throw exception or handle based on application's needs

}
}
/*
* Method to retrieve a filtered list of Player objects based
on country.
* @param c2w_pi_collection The name of the collection.
* @param country The country to filter by.
* @return A filtered list of Player objects.
* @throws ExecutionException If there is an issue executing
the read operation.
* @throws InterruptedException If the thread is interrupted
while waiting for the operation to complete.
*/
public List<Player> getDataList(String playerinfo_pi_collection,
String country) throws ExecutionException, InterruptedException {

try {
    CollectionReference playerinfo_pi_colRef = playerinfo_pi_db.collection(playerinfo_pi_collection); // Reference to the collection

Query query = playerinfo_pi_colRef.whereEqualTo("country",country); // Query to filter documents by country

ApiFuture<QuerySnapshot> playerinfo_pi_future = query.get();

// Asynchronously retrieve filtered query snapshot
QuerySnapshot playerinfo_pi_querySnapshot =playerinfo_pi_future.get(); // Get query snapshot containing filtered documents

List<QueryDocumentSnapshot> playerinfo_pi_documents =playerinfo_pi_querySnapshot.getDocuments(); // Extract list of document snapshots

List<Player> playerinfo_pi_dataList = new ArrayList<>();
for (QueryDocumentSnapshot playerinfo_pi_document :playerinfo_pi_documents)
 {

Player playerinfo_pi_object =playerinfo_pi_document.toObject(Player.class); // Convert each document snapshot to Player object

playerinfo_pi_dataList.add(playerinfo_pi_object); // Add Playerobject to list
}
return playerinfo_pi_dataList; // Return filtered list of Player objects

} catch (Exception e) {
e.printStackTrace(); // Print stack trace for debugging

throw e; // Re-throw exception or handle based on application's needs

}
}
/*
* Method to search for Player objects based on a key
(playerName or country).
* @param c2w_pi_key The key to search by (playerName or
country).* @return A list of Player objects matching the search key.
* @throws ExecutionException If there is an issue executing
the read operation.
* @throws InterruptedException If the thread is interrupted
while waiting for the operation to complete.
*/
public List<Player> getSearchPlayer(String playerinfo_pi_key) throws
ExecutionException, InterruptedException {
CollectionReference playerinfo_pi_players = playerinfo_pi_db.collection("player"); // Reference to the "player"collection

Query playerinfo_pi_nameQuery =playerinfo_pi_players.whereEqualTo("playerName", playerinfo_pi_key); // Query to filter by playerName

Query playerinfo_pi_countryQuery =playerinfo_pi_players.whereEqualTo("country", playerinfo_pi_key); // Query to filter by country

ApiFuture<QuerySnapshot> playerinfo_pi_nameQuerySnapshot =playerinfo_pi_nameQuery.get(); // Asynchronously retrieve query snapshot for playerName

ApiFuture<QuerySnapshot> playerinfo_pi_countryQuerySnapshot =playerinfo_pi_countryQuery.get(); // Asynchronously retrieve query snapshot for country

List<QueryDocumentSnapshot> playerinfo_pi_nameDocuments =playerinfo_pi_nameQuerySnapshot.get().getDocuments(); // Get documents matching playerName query

List<QueryDocumentSnapshot> countryDocuments =playerinfo_pi_countryQuerySnapshot.get().getDocuments(); // Get documents matching country query

Set<DocumentSnapshot> playerinfo_pi_uniqueDocuments = new HashSet<>();

playerinfo_pi_uniqueDocuments.addAll(playerinfo_pi_nameDocuments); //Add documents from playerName query to set
playerinfo_pi_uniqueDocuments.addAll(countryDocuments); // Add documents from country query to set

List<Player> playerinfo_pi_userList = new ArrayList<>();
for (DocumentSnapshot playerinfo_pi_document :playerinfo_pi_uniqueDocuments) {

if (playerinfo_pi_document.exists()) {
Player playerinfo_pi_user =playerinfo_pi_document.toObject(Player.class); // Convert document snapshot to Player object

playerinfo_pi_userList.add(playerinfo_pi_user); // Add Player object to list
}
}
return playerinfo_pi_userList; // Return list of Player objects matching search key
}}