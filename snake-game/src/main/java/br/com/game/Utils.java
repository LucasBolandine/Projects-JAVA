package br.com.game;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Paint;

public class Utils {

    public static Canvas buildSquare(Paint color) {
        Canvas square = new Canvas(Configurations.SQUARE_SIZE, Configurations.WIDTH_SCENARIO);
        GraphicsContext graphicsContext = square.getGraphicsContext2D();
        graphicsContext.setFill(color);
        graphicsContext.fillRect(0, 0, Configurations.SQUARE_SIZE, Configurations.SQUARE_SIZE);

        return  square;
    }
}
