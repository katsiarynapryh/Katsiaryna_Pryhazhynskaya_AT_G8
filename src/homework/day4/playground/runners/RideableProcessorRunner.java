package homework.day4.playground.runners;

import homework.day4.playground.craft.Rideable;
import homework.day4.playground.craft.field.Car;
import homework.day4.playground.craft.field.Moped;
import homework.day4.playground.craft.field.Motorbike;
import homework.day4.playground.craft.field.Vehicle;
import homework.day4.playground.processors.RideableProcessor;
import homework.day4.playground.processors.TransportableProcessor;

public class RideableProcessorRunner {
    public static void main(String[] args) {
        RideableProcessor rideableProc = new RideableProcessor();

        Rideable rideableCar = new Car(223, "Lada Rideable");
        Rideable rideableMoped = new Moped(3452, "Honda EM1 837 Rideable");
        Rideable rideableMotorbike = new Motorbike(7623, "Suzuki GSX-R1000 Rideable");
        Vehicle vehicleCar = new Car(223, "Lada Vehicle");
        Vehicle vehicleMoped = new Moped(3452, "Honda EM1 837 Vehicle");
        Vehicle vehicleMotorbike = new Motorbike(7623, "Suzuki GSX-R1000 Vehicle");
        Car aCar = new Car(223, "Lada Car");
        Moped aMoped = new Moped(3452, "Honda EM1 837 Moped");
        Motorbike aMotorbike = new Motorbike(7623, "Suzuki GSX-R1000 Motorbike");
        //Vehicle anonymousVehicle = new Vehicle(3452, "Honda EM1 837 Vehicle"){};
//        Rideable anonymousRideable = new Rideable(){
//            String name = "Anonymous";
//            @Override
//            public void drive(String direction) {
//                System.out.printf("I am %s, my name is %s and I amd drive to %s%n",
//                        this.getClass().getSimpleName(), this.name, direction);
//            }
//        };

        rideableProc.runRideable(rideableCar);
        rideableProc.runRideable(rideableMoped);
        rideableProc.runRideable(rideableMotorbike);
        rideableProc.runRideable(vehicleCar);
        rideableProc.runRideable(vehicleMoped);
        rideableProc.runRideable(vehicleMotorbike);
        rideableProc.runRideable(aCar);
        rideableProc.runRideable(aMoped);
        rideableProc.runRideable(aMotorbike);
        //rideableProc.runRideable(anonymousVehicle);
        //rideableProc.runRideable(anonymousRideable);

        rideableProc.runRideable(vehicleCar, "никуда");
        rideableProc.runRideable(aMotorbike, "повсюду");

    }

}
