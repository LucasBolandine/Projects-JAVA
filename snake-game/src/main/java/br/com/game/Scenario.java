package br.com.game;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Scenario {

    private Scene scene;
    private Snake snake;
    private Group root = new Group();

    public Scenario(Stage primaryStage, Snake snake) {

        this.scene = new Scene(root, Configurations.WIDTH_SCENARIO,Configurations.HEIGTH_SCENARIO);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Snake Game by Luke Bolandine");
        primaryStage.show();

        this.snake = snake;

        root.getChildren().add(snake.getHeadSnake());
    }

    public void setKeyPressed(EventHandler<? super KeyEvent> action) {
        this.scene.setOnKeyPressed(action);
    }
}
