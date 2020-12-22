package Exercises.Shop;

public class Shop {
    public static void main(String[] args) {
        Product product1 = new Product("Czekolada mleczna","Milka");
//        product1.name = "Czekolada mleczna";
//        product1.producer = "Milka";
        Offer offer1 = new Offer(product1, 3.99, true);
//        offer1.product = product1;
//        offer1.price = 3.99;
//        offer1.special = true;

        offer1.printInfo();


    }
}
