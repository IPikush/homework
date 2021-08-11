package Lesson8;

public class Cat extends Animals{
    String sound;

    public Cat(String food, String location, String sound) {
        super(food, location);
        this.sound = sound;
    }

    @Override
    public void makeNoise() {
        System.out.println("Cat makes noise " + this.sound);
    }
    @Override
    public String eat() {
        return "Cat eats " + getFood();
    }
    @Override
    public void sleep() {
        System.out.println("Cat sleeps");
    }
}
