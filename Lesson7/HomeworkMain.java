package Lesson7;

public class HomeworkMain {
    public static void main(String[] args) {

//first(task from class)
        Person Ivan = new Person("Ivan Ivanov Ivanovich",23);
        Person Natasha = new Person();
        Natasha.fullName= "Natasha Ivanova Ivanovna";
        Natasha.age=27;
        System.out.println(Ivan.move());
        System.out.println(Natasha.talk());

//second(task from class and homework)
        String[] books = new String[3];
        books[0] = "1";
        books[1] = "2";
        books[2]="3";

        Reader[] reader = new Reader[3];
        Book[] book= new Book[2];
        book[0]=new Book("History of Ukraine","TestWriter");
        book[1]= new Book("TestBook","Not real writer");

        reader[0]=new Reader("Petrov V.V.",145263,"math","17.06.1997","+380660156545");
        reader[1]= new Reader("Ivanov I.I.",458,"law","01.06.1996","+380225655555");
        reader[2]= new Reader("Krasnov M.M.",0001,"historic","26.12.1996","+380414215639");

        reader[0].takeBook(3, books);
        reader[1].takeBook(5);
        reader[2].takeBook(book);

        reader[2].returnBook(3,books);
        reader[1].returnBook(2);
        reader[0].returnBook(book);

//third(task about Student and Aspirant)
        Student test = new Aspirant("Iryna","Test","test123",5,"TestWork");
        test.getScolarShip(test.getAverageMark());

        Student[] students = new Student[2];
        students[0]=new Student("Ivan","TestIvanov","123test",5);
        students[1]=new Aspirant("Maria","Tester","group7",4.8,"ScienceTest");
        students[0].getScolarShip(students[0].getAverageMark());
        students[1].getScolarShip(students[1].getAverageMark());




    }
}
