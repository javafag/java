package OOP.generics.Book;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Book <T extends Number & Comparable<T>> implements Comparable<Book<T>> {
    private String title;
    private String author;
    private T rating;

    public Book(String author, String title, T rating) {
        this.author = author;
        this.title = title;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public T getRating() {
        return rating;
    }

    public boolean hasBetterRating(Book<? extends Comparable<T>> other){
        return this.rating.compareTo((T)other.rating) > 0;
    }

    public Integer compareRatings(Book<? extends Comparable<T>> other){
        return this.rating.compareTo((T)other.rating);
    }

    public Double getRatingAsPercentage(){
        double ratingAsDouble = this.rating.doubleValue();

        return (ratingAsDouble / 10.0) * 100.0;
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", rating=" + rating +
                '}';
    }

    @Override
    public int compareTo(Book<T> o) {
        return this.rating.compareTo(o.rating);
    }


    public static void main(String[] args) {
        List<Book<Double>> books = new ArrayList<>();



        books.add(new Book<>("Olek","SINNERS - 1",4.0));
        books.add(new Book<>("Olek","SINNERS - 2",7.0));
        books.add(new Book<>("Olek","SINNERS - 3",9.0));


        Book<Double> book4 = new Book("Olek","SINNERS - 4",10.0);
        books.add(book4);


        Collections.sort(books);



       for(Book<Double> p : books) {
            System.out.println(p.getAuthor() + ", " + p.getTitle() + ": " + p.getRating());
        }

        Book<Double> Max = books.get(0);
        for(Book<Double> p : books) {
            if(p.hasBetterRating(Max)){
                Max = p;
            }
        }

        System.out.println(Max + "% : Book with the best rating");


        System.out.println(book4.getRatingAsPercentage());


        System.out.println(books.get(2).compareRatings(books.get(3)));

    }

}

//Список из 4-5 книг с разными типами рейтингов (Integer от 1-10, Double от 0.0-10.0)
//Отсортируй список
//Найди книгу с лучшим рейтингом
//Выведи рейтинг одной книги в процентах
//Сравни две книги между собой



//Задание: Библиотека книг
//Создай класс Book<T extends Comparable<T>> со следующими требованиями:
//Поля:
//
//title (String) - название
//author (String) - автор
//rating (T) - рейтинг (generic тип, который можно сравнивать)
//
//Методы:
//
//Конструктор - принимает все три параметра
//getters для всех полей
//hasBetterRating(Book<? extends Comparable<T>> other) - возвращает true если у этой книги рейтинг выше
//compareRatings(Book<? extends Comparable<T>> other) - возвращает результат сравнения рейтингов (int)
//getRatingAsPercentage() - возвращает рейтинг как процент от 10 (Double). Например: рейтинг 8 → 80.0%
//toString() - переопредели, чтобы красиво выводить книгу
//
//Дополнительно:
//
//Сделай класс implements Comparable<Book<T>> для сортировки по рейтингу
//
//В main создай:
//

//
//Удачи! Пиши если застрянешь 🔥