package homework.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Numbers
{
    public static <T> List<T> reverseList(List<T> numbers)
    {
        List<T> reverse = new ArrayList<>(numbers);
        Collections.reverse(reverse);
        return reverse;
    }

    public static void main(String[] args)
    {
        Integer myNumb[] = {3342, 34, 79, 23426, 68, 1324, 55, 7699};
        List<Integer> numbers = Arrays.asList(myNumb);

        for (Integer mynumber : numbers)
        {
            System.out.println(mynumber); //отпечатать числа в консоль новой строки
        }

        //Посчитать сумму всех чисел и вывести результат в консоль
        int sum = 0;
        for (int i = 0; i < myNumb.length; i++)
        {
            sum = sum + myNumb[i];
        }
        System.out.println("сумма всех чисел: " + sum);

        //Отсортировать список по возрастанию
        Collections.sort(numbers);

        for (int i = 0; i < numbers.size(); i++)
        {
            System.out.print(numbers.get(i) + " "); //отпечатать числа в консоль через пробел
        }
        System.out.println();

//Развернуть список в обратном порядке
        List<Integer> reverse = reverseList(numbers);

        for (Integer mynumber : numbers)
        {
            System.out.print(mynumber + " "); //отпечатать числа в консоль через пробел
        }
    }
}
