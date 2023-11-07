package homework.day5;

import java.util.Arrays;

public class FindNumbers {
    //1.3 метод позволяет найти в тексте все цифры и преобразовать их в массив числовых переменных,
    // вывести все элементы массива в косоль, текст получает на вход в виде аргумента
    public void findNumbers(String stringInput) {
        for (char myNum : stringInput.toCharArray()) {
            if (Character.isDigit(myNum)) {
                System.out.print(myNum);
            }
        }
    }
}