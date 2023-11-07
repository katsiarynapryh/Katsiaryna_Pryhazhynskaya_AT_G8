package homework.day5;

import java.util.Arrays;

public class PrintLetters {
    //1.1 метод позволяет отпечатать в консоль все буквы в стобик из строки текста, которую принимает на вход в виде аргумента

    public void printLettersToColumn(String stringInput) {
        char[] charArray = stringInput.toCharArray();
        String letters = "[abcdefghijklmnopqrstuvwxyz]";

        System.out.println("Char array:");
        for (int i = 0; i < charArray.length; i++)
            System.out.println(charArray[i]);

    }
}
