package classwork.day7;

import java.util.*;

public class TrainingSet {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        String myString = "мама мыла раму мыла";
        String[] words = myString.split(" ");
        for (String jun : words) {
            mySet.add(jun);
        }

        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String jun : mySet) {
            System.out.println(jun);
        }
    }
}
