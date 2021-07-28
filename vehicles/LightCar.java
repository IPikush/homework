package vehicles;

import details.Engine;
import professions.Driver;
import vehicles.Car;

public class LightCar implements Car {
    String carClass;
    String brand;
    double weight;
    Driver testDriver;
    Engine testEngine;

    public LightCar(String carClass, String brand, double weight, Driver testDriver, Engine testEngine) {
        this.carClass = carClass;
        this.brand = brand;
        this.weight = weight;
        this.testDriver = testDriver;
        this.testEngine = testEngine;
    }

    @Override
    public void start() {
        System.out.println("Go!");
    }
    @Override
    public void stop() {
        System.out.println("Stop!");
    }
    @Override
    public void turnRight() {
        System.out.println("Turn right!");
    }
    @Override
    public void turnLeft() {
        System.out.println("Turn left!");
    }
    @Override
    public String toString(){
       return "Class: " + this.carClass +"\nBrand: "+ this.brand +
               "\nEngine: "+ this.testEngine.toString()+"\nWeight: "+ this.weight +
               "\nDriver: "+ this.testDriver.toString();
    }


}
