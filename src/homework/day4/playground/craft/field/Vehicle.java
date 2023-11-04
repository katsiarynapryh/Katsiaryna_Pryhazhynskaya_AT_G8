package homework.day4.playground.craft.field;

import homework.day4.playground.craft.Transportable;
import homework.day4.playground.essence.Matter;

public abstract class Vehicle extends Matter implements Transportable {
    protected String name;

    public Vehicle(int mass, String name) {
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
