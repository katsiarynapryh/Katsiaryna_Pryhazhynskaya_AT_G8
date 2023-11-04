package homework.day4.playground.craft.air;

import homework.day4.playground.creatures.Fly;

public class Plane extends Aircraft {
    public Plane(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void fly(String direction)
    {
        System.out.println(String.format("I am %s, my name is %s and I amd flying to %s",
                Plane.class.getSimpleName(), this.getName(), direction));
    }

    @Override
    public int move(int pointA, int pointB)
    {
        System.out.println(String.format("I am %s, my name is %s and I am moving from point %d to point %d",
                Plane.class.getSimpleName(), this.getName(), pointA, pointB));
        //N - название класса соответствующего обьекта, М - значение name обьекта
        return pointB - pointA;
    }
}
