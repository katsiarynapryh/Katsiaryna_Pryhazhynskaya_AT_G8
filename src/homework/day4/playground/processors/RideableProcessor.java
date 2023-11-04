package homework.day4.playground.processors;

import homework.day4.playground.craft.Rideable;

import static homework.day4.playground.utils.DirectionGenerator.generateDirection;

public class RideableProcessor {
    public void runRideable(Rideable rideable) {
        rideable.drive(generateDirection());
    }

    public void runRideable(Rideable rideable, String direction) {
        rideable.drive(direction);
    }
}
