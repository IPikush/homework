package Lesson6;

public class MainClass {
    public static void main(String[] args) {
        // 3 экземпляры(objects) класса Phone
        Phone nokia=new Phone();
        Phone samsung=new Phone();
        //Phone lg= new Phone();
        System.out.println(samsung.model);
        System.out.println(nokia.weight);
        //System.out.println(lg.model);
        nokia.weight=150;
        nokia.model="nokia";
        //lg.model="lg";
        //lg.weight=nokia.weight;
        //lg.number="+380622581452";
        //System.out.println(lg.receiveCall("Vasya")); - инкапсуляция(так как если в другом классе приват, то здесь этот метод не виден из того класса)
        Lg lg=new Lg();
        lg.number="+383235546546";
        //System.out.println(lg.getNumber());

        //samsung.model="samsung";
        System.out.println(samsung.model);
        System.out.println(samsung.setNumber("321456987"));
        //System.out.println(lg.model);
        System.out.println(nokia.model);
        System.out.println(lg.receiveCall("Ira", "Julia"));
        System.out.println(lg.receiveCall("Ira")); //полиморфизм (так как метод переопределен)

    }
}
