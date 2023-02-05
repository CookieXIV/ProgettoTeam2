package CoffeeBooks;

public class Book {

    String titolo;
    String autore;
    String code;
    double prezzo;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + titolo + '\'' +
                ", author='" + autore + '\'' +
                ", code='" + code + '\'' +
                ", cost=" + prezzo +
                '}';
    }

    public Book(String titolo, String autore, String code, double prezzo) {
        this.titolo = titolo;
        this.autore = autore;
        this.code = code;
        this.prezzo = prezzo;
    }





}

