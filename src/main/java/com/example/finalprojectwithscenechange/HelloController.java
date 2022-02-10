package com.example.finalprojectwithscenechange;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.stage.FileChooser;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label SavedNoteText;

    @FXML
    private Button AreYouSure;

    @FXML
    private Label homeScreenText;

    @FXML
    private Button CloseButton;

    @FXML
    private Button BackButton;

    @FXML
    private Button CloseButton1;


    //for change scene {
    private Stage stage;
    private Scene scene;
    private Parent root;
    //for change scene }

    //for closing window {
    public void CloseApplication(ActionEvent event){
    }
    //for closing window }


    // For changing scene, creating methods, Attached via SceneBuilder "OnAction" {
    public void switchToScene1(ActionEvent event){
        try { // to go to the START scene
            Parent root = FXMLLoader.load(getClass().getResource("Start-page.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void switchToScene2(ActionEvent event){
        try { // to go to the NOTES scene
            Parent root = FXMLLoader.load(getClass().getResource("CreateOpenPage.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void switchToScene3(ActionEvent event){
        try { //to to to RESOURCE file hub scene
            Parent root = FXMLLoader.load(getClass().getResource("ResourcePage.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void switchToCloseScene(ActionEvent event){
        try { // to go to the NOTES scene
            Parent root = FXMLLoader.load(getClass().getResource("AreYouSure.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


// For changing scene, creating methods, Attached via SceneBuilder "OnAction" }

}


