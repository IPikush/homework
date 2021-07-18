package Lesson7;

import java.util.Arrays;

public class Reader {
    String fullNameReader;
    Integer numberOfTicket;
    String faculty;
    String birthDay;
    String phone;

    public Reader(String fullNameReader, Integer numberOfTicket, String faculty, String birthDay, String phone) {
        this.fullNameReader = fullNameReader;
        this.numberOfTicket = numberOfTicket;
        this.faculty = faculty;
        this.birthDay = birthDay;
        this.phone = phone;
    }

    public void takeBook(int takenBooks){
        System.out.println(fullNameReader + " took "+takenBooks+" books");
    }
    public void takeBook(Book[] books){
        System.out.println(fullNameReader+" took such books: " + Arrays.toString(books).substring(1,Arrays.toString(books).length()-1));
    }
    public void takeBook(int takenBooks, String[] nameBook){
        System.out.println(fullNameReader + " took such books: "+ Arrays.toString(nameBook).substring(1,Arrays.toString(nameBook).length()-1));
    }
    public void returnBook(int returnedBooks){
        System.out.println(fullNameReader + " returned "+returnedBooks+" books");
    }
    public void returnBook(Book[] books){
        System.out.println(fullNameReader+" returned such books: " + Arrays.toString(books).substring(1,Arrays.toString(books).length()-1));
    }
    public void returnBook(int returnedBooks, String[] nameBook){
        System.out.println(fullNameReader + " returned such books: "+ Arrays.toString(nameBook).substring(1,Arrays.toString(nameBook).length()-1));
    }





}
