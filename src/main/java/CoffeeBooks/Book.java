package CoffeeBooks;

public class Book {

    String titolo;
    String autore;
    String code;
    double prezzo;
    int quantità;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + titolo + '\'' +
                ", author='" + autore + '\'' +
                ", code='" + code + '\'' +
                ", cost=" + prezzo +
                ", in possesso=" + quantità +'\''+
                '}';
    }

    public Book(String titolo, String autore, String code, double prezzo, int quantità) {
        this.titolo = titolo;
        this.autore = autore;
        this.code = code;
        this.prezzo = prezzo;
        this.quantità = quantità;
    }






}

