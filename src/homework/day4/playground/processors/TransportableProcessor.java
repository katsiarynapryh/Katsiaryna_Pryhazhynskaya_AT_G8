package homework.day4.playground.processors;

import homework.day4.playground.craft.Transportable;

import static homework.day4.playground.utils.CoordinatesGenerator.generateCoordinate;

public class TransportableProcessor {
    public void runTransportable(Transportable transportable, int pointA, int pointB) {
        int dist = transportable.move(pointA, pointB);
        System.out.println(String.format("Transportable %s was moved to %s points",
                transportable.getClass().getSimpleName(), dist));
//принимает обьект перемещающего и числа точек перемещения А и В,
// и вызывает у первого метод move, которому передает точки перемещения,

// после чего печатает в консоль строку "Transportable N was moved to M points",
// где N - название класса соответствующего обьекта,
// M - получаемое значение расстояния в результате выполнения метода move
    }

    public void runTransportable(Transportable transportable) {
        int dist = transportable.move(generateCoordinate(), generateCoordinate());
        System.out.println(String.format("Transportable %s was moved to %s points",
                transportable.getClass().getSimpleName(), dist));
//принимает обьект перемещающего, и вызывает у него move,
// которому передает случайные значения точек перемещения, которые генерируется вызовами метода generateCoordinate() из утилиты CoordinatesGenerator,
    }
}
