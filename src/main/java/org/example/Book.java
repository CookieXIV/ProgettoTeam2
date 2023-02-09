package org.example;

public class Book {
    String title;
    String author;
    String barcode;
    int quantity;
    double price;

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
