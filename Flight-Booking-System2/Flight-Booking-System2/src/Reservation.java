import java.util.*;

public class Reservation {
    public char answer;
    public static ArrayList<Flight> reservationList;

    // User user;
    // Flight flight;
    Scanner scanner;
    
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

            // reservationList.add(new Flight()));
            // showReservation();
        } else if (answer == 'N' || answer == 'n') {
            Main.showMenu();
        } else {
            System.out.println("Error: Invalid reservation option!");
        }
        System.out.println();
        System.out.println("==========================================================================================");
    }

    // public void showReservation() {
    //     System.out.println("You've successfully booked the flight!");
    //     System.out.println("Flight Detail");
    //     System.out.println(reservationList.get(reservationList.size() - 1));
    //     System.out.println(User.firstName);
    // }
}
