package br.com.game;

import java.util.Random;

public class Configurations {

    public static final Integer WIDTH_SCENARIO = 880;
    public static final Integer HEIGTH_SCENARIO = 640;
    public static final Integer SQUARE_SIZE = 40;

    public static int snakeStartingPositionX() {
        Random generator = new Random();

        int min = 1;
        int numberCalculatePositionX = generator.nextInt(WIDTH_SCENARIO - min + 1) + min;
        int localPositionX = WIDTH_SCENARIO / numberCalculatePositionX;
        return  localPositionX;
    }

    public static int snakeStartingPositionY() {
        Random generator = new Random();

        int min = 1;
        int numberCalculatePositionY = generator.nextInt(HEIGTH_SCENARIO - min + 1) + min;
        int localPositionY = HEIGTH_SCENARIO / numberCalculatePositionY;
        return  localPositionY;
    }


}

