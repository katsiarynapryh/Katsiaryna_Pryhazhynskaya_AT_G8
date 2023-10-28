package homework.day8;

import java.util.ArrayList;
import java.util.List;

public class Cities {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");
        for (String mycities : cities) {
            System.out.println(mycities); //отпечатать слова в консоль с новой строки
        }

        for(Character character : cities) {
            int lettersCount = 0;
            for (String mycities : cities) {
                for (int i = 0; i < cities.size(); i++) {
                    if (mycities.charAt(i) == character)) {
                        lettersCount++;
                    }
                }
            }
            System.out.println("сумма всех буков во всех словах:" + lettersCount); // Посчитать сумму всех буков во всех словах и вывести число в консоль
        }

        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " "); //отпечатать слова в консоль через пробел
        }
    }
}