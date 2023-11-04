package homework.day4.playground.craft.field;

import homework.day4.playground.craft.air.Plane;

public class Motorbike extends Vehicle {
    public Motorbike(int mass, String name) {
        super(mass, name);
    }

    @Override
    public int move(int pointA, int pointB) {
        System.out.println(String.format("I am %s, my name is %s and I am moving from point %d to point %d",
                Motorbike.class.getSimpleName(), this.getName(), pointA, pointB));
        return pointB - pointA;
    }

    @Override
    public void drive(String direction) {
        System.out.println(String.format("I am %s, my name is %s and I amd driving to %s",
                Motorbike.class.getSimpleName(), this.getName(), direction));
    }

}
