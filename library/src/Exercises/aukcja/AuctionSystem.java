package Exercises.aukcja;

public class AuctionSystem {

    public static void main(String[] args) {

        Auction auction1 = new Auction();
        auction1.title = "Xbox";
        auction1.description="extra super";
        auction1.price = 200;
        auction1.seller = new Seller();
        auction1.seller.firstName = "Bartek";
        auction1.seller.lastName = "Batorski";
        auction1.seller.adress = new Adress();
        auction1.seller.adress.city = "Warsaw";

        System.out.println(auction1.seller.firstName);

       // Auction auction = new Auction();/

    }


}
