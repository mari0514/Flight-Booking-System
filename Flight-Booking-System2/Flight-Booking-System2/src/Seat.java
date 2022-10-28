import java.util.Scanner;

public class Seat {
    public String seatClass;
    public char column;
    public int row;

    Flight flight;
    Reservation reservation;

    Scanner scanner;

    // constructor
    public Seat() {
        reservation = new Reservation();
    }

    public Seat(String seatClass, char column, int row) {
        this.seatClass = seatClass;
        this.column = column;
        this.row = row;
    }

    public void showSeatClass() {
        System.out.println("==========================================================================================");
        System.out.println();
        System.out.println("Which class would you like to choose?: ");
        System.out.println();
        System.out.println("1 - Economy / $1,000");
        System.out.println("2 - Premium Economy / $2,000");
        System.out.println("3 - Business / $3,000");
        System.out.println("4 - First Class / $4,000");
        System.out.println("5 - Go back to the destination menu");
        System.out.println();
        System.out.println("==========================================================================================");

        scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        switch (value) {
            case 1:
                System.out.println("Your seat class is \"Economy\"");
                this.seatClass = "Economy";
                seatNumberOfEconomy();
                break;
            case 2:
                System.out.println("Your seat class is \"Premium Economy\"");
                this.seatClass = "Premium Economy";
                seatNumberOfPremiunEconomy();
                break;
            case 3:
                System.out.println("Your seat class is \"Business\"");
                this.seatClass = "Business";
                seatNumberOfBusiness();
                break;
            case 4:
                System.out.println("Your seat class is \"First Class\"");
                this.seatClass = "First Class";
                seatNumberOfFirstClass();
                break;
            case 5:
                flight.showDestination();
                break;
            default:
                System.out.println("Error: Invalid option!");
                break;
        }
    }


    public void seatNumberOfEconomy() {
        System.out.println("==========================================================================================");
        System.out.println();
        System.out.println("Please select column of seat - enter a number from 31 - 50");
        this.row = scanner.nextInt();
        System.out.println();
        System.out.println("Please select row of seat - enter an alphabet from A - K");
        this.column = scanner.next().charAt(0);
        System.out.println();
        System.out.println("==========================================================================================");
        System.out.println();
        System.out.println("Your seat number is \"" + row + column + "\"");
        System.out.println();
        reservation.confirmFlight();
    }
   
    public void seatNumberOfPremiunEconomy() {
        System.out.println("==========================================================================================");
        System.out.println();
        System.out.println("Please select column of seat - enter a number from 11 - 30");
        this.row = scanner.nextInt();
        System.out.println("Please select row of seat - enter an alphabet from A - K");
        this.column = scanner.next().charAt(0);
        System.out.println();
        System.out.println("==========================================================================================");
        System.out.println();
        System.out.println("Your seat number is \"" + row + column + "\"");
        System.out.println();
        reservation.confirmFlight();
    }
    
    public void seatNumberOfBusiness() {
        System.out.println("==========================================================================================");
        System.out.println();
        System.out.println("Please select column of seat - enter a number from 6 - 10");
        this.row = scanner.nextInt();
        System.out.println("Please select row of seat - enter an alphabet from A - K");
        this.column = scanner.next().charAt(0);
        System.out.println();
        System.out.println("==========================================================================================");
        System.out.println();
        System.out.println("Your seat number is \"" + row + column + "\"");
        System.out.println();
        reservation.confirmFlight();
    }
    
    public void seatNumberOfFirstClass() {
        System.out.println("==========================================================================================");
        System.out.println();
        System.out.println("Please select column of seat - enter a number from 1 - 5");
        this.row = scanner.nextInt();
        System.out.println("Please select row of seat - enter an alphabet from A - K");
        this.column = scanner.next().charAt(0);
        System.out.println();
        System.out.println("==========================================================================================");
        System.out.println();
        System.out.println("Your seat number is \"" + row + column + "\"");
        System.out.println();
        reservation.confirmFlight();
    }

    @Override
    public String toString() {
        return 
            "Seat Class = " + seatClass + 
            "\nrow = " + row +
            "\ncolumn = " + column;
    }
    
}

