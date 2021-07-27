package details;

import details.Engine;

public class ElectricEngine implements Engine {
    int power;
    String company;

    public ElectricEngine(int power, String company) {
        this.power = power;
        this.company = company;
    }
    @Override
    public String toString(){
        return "Electric engine, "+ "power "+ this.power +", " + this.company;
    }
}

