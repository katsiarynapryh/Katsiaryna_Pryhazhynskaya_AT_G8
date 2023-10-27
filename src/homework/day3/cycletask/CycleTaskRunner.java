package homework.day3.cycletask;

public class CycleTaskRunner {
    public static void main(String[] args) {
        new UseWhile().showTwentyArray();
        System.out.println();
        new UseFor().showOddArray();
        System.out.println();

        EmptyArray emptyArray = new EmptyArray();
        emptyArray.arrayTasks();
    }
}
