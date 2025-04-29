package com.playerinfo.view;

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
import com.playerinfo.controller.BackgroundImageController;
import com.playerinfo.controller.UserController;
/*
* This class represents the signup page of the application.
*/
public class SignupPage {
private UserController playerinfo_pi_userController = new UserController(); // Controller for user-related operations
private BackgroundImageController playerinfo_pi_backgroundImg = new BackgroundImageController(); // Controller for background image
/*
* Creates and returns the signup scene.
** @param playerinfo_pi_backHandler A Runnable to handle the action
of going back to the previous scene.
* @return The signup scene.
*/
public Scene createSignupScene(Runnable playerinfo_pi_backHandler) {
    // Logo image
    ImageView playerinfo_pi_logo = new ImageView("1\\demo\\src\\main\\resources\\images\\Logo21.png");
    playerinfo_pi_logo.setFitWidth(40);
    playerinfo_pi_logo.setPreserveRatio(true);
    // Title label
    Label playerinfo_pi_title = new Label("Welcome to Players Info");
    
    playerinfo_pi_title.setStyle("-fx-font-size:25 ;-fx-font-weight: bold; -fx-pref-width: 600; -fx-pref-height: 30; -fx-alignment : CENTER; -fx-text-fill:#FFFFFF");
    
    // Header VBox containing logo and title
    VBox playerinfo_pi_header = new VBox(10, playerinfo_pi_logo, playerinfo_pi_title);
    
    playerinfo_pi_header.setAlignment(Pos.CENTER);
    // Label and TextField for username
    Label playerinfo_pi_userLabel = new Label("Username:");
    TextField playerinfo_pi_userTextField = new TextField();
    playerinfo_pi_userTextField.setPromptText("Enter Username");
    playerinfo_pi_userTextField.setFocusTraversable(false);
    playerinfo_pi_userTextField.setStyle("-fx-max-width: 270;-fx-min-height: 30;-fx-background-radius: 15;");
    // Label and PasswordField for password
    Label playerinfo_pi_passLabel = new Label("Password:");
    PasswordField playerinfo_pi_passField = new PasswordField();
    playerinfo_pi_passField.setFocusTraversable(false);
    playerinfo_pi_passField.setPromptText("Enter Password");
    playerinfo_pi_passField.setStyle("-fx-min-width: 270;-fx-min-height: 30;-fx-background-radius: 15;");
// Button to trigger signup action
Button playerinfo_pi_signupButton = new Button("Signup");
playerinfo_pi_signupButton.setStyle("-fx-pref-width:70;-fx-min-height: 30;-fx-background-radius: 15;-fx-background-color : #2196F3 ;-fx-text-fill:#FFFFF");

// Label to navigate to login scene
Label playerinfo_pi_loginButton = new Label("Login");
playerinfo_pi_loginButton.setStyle(" -fx-background-radius: 15;-fx-text-fill : white");

// TextField to show password in plain text
TextField playerinfo_pi_textFieldPassword = new TextField();
playerinfo_pi_textFieldPassword.setPromptText("Enter Password");
playerinfo_pi_textFieldPassword.setFocusTraversable(false);
playerinfo_pi_textFieldPassword.setVisible(false);
playerinfo_pi_textFieldPassword.setStyle("-fx-min-width: 270;-fx-min-height: 30; -fx-background-radius: 15;");
playerinfo_pi_textFieldPassword.textProperty().bindBidirectional(playerinfo_pi_passField.textProperty());
// Images for toggle icon
Image playerinfo_pi_hide = new Image("1\\demo\\src\\main\\resources\\images\\hidden-12115.png");
Image playerinfo_pi_show = new Image("1\\demo\\src\\main\\resources\\images\\show.png");
ImageView playerinfo_pi_icon = new ImageView(playerinfo_pi_show);
playerinfo_pi_icon.setFitWidth(30);
playerinfo_pi_icon.setPreserveRatio(true);
// HBox for password fields
HBox playerinfo_pi_passBox = new HBox(10, playerinfo_pi_passField);
playerinfo_pi_passBox.setPrefWidth(400);
// HBox for toggle icon
HBox playerinfo_pi_iconBox = new HBox(10, playerinfo_pi_icon);
playerinfo_pi_iconBox.setMaxWidth(70);
playerinfo_pi_iconBox.setAlignment(Pos.BASELINE_LEFT);
// StackPane for password field and icon
StackPane playerinfo_pi_passFieldStackPane = new StackPane(playerinfo_pi_passBox, playerinfo_pi_iconBox);
playerinfo_pi_passFieldStackPane.setAlignment(Pos.BASELINE_RIGHT);

// Label for output messages
Label playerinfo_pi_output = new Label();
playerinfo_pi_output.setStyle("-fx-text-fill: white;");
// Style the labels
playerinfo_pi_userLabel.setStyle("-fx-text-fill: white;");
playerinfo_pi_passLabel.setStyle("-fx-text-fill: white;");
// VBox layouts for the fields and buttons
VBox playerinfo_pi_fieldBox1 = new VBox(10, playerinfo_pi_userLabel,playerinfo_pi_userTextField);

playerinfo_pi_fieldBox1.setMaxSize(300, 30);
VBox playerinfo_pi_fieldBox2 = new VBox(10, playerinfo_pi_passLabel,playerinfo_pi_passFieldStackPane);

playerinfo_pi_fieldBox2.setMaxSize(300, 30);
// Set action for the signup button
playerinfo_pi_signupButton.setOnAction(new EventHandler<ActionEvent>() {

@Override
public void handle(ActionEvent playerinfo_pi_event) {
if (!playerinfo_pi_userTextField.getText().isEmpty() &&!playerinfo_pi_passField.getText().isEmpty()) {

if

(playerinfo_pi_userController.handleSignup(playerinfo_pi_userTextField.getText(), playerinfo_pi_passField.getText())) {
    LoginPage playerinfo_pi_loginPage = new LoginPage();

playerinfo_pi_loginPage.getLoginScene();
} else {
playerinfo_pi_output.setText("User not Registered");

}
} else {
playerinfo_pi_output.setText("Please Enter Username and Password");
}
}
});
// Set action for the login button
playerinfo_pi_loginButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
@Override
public void handle(MouseEvent playerinfo_pi_event) {
playerinfo_pi_backHandler.run();
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
playerinfo_pi_passBox.getChildren().add(0,playerinfo_pi_textFieldPassword);

playerinfo_pi_icon.setImage(playerinfo_pi_hide);
} else {
playerinfo_pi_passField.setVisible(true);
playerinfo_pi_textFieldPassword.setVisible(false);
playerinfo_pi_passBox.getChildren().remove(0);
playerinfo_pi_passBox.getChildren().add(0,playerinfo_pi_passField);

playerinfo_pi_icon.setImage(playerinfo_pi_show);
}
}
});
// Main VBox layout for the signup page
VBox playerinfo_pi_loginBox = new VBox(20, playerinfo_pi_header,
playerinfo_pi_fieldBox1, playerinfo_pi_fieldBox2, playerinfo_pi_signupButton,
playerinfo_pi_loginButton, playerinfo_pi_output);

playerinfo_pi_loginBox.setStyle("-fx-pref-height : 200 ;-fx-alignment : TOP_CENTER ; -fx-padding : 30;-fx-background-color : rgba(0, 0, 0, 0.5);");
playerinfo_pi_loginBox.setAlignment(Pos.CENTER);
playerinfo_pi_loginBox.setMaxSize(400, 200);
playerinfo_pi_loginBox.setOpacity(0.8);
// StackPane for the signup page
StackPane playerinfo_pi_sp = new StackPane(playerinfo_pi_loginBox);
playerinfo_pi_sp.setStyle("-fx-background-image:url('" +playerinfo_pi_backgroundImg.imageData() + "');-fx-background-size:cover; ");

// Return the signup scene
return new Scene(playerinfo_pi_sp, 1000, 800);
}
}