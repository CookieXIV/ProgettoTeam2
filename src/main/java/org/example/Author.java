package org.example;

import java.util.ArrayList;

public class Author {
    String name;

    ArrayList<Book> myBook = new ArrayList<Book>();

    public Author(String name){
        this.name= name;
    }

    public String getAuthor(){
        return name +"\nI suoi libri=\n" + myBook.toString() ;
    }

    public void addBook(Book book){
        myBook.add(book);
    }

}
