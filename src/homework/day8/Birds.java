package homework.day8;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Birds
{
    public static void main(String[] args)
    {
        String myBirds[] = {"Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля"};
        List<String> birds = Arrays.asList(myBirds);

        for (String mybird : birds)
        {
            System.out.println("--" + mybird + "--"); //отпечатать слова в консоль с новой строки в виде --Чайка--
        }

        // Посчитать сколько птиц содержат больше 1 гласной и вывести число в консоль
        int birdCount = 0;
        for (String mybird : birds)
        {
            Matcher match = Pattern.compile("[аеёиоуыэюя]").matcher(mybird);
            int vowelCount = 0;
            while (match.find())
            {
                vowelCount++; // Подсчет количества гласных
            }

            if (vowelCount > 1)
            {
                birdCount++;
            }
        }
        System.out.println("столько птиц содержат больше 1 гласной: " + birdCount);

        for (int i = 0; i < birds.size(); i++)
        {
            System.out.print(birds.get(i) + " "); //отпечатать слова в консоль через пробел
        }

        System.out.println();

        birds.set(3, "Синица"); // Заменить 3-й элемент списка на Синица

        for (String mybird : birds)
        {
            System.out.print(mybird + " "); //отпечатать слова в консоль через пробел
        }

    }
}