import java.util.Random;
public class ForEach {
    public void foo() {
        int[] array = new int[10];
        Random random = new Random();
        int k = 0;
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(100);
            k = k + array[i];
        }

        System.out.println("Average value is: " + k / 10);
    }

    public static void main(String[] args) {
        new ForEach().foo();
    }
}
