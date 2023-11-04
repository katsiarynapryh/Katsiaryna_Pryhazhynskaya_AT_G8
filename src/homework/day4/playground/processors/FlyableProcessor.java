package homework.day4.playground.processors;

import homework.day4.playground.essence.Flyable;

import static homework.day4.playground.utils.DirectionGenerator.generateDirection;

public class FlyableProcessor {
    public void runFlyable(Flyable flyable) {
        flyable.fly(generateDirection()); //принимает обьект летающего и вызывает у него метод fly,
        // которому передает случайное направления,
        // которое генерируется вызовом метода generateDirection() из утилиты DirectionGenerator
    }

    public void runFlyable(Flyable flyable, String direction) {
        flyable.fly(direction); //принимает обьект летающего и строку направления,
        // и вызывает у первого метод fly, которому передает строку направления, переданную в качестве аргумента
    }
}
