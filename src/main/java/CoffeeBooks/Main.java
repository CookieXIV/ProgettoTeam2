package CoffeeBooks;


import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        /*
        Autore stephenKing = new Autore("Stephen King");
        stephenKing.addBook(new Book("It","Stephen King"," ",19));
        stephenKing.addBook(new Book("Shining","Stephen King"," ",14));
        stephenKing.addBook(new Book("Misery","Stephen King"," ",16));
        stephenKing.addBook(new Book("Il miglio verde","Stephen King"," ",21));



        // problema con gli oggetti annidati, books=null --- fix
        //non riesci ad aggiungere oggetto Book in lista books dentro author --- fix
        //magari risolvere con una lista enum di autori(?) --- da provare ancora
        //------- Aggiornamento -- : risolto aggiungendo  books = new ArrayList<Book>(); Al costruttore di Autore ----



        Autore jRRMartin = new Autore("JRR Martin");
        jRRMartin.addBook(new Book("Il Signore degli Anelli","J.R.R. Martin","#",26));
        jRRMartin.addBook(new Book("Le due torri","J.R.R. Martin","#",25));
        jRRMartin.addBook(new Book("Il ritorno del Re","J.R.R. Martin","#",26));
        jRRMartin.addBook(new Book("Il Silmarillion","J.R.R. Martin","#",45));


            System.out.println("Digita il nome dello scrittore");
            String nomeAutoreCercato = s.nextLine();
            List<Book> libriAutore  = stephenKing.cercaAutore(nomeAutoreCercato);


            //  List<Book> libriAutore1  = jRRMartin.cercaAutore(nomeAutoreCercato) --- fare in modo che sia un unica lista
            // usare la nuova classe biblioteca per creare autore.list e un metodo switch con vari casi


            if (libriAutore.isEmpty()) {
                System.out.println("Nessun libro trovato per l'autore " + nomeAutoreCercato + ".");
            } else {
                System.out.println("Libri scritti da " + nomeAutoreCercato + ":");
                for (Book book : libriAutore) {
                    System.out.println(book.titolo + " - " + book.autore +" - " + book.prezzo + "€");
                }
            }
         */

        Biblioteca biblioteca = new Biblioteca();

        Autore autore1 = new Autore("Stephen King");
        autore1.addBook(new Book("It","Stephen King"," ",19.29));
        autore1.addBook(new Book("Shining","Stephen King"," ",14.45));
        autore1.addBook(new Book("Misery","Stephen King"," ",16.50));
        autore1.addBook(new Book("Il miglio verde","Stephen King"," ",21.0));

        Autore autore2 = new Autore("JRR Martin");
        autore2.addBook(new Book("Il Signore degli Anelli","J.R.R. Martin","#",26.00));
        autore2.addBook(new Book("Le due torri","J.R.R. Martin","#",25.45));
        autore2.addBook(new Book("Il ritorno del Re","J.R.R. Martin","#",26.00));
        autore2.addBook(new Book("Il Silmarillion","J.R.R. Martin","#",45.00));

        Autore autore3 = new Autore("Ernest Hemingway");
        autore3.addBook(new Book("Il Vecchio e il Mare","Ernest Hemingway","#",6.58));
        autore3.addBook(new Book("Per chi suona la campana","Ernest Hemingway","#",7.20));
        autore3.addBook(new Book("Addio alle Armi","Ernest Hemingway","#",7.00));
        autore3.addBook(new Book("Festa mobile","Ernest Hemingway","#",6.30));

        Autore autore4 = new Autore("Virginia Woolf");
        autore4.addBook(new Book("La Signora Dalloway","Virginia Woolf","#",8.94));
        autore4.addBook(new Book("Una ttanza tutta per sé","Virginia Woolf","#",7.50));
        autore4.addBook(new Book("Gita al faro","Virginia Woolf","#",8.94));
        autore4.addBook(new Book("Orlando","Virginia Woolf","#",9.49));

        Autore autore5 = new Autore("H.P. Lovecraft");
        autore5.addBook(new Book("Il richiamo di Cthulhu","H.P. Lovecraft","#",20.00));
        autore5.addBook(new Book("Alle montagne della follia","H.P. Lovecraft","#",12.00));
        autore5.addBook(new Book("Il Necronomicon","H.P. Lovecraft","#",24.70));
        autore5.addBook(new Book("I gatti i Ulthar","H.P. Lovecraft","#",12.90));
        autore5.addBook(new Book("Il Culto Segreto","H.P. Lovecraft","#",15.20));

        Autore autore6 = new Autore("Dan Brown");
        autore6.addBook(new Book("Il codice da Vinci","Dan Brown","#",7.99));
        autore6.addBook(new Book("Angeli e Demoni","Dan Brown","#",11.99));
        autore6.addBook(new Book("Inferno","Dan Brown","#",10.90));
        autore6.addBook(new Book("Origin","Dan Brown","#",14.25));



        biblioteca.addAutore(autore1);
        biblioteca.addAutore(autore2);
        biblioteca.addAutore(autore3);
        biblioteca.addAutore(autore4);
        biblioteca.addAutore(autore5);
        biblioteca.addAutore(autore6);

    while (true) {
        System.out.println("Abbiamo i seguenti autori: "+ autore1.name + " - " + autore2.name + " - " + autore3.name + " - " + autore4.name + " - " + autore5.name + " - " + autore6.name);
        System.out.print("Inserisci il nome dell'autore da cercare: ");
        String nomeAutore = s.nextLine();

        List<Book> libri = biblioteca.getLibri(nomeAutore);
        if (libri.isEmpty()) {
            System.out.println("Nessun libro trovato per l'autore " + nomeAutore);
        } else {
            for (Book libro : libri) {
                System.out.println(libro.autore + " - " + libro.titolo + " - " + libro.prezzo + "€");
            }
        }
    }






    }
}