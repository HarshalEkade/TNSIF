package com.playerinfo.view;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import com.playerinfo.controller.ImageUpload;
import com.playerinfo.controller.PlayerController;
import com.playerinfo.model.Player;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
public class AddPlayerPage {
private PlayerController playerinfo_pi_playerController = new
PlayerController();
private static String playerinfo_pi_country = null, playerinfo_pi_imgUrl =null;
private Stage playerinfo_pi_primaryStage;

/*
* Constructor to initialize the AddPlayerPage with a
specific country.
* @param playerinfo_pi_country The country for which the player is
being added.
*/
public AddPlayerPage(String playerinfo_pi_country){
AddPlayerPage.playerinfo_pi_country = playerinfo_pi_country;
}
/*
* Setter for the primary stage.
* @param playerinfo_pi_primaryStage The primary stage to set.
*/
void setAddPlayerPage(Stage playerinfo_pi_primaryStage){
this.playerinfo_pi_primaryStage = playerinfo_pi_primaryStage;
}
/*
* Method to create the player addition scene.
* @param playerinfo_pi_backHandler Runnable handler for the back
button action.
* @return The VBox containing the player addition UI
components.
*/
public VBox createPlayerScene(Runnable playerinfo_pi_backHandler) {
// Back button setup
Button playerinfo_pi_backButton = new Button("Back");
playerinfo_pi_backButton.setStyle("-fx-pref-width:120;-fx-min-height: 30;-fx-background-radius: 15;-fx-background-color : #2196F3; -fx-text-fill:#FFFFFF");

playerinfo_pi_backButton.setOnAction(new EventHandler<ActionEvent>() {

@Override
public void handle(ActionEvent playerinfo_pi_event) {

playerinfo_pi_backHandler.run(); // Execute the back handler
}
});
// Title label setup
Label playerinfo_pi_title = new Label("Add Player");
playerinfo_pi_title.setStyle("-fx-font-size:30 ;-fx-font-weight:bold; -fx-pref-width: 500; -fx-pref-height: 30; -fx-alignment :CENTER; -fx-text-fill:#FFFFFF");

// Button box containing the back button
HBox playerinfo_pi_buttonBox = new HBox(100, playerinfo_pi_backButton);
playerinfo_pi_buttonBox.setStyle("-fx-pref-size : 1000 400;-fx-padding : 30 ; ");

playerinfo_pi_buttonBox.setAlignment(Pos.TOP_LEFT);
// Form for player details
VBox playerinfo_pi_form = createPlayerForm();
playerinfo_pi_form.getChildren().add(0, playerinfo_pi_title); // Add title to the top of the form

playerinfo_pi_form.setStyle("-fx-pref-height : 480 ;-fx-max-width : 440; -fx-alignment : TOP_CENTER ; -fx-padding :20 20 20 40 ;-fx-background-color : rgba(0, 0, 0, 0.5);");
// VBox to hold all components of the player addition page

VBox playerinfo_pi_playerVBox = new VBox(10, playerinfo_pi_buttonBox,playerinfo_pi_form);

playerinfo_pi_playerVBox.setAlignment(Pos.TOP_CENTER);
playerinfo_pi_playerVBox.setStyle("-fx-background-image:url('1\\demo\\src\\main\\resources\\images\\CricketStadium.jpeg'); -fx-background-size: cover;-fx-padding : 0 0 50 0");

return playerinfo_pi_playerVBox;
}

/*
* Creates the form for entering player details.
* @return The VBox containing the player detail form
components.
*/
private VBox createPlayerForm(){
// Default player image setup
Image playerinfo_pi_playerImage = new Image("1\\demo\\src\\main\\resources\\images\\msdhoni.png");
ImageView playerinfo_pi_playerImgView = new ImageView(playerinfo_pi_playerImage);

playerinfo_pi_playerImgView.setFitHeight(120);
playerinfo_pi_playerImgView.setStyle("-fx-border-color: black;-fx-border-width: 1px;-fx-border-style: solid;");
playerinfo_pi_playerImgView.setPreserveRatio(true);
HBox playerinfo_pi_playerImage_hb = new HBox(playerinfo_pi_playerImgView);

playerinfo_pi_playerImage_hb.setStyle("-fx-pref-size : 35020;-fx-alignment : CENTER");
// Player name input setup
Label playerinfo_pi_playerNameLabel = new Label("Enter Player Name : ");
playerinfo_pi_playerNameLabel.setStyle("-fx-font-size:12;-fx-font-weight:bold; -fx-text-fill:#FFFFFF");

TextField playerinfo_pi_playerNametf = new TextField();
playerinfo_pi_playerNametf.setPromptText("Enter Player Name");
playerinfo_pi_playerNametf.setStyle("-fx-pref-width : 180;-fx-text-fill:#FFFFFF");

HBox playerinfo_pi_playerName = new HBox(10,
playerinfo_pi_playerNameLabel, playerinfo_pi_playerNametf);
playerinfo_pi_playerName.setMaxSize(400, 20);
// Player age input setup
Label playerinfo_pi_playerAgeLabel = new Label("Enter Player Age: ");

playerinfo_pi_playerAgeLabel.setStyle("-fx-font-size:12;-fx-font-weight:bold; -fx-text-fill:#FFFFFF");

TextField playerinfo_pi_playerAgetf = new TextField();
playerinfo_pi_playerAgetf.setPromptText("Enter Player Age");
playerinfo_pi_playerAgetf.setStyle("-fx-pref-width : 180;-fx-text-fill:#FFFFFF");

HBox playerinfo_pi_playerAge = new HBox(10,playerinfo_pi_playerAgeLabel, playerinfo_pi_playerAgetf);
playerinfo_pi_playerAge.setMaxSize(400, 20);
// Player country input setup
Label playerinfo_pi_playerCountryLabel = new Label("Enter Player Country : ");
playerinfo_pi_playerCountryLabel.setStyle("-fx-font-size:12;-fx-font-weight:bold; -fx-text-fill:#FFFFFF");

TextField playerinfo_pi_playerCountrytf = new TextField();
if(playerinfo_pi_country != null)
playerinfo_pi_playerCountrytf.setText(playerinfo_pi_country);
playerinfo_pi_playerCountrytf.setPromptText("Enter Player Country");

playerinfo_pi_playerCountrytf.setStyle("-fx-pref-width : 180;-fx-text-fill:#FFFFFF");

HBox playerinfo_pi_playerCountry = new HBox(10,
playerinfo_pi_playerCountryLabel, playerinfo_pi_playerCountrytf);
playerinfo_pi_playerCountry.setMaxSize(400, 20);
// Player role input setup
Label playerinfo_pi_playerRoleLabel = new Label("Enter Player Role : ");
playerinfo_pi_playerRoleLabel.setStyle("-fx-font-size:12;-fx-font-weight:bold; -fx-text-fill:#FFFFFF");

TextField playerinfo_pi_playerRoletf = new TextField();
playerinfo_pi_playerRoletf.setPromptText("Enter Player Role");

playerinfo_pi_playerRoletf.setStyle("-fx-pref-width : 180;-fx-text-fill:#FFFFFF");

HBox playerinfo_pi_playerRole = new HBox(10,playerinfo_pi_playerRoleLabel, playerinfo_pi_playerRoletf);
playerinfo_pi_playerRole.setMaxSize(400, 20);
// Player batting style input setup
Label playerinfo_pi_playerBatStyleLabel = new Label("Enter Player Batting Style : ");
playerinfo_pi_playerBatStyleLabel.setStyle("-fx-font-size:12;-fx-font-weight:bold; -fx-text-fill:#FFFFFF");

TextField playerinfo_pi_playerBatStyletf = new TextField();
playerinfo_pi_playerBatStyletf.setPromptText("Enter Player Batting Style");

playerinfo_pi_playerBatStyletf.setStyle("-fx-pref-width : 180;-fx-text-fill:#FFFFFF");

HBox playerinfo_pi_playerBatStyle = new HBox(10,playerinfo_pi_playerBatStyleLabel, playerinfo_pi_playerBatStyletf);
playerinfo_pi_playerBatStyle.setMaxSize(400, 20);
// Player bowling style input setup
Label playerinfo_pi_playerBowlStyleLabel = new Label("Enter Player Bowling Style : ");
playerinfo_pi_playerBowlStyleLabel.setStyle("-fx-font-size:12;-fx-font-weight:bold; -fx-text-fill:#FFFFFF");

TextField playerinfo_pi_playerBowlStyletf = new TextField();
playerinfo_pi_playerBowlStyletf.setPromptText("Enter Player Bowling Style");

playerinfo_pi_playerBowlStyletf.setStyle("-fx-pref-width : 180;-fx-text-fill:#FFFFFF");

HBox playerinfo_pi_playerBowlStyle = new HBox(10,playerinfo_pi_playerBowlStyleLabel, playerinfo_pi_playerBowlStyletf);
playerinfo_pi_playerBowlStyle.setMaxSize(400, 20);
// Country flag input setup

Label playerinfo_pi_countryFlagLabel = new Label("Enter Country Flag : ");
playerinfo_pi_countryFlagLabel.setStyle("-fx-font-size:12;-fx-font-weight:bold; -fx-text-fill:#FFFFFF");

TextField playerinfo_pi_countryFlagtf = new TextField();
playerinfo_pi_countryFlagtf.setPromptText("Enter Country Flag");
playerinfo_pi_countryFlagtf.setStyle("-fx-pref-width : 180;-fx-text-fill:#FFFFFF");

HBox playerinfo_pi_countryFlagImg = new HBox(10,playerinfo_pi_countryFlagLabel, playerinfo_pi_countryFlagtf);
playerinfo_pi_countryFlagImg.setMaxSize(400, 20);
// Player info URL input setup
Label playerinfo_pi_playerInfoUrlLabel = new Label("Enter Info URL : ");
playerinfo_pi_playerInfoUrlLabel.setStyle("-fx-font-size:12;-fx-font-weight:bold; -fx-text-fill:#FFFFFF");

TextField playerinfo_pi_playerInfoUrltf = new TextField();
playerinfo_pi_playerInfoUrltf.setPromptText("Enter Info URL");
playerinfo_pi_playerInfoUrltf.setStyle("-fx-pref-width : 180;-fx-text-fill:#FFFFFF");

HBox playerinfo_pi_playerInfoUrl = new HBox(10,playerinfo_pi_playerInfoUrlLabel, playerinfo_pi_playerInfoUrltf);
playerinfo_pi_playerInfoUrl.setMaxSize(400, 20);
// Button to add player data
Button playerinfo_pi_addButton = new Button("Add Data");
playerinfo_pi_addButton.setStyle("-fx-pref-width:120;-fx-min-height: 30;-fx-background-radius: 15;-fx-background-color : #2196F3; -fx-text-fill:#FFFFFF");
HBox playerinfo_pi_buttonBox = new HBox(playerinfo_pi_addButton);
playerinfo_pi_buttonBox.setAlignment(Pos.CENTER);
// Output label for messages
Label playerinfo_pi_output = new Label();

playerinfo_pi_output.setStyle("fx-font-size:12;-fx-text-fill:#FFFFFF");

// File chooser setup for player image selection
FileChooser playerinfo_pi_fileChooser = new FileChooser();
playerinfo_pi_fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Image Files","*.png", "*.jpg", "*.jpeg"));
// Event handler for clicking on the player image view to select an image

playerinfo_pi_playerImgView.setOnMouseClicked(new EventHandler<MouseEvent>() {
@Override
public void handle(MouseEvent playerinfo_pi_event) {
File playerinfo_pi_selectedFile =playerinfo_pi_fileChooser.showOpenDialog(playerinfo_pi_primaryStage);
if (playerinfo_pi_selectedFile != null) {
String playerinfo_pi_imageUrl =ImageUpload.uploadImage(playerinfo_pi_selectedFile.getPath(),playerinfo_pi_selectedFile.getName());

playerinfo_pi_imgUrl = playerinfo_pi_imageUrl;
if (playerinfo_pi_imageUrl != null) {
Image playerinfo_pi_image = new Image(playerinfo_pi_imageUrl);
playerinfo_pi_playerImgView.setImage(playerinfo_pi_image);

}
}
}
});
// Event handler for adding player data
playerinfo_pi_addButton.setOnAction(new EventHandler<ActionEvent>() {

@Override

public void handle(ActionEvent playerinfo_pi_event) {
// Create a Player object and set its attributes from the input fields

Player playerinfo_pi_player = new Player();
playerinfo_pi_player.setPlayerName(playerinfo_pi_playerNametf.getText());
playerinfo_pi_player.setPlayerAge(playerinfo_pi_playerAgetf.getText());
playerinfo_pi_player.setCountry(playerinfo_pi_playerCountrytf.getText());
playerinfo_pi_player.setPlayerRole(playerinfo_pi_playerRoletf.getText());
playerinfo_pi_player.setBattingStyle(playerinfo_pi_playerBatStyletf.getText());
playerinfo_pi_player.setBowlingStyle(playerinfo_pi_playerBowlStyletf.getText())
;
playerinfo_pi_player.setInfoUrl(playerinfo_pi_playerInfoUrltf.getText());
playerinfo_pi_player.setFlag(playerinfo_pi_countryFlagtf.getText());

if(playerinfo_pi_imgUrl != null)
playerinfo_pi_player.setPlayerImg(playerinfo_pi_imgUrl);
else
playerinfo_pi_output.setText("Please add Image");
// Check if all compulsory fields are filled
if(checkCompulsoryFields(playerinfo_pi_player)){
// Attempt to add the player using the PlayerController
if(playerinfo_pi_playerController.addPlayers(playerinfo_pi_player)){
playerinfo_pi_output.setText("Player Added Successfully");

}else{
playerinfo_pi_output.setText("Player Not Added");

}
}else{
playerinfo_pi_output.setText("Fields are Empty");
}
}
});
// VBox to contain all form components and output label
VBox playerinfo_pi_page = new VBox(20, playerinfo_pi_playerImage_hb,
playerinfo_pi_playerName, playerinfo_pi_playerAge, playerinfo_pi_playerCountry,
playerinfo_pi_playerRole, playerinfo_pi_playerBatStyle, playerinfo_pi_playerBowlStyle,
playerinfo_pi_countryFlagImg, playerinfo_pi_playerInfoUrl, playerinfo_pi_buttonBox,
playerinfo_pi_output);

return playerinfo_pi_page;
}
/*
* Method to check if all compulsory fields in the player
object are filled.
* @param playerinfo_pi_player The player object to check.
* @return True if all compulsory fields are filled, false
otherwise.
*/
private boolean checkCompulsoryFields(Player playerinfo_pi_player) {
if(playerinfo_pi_player.getPlayerName().trim().isEmpty()
|| playerinfo_pi_player.getPlayerAge().trim().isEmpty()
|| playerinfo_pi_player.getPlayerImg().trim().isEmpty()
|| playerinfo_pi_player.getPlayerRole().trim().isEmpty()
|| playerinfo_pi_player.getCountry().trim().isEmpty()
|| playerinfo_pi_player.getBattingStyle().trim().isEmpty()
|| playerinfo_pi_player.getBowlingStyle().trim().isEmpty()
|| playerinfo_pi_player.getFlag().trim().isEmpty()
|| playerinfo_pi_player.getInfoUrl().trim().isEmpty()){
return false;

}



return true;
}
}

