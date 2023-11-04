package homework.day4.playground.runners;

import homework.day4.playground.craft.air.Aircraft;
import homework.day4.playground.craft.air.Copter;
import homework.day4.playground.craft.air.Plane;
import homework.day4.playground.craft.air.Rocket;
import homework.day4.playground.creatures.Fly;
import homework.day4.playground.creatures.Insect;
import homework.day4.playground.creatures.Mosquito;
import homework.day4.playground.essence.Flyable;
import homework.day4.playground.processors.FlyableProcessor;

public class FlyableProcessorRunner {
    public static void main(String[] args) {
        FlyableProcessor flyableProc = new FlyableProcessor();

        Flyable flyableCopter = new Copter(223, "Mi8 Flyable");
        Flyable flyablePlane = new Plane(3452, "Boeing 837 Flyable");
        Flyable flyableRocket = new Rocket(7623, "Super Heavy Flyable");
        Flyable flyableFly = new Fly(23, "Domestica Flyable");
        Flyable flyableMosquito = new Mosquito(12, "Vulgaris Flyable");
        Aircraft aircraftCopter = new Copter(223, "Mi8 Aircraft");
        Aircraft aircraftPlane = new Plane(3452, "Boeing 837 Aircraft");
        Aircraft aircraftRocket = new Rocket(7623, "Super Heavy Aircraft");
        Insect insectFly = new Fly(23, "Domestica Insect");
        Insect insectMosquito = new Mosquito(12, "Vulgaris Insect");
        Copter aCopter = new Copter(223, "Mi8 Copter");
        Plane aPlane = new Plane(3452, "Boeing 837 Plane");
        Rocket aRocket = new Rocket(7623, "Super Heavy Rocket");
        Fly aFly = new Fly(23, "Domestica Fly");
        Mosquito aMosquito = new Mosquito(12, "Vulgaris Mosquito");

        flyableProc.runFlyable(flyableCopter); //при помощи обьекта класса FlyableProcessor запустить runFlyable с каждым из обьектов из предыдущего пункта
        flyableProc.runFlyable(flyablePlane);
        flyableProc.runFlyable(flyableRocket);
        flyableProc.runFlyable(flyableFly);
        flyableProc.runFlyable(flyableMosquito);
        flyableProc.runFlyable(aircraftCopter);
        flyableProc.runFlyable(aircraftPlane);
        flyableProc.runFlyable(aircraftRocket);
        // flyableProc.runFlyable(insectFly); //в случае, если метод runFlyable не смог принять на вход обьект, ...
        // flyableProc.runFlyable(insectMosquito); //... закомментировать вызов метода и добавить пояснение причины
        flyableProc.runFlyable(aCopter);
        flyableProc.runFlyable(aPlane);
        flyableProc.runFlyable(aRocket);
        flyableProc.runFlyable(aFly);
        flyableProc.runFlyable(aMosquito);

        flyableProc.runFlyable(aircraftRocket, "никуда");
        flyableProc.runFlyable(aFly, "повсюду");
    }
}
