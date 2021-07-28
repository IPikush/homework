package professions;

import professions.Person;

public class Driver {
    int experience;

    public Driver(int experience) {
        this.experience = experience;
    }
    public String toString(Person test){
        return test.fullName+ ", " +test.getAge()+ ", "+ this.experience+ " years of experience ";
    }

}
