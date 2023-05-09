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
        Integer setInitX = random.nextInt(880) + 1;
        Integer setInitY = random.nextInt(640) + 1;

        this.headSnake = Utils.buildSquare(Color.BLACK);
        this.headSnake.setTranslateX(Configurations.WIDTH_SCENARIO/ setInitX );
        this.headSnake.setTranslateX(Configurations.HEIGTH_SCENARIO/setInitY );
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
