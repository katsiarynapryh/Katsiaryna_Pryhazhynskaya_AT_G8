package homework.day8;

import java.util.ArrayList;
import java.util.List;

public class Noodles {
    public static void main(String[] args) {
        List<String> noodles = new ArrayList<>();
        noodles.add("Hakka");
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");

        //отпечатать слова в консоль через тире
        for (String myN : noodles) {
            System.out.print(myN);
            if (noodles.indexOf(myN) != noodles.size() - 1)
                System.out.print("-");
        }

        System.out.println();

        //Заменить в каждом слове буквы "а" на букву "о"
        for (int i = 0; i < noodles.size(); i++) {
            noodles.set(i, noodles.get(i).replace("a", "o"));
        }

        for (int i = 0; i < noodles.size(); i++) {
            System.out.print(noodles.get(i) + " "); //отпечатать слова в консоль через пробел
        }

    }
}