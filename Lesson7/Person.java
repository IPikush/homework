package Lesson7;

public class Person {
    public String fullName;
    public Integer age;

    public String move(){
        return  fullName + " is moving";
    }

    public String talk(){
        return  fullName + " is talking";
    }


    public Person() {
    }

    public Person(String fullName, Integer age) {
        this.fullName = fullName;
        this.age = age;
    }



}
