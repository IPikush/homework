package HomeworkInterface;

import details.DieselEngine;
import details.ElectricEngine;
import details.Engine;
import details.Hybrid;
import professions.Driver;
import professions.Person;
import vehicles.Car;
import vehicles.LightCar;
import vehicles.Lorry;
import vehicles.SportCar;

public class TestMainWork {
    public static void main(String[] args) {
        Driver testDr=new Person(2,23,"Test Person Driver");
        Driver testLorryDriver= new Person(10,35,"Test Lorry Driver");
        Driver testSportCarDriver = new Person(12,32,"Test Sportcar Driver");
        Engine testEn=new ElectricEngine(756,"Tesla Inc.");
        Engine testDiesEngine=new DieselEngine(373,"Cummins Inc.");
        Engine testHybrid= new Hybrid(887,"Porsche Inc.");
        Car testTesla=new LightCar("Full-size","Tesla Model S",1956d,testDr,testEn);
        Car testLorry = new Lorry("lorry","KAMAZ-6580",41000,
                testLorryDriver,testDiesEngine,25750);
        Car testPorsche=new SportCar("hypercar","Porsche 918",1675d,testSportCarDriver,
                testHybrid,345d);

        System.out.println(testTesla.toString());
        testTesla.start();
        testTesla.turnRight();
        testTesla.turnLeft();
        testTesla.stop();

        System.out.println(testLorry.toString());
        System.out.println(testPorsche.toString());



    }
}
