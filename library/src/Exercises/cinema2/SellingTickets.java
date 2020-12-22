package Exercises.cinema2;

public class SellingTickets {


    public Ticket selling(Movie movie, Client client) {
        if (movie.getFreeSeats() == 0) {
            System.out.println("Brak wolnych miejsc");
            return null;
        } else if (client.getAge1() < movie.getAgeRequired()) {
            System.out.println("Film dostępny dla osób powyżej " + movie.getAgeRequired() + " lat");
            return null;
        } else {
            int ticketId = movie.getMaxSeats() - movie.getFreeSeats() + 1;
            movie.decreaseFreeSeats();
            return new Ticket(ticketId, client, movie);
        }
    }

}







