package project.bubbles;

public class Runner {
    public static void main(String[] args) {
        Bottle[] bottles = new Bottle[3];
        Bottle bottle1 = new Bottle(0.5);
        Bottle bottle2 = new Bottle(1.0);
        Bottle bottle3 = new Bottle(1.5);

        bottles[0] = bottle1;
        bottles[1] = bottle2;
        bottles[2] = bottle3;
        for (int i = 0; i < bottles.length - 1; i++) {
            bottles[i].open();
        }
    }
}
