package pl.javastart.library.io;

import pl.javastart.library.model.Book;
import pl.javastart.library.model.Magazine;

import java.util.Scanner;

public class DataReader {

    private Scanner sc = new Scanner(System.in);
    private ConsolPrinter printer;

    public DataReader(ConsolPrinter printer) {
        this.printer = printer;
    }

    public Book readAndCreateBook(){
        printer.printLine("Tytuł: ");
        String title = sc.nextLine();
        printer.printLine("Autor: ");
        String author = sc.nextLine();
        printer.printLine("Wydawnictwo: ");
        String publisher = sc.nextLine();
        printer.printLine("ISBN: ");
        String isbn = sc.nextLine();
        printer.printLine("Rok wydania: ");
        int releaseDate = sc.nextInt();
        sc.nextLine();
        printer.printLine("Ilość stron: ");
        int pages = sc.nextInt();
        sc.nextLine();

        return new Book(title, author, releaseDate, pages, publisher, isbn);

    }

    public Magazine readAndCreateMagazine() {
        printer.printLine("Tytuł: ");
        String title = sc.nextLine();
        printer.printLine("Wydawnictwo: ");
        String publisher = sc.nextLine();
        printer.printLine("Język: ");
        String language = sc.nextLine();
        printer.printLine("Rok wydania: ");
        int year = getInt();
        printer.printLine("Miesiąc: ");
        int month = getInt();
        printer.printLine("Dzień: ");
        int day = getInt();

        return new Magazine(title, publisher, language, year, month, day);
    }
    
    public int getInt(){
        try{
            return sc.nextInt();
        } finally {
            sc.nextLine();

        }

    }


    public void close() {
        sc.close();
    }

}