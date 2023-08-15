package Assignments;


import java.util.Scanner;
import java.util.ArrayList;




class Park{
	// Defining private instance variables for storing parking details
	private String state;
	private String carPark;
	private double price;
    private int levels;
    private int rowsPerLevel;
    private int spotsPerRow;
    private boolean hasCompactSpots;
    private boolean hasLargeSpots;
    private boolean canParkCars;
    private boolean canParkMotorcycles;
    private int openingTime;
    private int closingTime;
    
	
	public Park(){
		this.state = "";
		this.carPark = "";
		this.price = 0;
		this.levels = 1;
	    this.rowsPerLevel = 1;
	    this.spotsPerRow = 1;
	    this.hasCompactSpots = false;
	    this.hasLargeSpots = false;
	    this.canParkCars = true;
	    this.canParkMotorcycles = true;
	    this.openingTime = 0;
	    this.closingTime = 0;
	}
	
	
     
	public Park(String state, String carPark, double price, int levels, int rowsPerLevel, int spotsPerRow, boolean hasCompactSpots, boolean hasLargeSpots, boolean canParkCars, boolean canParkMotorcycles, int openingTime, int closingTime) {
	    this.state = state;
	    this.carPark = carPark;
	    this.price = price;
	    this.levels= levels;
	    this.rowsPerLevel = rowsPerLevel;
	    this.spotsPerRow = spotsPerRow;
	    this.hasCompactSpots = hasCompactSpots;
	    this.hasLargeSpots = hasLargeSpots;
	    this.canParkCars = canParkCars;
	    this.canParkMotorcycles = canParkMotorcycles;
	    this.openingTime = openingTime;
	    this.closingTime = closingTime;
	    
	}
	
	// Defining getter and setter methods for accessing and modifying instance variables
	 /**
     * Get the state of the park.
     *
     * @return The state of the park.
     */
    public String getState() {
        return state;
    }

    /**
     * Set the state of the park.
     *
     * @param state The state of the park.
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Get the name of the car park.
     *
     * @return The name of the car park.
     */
    public String getCarPark() {
        return carPark;
    }

    /**
     * Set the name of the car park.
     *
     * @param carPark The name of the car park.
     */
    public void setCarPark(String carPark) {
        this.carPark = carPark;
    }

    /**
     * Get the price of the park.
     *
     * @return The price of the park.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Set the price of the park.
     *
     * @param price The price of the park.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Get the number of levels in the park.
     *
     * @return The number of levels in the park.
     */
    public int getLevels() {
        return levels;
    }

    /**
     * Set the number of levels in the park.
     *
     * @param levels The number of levels in the park.
     */
    public void setLevels(int levels) {
        this.levels = levels;
    }

    /**
     * Get the number of rows per level in the park.
     *
     * @return The number of rows per level in the park.
     */
    public int getRowsPerLevel() {
        return rowsPerLevel;
    }

    /**
     * Set the number of rows per level in the park.
     *
     * @param rowsPerLevel The number of rows per level in the park.
     */
    public void setRowsPerLevel(int rowsPerLevel) {
        this.rowsPerLevel = rowsPerLevel;
    }

    /**
     * Get the number of spots per row in the park.
     *
     * @return The number of spots per row in the park.
     */
    public int getSpotsPerRow() {
        return spotsPerRow;
    }

    /**
     * Set the number of spots per row in the park.
     *
     * @param spotsPerRow The number of spots per row in the park.
     */
    public void setSpotsPerRow(int spotsPerRow) {
        this.spotsPerRow = spotsPerRow;
    }

    /**
     * Check if the park has compact spots.
     *
     * @return True if the park has compact spots, false otherwise.
     */
    public boolean getHasCompactSpots() {
        return hasCompactSpots;
    }

    /**
     * Set whether the park has compact spots.
     *
     * @param hasCompactSpots True if the park has compact spots, false otherwise.
     */
    public void setHasCompactSpots(boolean hasCompactSpots) {
        this.hasCompactSpots = hasCompactSpots;
    }

    /**
     * Check if the park has large spots.
     *
     * @return True if the park has large spots, false otherwise.
     */
    public boolean getHasLargeSpots() {
        return hasLargeSpots;
    }

    /**
     * Set whether the park has large spots.
     *
     * @param hasLargeSpots True if the park has large spots, false otherwise.
     */
    public void setHasLargeSpots(boolean hasLargeSpots) {
        this.hasLargeSpots = hasLargeSpots;
    }

    /**
     * Check if cars are allowed to park in the park.
     *
     * @return True if cars are allowed to park, false otherwise.
     */
    public boolean getCanParkCars() {
        return canParkCars;
    }

    /**
     * Set whether cars are allowed to park in the park.
     *
     * @param canParkCars True if cars are allowed to park, false otherwise.
     */
    public void setCanParkCars(boolean canParkCars) {
        this.canParkCars = canParkCars;
    }

    /**
     * Check if motorcycles are allowed to park in the park.
     *
     * @return True if motorcycles are allowed to park, false otherwise.
     */
    public boolean getCanParkMotorcycles() {
        return canParkMotorcycles;
    }

    /**
     * Set whether motorcycles are allowed to park in the park.
     *
     * @param canParkMotorcycles True if motorcycles are allowed to park, false otherwise.
     */
    public void setCanParkMotorcycles(boolean canParkMotorcycles) {
        this.canParkMotorcycles = canParkMotorcycles;
    }
    
    /**
     * Get the opening time of the park.
     *
     * @return The opening time of the park.
     */
    public int getOpeningTime() {
        return openingTime;
    }
    
    /**
     * Set the opening time of the park.
     *
     * @param openingTime The opening time of the park.
     */
    public void setOpeningTime(int openingTime) {
        this.openingTime = openingTime;
    }
    
    /**
     * Get the closing time of the park.
     *
     * @return The closing time of the park.
     */
    public int getClosingTime() {
        return closingTime;
    }
    
    /**
     * Set the closing time of the park.
     *
     * @param closingTime The closing time of the park.
     */
    public void setClosingTime(int closingTime) {
        this.closingTime = closingTime;
    }
	
	public static void cheapaPark(ArrayList<Park> parkList) {
	    int n = parkList.size();
	    for (int i = 0; i < n - 1; i++) {
	        for (int j = 0; j < n - i - 1; j++) {
	            if (parkList.get(j).getPrice() > parkList.get(j + 1).getPrice()) {
	                Park temp = parkList.get(j);
	                parkList.set(j, parkList.get(j + 1));
	                parkList.set(j + 1, temp);
	            }
	        }
	    }
	}
	
	
	
	public static boolean isBookingTimeWithinOpeningHours(Park park, int bookingTime) {
	        return bookingTime >= park.getOpeningTime() && bookingTime <= park.getClosingTime();
	    }
	
	
	public static void displayAdditionalAttributes(Park park) {
	    System.out.println("Additional Attributes for " + park.getCarPark() + ":");
	    System.out.println("Number of levels: " + park.getLevels());
	    System.out.println("Number of rows per level: " + park.getRowsPerLevel());
	    System.out.println("Number of spots per row: " + park.getSpotsPerRow());
	    System.out.println("Has compact spots: " + (park.getHasCompactSpots() ? "Yes" : "No"));
	    System.out.println("Has large spots: " + (park.getHasLargeSpots() ? "Yes" : "No"));
	    System.out.println("Can park cars and motorcycles only: " + (park.getCanParkCars() ? "Yes" : "No"));
	    System.out.println("Can park motorcycles: " + (park.getCanParkMotorcycles() ? "Yes" : "No"));
	}

	
	
	public static void main(String[] args) {
        // Creating park objects
        Park park1 = new Park("QLD", "55 Little Edward Street Car Park", 9.99, 1, 2, 18, true, false, true, true, 6, 18);
        Park park2 = new Park("ACT", "Little National", 7.99, 3, 1, 2, false, true, true, true, 9, 22);
        Park park3 = new Park("QLD", "340 Adelaide Street", 3.99, 2, 3, 3, true, true, false, true, 6, 24);
		
        // Creating an ArrayList to store the parks
        ArrayList<Park> parkList = new ArrayList<>();
		
        // Adding parks to the parkList
        parkList.add(park1);
        parkList.add(park2);
        parkList.add(park3);
		
        // Sorting the parkList by price
        cheapaPark(parkList);
		
        // Displaying the sorted list of parks
        System.out.println("Sorted lists of Parks:");
        for(Park p : parkList) {
            System.out.println(p.getCarPark() + " - $" + p.getPrice());
        }
		
        // Getting booking time from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your booking time (just enter the hour in 24-hour format): ");
        int bookingTime = scanner.nextInt();
	    
        // Checking and displaying available parks based on the booking time
        System.out.println("Available Parks:");
        for (int i = 0; i < parkList.size(); i++) {
            Park park = parkList.get(i);
            if (isBookingTimeWithinOpeningHours(park, bookingTime)) {
                System.out.println((i + 1) + ". " + park.getCarPark());
            }
        }
		
        // Asking the user to choose a park
        System.out.println("Enter the number of park you want to choose: ");
        int selectedParkIndex = scanner.nextInt();
		    
        if (selectedParkIndex >= 1 && selectedParkIndex <= parkList.size()) {
            // Retrieving the selected park
            Park selectedPark = parkList.get(selectedParkIndex - 1);
            System.out.println("You have selected Park: " + selectedPark.getCarPark());
            // Displaying additional attributes for the selected park
            displayAdditionalAttributes(selectedPark);
        } else {
            System.out.println("Invalid park selection.");
        }
    }


abstract class Vehicle {
   
}

class Car extends Vehicle {
   
}

class Motorcycle extends Vehicle {
   
}}

