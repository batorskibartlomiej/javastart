package pl.javastart.library.model;

public class Library {

//    private static final int MAX_BOOKS = 1000;
//    private static final int MAX_MAGAZINES = 1000;
//    private Book[] books = new Book[MAX_BOOKS];
//    private Magazine[] magazines = new Magazine[MAX_MAGAZINES];
//    private int booksNumber = 0;
//    private int magazinesNumber;

    private static final int MAX_PUBLICATION = 2000;
    private Publication[] publications = new Publication[MAX_PUBLICATION];
    private int publicationNumber = 0;


    public Publication[] getPublications() {
        Publication[] result = new Publication[publicationNumber];
        for (int i = 0; i < result.length; i++) {
            result[i]= publications[i];

        }
        return result;
    }

    public void addBook(Book book) {

        addPublication(book);

    }



    public void addMagazine(Magazine magazine) {
        addPublication(magazine);

    }

    private void addPublication(Publication publication) {
        if (publicationNumber >= MAX_PUBLICATION) {
            throw new ArrayIndexOutOfBoundsException("Max publications exceeded " + MAX_PUBLICATION);
        }
        publications[publicationNumber] = publication;
        publicationNumber++;
    }


}
