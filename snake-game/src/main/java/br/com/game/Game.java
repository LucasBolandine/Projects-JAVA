package br.com.game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class Game extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Snake snake = new Snake();
        Scenario scenario = new  Scenario(primaryStage, snake);
        GameEvents gameEvents = new GameEvents(scenario, snake);
    }

}