package details;

import details.Engine;

public class DieselEngine implements Engine {
    int power;
    String company;

    public DieselEngine(int power, String company) {
        this.power=power;
        this.company=company;
    }
    @Override
    public String toString(){
        return "Diesel engine, "+ "power "+ this.power +", " + this.company;
    }
}
