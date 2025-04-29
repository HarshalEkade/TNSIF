package com.playerinfo.view;

import java.util.List;
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
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
/*
* This class represents the UI for displaying a list of players.
*/
public class PlayerListPage {
private Stage playerinfo_pi_primaryStage;
private PlayerController playerinfo_pi_playerinfo_pi_playerController = new PlayerController(); // Service to interact with Firestore
private Scene playerinfo_pi_playerinfo_pi_playerListScene,playerinfo_pi_addPlayerScene;
static String playerinfo_pi_country = null;
VBox playerinfo_pi_vb; // VBox to hold the user scene components
/*
* Constructor to initialize the country for which player
list is displayed.
* @param playerinfo_pi_country The country name.

*/
public PlayerListPage(String playerinfo_pi_country) {
PlayerListPage.playerinfo_pi_country = playerinfo_pi_country;
}
/*
* Setter for the player list scene.
* @param scene The scene to set.
*/
public void setPlayerListScene(Scene scene){
this.playerinfo_pi_playerinfo_pi_playerListScene = scene;
}
/*
* Setter for the primary stage.
* @param playerinfo_pi_primaryStage The primary stage to set.
*/
public void setPlayerListPage(Stage playerinfo_pi_primaryStage){
this.playerinfo_pi_primaryStage = playerinfo_pi_primaryStage;
}
/*
* Constructor to initialize the PlayerListPage with a
specific PlayerController instance.
* @param playerinfo_pi_playerinfo_pi_playerController The PlayerController
instance to use.
*/
public PlayerListPage(PlayerController
playerinfo_pi_playerinfo_pi_playerController) {

this.playerinfo_pi_playerinfo_pi_playerController = playerinfo_pi_playerinfo_pi_playerController;
}
/*
* Method to create the player list scene.
* @param playerinfo_pi_backHandler The handler for the back button.

* @return The VBox containing the player list scene
components.
*/
public VBox createPlayerListScene(Runnable
playerinfo_pi_backHandler) {

// Create UI components
Button playerinfo_pi_logoutButton = new Button("Back"); //Button to trigger logout action

playerinfo_pi_logoutButton.setStyle("-fx-pref-width:120;-fx-min-height: 30;-fx-background-radius: 15;-fx-background-color : #2196F3; -fx-text-fill:#FFFFFF");
Label playerinfo_pi_title = new Label("Player List of " + playerinfo_pi_country); // Label to display the country name

playerinfo_pi_title.setStyle("-fx-font-size:30 ;-fx-font-weight:bold; -fx-pref-width: 700; -fx-pref-height: 30; -fx-alignment :CENTER");

Button playerinfo_pi_addPlayer = new Button("Add Player");
playerinfo_pi_addPlayer.setStyle("-fx-pref-width:120;-fx-min-height: 30;-fx-background-radius: 15;-fx-background-color : #2196F3; -fx-text-fill:#FFFFFF");

HBox playerinfo_pi_header = new HBox(50,playerinfo_pi_logoutButton,playerinfo_pi_title,playerinfo_pi_addPlayer);
playerinfo_pi_header.setStyle("-fx-pref-width: 800;-fx-pref-height: 30; ");

VBox playerinfo_pi_playerinfo_pi_cardList = new VBox(10);
List<Player> playerinfo_pi_playerinfo_pi_playerList = playerinfo_pi_playerinfo_pi_playerController.getAllPlayersByCountry(playerinfo_pi_country);

// Create player cards for each player in the list
for(Player playerinfo_pi_player : playerinfo_pi_playerinfo_pi_playerList){
playerinfo_pi_playerinfo_pi_cardList.getChildren().add(createPlayerCard(playerinfo_pi_player));

}
// Set action for the logout button
playerinfo_pi_logoutButton.setOnAction(new EventHandler<ActionEvent>() {

@Override
public void handle(ActionEvent playerinfo_pi_event) {
playerinfo_pi_backHandler.run(); // Run the back handler
}
});
// Set action for the add player button
playerinfo_pi_addPlayer.setOnAction(new EventHandler<ActionEvent>() {

@Override
public void handle(ActionEvent playerinfo_pi_event) {
initAddPlayerScene(); // Initialize add player scene
playerinfo_pi_primaryStage.setScene(playerinfo_pi_addPlayerScene); // Show add player scene

playerinfo_pi_primaryStage.setTitle("Admin Dashboard");
}
});
// Scroll pane to hold the list of player cards
ScrollPane playerinfo_pi_scrollPane = new ScrollPane();
playerinfo_pi_scrollPane.setContent(playerinfo_pi_playerinfo_pi_cardList);
playerinfo_pi_scrollPane.setFitToWidth(true);
playerinfo_pi_scrollPane.setStyle("-fx-background: #D3D3D3;");
// Create a VBox layout for the player list scene components

playerinfo_pi_vb = new VBox(30,playerinfo_pi_header,playerinfo_pi_scrollPane);

playerinfo_pi_vb.setStyle("-fx-background-color:#D3D3D3;-fx-padding: 30;"); // Set background color and padding
return playerinfo_pi_vb; // Return the created VBox
}
/*
* Initializes the add player scene.
*/
private void initAddPlayerScene() {
AddPlayerPage playerinfo_pi_addPlayerPage = new AddPlayerPage(playerinfo_pi_country); // Create AddPlayerPage instance
playerinfo_pi_addPlayerPage.setAddPlayerPage(playerinfo_pi_primaryStage);

playerinfo_pi_addPlayerScene = new Scene(playerinfo_pi_addPlayerPage.createPlayerScene(this::handleBack),1000, 800); // Create add player scene
}
/*
* Handler for navigating back from add player scene to
player list scene.
*/
private void handleBack() {
playerinfo_pi_primaryStage.setScene(playerinfo_pi_playerinfo_pi_playerListScene); //Show player list scene
}
/*
* Creates a player card UI component.
* @param playerinfo_pi_player The player object to display.
* @return The HBox containing the player card.
*/
HBox createPlayerCard(Player playerinfo_pi_player){
// Create and style player image

Image playerinfo_pi_playerImage = new
Image(playerinfo_pi_player.getPlayerImg());
ImageView playerinfo_pi_plImageView = new

ImageView(playerinfo_pi_playerImage);

playerinfo_pi_plImageView.setFitHeight(120);
playerinfo_pi_plImageView.setPreserveRatio(true);
playerinfo_pi_plImageView.setStyle("-fx-border-color: black;-fx-border-width: 1px;-fx-border-style: solid;");

Circle playerinfo_pi_clip = new Circle(60, 60, 60); // CenterX, CenterY, Radius

playerinfo_pi_plImageView.setClip(playerinfo_pi_clip);
// Create player name label
Label playerinfo_pi_playerName = new
Label(playerinfo_pi_player.getPlayerName());

playerinfo_pi_playerName.setStyle("-fx-font-size :20px;-fx-font-weight: bold;");

HBox playerinfo_pi_name = new HBox(playerinfo_pi_playerName);
// Create age label
Label ageLabel = new Label("Age : ");
ageLabel.setStyle("-fx-font-weight: bold;");
Label playerinfo_pi_playerAge = new Label(String.valueOf(playerinfo_pi_player.getPlayerAge()));
HBox age = new HBox(ageLabel,playerinfo_pi_playerAge);
// Create role label
Label playerinfo_pi_playerinfo_pi_roleLabel = new Label("Role : ");
playerinfo_pi_playerinfo_pi_roleLabel.setStyle("-fx-font-weight:bold;");

Label playerinfo_pi_playerRole = new Label(playerinfo_pi_player.getPlayerRole());
HBox playerinfo_pi_role = new HBox(playerinfo_pi_playerinfo_pi_roleLabel,playerinfo_pi_playerRole);

// Create batting style label

Label playerinfo_pi_playerinfo_pi_batStyleLabel = new Label("Batting Style : ");

playerinfo_pi_playerinfo_pi_batStyleLabel.setStyle("-fx-font-weight: bold;");

Label playerinfo_pi_battingStyle = new Label(playerinfo_pi_player.getBattingStyle());
HBox playerinfo_pi_batStyle = new HBox(playerinfo_pi_playerinfo_pi_batStyleLabel,playerinfo_pi_battingStyle);

// Create bowling style label
Label playerinfo_pi_playerinfo_pi_bowlStyleLabel = new Label("Bowling Style : ");

playerinfo_pi_playerinfo_pi_bowlStyleLabel.setStyle("-fx-font-weight: bold;");

Label playerinfo_pi_bowlingStyle = new Label(playerinfo_pi_player.getBowlingStyle());
HBox playerinfo_pi_bowlStyle = new HBox(playerinfo_pi_playerinfo_pi_bowlStyleLabel,playerinfo_pi_bowlingStyle);

// VBox to hold player information
VBox playerinfo_pi_playerInfo = new VBox(3,playerinfo_pi_name, age,playerinfo_pi_role, playerinfo_pi_batStyle, playerinfo_pi_bowlStyle);
// HBox to hold entire player card
HBox playerinfo_pi_card = new HBox(20,playerinfo_pi_plImageView,playerinfo_pi_playerInfo);

playerinfo_pi_card.setStyle("-fx-border-color: black;-fx-border-width: 2px;-fx-border-style: solid; -fx-border-radius:5px; -fx-background: WHITE;");
return playerinfo_pi_card;
}
}
