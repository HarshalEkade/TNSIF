package com.playerinfo.view;

import java.util.Map;
import com.playerinfo.controller.PlayerController;
import javafx.animation.ScaleTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextBoundsType;
import javafx.scene.text.TextFlow;

import javafx.stage.Stage;
import javafx.util.Duration;
public class categoriesPage {
private Stage playerinfo_pi_primaryStage;
private PlayerController playerinfo_pi_playerController = new PlayerController(); // Service to interact with Firestore
private Scene playerinfo_pi_categoryScene, playerinfo_pi_playerListScene,playerinfo_pi_addPlayerScene;
VBox playerinfo_pi_vb; // VBox to hold the user scene components
public categoriesPage() {
// Default constructor
}
public void setCategoryScene(Scene playerinfo_pi_scene){
this.playerinfo_pi_categoryScene = playerinfo_pi_scene;
}
public void setCategoryPage(Stage playerinfo_pi_primaryStage){
this.playerinfo_pi_primaryStage = playerinfo_pi_primaryStage;
}
// Constructor to initialize the CategoriesPage with the PlayerController instance.
public categoriesPage(PlayerController
playerinfo_pi_playerController) {

this.playerinfo_pi_playerController = playerinfo_pi_playerController;
}
// Method to create the category scene
public VBox createCategoryScene(Runnable playerinfo_pi_logoutHandler) {

Button playerinfo_pi_logoutButton = new Button("Logout"); //Button to trigger logout action

playerinfo_pi_logoutButton.setStyle("-fx-pref-width:120;-fx-min-height: 30;-fx-background-radius: 15;-fx-background-color : #2196F3; -fx-playerinfo_pi_text-fill:#FFFFFF");
Label playerinfo_pi_title = new Label("Countries"); // Label to display the title

playerinfo_pi_title.setStyle("-fx-font-size:30 ;-fx-font-weight bold; -fx-pref-width: 700; -fx-pref-height: 30; -fx-alignment :CENTER ;-fx-playerinfo_pi_text-fill:#FFFFFF");

Button playerinfo_pi_addPlayer = new Button("Add Player"); //Button to add a new player

playerinfo_pi_addPlayer.setStyle("-fx-pref-width:120;-fx-min-height: 30;-fx-background-radius: 15;-fx-background-color : #2196F3; -fx-playerinfo_pi_text-fill:#FFFFFF");
HBox playerinfo_pi_header = new HBox(50, playerinfo_pi_logoutButton,playerinfo_pi_title); // HBox for header section

playerinfo_pi_header.setStyle("-fx-pref-width: 800;-fx-pref-height: 30;");

Map<String, String> playerinfo_pi_countryLists =playerinfo_pi_playerController.getAllCountries(); // Get the list of countries

GridPane playerinfo_pi_circles =createCircles(playerinfo_pi_countryLists); // Create circles representing countries

// Set action for the logout button
playerinfo_pi_logoutButton.setOnAction(new EventHandler<ActionEvent>() {

@Override
public void handle(ActionEvent playerinfo_pi_event) {
playerinfo_pi_logoutHandler.run(); // Run the logout handler
}
});

// Set action for the add player button
playerinfo_pi_addPlayer.setOnAction(new EventHandler<ActionEvent>() {

@Override
public void handle(ActionEvent playerinfo_pi_event) {
initAddPlayerScene();

playerinfo_pi_primaryStage.setScene(playerinfo_pi_addPlayerScene); // Show add player scene

playerinfo_pi_primaryStage.setTitle("Admin Dashboard");
}
});
ScrollPane playerinfo_pi_scrollPane = new ScrollPane(); //ScrollPane to hold circles

playerinfo_pi_scrollPane.setFitToWidth(true);
// Instructions text
Text playerinfo_pi_point1 = new Text("Welcome Admin");
playerinfo_pi_point1.setFont(Font.font("Arial", 20));
playerinfo_pi_point1.setFill(Color.BLACK);
playerinfo_pi_point1.setBoundsType(TextBoundsType.VISUAL);
Text playerinfo_pi_point2 = new Text("1. Here are the countries of which we have\n Players listed.");

playerinfo_pi_point2.setFont(Font.font("Times New Roman", 16));
playerinfo_pi_point2.setFill(Color.BLACK);
playerinfo_pi_point2.setBoundsType(TextBoundsType.VISUAL);
// Player parameters text
Text playerinfo_pi_line1 = new Text("2. Player contains following parameters\n");

Text playerinfo_pi_line2 = new Text("\tName\n");
Text playerinfo_pi_line3 = new Text("\tAge\n");
Text playerinfo_pi_line4 = new Text("\tImage\n");
Text playerinfo_pi_line5 = new Text("\tRole\n");
Text playerinfo_pi_line6 = new Text("\tCountry\n");

Text playerinfo_pi_line7 = new Text("\tCountry Flag ('https://static.vecteezy.com/system/resources/previews/014/743/461/original/india-country-flags-name-in-the-world-free-vector.jpg')\n");
Text playerinfo_pi_line8 = new Text("\tBatting Style\n");
Text playerinfo_pi_line9 = new Text("\tBowling Style\n");
Text playerinfo_pi_line10 = new Text("\tInfo URL ('https://www.cricbuzz.com/')");
// Set the font and color for each Text node
Text[] playerinfo_pi_lines = {playerinfo_pi_line1, playerinfo_pi_line2,
playerinfo_pi_line3, playerinfo_pi_line4, playerinfo_pi_line5, playerinfo_pi_line6,
playerinfo_pi_line7, playerinfo_pi_line8, playerinfo_pi_line9, playerinfo_pi_line10};

for (Text playerinfo_pi_line : playerinfo_pi_lines) {
playerinfo_pi_line.setFont(Font.font("Times New Roman",16));

playerinfo_pi_line.setFill(Color.BLACK);
playerinfo_pi_line.setBoundsType(TextBoundsType.VISUAL);
}
// Create a TextFlow container and add the Text nodes
TextFlow playerinfo_pi_textFlow = new TextFlow(playerinfo_pi_lines);
playerinfo_pi_textFlow.setLineSpacing(10);
// Additional instruction text
Text playerinfo_pi_point3 = new Text("You can add a Player by clicking below button\n\n\t\t\t\t 👇");

playerinfo_pi_point3.setFont(Font.font("Times New Roman", 16));
playerinfo_pi_point3.setFill(Color.BLACK);
playerinfo_pi_point3.setBoundsType(TextBoundsType.VISUAL);
// VBox for instruction points
VBox playerinfo_pi_instructionPoints = new VBox(30,

playerinfo_pi_point1, playerinfo_pi_point2, playerinfo_pi_textFlow, playerinfo_pi_point3);
playerinfo_pi_instructionPoints.setStyle("-fx-pref-height:500;");

// Create a VBox layout for the instructions and add player button

VBox playerinfo_pi_instructions = new VBox(40,playerinfo_pi_instructionPoints, playerinfo_pi_addPlayer);

playerinfo_pi_instructions.setStyle("-fx-pref-width: 300;-fx-pref-height: 800; -fx-background-color: rgba(255, 255, 255,0.8); -fx-alignment: BOTTOM_CENTER; -fx-padding: 40 10 50 10;");

HBox playerinfo_pi_body = new HBox(playerinfo_pi_instructions,playerinfo_pi_circles); // HBox for body section

playerinfo_pi_vb = new VBox(100, playerinfo_pi_header, playerinfo_pi_body);

// VBox to hold the header and body

playerinfo_pi_vb.setStyle("-fx-background-image:url('1\\demo\\src\\main\\resources\\images\\CricketStadium.jpeg'); -fx-background-size: cover;-fx-padding: 30 20 20 20;");

return playerinfo_pi_vb; // Return the created VBox
}
// Method to initialize the add player scene
private void initAddPlayerScene() {
AddPlayerPage playerinfo_pi_addPlayerPage = new AddPlayerPage(null); // Create AddPlayerPage instance
playerinfo_pi_addPlayerPage.setAddPlayerPage(playerinfo_pi_primaryStage);

playerinfo_pi_addPlayerScene = new Scene(playerinfo_pi_addPlayerPage.createPlayerScene(this::handleBack),
1000, 800); // Create add player scene
}
// Method to initialize the player list scene
private void initPlayerListScene(String playerinfo_pi_country) {
PlayerListPage playerinfo_pi_playerListPage = new PlayerListPage(playerinfo_pi_country); // Create PlayerListPage instance
playerinfo_pi_playerListPage.setPlayerListPage(playerinfo_pi_primaryStage);

playerinfo_pi_playerListScene = new Scene(playerinfo_pi_playerListPage.createPlayerListScene(this::handleBack), 1000, 800); // Create player list scene

playerinfo_pi_playerListPage.setPlayerListScene(playerinfo_pi_playerListScene);
}
// Method to handle back button action
private void handleBack() {
playerinfo_pi_primaryStage.setScene(playerinfo_pi_categoryScene); //Show category scene
}
// Method to create circles representing countries
private GridPane createCircles(Map<String, String>
playerinfo_pi_countries) {

GridPane playerinfo_pi_gridPane = new GridPane();
playerinfo_pi_gridPane.setHgap(70); // Horizontal gap between columns

playerinfo_pi_gridPane.setVgap(70); // Vertical gap between rows
playerinfo_pi_gridPane.setStyle("-fx-padding: 50 100 50 100");
int i = 0, j = 0;
for (Map.Entry<String, String> playerinfo_pi_entry :

playerinfo_pi_countries.entrySet()) {

String playerinfo_pi_countryName = playerinfo_pi_entry.getKey();
String playerinfo_pi_flag = playerinfo_pi_entry.getValue();
Image playerinfo_pi_image = new Image(playerinfo_pi_flag);
// Create an ImageView
ImageView playerinfo_pi_imageView = new ImageView(playerinfo_pi_image);

playerinfo_pi_imageView.setFitHeight(100); // Set the height of the image view

playerinfo_pi_imageView.setPreserveRatio(true);
// Create a Circle
Circle playerinfo_pi_clip = new Circle(50, 50, 50); //CenterX, CenterY, Radius

playerinfo_pi_clip.setFill(new ImagePattern(playerinfo_pi_image));

// Text for country name
Text playerinfo_pi_text = new Text(playerinfo_pi_countryName);
playerinfo_pi_text.setFont(Font.font("Arial", 16));
playerinfo_pi_text.setFill(Color.WHITE);
playerinfo_pi_text.setBoundsType(TextBoundsType.VISUAL);
VBox playerinfo_pi_vb = new VBox(10, playerinfo_pi_clip,

playerinfo_pi_text); // VBox for circle and text
playerinfo_pi_vb.setAlignment(Pos.CENTER);
// Set action for clicking on a country
playerinfo_pi_vb.setOnMouseClicked(new

EventHandler<MouseEvent>() {
@Override
public void handle(MouseEvent playerinfo_pi_event) {
initPlayerListScene(playerinfo_pi_countryName);
playerinfo_pi_primaryStage.setScene(playerinfo_pi_playerListScene); // Show player list scene

playerinfo_pi_primaryStage.setTitle("Admin Dashboard");
}
});
// Animation for zooming in when mouse enters
ScaleTransition playerinfo_pi_scaleTransition = new
ScaleTransition(Duration.seconds(0.5), playerinfo_pi_vb);
playerinfo_pi_scaleTransition.setFromX(1.0);
playerinfo_pi_scaleTransition.setFromY(1.0);
playerinfo_pi_scaleTransition.setToX(1.1);
playerinfo_pi_scaleTransition.setToY(1.1);
playerinfo_pi_scaleTransition.setCycleCount(1);
playerinfo_pi_scaleTransition.setAutoReverse(false);
// Animation for zooming out when mouse exits

ScaleTransition playerinfo_pi_resetTransition = new
ScaleTransition(Duration.seconds(0.5), playerinfo_pi_vb);
playerinfo_pi_resetTransition.setFromX(1.1);
playerinfo_pi_resetTransition.setFromY(1.1);
playerinfo_pi_resetTransition.setToX(1.0);
playerinfo_pi_resetTransition.setToY(1.0);
playerinfo_pi_resetTransition.setCycleCount(1);
playerinfo_pi_resetTransition.setAutoReverse(false);
playerinfo_pi_vb.setOnMouseEntered(playerinfo_pi_event ->

playerinfo_pi_scaleTransition.play());

playerinfo_pi_vb.setOnMouseExited(playerinfo_pi_event ->

playerinfo_pi_resetTransition.play());

playerinfo_pi_gridPane.add(playerinfo_pi_vb, i, j); // Add VBox to GridPane

if(i == 2){
j++;i = -1;
}
i++;
}
return playerinfo_pi_gridPane; // Return the created GridPane
}
}
