import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.UUID;



public class User {

    private String id;

    private String firstName;
    private String lastName;
    private boolean isActive;
    private Integer password;
    Scanner scanner = new Scanner(System.in);

    public User() {
        this.id = UUID.randomUUID().toString();
        this.password = null;
        this.isActive = false;
    }

    public String getId() {
        return id;
    }

    public boolean isActive() {
        return isActive;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Welcome " + this.firstName + " " + this.lastName + " | " + "User Id: " + this.id;
    }

    public void signUp(){

        System.out.println("=======================================");
        System.out.print("Please enter first name: ");
        this.firstName = scanner.nextLine();
        System.out.print("Please enter last name: ");
        this.lastName = scanner.nextLine();
        System.out.print("Please enter password: ");
        
    
        try {
            this.password = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Password should be all integer value, Please try again!");
            // try to get password again after catching exception;
        } finally{
            this.isActive = true;
        }

    }

    public void showMenu(){
        Flight flight = new Flight();
        char inputValue = '\0';

        System.out.println("===============================");
        System.out.println(toString());
        System.out.println("===============================");
        System.out.println("1 - Book a flight");
        System.out.println("2 - See reservations");
        System.out.println("3 - Cancel reservations");
        System.out.println("4 - Exit");
        System.out.println("===============================");

        do{
            
            System.out.print("Please enter number: ");

            try {
                inputValue = scanner.next().charAt(0);
            } catch (NoSuchElementException e) {
                System.out.println("Something went wrong!");
            }
            
            
            switch (inputValue) {
                case '1':
                    System.out.println("Book a flight");
                    flight.showFlightMenu();
                    break;
                case '2':
                    System.out.println("See reservation");
                    break;
                case '3':
                    System.out.println("Cancel reservation");
                    break;
                case '4':
                    System.out.println("Thanks for using Mari's Airline!");
                    break;
                default:
                    break;
            }
        }while(inputValue != '4');
    }
    
}
