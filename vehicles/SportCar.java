package vehicles;

import details.Engine;
import professions.Driver;
import vehicles.LightCar;

public class SportCar extends LightCar {
    double speed;

    public SportCar(String carClass, String brand, double weight, Driver testDriver, Engine testEngine, double speed) {
        super(carClass, brand, weight, testDriver, testEngine);
        this.speed = speed;
    }
    @Override
    public String toString(){
        return "Class: " + this.carClass +"\nBrand: "+ this.brand +
                "\nEngine: "+ this.testEngine.toString()+"\nWeight: "+ this.weight +
                "\nMax speed : "+this.speed + "\nDriver: "+ this.testDriver.toString();
    }
}
