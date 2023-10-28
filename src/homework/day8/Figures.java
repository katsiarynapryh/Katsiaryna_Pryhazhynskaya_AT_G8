package homework.day8;

import java.io.*;
// import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Figures {
    public static void main(String[] args) {
        String myFigures[] = new String[]{"Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс"};
        List<String> figures = Arrays.asList(myFigures);

        try (FileWriter myWriter = new FileWriter("figures.txt", false)) {
            for (String myfig : figures) {
                myWriter.write(myfig);
                if (figures.indexOf(myfig) != figures.size() - 1)
                    myWriter.write("-");
            }
        } catch (Exception ex) {
            System.out.println("Error:" + ex.getMessage());
        }

        int counter = 0;
        for (String myfig : figures) {
            if (myfig.indexOf('и') == -1) {
                counter++;
            }
        }
        System.out.println("столько фигур не содержат симовол и:" + counter); // Посчитать сколько фигур НЕ содержат букву "и" и вывести число в консоль

        for (int i = 0; i < figures.size(); i++) {
            System.out.print(figures.get(i) + " "); //отпечатать слова в консоль через пробел
        }
        System.out.println();

        figures.add(2, "Треугольник"); //Вставить на 3 позицию Треугольник

        for (String myfig : figures) {
            System.out.print(myfig + " "); //отпечатать слова в консоль через пробел
        }

    }
}