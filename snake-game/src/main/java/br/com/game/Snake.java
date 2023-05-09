package br.com.game;


import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

import java.util.Random;

public class Snake {

    private Canvas headSnake;

    public Snake() {
        createSnake();
    }

    private void createSnake() {
        Random random = new Random();
        Integer setInitX = random.nextInt(
                (Configurations.WIDTH_SCENARIO/Configurations.SQUARE_SIZE) * Configurations.SQUARE_SIZE
        );
        Integer setInitY = random.nextInt(
                (Configurations.WIDTH_SCENARIO/Configurations.SQUARE_SIZE) * Configurations.SQUARE_SIZE
        );

        this.headSnake = Utils.buildSquare(Color.web("#663366"));
        this.headSnake.setTranslateX(setInitX);
        this.headSnake.setTranslateX(setInitY);
    }

    public Canvas getHeadSnake() {
        return headSnake;
    }

    public void setPosition(Integer x, Integer y) {
        this.headSnake.setTranslateX(x);
        this.headSnake.setTranslateY(y);
    }

    public Integer getPositionX() {
        return (int) this.headSnake.getTranslateX();
    }

    public Integer getPositionY() {
        return (int) this.headSnake.getTranslateY();
    }
}
