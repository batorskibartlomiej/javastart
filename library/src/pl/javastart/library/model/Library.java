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




    public void addBook(Book book) {

        if (publicationNumber < MAX_PUBLICATION) {
            publications[publicationNumber] = book;
            publicationNumber++;

        } else {
            System.out.println("Maksymalna liczba książek przekroczona");

        }

    }

    public void printBooks() {
        int countBooks=0;

        for (int i = 0; i < publicationNumber; i++) {
            if(publications[i] instanceof Book)
                System.out.println(publications[i]);
            countBooks++;

        }
        if(countBooks==0){
            System.out.println("Brak książek");
        }

    }

    public void addMagazine(Magazine magazine) {
        if (publicationNumber < MAX_PUBLICATION) {
            publications[publicationNumber] = magazine;
            publicationNumber++;
        } else {
            System.out.println("Maxymalna liczba magazynów została osiągnięta");
        }

    }

    public void printMagazines() {
        int countMagazines=0;
        for (int i = 0; i < publicationNumber; i++) {
            if(publications[i] instanceof Magazine)

            System.out.println(publications[i]);
            countMagazines++;
        }
        if (countMagazines == 0) {
            System.out.println("Brak magazynów w bibliotece");
        }


    }
}
