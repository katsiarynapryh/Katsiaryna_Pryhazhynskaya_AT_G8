package homework.playground.essence.creatures;

import homework.playground.essence.Matter;

public abstract class Animal extends Matter {
    protected String name;

    public Animal(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void eat(Plant food) {
        System.out.println(String.format("I am N and I am eating D"))
    }
}
