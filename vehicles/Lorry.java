package vehicles;

import details.Engine;
import professions.Driver;
import vehicles.LightCar;

public class Lorry extends LightCar {
    int carrying;
    public Lorry(String carClass, String brand, double weight, Driver testDriver, Engine testEngine, int carrying) {
        super(carClass, brand, weight, testDriver, testEngine);
        this.carrying=carrying;
    }
    public String toString(){
        return "Class: " + this.carClass +"\nBrand: "+ this.brand +
                "\nEngine: "+ this.testEngine.toString()+"\nWeight: "+ this.weight + "\nCarrying: " +
                this.carrying + "\nDriver: "+ this.testDriver.toString();
    }

}
