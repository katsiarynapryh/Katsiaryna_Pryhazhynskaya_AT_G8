package homework.day8;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Cars {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Мерс");
        cars.add("Ауди");
        cars.add("Жигуль");
        cars.add("Рено");
        cars.add("Жигуль");
        cars.add("Жигуль");
        cars.add("Ауди");

        try (
                FileWriter myWriter = new FileWriter("cars.txt", false)) {
            for (String mycar : cars) {
                myWriter.write("\"" + mycar + "\"" + "\n"); //с новой строки в кавычках
            }
        } catch (
                Exception ex) {
            System.out.println("Error:" + ex.getMessage());
        }

        // Найти и удалить из набора авто, в названии которых больше 4 букв
        for (int i = 0; i < cars.size(); i++) {
            int counter = cars.get(i).toCharArray().length;
            if (counter > 4) {
                cars.remove(i);
                i--;
            }
        }

        for (String mycar : cars) {
            System.out.print(mycar + " "); //отпечатать слова в консоль через пробел
        }

    }
}