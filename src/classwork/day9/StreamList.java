package classwork.day9;

import java.util.Arrays;
import java.util.List;

public class StreamList {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        long counter = list.stream().filter(x -> x.equals("мама")).count();

        System.out.println(counter);



//        int count = 0;
//        for (String myList : list) {
//            if (myList.contains("мама")) {
//                count++;
//            }
//        }
//        System.out.println(count);

    }
}