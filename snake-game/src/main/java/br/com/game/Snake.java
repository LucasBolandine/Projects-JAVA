package br.com.game;


import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

public class Snake {

    private Canvas headSnake;

    public Snake() {
        createSnake();
    }

    private void createSnake() {

        this.headSnake = Utils.buildSquare(Color.BLACK);
        this.headSnake.setTranslateX(Configurations.snakeStartingPositionX());
        this.headSnake.setTranslateX(Configurations.snakeStartingPositionY());
    }

    public Canvas getHeadSnake() {
        return headSnake;
    }
}
