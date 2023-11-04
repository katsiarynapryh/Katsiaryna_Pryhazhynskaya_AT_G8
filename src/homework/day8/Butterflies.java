package homework.day8;

import java.util.ArrayList;
import java.util.List;

public class Butterflies {
    public static void main(String[] args) {
        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");


        for (String mybutterfly : butterflies) {
            System.out.print("\"" + mybutterfly + "\""); //отпечатать слова в консоль в кавычках
        }
        System.out.println();

        int counter = 0;
        for (String mybutterfly : butterflies) {
            if (mybutterfly.indexOf('o') >= 0) {
                counter++;
            }
        }
        System.out.println("количество бабочек с симовлом о:" + counter); // Посчитать сколько бабочек содержат букву "о" и вывести число в консоль

        for (int i = 0; i < butterflies.size(); i++) {
            System.out.print(butterflies.get(i) + " "); //отпечатать слова в консоль через пробел
        }
        System.out.println();

        for (String mybutterfly : butterflies) {
            System.out.println(mybutterfly); //отпечатать слова в консоль через перенос строки
        }
    }
}