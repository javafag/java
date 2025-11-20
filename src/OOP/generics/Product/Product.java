package OOP.generics.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Product<T extends Number & Comparable<T>> implements Comparable<Product<T>> {
    private String name;
    private T price;

    public Product(String name, T price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public T getPrice() {
        return price;
    }




    public boolean isMoreExpensive(Product<? extends Comparable<T>> other){
        return this.price.compareTo((T) other.price) > 0;
    }

    public int comparePrices(Product<? extends Comparable<T>> other){

        return this.price.compareTo((T)other.price);
    }

    public Double applyDiscount(double percentage){
        double priceAsDouble = this.price.doubleValue();
        return priceAsDouble - (priceAsDouble * percentage / 100);
    }

    @Override
    public int compareTo(Product<T> other) {
        return this.price.compareTo(other.price);
    }


    public static void main(String[] args) {
        List<Product<Double>> products = new ArrayList<>();
        products.add(new Product<>("Яблоко", 50.0));
        products.add(new Product<>("Банан", 30.0));
        products.add(new Product<>("Апельсин", 40.0));

        Collections.sort(products);

        for(Product<Double> p : products) {
            System.out.println(p.getName() + ": " + p.getPrice());
        }

        Product <Integer> productInt1 = new Product<>("Int1",21);
        Product <Integer> productInt2 = new Product<>("Int2",25);
        Product <Double> productDouble = new Product<>("Int",23.0);
        Product <Float> productFloat = new Product<>("Int",25.0f);



        System.out.println(productInt1.comparePrices( productInt2));

        System.out.println("Discount" + productFloat.applyDiscount(30));


        System.out.println(productInt1.comparePrices(productInt2));



        Product<Double> maxProduct = products.get(0);
        for(Product<Double> P : products){
            if(P.isMoreExpensive(maxProduct)){
                maxProduct = P;
            }
        }

        System.out.println(maxProduct.getName());
    }
}






//Задание: Система управления продуктами
//Создай класс Product<T extends Comparable<T>> со следующими требованиями:
//Поля:
//
//name (String)
//price (T) - generic тип, который можно сравнивать
//
//Методы:
//
//Конструктор - принимает name и price
//getters для обоих полей
//isMoreExpensive(Product<? extends Comparable<T>> other) - возвращает true если этот продукт дороже
//comparePrices(Product<? extends Comparable<T>> other) - возвращает результат сравнения цен (int)
//applyDiscount(double percentage) - применяет скидку в процентах (возвращает новую цену как Double)
//
//В main создай:
//
//        3 продукта с разными типами цен (Integer, Double, Float)
//Сравни их между собой
//Примени скидку 20% к одному из них
//Найди самый дорогой продукт из списка
//
//Дополнительно:
//Сделай класс Product implements Comparable<Product<T>> чтобы можно было сортировать список продуктов по цене.
//Попробуй написать сам, потом покажу решение если что!