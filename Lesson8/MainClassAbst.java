package Lesson8;

public class MainClassAbst {
    public static void main(String[] args) {
        Animals[] arrayOfAnimals = new Animals[3];
        arrayOfAnimals[0] = new Dog("bone","garden","woof!");
        arrayOfAnimals[1]= new Cat("milk","house","meow");
        arrayOfAnimals[2]=new Horse("grass","stable","heehaw");

        Vet vet = new Vet();
        for (Animals animal :arrayOfAnimals) {
            vet.treatAnimal(animal);
            //there are other methods from task:
            animal.makeNoise();
            animal.sleep();
        }
    }
}
