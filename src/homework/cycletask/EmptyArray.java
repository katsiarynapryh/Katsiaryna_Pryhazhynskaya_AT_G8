package homework.cycletask;

import java.util.Random;

public class EmptyArray {
    public void arrayTasks() {

        Random rnd = new Random();
        int[] array = new int[7];

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt();
            System.out.print(array[i] + " "); // пройти по массиву и вывести в консоль все элементы
        }
        System.out.println();

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " "); // вывести в консоль все элементы массива в обратном порядке
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] * 5 + " "); // каждый элемент массива умножить на 5 и вывести результат в консоль
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] * array[i] + " "); // каждый элемент массива возвести в квадрат и вывести результат в консоль
        }
        System.out.println();

        int minElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minElement) {
                minElement = array[i];
            }
        }
        System.out.println("Min element: " + minElement); // найти минимальный элемент массива и вывести результат в консоль

        int old_val = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = old_val;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); // поменять местами первый и последний элементы и вывести результат в консоль
        }

        // отсортировать элементы массива в порядке убывания (любым способом) и вывести результат в консоль
    }
}