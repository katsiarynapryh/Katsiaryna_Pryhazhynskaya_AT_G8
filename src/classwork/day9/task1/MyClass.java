package classwork.day9.task1;

import classwork.day9.task1.IMyInterface;

public class MyClass {
    public void justMethod(IMyInterface staff) {
        System.out.println("The result of something is: "
                + staff.doSomething());
    }

}
