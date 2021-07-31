package Lesson8;

public class Horse extends Animals{
    String sound;

    public Horse(String food, String location, String sound) {
        super(food, location);
        this.sound = sound;
    }


    @Override
    public void makeNoise() {
        System.out.println("Horse makes noise " + this.sound);

    }
    @Override
    public String eat() {
        return "Horse eats " + getFood();
    }

    @Override
    public void sleep() {
        System.out.println("Horse sleeps");


    }
}
