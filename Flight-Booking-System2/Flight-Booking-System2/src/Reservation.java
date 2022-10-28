import java.util.*;

public class Reservation {
    public char answer;
    public static ArrayList<Flight> reservationList;
    User user;
    Flight flight;
    Seat seat;
    Scanner scanner;

    public Reservation() {
        this.user = new User();
        // flight = new Flight();
    }
    
    // let the user confirm the flight and add the flight to the reservation list
    public void confirmFlight() {
        // System.out.println(flight.flightNumber);
        reservationList = new ArrayList<>();
        scanner = new Scanner(System.in);
        System.out.println("==========================================================================================");
        System.out.println();
        System.out.println("Would you like to book the flight? - Enter \"Y\" for YES and \"N\" for NO: ");
        answer = scanner.next().charAt(0);
        if (answer == 'Y' || answer == 'y') {



            reservationList.add(new Flight(flight.flightNumber, flight.schedule, 0));
            // reservationList.add(new Seat(seat.seatClass, seat.column, seat.row));

            System.out.println(reservationList.toString());
            


            // showReservation();
        } else if (answer == 'N' || answer == 'n') {
            Main.showMenu(user);
        } else {
            System.out.println("Error: Invalid reservation option!");
        }
        System.out.println();
        System.out.println("==========================================================================================");
    }

    // public void showReservation() {

    //     System.out.println(reservationList.get(reservationList.size() - 1));
    //     System.out.println(User.firstName);
    // }
}
