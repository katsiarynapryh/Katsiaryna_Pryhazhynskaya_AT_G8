package homework.day8;

import java.util.ArrayList;
import java.util.List;

public class Countries {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("Андора");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");

        for (String mycountry : countries) {
            System.out.print(mycountry); //отпечатать слова в консоль через запятую с пробелом
            if (countries.indexOf(mycountry) != countries.size() - 1)
                System.out.print(", ");
        }

        System.out.println();

        int counter = 0;
        for (String mycountry : countries) {
            if (mycountry.length() < 7) {
                counter++;
            }
        }
        System.out.println("стран, в названии которых меньше 7 букв:" + counter); //Посчитать сколько стран, в названии которых меньше 7 букв и вывести число в консоль


        for (int i = 0; i < countries.size(); i++) {
            System.out.print(countries.get(i) + "\n"); //отпечатать слова в консоль с новой строки
        }

    }
}