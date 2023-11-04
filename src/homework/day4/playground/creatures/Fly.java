package homework.day4.playground.creatures;

import homework.day4.playground.essence.Flyable;

public class Fly extends Insect implements Flyable {
    public Fly(int mass, String animalName) {
        super(mass, animalName);
    }

    @Override
    public void fly(String direction)
    {
        System.out.println(String.format("I am %s, my name is %s and I amd flying to %s", Fly.class.getSimpleName(), this.getName(), direction));
        // N - название класса соответствующего обьекта,
        // М - значение name обьекта,
        // D - строка, подставляемая из значения передаваемого аргумента
    }
}
