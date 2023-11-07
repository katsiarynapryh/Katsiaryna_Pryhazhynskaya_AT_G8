package homework.day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Elements
{
    public static void main(String[] args)
    {
        List<String> elements = new ArrayList<>();
        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Picker");
        elements.add("Breadcrumb");

        for (String myelement : elements)
        {
            System.out.print(myelement + " "); //отпечатать слова в консоль через пробел
        }

        System.out.println();

        // Посчитать сколько названий элементов состоит более, чем из одного слова и вывести число в консоль
        int count = 0;
            for (String myelement : elements)
            {
                if (elements.contains(" "))
                {
                    count++;
                } else if (elements.contains("-"))
                {
                    count++;
                }
            }
        System.out.println("столько элементов состоит более, чем из одного слова: " + count);

        for (int i = 0; i < elements.size(); i++)
        {
            System.out.print(elements.get(i) + " "); //отпечатать слова в консоль через пробел
        }

        System.out.println();

        elements.add(4, "Spinner");
        elements.remove(2);
        elements.set(5, "Switch");

        for (String myelement : elements)
        {
            System.out.print(myelement + " "); //отпечатать слова в консоль через пробел
        }

    }
}