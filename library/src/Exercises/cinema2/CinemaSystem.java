package Exercises.cinema2;

class CinemaSystem {
    public static void main(String[] args) {


        Movie movie1 = new Movie("Omen", "horror", 128,18,72,72);
        Client client1 = new Client("Jan", "Nowak", 19);



        Client client2 = new Client("Jan", "Batorski", 19);

        SellingTickets st1 = new SellingTickets();




        Ticket ticket1 =st1.selling(movie1, client1);
        Ticket ticket2 =st1.selling(movie1, client2);






        System.out.println("Sprzedane bilety");
        if (ticket1 != null) {
            System.out.println(ticket1.getInfo());
        }
        if (ticket2 != null) {
            System.out.println(ticket2.getInfo());
        }

        System.out.println("Liczba pozostałych miejsc: " + movie1.getFreeSeats());
        System.out.println("Liczba sprzedanych biletów: " + (movie1.getMaxSeats() - movie1.getFreeSeats()));
    }
}