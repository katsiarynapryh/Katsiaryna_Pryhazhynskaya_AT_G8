package homework.day4.playground.runners;

import homework.day4.playground.craft.Rideable;
import homework.day4.playground.craft.Transportable;
import homework.day4.playground.craft.air.Aircraft;
import homework.day4.playground.craft.air.Copter;
import homework.day4.playground.craft.air.Plane;
import homework.day4.playground.craft.air.Rocket;
import homework.day4.playground.craft.field.Car;
import homework.day4.playground.craft.field.Moped;
import homework.day4.playground.craft.field.Motorbike;
import homework.day4.playground.craft.field.Vehicle;
import homework.day4.playground.essence.Flyable;
import homework.day4.playground.processors.FlyableProcessor;
import homework.day4.playground.processors.TransportableProcessor;

public class TransportableProcessorRunner {
    public static void main(String[] args) {
        TransportableProcessor transportableProc = new TransportableProcessor();

        Transportable transportableCopter = new Copter(223, "AW109 Transportable");
        Transportable transportablePlane = new Plane(3452, "Airbus a380 Transportable");
        Transportable transportableRocket = new Rocket(7623, "Soyuz-FG Transportable");
        Transportable transportableCar = new Car(23, "Tesla X Transportable");
        Transportable transportableMoped = new Moped(12, "Honda EM1 Transportable");
        Transportable transportableMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Transportable");
        Aircraft aircraftCopter = new Copter(223, "AW109 Aircraft");
        Aircraft aircraftPlane = new Plane(3452, "Airbus a380 Aircraft");
        Aircraft aircraftRocket = new Rocket(7623, "Soyuz-FG Aircraft");
        Vehicle vehicleCar = new Car(23, "Tesla X Vehicle");
        Vehicle vehicleMoped = new Moped(12, "Honda EM1 Vehicle");
        Vehicle vehicleMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Vehicle");
        Flyable flyableCopter = new Copter(223, "AW109 Flyable");
        Flyable flyablePlane = new Plane(3452, "Airbus a380 Flyable");
        Flyable flyableRocket = new Rocket(7623, "Soyuz-FG Flyable");
        Rideable rideableCar = new Car(23, "Tesla X Rideable");
        Rideable rideableMoped = new Moped(12, "Honda EM1 Rideable");
        Rideable rideableMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Rideable");
        Copter aCopter = new Copter(223, "AW109 Copter");
        Plane aPlane = new Plane(3452, "Airbus a380 Plane");
        Rocket aRocket = new Rocket(7623, "Soyuz-FG Rocket");
        Car aCar = new Car(23, "Tesla X Car");
        Moped aMoped = new Moped(12, "Honda EM1 Moped");
        Motorbike aMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Motorbike");

        transportableProc.runTransportable(transportableCopter); //при помощи обьекта класса TransportableProcessor запустить runTransportable с каждым из обьектов из предыдущего пункта
        transportableProc.runTransportable(transportablePlane);
        transportableProc.runTransportable(transportableRocket);
        transportableProc.runTransportable(transportableCar);
        transportableProc.runTransportable(transportableMoped);
        transportableProc.runTransportable(transportableMotorbike);
        transportableProc.runTransportable(aircraftCopter);
        transportableProc.runTransportable(aircraftPlane);
        transportableProc.runTransportable(aircraftRocket);
        transportableProc.runTransportable(vehicleCar);
        transportableProc.runTransportable(vehicleMoped);
        transportableProc.runTransportable(vehicleMotorbike);
        //transportableProc.runTransportable(flyableCopter);
        //transportableProc.runTransportable(flyablePlane);
        //transportableProc.runTransportable(flyableRocket);
        transportableProc.runTransportable(rideableCar);
        transportableProc.runTransportable(rideableMoped);
        transportableProc.runTransportable(rideableMotorbike);
        transportableProc.runTransportable(aCopter);
        transportableProc.runTransportable(aPlane);
        transportableProc.runTransportable(aRocket);
        transportableProc.runTransportable(aCar);
        transportableProc.runTransportable(aMoped);
        transportableProc.runTransportable(aMotorbike);

        transportableProc.runTransportable(aCar, 23, 242);
        transportableProc.runTransportable(vehicleMoped, 93, 7);

    }
}