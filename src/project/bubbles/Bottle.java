package project.bubbles;

public class Bottle {
    double volume;
    SparklingWater sparklingWater;

    public Bottle(double volume) {
        this.volume = volume;
        var bubbleCount = (int) (10000 * volume);
        sparklingWater = new SparklingWater(bubbleCount);

        Bubble[] bubbles = new Bubble[bubbleCount];
        for (int i = 0; i < bubbleCount; i++) {
            bubbles[i] = new Bubble("");
        }
        sparklingWater.pump(bubbles);
    }

    public void open() {
        while (sparklingWater.degas()) {
        }
    }
}
