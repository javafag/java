package OOPBasics.equalsHashCodeToString.Book2;

import java.util.HashSet;
import java.util.Objects;

public class Book {


    private String title;
    private String author;
    private int year;


    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }


    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "', year=" + year + "}";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);
    }

    public static void main(String[] args) {

        Book book = new Book("Big A","Olek",2006);
        Book book1 = new Book("Big A","Olek",2006);
        Book book2 = new Book("Big B","Olek",2009);
        Book book3 = new Book("Big C","Olek",2012);


        System.out.println(book.equals(book1));


        HashSet<Book> books = new HashSet<>();

        books.add(book);
        books.add(book1);
        books.add(book2);
        books.add(book3);


        for(Book book4 : books){
            System.out.println(book4);
        }
    }

}

// 🟢 Задача: Книги в библиотеке
//        Условие
//
//Создай класс Book с полями:
//
//title (название),
//
//author (автор),
//
//year (год издания).
//
//Переопредели:
//
//toString() → должен выводить книгу красиво:
//
//Book{title='War and Peace', author='Tolstoy', year=1869}
//
//
//equals() → книги считаются равными, если совпадают title и author.
//
//hashCode() → согласован с equals.
//
//        В main() сделай:
//
//создай несколько книг, в том числе дубликат (одинаковое название + автор);
//
//положи их в HashSet<Book>;