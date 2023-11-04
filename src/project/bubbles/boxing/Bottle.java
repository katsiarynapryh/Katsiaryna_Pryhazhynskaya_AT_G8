package project.bubbles.boxing;

import project.bubbles.water.Bubble;
import project.bubbles.water.SparklingWater;
import project.bubbles.water.Water;

public class Bottle {
    protected double volume;
    protected Water water;
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

    //метод open() вызывает метод degas() в газировке
    public void open() {
        while (sparklingWater.degas()) {
        }
    }

    //метод void open() меняет состояние воды в "открытое"

 //метод void warm(int temperature) устанавливает температуру воды в бутылке
public void warm(int temperature) {

}



}
