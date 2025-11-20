package OOPBasics.Book1;

import java.util.ArrayList;

public class Book {

    private final String title;  // лучше делать поля private
    private final String author;
    private final int year;
    private final int pages;


    public Book(String title, String author, int year, int pages) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString(){
        return "Book: "+ title + "Author: " + author + "Year: " + year + "Pages capacity: " + pages + "\n";
    }

    public static void main(String[] args) {

        Book book4 = new Book("Oleni","Oleg Zalupskiy" ,1993 ,574);
        Book book1 = new Book("Oleni PART 2","Oleg Zalupskiy" ,1995 ,374);
        Book book2 = new Book("Oleni PART 3","Oleg Zalupskiy" ,2001 ,274);
        Book book3 = new Book("Oleni PART 4","Oleg Zalupskiy" ,2005 ,74);

        ArrayList<Book> books = new ArrayList<>();

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);



        System.out.println("Все книги: " + books);

        // 2. Самая толстая книга
        Book thickestBook = book1;
        for (Book book : books) {
            if (book.getPages() > thickestBook.getPages()) {
                thickestBook = book;
            }
        }
        System.out.println("\nСамая толстая книга: " + thickestBook);


        System.out.println("\nКниги после 2000 года:");
        for(Book book : books){

            if(book.getYear() > 2000){
                System.out.println(book);
            }

        }




    }
}


//Задание: Система управления книгамиСоздай класс Book со следующими требованиями:Поля:
//
//title (название)
//author (автор)
//year (год издания)
//pages (количество страниц)
//Методы:
//
//Конструктор с всеми параметрами
//Геттеры для всех полей
//Переопредели toString() в формате: "Книга: [название] - [автор] ([год], [страниц] стр.)"
//В main() создай массив из 3-4 книг и:
//
//Выведи весь массив одной строкой
//Найди и выведи самую толстую книгу (с максимальным количеством страниц)
//Выведи все книги, изданные после 2000 года