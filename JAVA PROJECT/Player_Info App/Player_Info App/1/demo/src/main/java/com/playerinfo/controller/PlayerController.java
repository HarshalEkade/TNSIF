package com.playerinfo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import com.playerinfo.dao.PlayerDao;
import com.playerinfo.model.Player;
/*
* Controller class to manage player-related operations.
*/
public class PlayerController {
private PlayerDao playerinfo_pi_playerDao = new PlayerDao(); //Instance of PlayerDao to interact with the database
/*
* Method to retrieve all players from the database.
* @return A list of all Player objects.
*/
public List<Player> getAllPlayers() {
try {
return playerinfo_pi_playerDao.getDataList("player"); //Retrieve all players from the "player" collection

} catch (ExecutionException | InterruptedException e) {
e.printStackTrace(); // Print stack trace for debugging
}
return new ArrayList<>(); // Return an empty list if an exception occurs
}
/*
* Method to add a player to the database.
* @param c2w_pi_data The Player object to be added.
* @return true if the player is added successfully, false
otherwise.
*/
public boolean addPlayers(Player playerinfo_pi_data) {
try {
    playerinfo_pi_playerDao.addData("player",playerinfo_pi_data.getPlayerName(), playerinfo_pi_data); // Add player to the"player" collection

return true; // Return true if the player is added successfully

} catch (ExecutionException | InterruptedException e) {
e.printStackTrace(); // Print stack trace for debugging
}
return false; // Return false if an exception occurs
}
/*
* Method to search for players based on a key (playerName or
country).
* @param c2w_pi_key The search key.
* @return A list of Player objects that match the search
key.
*/
public List<Player> getSearchPlayer(String playerinfo_pi_key) {
try {
return playerinfo_pi_playerDao.getSearchPlayer(playerinfo_pi_key);

// Search for players based on the key

} catch (ExecutionException | InterruptedException e) {
e.printStackTrace(); // Print stack trace for debugging
}
return new ArrayList<>(); // Return an empty list if an exception occurs
}
/*
* Method to retrieve all unique countries and their flags
from the player database.
* @return A map where the key is the country name and the
value is the flag URL.
*/
public Map<String, String> getAllCountries() {
    Map<String, String> playerinfo_pi_countries = new HashMap<>();
    
    // Map to store country names and flag URLs
    
    List<Player> playerinfo_pi_playersList = getAllPlayers(); // Retrieve all players
    
    for (Player playerinfo_pi_player : playerinfo_pi_playersList) {
    if (!playerinfo_pi_countries.containsKey(playerinfo_pi_player.getCountry())) { 
   // If the country is not already in the map
    
   playerinfo_pi_countries.put(playerinfo_pi_player.getCountry(),  playerinfo_pi_player.getFlag()); // Add country and flag to the map
    
    }
    }
    return playerinfo_pi_countries; // Return the map of countries and flags
    }
    /*
    * Method to retrieve all players from a specific country.
    * @param c2w_pi_country The name of the country.
    * @return A list of Player objects from the specified
    country.
    */
    public List<Player> getAllPlayersByCountry(String  playerinfo_pi_country) {
    try {
    return playerinfo_pi_playerDao.getDataList("player",playerinfo_pi_country); // Retrieve players from the specified country
    } catch (ExecutionException | InterruptedException e) {
    e.printStackTrace(); // Print stack trace for debugging
    }
    return new ArrayList<>(); // Return an empty list if an exception occurs
    }}
