import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User myUser = new User();
        
        if(myUser.isActive()){
            showMenu(myUser);
        }else{
            myUser.signUp();
            showMenu(myUser);
        }

    }

    public static void showMenu(User user){
        Flight flight = new Flight();
        char inputValue = '\0';

        // User user = new User();
        
        Scanner scanner = new Scanner(System.in);
        
        do{
            try{
                
                System.out.println("===============================");
                System.out.println();
                System.out.println(user.toString());
                System.out.println();
                System.out.println("===============================");
                System.out.println();
                System.out.println("1 - Book a flight");
                System.out.println("2 - See reservations");
                System.out.println("3 - Cancel reservations");
                System.out.println("4 - Exit");
                System.out.println();
                System.out.println("===============================");
                System.out.print("Please enter number: ");

                inputValue = scanner.next().charAt(0);

                switch (inputValue) {
                    case '1':
                        System.out.println("Book a flight");
                        flight.showDestination();
                        System.out.println(flight);
                        break;
                    case '2':
                        System.out.println("See reservation");
                        showMyFlight(user.getMyFlights());
                        break;
                    case '3':
                        System.out.println("Cancel reservation");
                        break;
                    case '4':
                        System.out.println("Thanks for using Mari's Airline! Have a nice one!");
                        break;
                    default:
                        System.out.println("Error: Invalid menu option!");
                        break;
                }
            } catch (NoSuchElementException e) {
                System.out.println("Something went wrong!");
            }
            
        }while(inputValue != '4');

        scanner.close();
    }

    public static void showMyFlight(ArrayList<Flight> list){
        for(Flight item: list){
            System.out.println(item.getFlightNumber());
        }
    }
}
