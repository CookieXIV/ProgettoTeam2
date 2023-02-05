package CoffeeBooks;

import java.util.ArrayList;
import java.util.List;

public class Autore {

    String name;

    List<Book> books;

    public Autore(String name) {
        this.name = name;
        books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
       books.add(book);
    }



    /*
    public void getBooks() {
        for (Book book:books
             ) {
            System.out.println(book.toString());
        }
     }


    public List<Book> cercaAutore(String nomeAutoreCercato) {
        List<Book> libriAutore = new ArrayList<Book>();
        for (Book book : books) {
            if (book.autore.equals(nomeAutoreCercato)) {
                libriAutore.add(book);
            }
        }
        return libriAutore;
    }
    */



}
