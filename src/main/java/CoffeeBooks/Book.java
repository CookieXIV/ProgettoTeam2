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

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setQuantità(int quantità) {
        this.quantità = quantità;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getQuantità() {
        return quantità;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public String getAutore() {
        return autore;
    }

    public String getCode() {
        return code;
    }

    public String getTitolo() {
        return titolo;
    }


}

