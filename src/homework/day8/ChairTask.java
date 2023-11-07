package homework.day8;

import homework.day8.objectclasses.Bubble;
import homework.day8.objectclasses.Chair;
import homework.day8.objectclasses.Sand;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChairTask
{
    public static void main(String[] args)
    {
        List<Chair> furniture = Arrays.asList(new Chair(1, 2), new Chair(4, 2), new Chair(2, 4));

        for (Chair myChairs : furniture) {
            System.out.print(myChairs.getHeight() * myChairs.getWidth() + " "); //произведение высоты на ширину в консоль через пробел
        }

        System.out.println();

        //Создать пустую карту, где ключом является целое число, а значением объект стула
        Map<Integer, Chair> furnitureUpd = new HashMap<>();

        //Заполнить карту значениями из предыдущего списка, используя в качестве ключа любое уникальное число
        for (int i = 0; i < furniture.size(); i++) {
            furnitureUpd.put(i, furniture.get(i));
        }

        //Проитерировать карту и отпечатать ключи в консоль
        for (int i : furnitureUpd.keySet()) {
            System.out.println(i);
        }

        System.out.println();

        //Проитерировать карту и отпечатать значения в консоль
        for (Chair chair: furnitureUpd.values()) {
            System.out.println(chair);
        }

        System.out.println();

        //Проитерировать карту и отпечатать пары ключ-значение в консоль
        for (Map.Entry<Integer, Chair> entry : furnitureUpd.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}