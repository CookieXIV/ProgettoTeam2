package org.example;

import java.util.List;

public class Author {

    String name;
    String surname;

    List<Book> books;

    public void Author(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public List<Book> getBooks(){
        return books;
    }
}
