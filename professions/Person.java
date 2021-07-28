package professions;

public class Person extends Driver {
    private int age;
    String fullName;

    public Person(int experience, int age, String fullName) {
        super(experience);
        this.age = age;
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public String getFullName() {
        return fullName;
    }

    public String toString(){
        return this.fullName + ", " +this.age+ ", "+ this.experience+ " years of experience ";
    }

}
