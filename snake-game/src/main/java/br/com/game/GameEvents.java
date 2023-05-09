package br.com.game;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.input.KeyCode;
import javafx.util.Duration;

public class GameEvents {

    private  Scenario scenario;
    private KeyCode currentDirection;
    private Snake snake;

    public GameEvents(Scenario scenario, Snake snake) {
        this.snake = snake;
        this.scenario = scenario;
        this.scenario.setKeyPressed(e -> {
            KeyCode keyPressed = e.getCode();

            if (keyPressed.equals(KeyCode.RIGHT) || keyPressed.equals(KeyCode.D)) {
                currentDirection = keyPressed;
            }

            if (keyPressed.equals(KeyCode.DOWN) || keyPressed.equals(KeyCode.S)) {
                currentDirection = keyPressed;
            }

            if (keyPressed.equals(KeyCode.LEFT) || keyPressed.equals(KeyCode.A)) {
                currentDirection = keyPressed;
            }

            if (keyPressed.equals(KeyCode.UP) || keyPressed.equals(KeyCode.W)) {
                currentDirection = keyPressed;
            }
        } );

        startMovement();
    }

    private void startMovement() {
        Timeline timeline = new Timeline();

        KeyFrame keyFrame = new KeyFrame(Duration.millis(Configurations.KEY_FRAME_TIME_IN_MILLIS), e -> {
            Integer positionX = snake.getPositionX();
            Integer positionY = snake.getPositionY();

            if (KeyCode.RIGHT.equals(currentDirection) || KeyCode.D.equals(currentDirection)) {
                positionX += Configurations.SQUARE_SIZE;
            }

            if (KeyCode.DOWN.equals(currentDirection) || KeyCode.S.equals(currentDirection)) {
                positionY += Configurations.SQUARE_SIZE;
            }

            if (KeyCode.LEFT.equals(currentDirection) || KeyCode.A.equals(currentDirection)) {
                positionX -= Configurations.SQUARE_SIZE;
            }

            if (KeyCode.UP.equals(currentDirection) || KeyCode.W.equals(currentDirection)) {
                positionY -= Configurations.SQUARE_SIZE;
            }

            this.snake.setPosition(positionX,positionY);
        });

        timeline.getKeyFrames().add(keyFrame);
        timeline.setCycleCount(Integer.MAX_VALUE);
        timeline.play();
    }
}
