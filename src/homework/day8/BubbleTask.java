package homework.day8;

import homework.day8.objectclasses.Bubble;

import java.util.Arrays;
import java.util.List;

public class BubbleTask {
    public static void main(String[] args) {
        List<Bubble> bubbles = Arrays.asList(new Bubble(2, "CO2"), new Bubble(4, "O2"), new Bubble(5, "CO"));

        for (Bubble mybubbles : bubbles) {
            System.out.print(mybubbles.getVolume() + " "); //отпечатать объемы в консоль через пробел
        }

        System.out.println();

        for (Bubble mybubbles : bubbles) {
            System.out.print(mybubbles.getName() + " "); //отпечатать имена в консоль через пробел
        }
        System.out.println();

        int countVolume = 0;
        for (Bubble mybubbles : bubbles){
            countVolume += mybubbles.getVolume();
        }
        System.out.println("объем всех пузырей " + countVolume);

        for (int i = 0; i < bubbles.size(); i++) {
            System.out.println(bubbles.get(i).toString());
            }
    }
}