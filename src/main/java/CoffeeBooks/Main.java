package CoffeeBooks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);



        Author StephenKing = new Author();
        StephenKing.addBook(new Book("It","Stephen King"," ",19));
        StephenKing.addBook(new Book("Shining","Stephen King"," ",14));
        StephenKing.addBook(new Book("Misery","Stephen King"," ",16));
        StephenKing.addBook(new Book("Il miglio verde","Stephen King"," ",21));

        try {
            System.out.println("Digita il nome dello scrittore");
            String search = s.nextLine();
            if (search == StephenKing.name) {
                StephenKing.books.stream().toArray();
            } else {
                System.out.println("Invalid name");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }









    }
}