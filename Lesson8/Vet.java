package Lesson8;

public class Vet {
    public void treatAnimal(Animals animal){
        System.out.println(animal.eat() + " and lives in " + animal.getLocation());
    }
}
