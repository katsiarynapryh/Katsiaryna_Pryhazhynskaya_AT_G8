package homework.day8;

import homework.day8.objectclasses.Person;
import homework.day8.objectclasses.Sand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SandTask {
    public static void main(String[] args) {
        List<Sand> sandbox = new ArrayList<>();
        sandbox.add(new Sand(2, "Речной"));
        sandbox.add(new Sand(4, "Речной"));
        sandbox.add(new Sand(2, "Карьерный"));
        sandbox.add(new Sand(7, "Речной"));

        for (Sand mysand : sandbox) {
            System.out.print(mysand.getWeight() + " ");
        }

        System.out.println();

        for (Sand mysand : sandbox) {
            System.out.print(mysand.getName() + " ");
        }

        System.out.println();

//Создать пустую карту, где ключом является целое число, а значением объект песка
        Map<Integer, Sand> sandUpdated = new HashMap<>();

        //Заполнить карту значениями из предыдущего списка, используя в качестве ключа любое уникальное число
        for (int i = 0; i < sandbox.size(); i++) {
            sandUpdated.put(i, sandbox.get(i));
        }

//Проитерировать карту и отпечатать ключи в консоль
        for (int i : sandUpdated.keySet()) {
            System.out.println(i);
        }

        System.out.println();

//Проитерировать карту и отпечатать значения в консоль
        for (Sand sand: sandUpdated.values()) {
            System.out.println(sand);
        }

        System.out.println();

//Проитерировать карту и отпечатать пары ключ-значение в консоль
        for (Map.Entry<Integer, Sand> entry : sandUpdated.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

    }
}