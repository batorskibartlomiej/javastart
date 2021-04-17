package pl.javastart.library.model;

import pl.javastart.library.exceptions.PublicationAlreadyExistException;
import pl.javastart.library.exceptions.UserAlreadyExistException;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Library implements Serializable {

//    private static final int MAX_BOOKS = 1000;
//    private static final int MAX_MAGAZINES = 1000;
//    private Book[] books = new Book[MAX_BOOKS];
//    private Magazine[] magazines = new Magazine[MAX_MAGAZINES];
//    private int booksNumber = 0;
//    private int magazinesNumber;




    private Map<String, Publication> publications = new HashMap<>();
    private Map<String, LibraryUser> users = new HashMap<>();

    public Map<String, Publication> getPublications() {
        return publications;
    }

    public Map<String, LibraryUser> getUsers() {
        return users;
    }

    public void addPublication(Publication publication) {
        if (publications.containsKey(publication.getTitle())) {
            throw new PublicationAlreadyExistException(
                    "Publikacja o takim tytule istnieje "+publication.getTitle()
            );
        }
            publications.put(publication.getTitle(), publication);

        }


        public void addUser(LibraryUser user){
         if(users.containsKey(user.getPesel())){
             throw new UserAlreadyExistException(
                     "Uzytkownik ze wskazanym peselem już istenieje " + user.getPesel()
             );
         }
         users.put(user.getPesel(),user);

        }

    public boolean removePublication(Publication pub) {
       if(publications.containsValue(pub)){
           publications.remove(pub.getTitle());
           return true;
       }else{
           return false;
       }


    }
}