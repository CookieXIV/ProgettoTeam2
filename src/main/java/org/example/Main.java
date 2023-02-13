package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {

        /*public Optional<Author> findFirstByName(final String name) {
            return Arrays.stream(author)
                    .filter(s -> s.getName().equalsIgnoreCase(name))
                    .findFirst();
        }*/
        Author a1 = new Author("Stephen King");
        Author a2 = new Author("Ernest Hemingway");
        Author a3 = new Author("Virginia Woolf");
        Author a4 = new Author("Dan Brown");

        ArrayList<Author> authors = new ArrayList<>();

        authors.add(a1);
        authors.add(a2);
        authors.add(a3);
        authors.add(a4);

        System.out.println(authors);

        a1.addBook(new Book("It", "Stephen King", "#",1,19.99));
        a1.addBook(new Book("Shining", "Stephen King", "#", 1, 19.99));
        a1.addBook(new Book("Misery","Stephen King","#",1, 16.50));
        a1.addBook(new Book("Il miglio verde","Stephen King","#",1,21.0));

        a1.getAuthor();



    }
}