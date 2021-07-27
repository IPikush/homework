package Lesson7;

public class Book {
    private String nameOfBook;
    private String writer;

    public Book(String nameOfBook, String writer) {
        this.nameOfBook = nameOfBook;
        this.writer = writer;
    }



    public String toString(){
        return this.nameOfBook + " "+ this.writer;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
}
