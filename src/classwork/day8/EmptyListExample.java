package classwork.day8;

import java.util.ArrayList;
import java.util.List;

public class EmptyListExample {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        for (String mycolor : colors) {
            System.out.println(mycolor);
        }
        System.out.println();

        colors.add("Pink");
        colors.add("Yellow");
        System.out.println(colors.get(2));
        System.out.println(colors.get(4));


        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }


    }

}
