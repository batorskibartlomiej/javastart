package Exercises.cinema;

class CinemaSystem {
    public static void main(String[] args) {


        Movie movie1 = new Movie("Omen", "horror", 128, 16, 73, 73);



        Client client1 = new Client("Jan", "Kowalski", 17);
        Client client2 = new Client("Anna", "Zalewska", 19);
        SellingTickets st1 = new SellingTickets();
        Ticket ticket2 = st1.createTicket(movie1, client2);

        Ticket ticket1 = st1.createTicket(movie1, client1);


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
