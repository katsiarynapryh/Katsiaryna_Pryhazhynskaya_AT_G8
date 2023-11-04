package classwork.day9.task1;

import classwork.day9.task1.MyClass;

public class Runner {
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        mc.justMethod(() -> 0); // with lambda


//        mc.justMethod(new IMyInterface(){
//            @Override
//            public double doSomething() {
//                return 0;
//            }
//        });

    }

}
