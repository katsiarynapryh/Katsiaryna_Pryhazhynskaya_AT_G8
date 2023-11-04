package homework.day3.cycletask;

public class UseFor {
    public void showOddArray() {
        for (int i = 3; i <= 19; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " "); // каждое нечетное число от 3 до 19 включительно
            }
        }
    }

}