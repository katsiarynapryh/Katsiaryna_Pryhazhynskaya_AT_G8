package homework.day4.playground.creatures;

import homework.day4.playground.essence.Matter;

public abstract class Animal extends Matter {
    protected String animalName;

    public Animal(int mass, String animalName) {
        super(mass);
        this.animalName = animalName;
    }

    public String getName() {
        return animalName;
    }

    public void setName(String animalName) {
        this.animalName = animalName;
    }

    public void eat(Plant food) {
        var who = animalName;
        var what = food.plantName;
        System.out.println(String.format("I am %s and I am eating %s", who, what));
    }
}