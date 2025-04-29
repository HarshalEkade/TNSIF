package com.playerinfo.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
public class PlayerInfoPage {
private static String playerinfo_pi_url; // URL of the player information page
/*
* Constructor to initialize PlayerInfoPage with a specific
URL.
* @param playerinfo_pi_url The URL of the player information page.
*/
public PlayerInfoPage(String playerinfo_pi_url) {
PlayerInfoPage.playerinfo_pi_url = playerinfo_pi_url;
}
/*
* Method to create the player information scene.
* @param playerinfo_pi_backHandler Runnable handler for the back
button action.
* @return The VBox containing the player information UI
components.
*/
public VBox createPlayerInfoScene(Runnable playerinfo_pi_backHandler) {
// Back button setup
Button playerinfo_pi_backButton = new Button("Back");
playerinfo_pi_backButton.setStyle("-fx-pref-width:120;-fx-min-height: 30;-fx-background-radius: 15;-fx-background-color : #2196F3; -fx-text-fill:#FFFFFF");

// HBox to hold the back button
HBox playerinfo_pi_header = new HBox(50, playerinfo_pi_backButton);

playerinfo_pi_header.setStyle("-fx-pref-width: 800;-fx-pref-height: 30;");

// Set action for the back button
playerinfo_pi_backButton.setOnAction(new EventHandler<ActionEvent>() {

@Override
public void handle(ActionEvent event) {
playerinfo_pi_backHandler.run(); // Execute the back handler (logout handler)

}
});
// WebView setup to display the web content (playerinformation)

WebView playerinfo_pi_webView = new WebView();
WebEngine playerinfo_pi_webEngine = playerinfo_pi_webView.getEngine();
playerinfo_pi_webEngine.load(playerinfo_pi_url); // Load the specified URL into the WebView

// BorderPane to contain the WebView
BorderPane playerinfo_pi_root = new BorderPane();
playerinfo_pi_root.setStyle("-fx-pref-height: 700");
playerinfo_pi_root.setCenter(playerinfo_pi_webView);
// VBox to hold all components of the player information page

VBox playerinfo_pi_vb = new VBox(30, playerinfo_pi_header,playerinfo_pi_root);

playerinfo_pi_vb.setStyle("-fx-background-color:#D3D3D3;-fx-padding: 30;"); // Set background color and padding for the VBox

return playerinfo_pi_vb; // Return the created VBox containing the player information UI
}
}