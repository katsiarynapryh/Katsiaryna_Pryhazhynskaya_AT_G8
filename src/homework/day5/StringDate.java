package homework.day5;

import java.time.Instant;
import java.time.format.DateTimeFormatter;

public class StringDate {
    //1.7 метод принимает на вход строку текста и выводит в консоль дату, которая на n дней больше, чем текущая
    // в формате "Сгенерированная гласная дата: 7 мая", где n - это количество гласных буков в получаемой строке

    public void StringDate(String stringInput) {
        int VowelNumber;

        String allVowels = "[aeiouy]";

        DateTimeFormatter formatIn = DateTimeFormatter.ofPattern("dd mmmm");

        System.out.println("Сгенерированная гласная дата: ");
    }
}
