package com.example.finalprojectwithscenechange;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class HelloApplication extends Application {

    private double xOffset = 0;
    private double yOffset = 0;


    @Override
    public void start(Stage stage) throws IOException {
        try {
            //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
            Parent root = FXMLLoader.load(getClass().getResource("Start-page.fxml"));
            Scene scene = new Scene(root);
            stage.setResizable(false);
            stage.initStyle(StageStyle.TRANSPARENT);
            scene.setFill(Color.TRANSPARENT);
            stage.setTitle("Hello!");

            root.setOnMousePressed(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    xOffset = mouseEvent.getSceneX();
                    yOffset = mouseEvent.getSceneY();
                }
            });
            root.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle (MouseEvent event) {
                stage.setX(event.getScreenX() - xOffset);
                stage.setY(event.getScreenY() - yOffset);
            }
            });
            stage.setScene(scene);
            stage.show();



} catch(Exception e){
        e.printStackTrace();
        }

        }

public static void main(String[]args)
        {
        launch(args);
        }
        }