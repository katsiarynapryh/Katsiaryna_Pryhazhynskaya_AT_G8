package classwork.day7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CompareLists {
    public static void main(String[] args) {
        List<String> myList1 = new ArrayList<>();
        List<String> myList2 = new LinkedList<>();
        long t0 = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            myList1.add("k" + i);
        }
        System.out.println(System.currentTimeMillis() - t0);

        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            myList2.add("p" + i);
        }
        System.out.println(System.currentTimeMillis() - t1);

    }
}