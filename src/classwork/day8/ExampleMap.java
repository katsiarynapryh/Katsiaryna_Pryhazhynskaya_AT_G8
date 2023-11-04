package classwork.day8;

import java.util.HashMap;
import java.util.Map;

public class ExampleMap {
    public static void main(String[] args) {
        String[] array = "мама мыла раму мыла".split(" ");
        Map<Integer, String> words = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            words.put(i, array[i]); // заполняем
        }

        for (int i : words.keySet()) {
            System.out.println(i); // проитерировать ключи карты
        }

        System.out.println();

        for (String str : words.values()) {
            System.out.println(str); // проитерировать значения карты
        }

        System.out.println();

        for (Map.Entry<Integer, String> entry : words.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue()); // проитерировать комбинацию
        }

    }
}
