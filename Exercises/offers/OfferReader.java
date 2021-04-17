package Exercises.offers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OfferReader {

    private static final int OFFERS= 10;

    static Offer[] readOffers( String fileName) throws FileNotFoundException {
        Offer[] offerss = new Offer[10];

        try(Scanner scanner=new Scanner(new File(fileName))){
            scanner.nextLine();
            for (int i = 0; i < offerss.length; i++) {
                offerss[i]= createOffer(scanner.nextLine());

            }



        }return offerss;







    }

    private static Offer createOffer(String line) {

        String []data = line.split(";");
        return new Offer(data[0], Double.parseDouble(data[1]), Double.parseDouble(data[2]));


    }


}
