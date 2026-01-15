package OOPS.Level2;
// Program to Model a Movie Ticket Booking System
public class Q4 {
    public static void main(String[] args) {
        MovieTicket m = new MovieTicket("Cars");
        m.book(23,500);
        m.display();

    }
}
class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    MovieTicket(String movieName){
        this.movieName=movieName;
    }

    void book(int seat, double cost){
        seatNumber = seat;
        price = cost;
    }

    void display(){
        System.out.println("Movie: " + movieName);
        System.out.println("Seat No: " + seatNumber);
        System.out.println("Price: " + price);
    }
}
