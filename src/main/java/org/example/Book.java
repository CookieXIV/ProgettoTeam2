package org.example;

import java.util.Objects;

public class Book {
    String title;
    String author;
    String barcode;
    int quantity;
    double price;

    public Book(String title, String author, String barcode, int quantity, double price){
        this.title = title;
        this.author = author;
        this.barcode = barcode;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Title='" + title + '\'' +
                ", Author='" + author + '\'' +
                ", Barcode='" + barcode + '\'' +
                ", Quantity=" + quantity +
                ", Price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return quantity == book.quantity && Double.compare(book.price, price) == 0 && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(barcode, book.barcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, barcode, quantity, price);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
