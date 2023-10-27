package classwork.day8;

import java.util.ArrayList;
import java.util.List;

public class VegetablesList {
    public static void main(String[] args) {
        List<String> vegetables = new ArrayList<>();
        vegetables.add("Помидор");
        vegetables.add("Огурец");
        vegetables.add("Кабачок");
        vegetables.add("Батат");
        vegetables.add("Картоха");
        for (String myveg : vegetables) {
            System.out.println(myveg);
        }
        System.out.println();

        int counter = 0;
        for (String myveg : vegetables) {
            if (myveg.contains("a")) {
                counter++;
            }
        }
        System.out.println(counter++);
        System.out.println();

        // доделать задание

    }
}
