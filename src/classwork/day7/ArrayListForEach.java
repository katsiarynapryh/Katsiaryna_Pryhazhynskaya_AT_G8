package classwork.day7;

import java.util.ArrayList;
import java.util.List;

public class ArrayListForEach {
    public static void main(String[] args) {
        List<String> myList = new ArrayList();
        String myString = "мама мыла раму";
        String[] words = myString.split(" ");
        for (String jun : words) {
            myList.add(jun);
        }

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        // for-each
    }

}
