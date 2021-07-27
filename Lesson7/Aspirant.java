package Lesson7;

public class Aspirant extends Student{
    String scienceWork;
    public Aspirant(String firstName, String lastName, String group, double averageMark, String scienceWork) {
        super(firstName, lastName, group, averageMark);
        this.scienceWork=scienceWork;
    }
    public void getScolarShip(double averageMark){
        int scolarship;
        if (averageMark==5){
            scolarship=200;
        }
        else{
            scolarship=180;
        }
        System.out.println(getLastName()+" "+ getFirstName() + " gets scolarship " + scolarship);
}}
