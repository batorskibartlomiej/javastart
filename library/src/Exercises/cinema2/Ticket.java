package Exercises.cinema2;

public class Ticket {

    private int ticket1Id;
    private Client client;
    private Movie movie;


    public Ticket(int ticket1Id, Client client, Movie movie) {
        this.ticket1Id = ticket1Id;
        this.client = client;
        this.movie = movie;
    }

    public String getInfo() {
        return getTicket1Id()+ " | " +client.getFullName()+ " | " +movie.getMovieInfo();
    }

    public int getTicket1Id() {
        return ticket1Id;
    }

    public void setTicket1Id(int ticket1Id) {
        this.ticket1Id = ticket1Id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
