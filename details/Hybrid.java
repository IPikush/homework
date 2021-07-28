package details;

import details.Engine;

public class Hybrid implements Engine {
    int power;
    String company;

    public Hybrid(int power, String company) {
        this.power=power;
        this.company=company;
    }
    @Override
    public String toString(){
        return "Hybrid engine, "+ "power "+ this.power +", " + this.company;
    }
}
