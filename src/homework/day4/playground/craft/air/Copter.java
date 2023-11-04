package homework.day4.playground.craft.air;

import homework.day4.playground.creatures.Fly;

public class Copter extends Aircraft {
    public Copter(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void fly(String direction)
    {
        System.out.println(String.format("I am %s, my name is %s and I amd flying to %s",
                Copter.class.getSimpleName(), this.getName(), direction));
    }

    @Override
    public int move(int pointA, int pointB)
    {
        System.out.println(String.format("I am %s, my name is %s and I am moving from point %d to point %d",
                Copter.class.getSimpleName(), this.getName(), pointA, pointB));
        //N - название класса соответствующего обьекта, М - значение name обьекта
        // А и В - числа, подставляемые из значения передаваемых аргументов, и возвращает целое число, являющееся разницей В и А
        return pointB - pointA;
    }
}
