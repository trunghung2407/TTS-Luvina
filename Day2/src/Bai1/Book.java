/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author X1 GEN 4
 */
public class Book {
    private String name;
    private Author author;
    private double price;
    private int count;

    public Book(String name, Author author, double price, int count) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", author=" + author.toString() + ", price=" + price + ", count=" + count + '}';
    }
    
}
