package Lesson8;

public class Dog extends Animals{
    String sound;

    public Dog(String food, String location,String sound) {
        super(food, location);
        this.sound=sound;
    }


    @Override
    public void makeNoise() {
        System.out.println("Dog makes noise " + this.sound);
    }

    @Override
    public String eat() {
        return "Dog eats " + getFood();
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps");
    }
}
