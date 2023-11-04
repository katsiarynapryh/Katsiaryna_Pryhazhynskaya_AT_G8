package homework.day4.playground.craft.air;

import homework.day4.playground.craft.Transportable;
import homework.day4.playground.essence.Flyable;
import homework.day4.playground.essence.Matter;

public abstract class Aircraft extends Matter implements Transportable, Flyable {
    protected String name;

    public Aircraft(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
