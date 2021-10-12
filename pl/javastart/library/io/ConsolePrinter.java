package pl.javastart.library.io;

import pl.javastart.library.model.Book;
import pl.javastart.library.model.LibraryUser;
import pl.javastart.library.model.Magazine;
import pl.javastart.library.model.Publication;

import java.util.Collection;

public class ConsolePrinter {

    public void printMagazines(Collection<Publication> publications) {//może być tak, ale to niżej tez jets ok
        long count = publications.stream()
                .filter(p->p instanceof Magazine)
                .map(Publication::toString)
                .peek(this::printLine)
                .count();
                if(count==0)
                    printLine("Brak magazynów w bibliotece");




    }

    public void printBooks(Collection<Publication> publications) {
        int countBooks=0;

        for (Publication publication : publications) {
            if(publication instanceof Book)
                printLine(publication.toString());
            countBooks++;

        }
        if(countBooks==0){
            printLine("Brak książek");
        }

    }

    public void printUsers(Collection<LibraryUser> users){
        for (LibraryUser user : users) {
            printLine(user.toString());

        }
    }

    public void printLine(String text){
        System.out.println(text);
    }
}
