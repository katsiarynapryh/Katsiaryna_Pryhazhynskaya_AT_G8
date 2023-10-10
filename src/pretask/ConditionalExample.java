package pretask;

public class ConditionalExample {
    public static boolean check = false;
    public static int x = 9;

    public static void main(String[] args) {
        if (x > 10) {
            check = true;
        } else {
            check = false;
        }
        System.out.println(check);
    }
}