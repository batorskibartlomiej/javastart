package pl.javastart.library.app;

import pl.javastart.library.exceptions.noSuchOptionException;
import pl.javastart.library.io.ConsolPrinter;
import pl.javastart.library.io.DataReader;
import pl.javastart.library.model.Book;
import pl.javastart.library.model.Library;
import pl.javastart.library.model.Magazine;
import pl.javastart.library.model.Publication;

import java.util.InputMismatchException;

public class LibraryControl {

    // zmienne do kontrolowania programu

    private ConsolPrinter printer = new ConsolPrinter();
    private DataReader dataReader = new DataReader(printer);
    private Library library = new Library();


    public void controlLoop() {
        Option option;

        do {
            printOptions();
            option = getOption();
            switch (option) {
                case ADD_BOOK:
                    addBook();
                    break;
                case ADD_MAGAZINE:
                    addMagazine();
                    break;
                case PRINT_BOOKS:
                    printBooks();
                    break;
                case PRINT_MAGAZINES:
                    printMagazines();
                    break;
                case EXIT:
                    exit();
                    break;
                default:
                    printer.printLine("Nie ma takiej opcji, wprowadź ponownie: ");


            }
        }while(option != Option.EXIT);

    }

    private Option getOption() {
        boolean optionOk = false;
        Option option = null;
        while (!optionOk) {
            try {
                option = Option.createFromInt(dataReader.getInt());
                optionOk = true;
            } catch (noSuchOptionException e) {
                printer.printLine(e.getMessage() + ", podaj ponownie:");
            } catch (InputMismatchException ignored) {
                printer.printLine("Wprowadzono wartość, która nie jest liczbą, podaj ponownie:");
            }
        }

        return option;
    }
    private void printOptions() {
        printer.printLine("Wybierz opcję: ");
        for (Option option : Option.values()) {
            printer.printLine(option.toString());

        }
    }

    private void exit() {
        printer.printLine("Koniec programu");
        dataReader.close();
    }

    private void printBooks() {

        Publication[] publications = library.getPublications();
        printer.printBooks(publications);
    }

    private void addBook() {
        try {
            Book book = dataReader.readAndCreateBook();
            library.addBook(book);
        } catch (InputMismatchException e) {
            printer.printLine("Niepoprawne dane");
        } catch (ArrayIndexOutOfBoundsException e) {
            printer.printLine("Przekroczono liczbę maksymalna");
        }
    }
    private void addMagazine() {
        try {
            Magazine magazine = dataReader.readAndCreateMagazine();
            library.addMagazine(magazine);
        } catch (InputMismatchException e) {
            printer.printLine("Niepoprawne dane, nie można utworzyć magazynu");
        } catch (ArrayIndexOutOfBoundsException e) {
            printer.printLine("Przekroczono liczbę maksymalna");
        }
    }


    private void printMagazines() {
        Publication[] publications = library.getPublications();
        printer.printMagazines(publications);
    }


}
