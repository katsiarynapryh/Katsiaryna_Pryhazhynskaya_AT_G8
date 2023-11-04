package homework.day4.playground.utils;

import java.util.Random;

public class CoordinatesGenerator {
    public static int generateCoordinate() {
        Random rn = new Random();
        int randomNum = rn.nextInt(79) + 1;

        if (randomNum >= 1 && randomNum <= 79) {
            System.out.println("I have generated point with value: " + randomNum);
        }

        return randomNum;
    }
}