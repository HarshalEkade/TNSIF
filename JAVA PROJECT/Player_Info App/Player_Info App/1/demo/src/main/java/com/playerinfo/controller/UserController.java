package com.playerinfo.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import com.playerinfo.dao.UserDao;
import com.playerinfo.model.UserDetail;
/*
* Controller class to manage user-related operations.
*/
public class UserController {
private UserDao playerinfo_pi_userDao = new UserDao(); // Instance of UserDao to interact with the database
/*
* Method to authenticate a user based on username and
password.
* @param c2w_pi_username The username of the user.
* @param c2w_pi_password The password of the user.
* @return true if the authentication is successful, false
otherwise.
*/
public boolean authenticateUser(String playerinfo_pi_username,
String playerinfo_pi_password) {
    try {
        UserDetail playerinfo_pi_user =playerinfo_pi_userDao.getData("user", playerinfo_pi_username); // Retrieve user details from the database
        
        if (playerinfo_pi_user != null) {
        String playerinfo_pi_storedPassword =
        playerinfo_pi_user.getPassword(); // Get the stored password
        
        return
        
        playerinfo_pi_password.equals(playerinfo_pi_storedPassword); // Compare stored password with the provided password
        
        }
        } catch (ExecutionException | InterruptedException ex) {
        ex.printStackTrace(); // Print stack trace for debugging
        }
        return false; // Return false if authentication fails or an exception occurs
        }
        /*
        * Method to handle user signup.
        * @param c2w_pi_username The username of the new user.
        * @param c2w_pi_password The password of the new user.
        * @return true if the signup is successful, false otherwise.
        */
        public boolean handleSignup(String playerinfo_pi_username, String playerinfo_pi_password) {
        try {
        // Create a map to store user details
        Map<String, Object> playerinfo_pi_data = new HashMap<>();
        playerinfo_pi_data.put("password", playerinfo_pi_password); // Add password to the map
        
        playerinfo_pi_data.put("userName", playerinfo_pi_username); // Add username to the map
        
        playerinfo_pi_data.put("role", "USER"); // Add user role to the map
        playerinfo_pi_userDao.addData("user", playerinfo_pi_username,playerinfo_pi_data); // Add user details to the database

System.out.println("User registered successfully");

// Print success message

return true; // Return true if signup is successful
} catch (Exception ex) {
ex.printStackTrace(); // Print stack trace for debugging

return false; // Return false if an exception occurs
}
}
/*
* Method to get user details based on username.
* @param c2w_pi_userName The username of the user.
* @return UserDetail object containing user details, or null
if an exception occurs.
*/
public UserDetail getUserDetail(String playerinfo_pi_userName) {
try {
return playerinfo_pi_userDao.getData("user",playerinfo_pi_userName); // Retrieve user details from the database
} catch (ExecutionException | InterruptedException ex) {
ex.printStackTrace(); // Print stack trace for debugging
}
return null; // Return null if an exception occurs
}
}
