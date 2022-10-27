public class Flight {
    public String flightNumber;
    public String schedule;
    public int capacity;

    // constructor
    public Flight() {
        this.flightNumber = "";
        this.schedule = "";
        this.capacity = 0;
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


    public void showFlightMenu() {
        System.out.println("==========================================================================================");
        System.out.println();
        System.out.println("*** MENU ***");
        System.out.println("Please choose the flight to Tokyo");
        System.out.println();
        System.out.println("==========================================================================================");
        System.out.println();
        System.out.println("==========================================================================================");

    }

    
    
    
}
