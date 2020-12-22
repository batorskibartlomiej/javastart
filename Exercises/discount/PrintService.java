package Exercises.discount;

public class PrintService {



    public void printInfo(Client client, double price, double discountPrice){
        printWelcomeMeassage(client);
        printPrices(price,discountPrice);
    }



    private void printWelcomeMeassage(Client client){
        String firstName = client.getFirstName();
        String lastName = client.getLastName();
        if(firstName != null &&lastName==null) {
            System.out.println("Witaj " + firstName);
        }else if(firstName!=null&& lastName!=null) {
            System.out.println("Witaj " + firstName + " " + lastName);
        }else if(firstName==null&& lastName != null) {
            System.out.println("Dzień dobry panie/pani " + lastName);
        }else
            System.out.println("Witaj nieznajomy");


        }



    private void printPrices(double price, double discountPrice){
        System.out.println("Cena przed rabatem: "+ price);
        System.out.println("Cena po rabacie: "+discountPrice);
    }

}
