package com.playerinfo.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.playerinfo.controller.PlayerController;
import com.playerinfo.model.Player;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class UserPage {
private PlayerController playerinfo_pi_playerinfo_pi_playerController = new PlayerController(); // Service to interact with Firestore
private Scene playerinfo_pi_playerInfoScene, playerinfo_pi_userPageScene;
// Scenes for player info and user page
private Stage playerinfo_pi_primaryStage; // Primary stage of the application
VBox playerinfo_pi_vb; // VBox to hold the user scene components
public UserPage() {
// Default constructor
}
// Method to set the primary stage
public void setUserPage(Stage playerinfo_pi_primaryStage){
this.playerinfo_pi_primaryStage = playerinfo_pi_primaryStage;
}
// Method to set the user page scene
public void setUserPageScene(Scene playerinfo_pi_scene){
this.playerinfo_pi_userPageScene = playerinfo_pi_scene;
}
// Constructor to initialize the UserPage with the PlayerController instance
public UserPage(PlayerController
playerinfo_pi_playerinfo_pi_playerController) {

this.playerinfo_pi_playerinfo_pi_playerController =playerinfo_pi_playerinfo_pi_playerController;
}
// Method to create the user scene
public VBox createUserScene(Runnable playerinfo_pi_logoutHandler) {
Button playerinfo_pi_logoutButton = new Button("Logout"); //Button to trigger logout action

playerinfo_pi_logoutButton.setStyle("-fx-pref-width:120;-fx-min-height: 30;-fx-background-radius: 15;-fx-background-color : #2196F3; -fx-text-fill:#FFFFFF");

Label playerinfo_pi_title = new Label("Player List"); // Labelto display the title

playerinfo_pi_title.setStyle("-fx-font-size:30 ;-fx-font-weight:bold; -fx-pref-width: 650; -fx-pref-height: 30; -fx-alignment :CENTER");

HBox playerinfo_pi_header = new HBox(50,playerinfo_pi_logoutButton,playerinfo_pi_title); // Header with logout button and title

playerinfo_pi_header.setStyle("-fx-pref-width: 1000;-fx-pref-height: 30;");

VBox playerinfo_pi_cardList = new VBox(10); // VBox to hold the player cards

playerinfo_pi_cardList.setStyle("-fx-background-color: rgba(211,211, 211, 1)");

// Fetch all countries from the PlayerController
Map<String,String> playerinfo_pi_countryLists =
playerinfo_pi_playerinfo_pi_playerController.getAllCountries();
List<String> playerinfo_pi_playerinfo_pi_countryNames = new ArrayList<>(playerinfo_pi_countryLists.keySet());
// Create country cards for each country
for(String playerinfo_pi_country : playerinfo_pi_playerinfo_pi_countryNames){
playerinfo_pi_cardList.getChildren().add(createCountryCard(playerinfo_pi_country));
}
// Set action for the logout button
playerinfo_pi_logoutButton.setOnAction(new EventHandler<ActionEvent>() {

@Override
public void handle(ActionEvent playerinfo_pi_event) {
playerinfo_pi_logoutHandler.run(); // Run the logout handler
}
});
ScrollPane playerinfo_pi_scrollPane = new ScrollPane(); //ScrollPane to hold the card list

playerinfo_pi_scrollPane.setContent(playerinfo_pi_cardList);

playerinfo_pi_scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
playerinfo_pi_scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

playerinfo_pi_scrollPane.setFitToWidth(true);
playerinfo_pi_scrollPane.setPannable(true); // Enable panning
playerinfo_pi_scrollPane.setStyle("-fx-background: #D3D3D3;");
// Create a VBox layout for the user scene components
playerinfo_pi_vb = new VBox(30, playerinfo_pi_header,playerinfo_pi_scrollPane);

playerinfo_pi_vb.setStyle("-fx-background-color: rgba(211, 211,211, 1); -fx-background-size: cover; -fx-padding: 30;");
return playerinfo_pi_vb; // Return the created VBox
}
// Method to create a country card with player cards for each country
private VBox createCountryCard(String playerinfo_pi_country) {
Label playerinfo_pi_countryName = new Label(playerinfo_pi_country); //Label for the country name

playerinfo_pi_countryName.setStyle("-fx-font-size:20;-fx-font-weight: bold; -fx-pref-width: 650; -fx-pref-height:20;");

HBox playerinfo_pi_cardList = new HBox(10); // HBox to hold player cards

playerinfo_pi_cardList.setStyle("-fx-background-color:#D3D3D3;");

// Fetch all players for the given country from the PlayerController

List<Player> playerinfo_pi_playerList =playerinfo_pi_playerinfo_pi_playerController.getAllPlayersByCountry(playerinfo_pi_country);

// Create player cards for each player in the country
for(Player playerinfo_pi_player : playerinfo_pi_playerList){

playerinfo_pi_cardList.getChildren().add(createPlayerCard(playerinfo_pi_player)
);
}
ScrollPane playerinfo_pi_scrollPane1 = new ScrollPane(); //ScrollPane to hold the player card list

playerinfo_pi_scrollPane1.setContent(playerinfo_pi_cardList);

playerinfo_pi_scrollPane1.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
playerinfo_pi_scrollPane1.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

playerinfo_pi_scrollPane1.setPannable(true); // Enable panning
playerinfo_pi_scrollPane1.setStyle("-fx-background-color:#D3D3D3;");

VBox playerinfo_pi_countryPlayerCard = new VBox(5,playerinfo_pi_countryName,playerinfo_pi_scrollPane1); // VBox to hold country name and player list

playerinfo_pi_countryPlayerCard.setStyle("-fx-background-color:#D3D3D3;");

return playerinfo_pi_countryPlayerCard; // Return the created country player card
}
// Method to create a player card
HBox createPlayerCard(Player playerinfo_pi_player){

Image playerinfo_pi_playerImg = new Image(playerinfo_pi_player.getPlayerImg()); // Fetch player image
ImageView plImgView = new ImageView(playerinfo_pi_playerImg);

// Create ImageView for player image
plImgView.setFitHeight(120);
plImgView.setPreserveRatio(true);
plImgView.setStyle("-fx-border-color: black;-fx-border-width: 1px;-fx-border-style: solid;");

Label playerinfo_pi_playerName = new Label(playerinfo_pi_player.getPlayerName()); // Label for player name

playerinfo_pi_playerName.setStyle("-fx-font-size :20px;-fx-font-weight: bold;");

HBox name = new HBox(playerinfo_pi_playerName);
Label playerinfo_pi_ageLabel = new Label("Age : ");
playerinfo_pi_ageLabel.setStyle("-fx-font-weight: bold;");
Label playerinfo_pi_playerAge = new Label(String.valueOf(playerinfo_pi_player.getPlayerAge())); // Label for player age

HBox playerinfo_pi_age = new HBox(playerinfo_pi_ageLabel,playerinfo_pi_playerAge);

Label playerinfo_pi_roleLabel = new Label("Role : ");
playerinfo_pi_roleLabel.setStyle("-fx-font-weight: bold;");
Label playerinfo_pi_playerRole = new Label(playerinfo_pi_player.getPlayerRole()); // Label for player role

HBox playerinfo_pi_role = new HBox(playerinfo_pi_roleLabel,playerinfo_pi_playerRole);

Label playerinfo_pi_batStyleLabel = new Label("Batting Style :");

playerinfo_pi_batStyleLabel.setStyle("-fx-font-weight: bold;");
Label playerinfo_pi_battingStyle = new Label(playerinfo_pi_player.getBattingStyle()); // Label for batting style

HBox playerinfo_pi_batStyle = new HBox(playerinfo_pi_batStyleLabel,playerinfo_pi_battingStyle);

Label playerinfo_pi_bowlStyleLabel = new Label("Bowling Style :");

playerinfo_pi_bowlStyleLabel.setStyle("-fx-font-weight: bold;");
Label playerinfo_pi_bowlingStyle = new Label(playerinfo_pi_player.getBowlingStyle()); // Label for bowling style

HBox bowlStyle = new HBox(playerinfo_pi_bowlStyleLabel,playerinfo_pi_bowlingStyle);

VBox playerinfo_pi_playerInfo = new VBox(5,name, playerinfo_pi_age,
playerinfo_pi_role, playerinfo_pi_batStyle, bowlStyle); // VBox to hold player info

playerinfo_pi_playerInfo.setStyle("-fx-pref-width : 230");
HBox playerinfo_pi_card = new HBox(20,plImgView,playerinfo_pi_playerInfo); // HBox to hold player image and info

playerinfo_pi_card.setStyle("-fx-border-color: black;-fx-border-width: 2px;-fx-border-style: solid; -fx-border-radius:5px; -fx-background-color: rgba(255, 255, 255, 1)");

playerinfo_pi_card.setOnMouseClicked(new EventHandler<MouseEvent>() {
@Override
public void handle(MouseEvent playerinfo_pi_event) {
initPlayerInfoScene(playerinfo_pi_player.getInfoUrl());

// Initialize player info scene
playerinfo_pi_primaryStage.setScene(playerinfo_pi_playerInfoScene); // Show player info scene

playerinfo_pi_primaryStage.setTitle("Admin Dashboard");
}
});
return playerinfo_pi_card; // Return the created player card
}

// Method to initialize the player info scene
private void initPlayerInfoScene(String playerinfo_pi_infoUrl) {
PlayerInfoPage playerinfo_pi_playerInfoPage = new PlayerInfoPage(playerinfo_pi_infoUrl); // Create PlayerInfoPage instance

playerinfo_pi_playerInfoScene = new Scene(playerinfo_pi_playerInfoPage.createPlayerInfoScene(this::handleBack), 1000, 800); // Create player info scene
}
// Method to handle the back action from the player info scene
private void handleBack() {
playerinfo_pi_primaryStage.setScene(playerinfo_pi_userPageScene); //Show user page scene
}
}