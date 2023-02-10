package org.example;

import java.util.ArrayList;

public class Author {
    String name;

    ArrayList<Book> myBook = new ArrayList<Book>();
    Book sk1 = new Book("It", "Stephen King", "#",1,19.99);
    Book sk2 = new Book("Shining", "Stephen King", "#", 1, 19.99);
    Book sk3 = new Book("Misery","Stephen King","#",1, 16.50);
    Book sk4 = new Book("Il miglio verde","Stephen King","#",1,21.0);

    public Author(String name){
        this.name= name;
    }

    @Override
    public String toString() {
        return "Author= " + name + " ";
    }

    public String getAuthor(){
        return name +"\nI suoi libri=\n" + myBook ;
    }

}
