import java.util.ArrayList;
import java.util.Scanner;

public class Flight {
    public String flightNumber;
    public String schedule;
    public int capacity;
    public String destination;
    
    public ArrayList<Flight> flightList;

    User user = new User();
    Seat seat;

    Scanner scanner;

    // constructor
    public Flight() {
        this.flightNumber = "";
        this.schedule = "";
        this.capacity = 0;
        this.destination = "";
        seat = new Seat();
    }

    public Flight(String flightNumber, String schedule, int capacity) {
        this.flightNumber = flightNumber;
        this.schedule = schedule;
        this.capacity = capacity;
    }


    // getters and setters
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    // public void showFlightInformation(){
    //     System.out.println("============");
    //     System.out.println("Flight Number: " + this.flightNumber );
    //     System.out.println("Schedule: " + this.schedule );
    //     System.out.println("Capacity: " + this.capacity );
    //     System.out.println("============");
    // }


    public void showDestination() {
        System.out.println("==========================================================================================");
        System.out.println();
        System.out.println("Where are you travelling to?: ");
        System.out.println("1 - Tokyo");
        System.out.println("2 - New York");
        System.out.println("3 - Paris");
        System.out.println("4 - Go back to the main menu");
        System.out.println();
        System.out.println("==========================================================================================");

        scanner = new Scanner(System.in);
        int valueNum = scanner.nextInt();
        switch (valueNum) {
            case 1:
                destination = "Tokyo";
                showFlightMenuToTokyo();
                break;
            case 2:
                destination = "New York";
                showFlightMenuToNY();
                break;
            case 3:
                destination = "Paris";
                showFlightMenuToParis();
                break;
            case 4:
                Main.showMenu(user);
                scanner.close();
                break;
        
            default:
            System.out.println("Error: Invalid option!");
                break;
        }
    }


    public void showFlightMenuToTokyo() {

        flightList = new ArrayList<>();

        flightList.add(new Flight("011MR", "07:00am - 09:30am", 30));
        flightList.add(new Flight("012MR", "9:15am - 11:45am", 35));
        flightList.add(new Flight("013MR", "12:05pm - 2:35pm", 50));
        flightList.add(new Flight("014MR", "3:00pm - 5:30pm", 40));

        System.out.println("==========================================================================================");
        System.out.println();
        System.out.println("*** MENU ***");
        System.out.println("Please choose the flight to Tokyo");
        System.out.println();
        showFLightList(flightList);
        System.out.println("5 - Go back to the destination menu");
        // showFlightInformation();
        System.out.println();
        System.out.println("==========================================================================================");

        scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        switch (value) {
            case 1:
                System.out.println("Destination: " + this.destination + " | Flight Number: " + flightList.get(0).flightNumber + " | Flight Schedule: " + flightList.get(0).schedule + " | Capacity: " + flightList.get(0).capacity);
                flightNumber = flightList.get(0).flightNumber; 
                schedule = flightList.get(0).schedule;
                capacity = flightList.get(0).capacity;
                seat.showSeatClass();
                break;
            case 2:
                System.out.println("Destination: " + this.destination + " | Flight Number: " + flightList.get(1).flightNumber + " | Flight Schedule: " + flightList.get(1).schedule + " | Capacity: " + flightList.get(1).capacity);
                flightNumber = flightList.get(1).flightNumber; 
                schedule = flightList.get(1).schedule;
                capacity = flightList.get(1).capacity;
                seat.showSeatClass();
                break;
            case 3:
                System.out.println("Destination: " + this.destination + " | Flight Number: " + flightList.get(2).flightNumber + " | Flight Schedule: " + flightList.get(2).schedule + " | Capacity: " + flightList.get(2).capacity);
                flightNumber = flightList.get(2).flightNumber; 
                schedule = flightList.get(2).schedule;
                capacity = flightList.get(2).capacity;
                seat.showSeatClass();
                break;
            case 4:
                System.out.println("Destination: " + this.destination + " | Flight Number: " + flightList.get(3).flightNumber + " | Flight Schedule: " + flightList.get(3).schedule + " | Capacity: " + flightList.get(3).capacity);
                flightNumber = flightList.get(3).flightNumber; 
                schedule = flightList.get(3).schedule;
                capacity = flightList.get(3).capacity;
                seat.showSeatClass();
                break;
            case 5:
                showDestination();
            default:
                System.out.println("Error: Invalid option!");
                break;
        }

    }

    public void showFlightMenuToNY() {

        flightList = new ArrayList<>();

        flightList.add(new Flight("011MR", "07:00am - 09:30am", 30));
        flightList.add(new Flight("012MR", "9:15am - 11:45am", 35));
        flightList.add(new Flight("013MR", "12:05pm - 2:35pm", 50));
        flightList.add(new Flight("014MR", "3:00pm - 5:30pm", 40));

        System.out.println("==========================================================================================");
        System.out.println();
        System.out.println("*** MENU ***");
        System.out.println("Please choose the flight to New York");
        System.out.println();
        showFLightList(flightList);
        System.out.println("5 - Go back to the destination menu");
        // showFlightInformation();
        System.out.println();
        System.out.println("==========================================================================================");

        scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        switch (value) {
            case 1:
                System.out.println("Destination: " + this.destination + " | Flight Number: " + flightList.get(0).flightNumber + " | Flight Schedule: " + flightList.get(0).schedule + " | Capacity: " + flightList.get(0).capacity);
                flightNumber = flightList.get(0).flightNumber;
                schedule = flightList.get(0).schedule;
                capacity = flightList.get(0).capacity;
                seat.showSeatClass();
                break;
            case 2:
                System.out.println("Destination: " + this.destination + " | Flight Number: " + flightList.get(1).flightNumber + " | Flight Schedule: " + flightList.get(1).schedule + " | Capacity: " + flightList.get(1).capacity);
                flightNumber = flightList.get(1).flightNumber;
                schedule = flightList.get(1).schedule;
                capacity = flightList.get(1).capacity;
                seat.showSeatClass();
                break;
            case 3:
                System.out.println("Destination: " + this.destination + "Flight Number: " + flightList.get(2).flightNumber + " - Flight Schedule: " + flightList.get(2).schedule + " - Capacity: " + flightList.get(2).capacity);
                flightNumber = flightList.get(2).flightNumber;
                schedule = flightList.get(2).schedule;
                capacity = flightList.get(2).capacity;
                seat.showSeatClass();
                break;
            case 4:
                System.out.println("Destination: " + this.destination + "Flight Number: " + flightList.get(3).flightNumber + " - Flight Schedule: " + flightList.get(3).schedule + " - Capacity: " + flightList.get(3).capacity);
                flightNumber = flightList.get(3).flightNumber;
                schedule = flightList.get(3).schedule;
                capacity = flightList.get(3).capacity;
                seat.showSeatClass();
                break;
            case 5:
                showDestination();
                // scanner.close();
            default:
                System.out.println("Error: Invalid option!");
                break;
        }

    }

    public void showFlightMenuToParis() {

        flightList = new ArrayList<>();

        flightList.add(new Flight("011MR", "07:00am - 09:30am", 30));
        flightList.add(new Flight("012MR", "9:15am - 11:45am", 35));
        flightList.add(new Flight("013MR", "12:05pm - 2:35pm", 50));
        flightList.add(new Flight("014MR", "3:00pm - 5:30pm", 40));

        System.out.println("==========================================================================================");
        System.out.println();
        System.out.println("*** MENU ***");
        System.out.println("Please choose the flight to Paris");
        System.out.println();
        showFLightList(flightList);
        System.out.println("5 - Go back to the destination menu");
        // showFlightInformation();
        System.out.println();
        System.out.println("==========================================================================================");

        scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        switch (value) {
            case 1:
                System.out.println("Destination: " + this.destination + " | Flight Number: " + flightList.get(0).flightNumber + " | Flight Schedule: " + flightList.get(0).schedule + " | Capacity: " + flightList.get(0).capacity);
                flightNumber = flightList.get(0).flightNumber; 
                schedule = flightList.get(0).schedule;
                capacity = flightList.get(0).capacity;
                seat.showSeatClass();
                break;
            case 2:
                System.out.println("Destination: " + this.destination + " | Flight Number: " + flightList.get(1).flightNumber + " | Flight Schedule: " + flightList.get(1).schedule + " | Capacity: " + flightList.get(1).capacity);
                flightNumber = flightList.get(1).flightNumber; 
                schedule = flightList.get(1).schedule;
                capacity = flightList.get(1).capacity;
                seat.showSeatClass();
                break;
            case 3:
                System.out.println("Destination: " + this.destination + "Flight Number: " + flightList.get(2).flightNumber + " - Flight Schedule: " + flightList.get(2).schedule + " - Capacity: " + flightList.get(2).capacity);
                flightNumber = flightList.get(2).flightNumber; 
                schedule = flightList.get(2).schedule;
                capacity = flightList.get(2).capacity;
                seat.showSeatClass();
                break;
            case 4:
                System.out.println("Destination: " + this.destination + "Flight Number: " + flightList.get(3).flightNumber + " - Flight Schedule: " + flightList.get(3).schedule + " - Capacity: " + flightList.get(3).capacity);
                flightNumber = flightList.get(3).flightNumber; 
                schedule = flightList.get(3).schedule;
                capacity = flightList.get(3).capacity;
                seat.showSeatClass();
                break;
            case 5:
                showDestination();
                scanner.close();
            default:
                System.out.println("Error: Invalid option!");
                break;
        }

    }

    public void showFLightList(ArrayList<Flight> flights) {
        for(int i = 0; i < flights.size(); i++) {
            System.out.println(i+1 + " - " + flights.get(i).flightNumber + " / " + flights.get(i).schedule + " / " + flights.get(i).capacity);
        }
    }

    @Override
    public String toString() {
        return 
            "=================Flight=================" +
            "\nYou have successfully booked the flight!" +
            "\nflightNumber = " + flightNumber + 
            "\nSchedule = " + schedule + 
            // "\nCapacity=" + capacity +
            "\nDestination = " + destination + 
            // "\nUser = " + user + 
            "\n" + seat;
    }

    

    
    
    
}
