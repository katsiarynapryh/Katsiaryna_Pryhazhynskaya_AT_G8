package homework.day3.cycletask;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class EmptyArray {
    public void arrayTasks() {

        Random rnd = new Random();
        final int ARRAY_SIZE = 7;
        Integer[] trainingArray = new Integer[ARRAY_SIZE];

        for (int i = 0; i < trainingArray.length; i++) {
            trainingArray[i] = rnd.nextInt();
            System.out.print(trainingArray[i] + " "); // пройти по массиву и вывести в консоль все элементы
        }
        System.out.println();

        for (int i = trainingArray.length - 1; i >= 0; i--) {
            System.out.print(trainingArray[i] + " "); // вывести в консоль все элементы массива в обратном порядке
        }
        System.out.println();

        for (int i = 0; i < trainingArray.length; i++) {
            System.out.print(trainingArray[i] * 5 + " "); // каждый элемент массива умножить на 5 и вывести результат в консоль
        }
        System.out.println();

        for (int i = 0; i < trainingArray.length; i++) {
            System.out.print(trainingArray[i] * trainingArray[i] + " "); // каждый элемент массива возвести в квадрат и вывести результат в консоль
        }
        System.out.println();

        int minElement = trainingArray[0];
        for (int i = 1; i < trainingArray.length; i++) {
            if (trainingArray[i] < minElement) {
                minElement = trainingArray[i];
            }
        }
        System.out.println("Min element: " + minElement); // найти минимальный элемент массива и вывести результат в консоль

        int old_val = trainingArray[0];
        trainingArray[0] = trainingArray[trainingArray.length - 1];
        trainingArray[trainingArray.length - 1] = old_val;
        for (int i = 0; i < trainingArray.length; i++) {
            System.out.print(trainingArray[i] + " "); // поменять местами первый и последний элементы и вывести результат в консоль
        }
        System.out.println();

        Arrays.sort(trainingArray, Collections.reverseOrder());
        for (int values : trainingArray) {
            System.out.print(values + " "); // отсортировать элементы массива в порядке убывания (любым способом) и вывести результат в консоль
        }
    }
}