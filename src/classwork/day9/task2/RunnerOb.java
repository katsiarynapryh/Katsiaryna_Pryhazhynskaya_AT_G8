package classwork.day9.task2;

import classwork.day9.task1.ClassX;

public class RunnerOb {
    public static void main(String[] args) {
        MyObClass mc = new MyObClass();
        mc.justMethod(ClassX::new); // variant3: replace lambda with method reference


        //        mc.justMethod(string -> new ClassX(string)); // variant2: replace with lambda


//        mc.justMethod(new IMyObInterface() {
//            @Override
//            public ClassX doSomething(String string) {
//                return new ClassX(string);          // variant1
//            }
//        });

    }
}
