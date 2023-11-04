package project.bubbles.water;

public class Bubble {
    final double VOLUME = 0.3;
    String gasComposition;

    public Bubble(String gasComposition) {
        this.gasComposition = gasComposition;
    }

    public void burst() {
        System.out.println("Cramp!");
    }

    public double getVolume() {
        return VOLUME;
    }
}