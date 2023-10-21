package homework.playground.essence.creatures;

import homework.basetask.TrainMethodsIf;
import homework.playground.essence.Matter;

public abstract class Plant extends Matter {
    protected String plantName;
    public Plant(int mass, String plantName) {
        super(mass);
        this.plantName = plantName;
    }
    public String getPlantName() {
        return plantName;
    }
    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }
}