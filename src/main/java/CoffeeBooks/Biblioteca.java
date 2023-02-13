package CoffeeBooks;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<Autore> autori;

    public Biblioteca() {
        autori = new ArrayList<Autore>();
    }

    public void addAutore(Autore autore) {
        autori.add(autore);
    }

    public List<Book> getLibri(String nomeAutore) {
        List<Book> libri = new ArrayList<Book>();
        for (Autore autore : autori) {
            if (autore.name.equals(nomeAutore)) {
                libri.addAll(autore.books);
                break;
            }
        }
        return libri;
    }

    public void setAutori(List<Autore> autori) {
        this.autori = autori;
    }

    public List<Autore> getAutori() {
        return autori;
    }


}
