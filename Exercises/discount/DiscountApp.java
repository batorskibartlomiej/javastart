package Exercises.discount;

class DiscountApp {
    public static void main(String[] args) {
        Client client1 = new Client("Jan", "Kowalski", true);
        double price1 = 1100;

        Client client2 = new Client("Karol", "Nowak", false);
        double price2 = 1100;

        Client client3 = new Client(null, null, true);

        DiscountService discountService = new DiscountService();
        double priceDiscount1 = discountService.calculateDiscountPrice(client1, price1);
        double priceDiscount2 = discountService.calculateDiscountPrice(client2, price2);

        PrintService service = new PrintService();
        service.printInfo(client3,price1, priceDiscount1);


    }
}