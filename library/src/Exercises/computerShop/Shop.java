package Exercises.computerShop;

public class Shop {

    public static void main(String[] args) {
        Computer comp1 = new Computer("ASUS", 123);
        Computer comp2 = new Computer("ASUS", 124);
        Computer comp3 = new Computer("ASUS", 125);
        Computer comp4 = new Computer("ASUS", 125);
        Computer comp5 = new Computer("ASUS", 12);


        DataStore data = new DataStore();
        data.add(comp1);
        data.add(comp2);
        data.add(comp3);
        data.add(comp4);
        data.add(comp5);

        Computer compTofind = new Computer("ASUS", 12);

        int howManyCompFinds= data.checkAvailability(compTofind);
        System.out.println("Znaleziono "+howManyCompFinds+" takich samych kompów");

        System.out.println("Wszystkich kompów jest ");
        for (Computer c: data.getComputers()) {
            System.out.println(c);
            
        }

    }
}
