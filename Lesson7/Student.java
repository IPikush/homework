package Lesson7;

public class Student {
    private String firstName, lastName, group;
    private double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void getScolarShip(double averageMark){
        int scolarship;
        if (averageMark==5){
            scolarship=100;
        }
        else{
            scolarship=80;
        }
        System.out.println( lastName+" "+ firstName + " gets scolarship " + scolarship);

    }
}
