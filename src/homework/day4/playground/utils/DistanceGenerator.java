package homework.day4.playground.utils;

import java.util.Random;

public class DistanceGenerator {
    public static int generateDistance() {
        Random rn = new Random();
        int randomNum = rn.nextInt(99) + 1;
        if (randomNum >= 1 && randomNum <= 99) {
            System.out.println("DistanceGenerator: I have generated distance with value: " + randomNum);
        }

        return randomNum;
    }
}
