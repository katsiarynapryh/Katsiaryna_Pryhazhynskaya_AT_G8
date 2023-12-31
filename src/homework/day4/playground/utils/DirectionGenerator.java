package homework.day4.playground.utils;

import java.util.Random;

public class DirectionGenerator {
    public static String generateDirection() {
        Random rn = new Random();
        int randomNum = rn.nextInt(39) + 1;
        if (randomNum >= 1 && randomNum <= 9) {
            return "NORTH";
        } else if (randomNum >= 10 && randomNum <= 19) {
            return "SOUTH";
        } else if (randomNum >= 20 && randomNum <= 29) {
            return "WEST";
        } else if (randomNum >= 30 && randomNum <= 39) {
            return "EAST";
        } else {
            return "not valid direction parameters";}
        // генерирует случайное число от 1 (включая) до 40 (исключая),
        // и возвращает строку одного из 4-х значений направления, следуя логике,
        // если случайное от 1 до 9 - NORTH, от 10 до 19 - SOUTH, от 20 до 29 - WEST, от 30 до 39 - EAST
    }
}
