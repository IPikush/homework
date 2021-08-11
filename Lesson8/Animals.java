package Lesson8;

public abstract class Animals {
    private String food;
    private String location;

    public Animals(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    abstract public void makeNoise();
    abstract public String eat();
    abstract public void sleep();

}
