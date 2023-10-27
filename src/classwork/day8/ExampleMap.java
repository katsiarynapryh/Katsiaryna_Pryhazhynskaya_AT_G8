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
        for (int x : words.keySet()) {
            System.out.print(x);
        }
        System.out.println();

        for (String str : words.values()) {
            System.out.println(str);
        }

        for (Map.Entry<Integer, String> entry : words.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }

    }
}
