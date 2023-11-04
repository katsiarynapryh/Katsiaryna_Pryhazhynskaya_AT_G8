package homework.day8;

import java.util.Arrays;
import java.util.List;

public class Doubles {
    public static void main(String[] args) {
        Double myDoub[] = {33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9};
        List<Double> doubles = Arrays.asList(myDoub);

        for (Double myD : doubles) {
            System.out.print(myD + " "); //отпечатать числа в консоль через пробел
        }

        System.out.println();

        int result = 1;
        for (Double myD : doubles) {
            result *= myD;
            System.out.println("произведение всех чисел: " + result); //отпечатать числа в консоль через пробел
        }

        // найти сумму всех дробных частей и вывести результат в консоль
//        double sum = 0.00;
//        double i = doubles - (int)doubles;
//        for (double i = 0; i < myDoub.length; i++) {
//            sum = sum + myDoub[i];
//        }
//        System.out.println("сумма всех дробных частей: " + sum);

        // Проитерировать список по индексу и вывести целые части в консоль через пробел
//        int y = (int)doubles;
//        for (int y = 0; y < myDoub.length; y++) {
//            System.out.print((int)myDoub + " ");
//        }
    }
}