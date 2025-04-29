package com.playerinfo.view;

import java.util.Set;

import com.playerinfo.controller.BackgroundImageController;
import com.playerinfo.controller.UserController;
import com.playerinfo.model.UserDetail;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/*
* This class represents the login page of the application.
*/
public class LoginPage<CategoriesPage> extends Application {
private Stage playerinfo_pi_primaryStage; // The primary stage for displaying scenes
private Scene playerinfo_pi_loginScene; // Scene for the login page
private Scene playerinfo_pi_userScene, playerinfo_pi_adminScene; // Scenes for the user and admin dashboards
private UserController playerinfo_pi_userController = new UserController(); // Controller for user-related operations
private BackgroundImageController playerinfo_pi_backgroundImg = new BackgroundImageController(); // Controller for background image
public static String playerinfo_pi_key; // Static key to store the logged-in username
// Method to initialize the login page
public void getLoginPage(Stage playerinfo_pi_primaryStage) {
this.playerinfo_pi_primaryStage = playerinfo_pi_primaryStage;
initLoginScene(); // Initialize the login scene
}
// Method to initialize the login scene
private void initLoginScene() {
ImageView playerinfo_pi_logo = new ImageView("1\\demo\\src\\main\\resources\\images\\Logo21.png");

// Logo image

playerinfo_pi_logo.setFitWidth(40);
playerinfo_pi_logo.setPreserveRatio(true);
Label playerinfo_pi_title = new Label("Welcome Back"); // Title label

playerinfo_pi_title.setStyle("-fx-font-size:25 ;-fx-font-weight:bold; -fx-pref-width: 600; -fx-pref-height: 30; -fx-alignment :CENTER; -fx-text-fill:#FFFFFF");
VBox playerinfo_pi_header = new VBox(10, playerinfo_pi_logo,playerinfo_pi_title); // Header VBox containing logo and title

playerinfo_pi_header.setAlignment(Pos.CENTER);
Label playerinfo_pi_userLabel = new Label("Username"); // Label for username

TextField playerinfo_pi_userTextField = new TextField(); //TextField for username input

playerinfo_pi_userTextField.setPromptText("Enter Username");
playerinfo_pi_userTextField.setStyle("-fx-max-width: 270;-fx-min-height: 30; -fx-background-radius: 15;");
playerinfo_pi_userTextField.setFocusTraversable(false);
Label playerinfo_pi_passLabel = new Label("Password"); // Label for password

PasswordField playerinfo_pi_passField = new PasswordField(); //PasswordField for password input

playerinfo_pi_passField.setFocusTraversable(false);
playerinfo_pi_passField.setPromptText("Enter Password");
playerinfo_pi_passField.setStyle("-fx-min-width: 270;-fx-min-height: 30;-fx-background-radius: 15;");

TextField playerinfo_pi_textFieldPassword = new TextField(); //TextField to show password in plain text

playerinfo_pi_textFieldPassword.setPromptText("Enter Password");
playerinfo_pi_textFieldPassword.setFocusTraversable(false);
playerinfo_pi_textFieldPassword.setVisible(false);
playerinfo_pi_textFieldPassword.setStyle("-fx-min-width: 270;-fx-min-height: 30;-fx-background-radius: 15;");
playerinfo_pi_textFieldPassword.textProperty().bindBidirectional(playerinfo_pi_passField.textProperty()); // Bind text properties

Image playerinfo_pi_hide = new Image("1\\demo\\src\\main\\resources\\images\\hidden-12115.png"); //Image for hide icon

Image playerinfo_pi_show = new Image("1\\demo\\src\\main\\resources\\images\\show.png"); //Image for show icon
ImageView playerinfo_pi_icon = new ImageView(playerinfo_pi_show); //ImageView for toggle icon

playerinfo_pi_icon.setFitWidth(30);
playerinfo_pi_icon.setPreserveRatio(true);
HBox playerinfo_pi_passBox = new HBox(10, playerinfo_pi_passField); //HBox for password fields

playerinfo_pi_passBox.setPrefWidth(400);
HBox playerinfo_pi_iconBox = new HBox(10, playerinfo_pi_icon); // HBoxfor toggle icon

playerinfo_pi_iconBox.setMaxWidth(70);
playerinfo_pi_iconBox.setAlignment(Pos.BASELINE_LEFT);
StackPane playerinfo_pi_passFieldStackPane = new StackPane(playerinfo_pi_passBox, playerinfo_pi_iconBox); // StackPane for password field and icon
playerinfo_pi_passFieldStackPane.setAlignment(Pos.BASELINE_RIGHT);
Label playerinfo_pi_output = new Label(); // Label for output messages

playerinfo_pi_output.setStyle("-fx-text-fill: white;");
Button playerinfo_pi_loginButton = new Button("Login"); //Button to trigger login action

playerinfo_pi_loginButton.setStyle("-fx-pref-width:70;-fx-min-height: 30;-fx-background-radius: 15;-fx-background-color : #2196F3; -fx-text-fill:#FFFFFF");
Label playerinfo_pi_signupButton = new Label("Signup"); //Button to navigate to signup scene

playerinfo_pi_signupButton.setStyle(" -fx-background-radius: 15;-fx-text-fill : white");

// Set action for the login button
playerinfo_pi_loginButton.setOnAction(new EventHandler<ActionEvent>() {

@Override
public void handle(ActionEvent playerinfo_pi_event) {
    if (!playerinfo_pi_userTextField.getText().isEmpty() &&!playerinfo_pi_passField.getText().isEmpty()) {

if

(playerinfo_pi_userController.authenticateUser(playerinfo_pi_userTextField.getText(), playerinfo_pi_passField.getText())) {

UserDetail playerinfo_pi_userDetail =playerinfo_pi_userController.getUserDetail(playerinfo_pi_userTextField.getText(
));

if

(playerinfo_pi_userDetail.getRole().equals("USER")) {

initUserScene(); // Initialize user scene
playerinfo_pi_primaryStage.setScene(playerinfo_pi_userScene); // Show user scene

} else if

(playerinfo_pi_userDetail.getRole().equals("ADMIN")) {

initAdminScene(); // Initialize admin scene
playerinfo_pi_primaryStage.setScene(playerinfo_pi_adminScene); // Show admin scene

}
playerinfo_pi_userTextField.clear(); // Clear username field

playerinfo_pi_passField.clear(); // Clear password field

} else {
    playerinfo_pi_output.setText("Invalid Username or Password"); // Show error message

}
} else {
    playerinfo_pi_output.setText("Please Enter Username and Password"); // Show error message

}
}
});
// Toggle visibility of password
playerinfo_pi_icon.setOnMouseClicked(new EventHandler<MouseEvent>() {
@Override
public void handle(MouseEvent playerinfo_pi_event) {
if (playerinfo_pi_passField.isVisible()) {
    playerinfo_pi_passField.setVisible(false);
    playerinfo_pi_textFieldPassword.setVisible(true);
    playerinfo_pi_passBox.getChildren().remove(0);
    playerinfo_pi_passBox.getChildren().add(0,

    playerinfo_pi_textFieldPassword);

    playerinfo_pi_icon.setImage(playerinfo_pi_hide);
} else {
    playerinfo_pi_passField.setVisible(true);
    playerinfo_pi_textFieldPassword.setVisible(false);
    playerinfo_pi_passBox.getChildren().remove(0);
    playerinfo_pi_passBox.getChildren().add(0,

    playerinfo_pi_passField);

    playerinfo_pi_icon.setImage(playerinfo_pi_show);
}
}
});
// Set action for the signup button
playerinfo_pi_signupButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
@Override
public void handle(MouseEvent playerinfo_pi_event) {
showSignupScene(); // Show signup scene
playerinfo_pi_userTextField.clear(); // Clear username field

playerinfo_pi_passField.clear(); // Clear password field

}
});
// Style the labels
playerinfo_pi_userLabel.setStyle("-fx-text-fill: white;");
playerinfo_pi_passLabel.setStyle("-fx-text-fill: white;");
// Create VBox layouts for the fields and buttons
VBox playerinfo_pi_fieldBox1 = new VBox(10, playerinfo_pi_userLabel,playerinfo_pi_userTextField); // VBox for username
playerinfo_pi_fieldBox1.setMaxSize(300, 30);

VBox playerinfo_pi_fieldBox2 = new VBox(10, playerinfo_pi_passLabel,playerinfo_pi_passFieldStackPane); // VBox for password
playerinfo_pi_fieldBox2.setMaxSize(300, 30);
// Main VBox layout for the login page
VBox playerinfo_pi_loginBox = new VBox(20, playerinfo_pi_header,playerinfo_pi_fieldBox1, playerinfo_pi_fieldBox2, playerinfo_pi_loginButton,playerinfo_pi_signupButton, playerinfo_pi_output);

playerinfo_pi_loginBox.setStyle("-fx-pref-height : 200 ;-fx-alignment : TOP_CENTER ; -fx-padding : 30;-fx-background-color : rgba(0, 0, 0, 0.5);");
playerinfo_pi_loginBox.setMaxSize(400, 200);
StackPane playerinfo_pi_sp = new StackPane(playerinfo_pi_loginBox); // StackPane for the login page

playerinfo_pi_sp.setStyle("-fx-background-image:url('" + playerinfo_pi_backgroundImg.imageData() + "');-fx-background-size:cover;");

playerinfo_pi_loginScene = new Scene(playerinfo_pi_sp, 1000, 800); //Create login scene
}
// Method to initialize the user scene
private void initUserScene() {
UserPage playerinfo_pi_userPage = new UserPage(); // Create UserPage instance

playerinfo_pi_userPage.setUserPage(playerinfo_pi_primaryStage);
playerinfo_pi_userScene = new Scene(playerinfo_pi_userPage.createUserScene(this::handleLogout), 1000,800); // Create user scene

playerinfo_pi_userPage.setUserPageScene(playerinfo_pi_userScene);
}
// Method to initialize the admin scene
private void initAdminScene() {
categoriesPage  playerinfo_pi_adminPage = new categoriesPage();
// Create CategoriesPage instance

playerinfo_pi_adminPage.setCategoryPage(playerinfo_pi_primaryStage);
playerinfo_pi_adminScene = new Scene(playerinfo_pi_adminPage.createCategoryScene(this::handleLogout),1000, 800); // Create admin scene

playerinfo_pi_adminPage.setCategoryScene(playerinfo_pi_adminScene);
}
// Method to get the login scene
public Scene getLoginScene() {
return playerinfo_pi_loginScene;
}
// Method to show the login scene
public void showLoginScene() {
    playerinfo_pi_primaryStage.setScene(playerinfo_pi_loginScene);
    playerinfo_pi_primaryStage.show();
}
// Method to show the signup scene
private void showSignupScene() {
SignupPage signupPage = new SignupPage(); // Create SignupPage instance

Scene signupScene =signupPage.createSignupScene(this::handleBack); // Create signu scene

playerinfo_pi_primaryStage.setScene(signupScene);
playerinfo_pi_primaryStage.show();
}
// Method to handle logout action
private void handleLogout() {
    playerinfo_pi_primaryStage.setScene(playerinfo_pi_loginScene); // Show login scene
}
// Method to handle back action from signup
private void handleBack() {
    playerinfo_pi_primaryStage.setScene(playerinfo_pi_loginScene); // Show login scene
}
@Override
public void start(Stage playerinfo_pi_primaryStage) throws Exception
{
Class.forName("com.playerinfo.configuration.FirebaseInitialization");
// Initialize Firebase

LoginPage loginController = new LoginPage(); // Create LoginPage instance

loginController.getLoginPage(playerinfo_pi_primaryStage); //Initialize login page
playerinfo_pi_primaryStage.setScene(loginController.getLoginScene());
// Set the initial scene to the login scene

playerinfo_pi_primaryStage.setTitle("Players Information"); //Set the title of the primary stage window
playerinfo_pi_primaryStage.getIcons().add(new Image("1\\demo\\src\\main\\resources\\images\\Logo21.png")); // Set the icon of the primary stage window

playerinfo_pi_primaryStage.show(); // Show the primary stage window
}
}
