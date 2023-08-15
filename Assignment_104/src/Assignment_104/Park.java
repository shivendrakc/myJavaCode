/**
 * The Park class represents a parking facility with various attributes and functionalities.
 * It stores information about the state, car park name, pricing, levels, rows, spots, and other details.
 * The Park class provides methods to get and set these attributes.
 * It also allows checking the availability of parking for cars and motorcycles.
 * This class can be used to manage and operate parking facilities.
 * @author Shivendra K C
 * @version 2023/5/5
 */
package Assignment_104;    

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
    
	// Define a default constructor that initializes some variables
    /**
     * Default constructor for Park class.
     * Initializes the variables with default values.
     */
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
	
	// Defining a parameterized constructor that takes in parking details
	/**
     * Parameterized constructor for Park class.
     * Initializes the variables with the provided values.
     * 
     * @param state              the state of the park
     * @param carPark            the name of the car park
     * @param price              the price of parking
     * @param levels             the number of levels in the car park
     * @param rowsPerLevel       the number of rows per level in the car park
     * @param spotsPerRow        the number of spots per row in the car park
     * @param hasCompactSpots    whether the car park has compact spots
     * @param hasLargeSpots      whether the car park has large spots
     * @param canParkCars        whether cars can be parked in the car park
     * @param canParkMotorcycles whether motorcycles can be parked in the car park
     * @param openingTime        the opening time of the car park
     * @param closingTime        the closing time of the car park
     */
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
	/*public static void chepaPark(ArrayList<Park> parkList) {
		parkList.sort((park1, park2) -> Double.compare(park1.getPrice(), park2.getPrice()));
	}*/
	
	// above is the comparator based sorting where we are using lambda expression and is much easier method for sorting as it comes inbuilt in java
	// But since it was not included in our course i am putting the above method in comments and using bubble sort method instead as given below 
	
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
	
	/**
	 * Checks if the given booking time is within the opening hours of the park.
	 *
	 * @param park        The park to check the opening hours.
	 * @param bookingTime The booking time to be checked.
	 * @return True if the booking time is within the opening hours of the park, false otherwise.
	 */
	
	public static boolean isBookingTimeWithinOpeningHours(Park park, int bookingTime) {
	        return bookingTime >= park.getOpeningTime() && bookingTime <= park.getClosingTime();
	    }
	
	/**
	 * Displays additional attributes of the park when to display to the customer
	 *
	 * @param park The park to display additional attributes for.
	 */
	
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
	

	
	// Main method 
	public static void main(String[] args) {
		
		//creating three different objects to create 3 parks found in wilson parking
		 Park park1 = new Park("NSW", "25 Martin Place - MLC Centre", 10.99, 3, 5, 10, true, false, true, true, 6, 19);
		 Park park2 = new Park("ACT", "Little National", 8.99, 2, 4, 8, false, true, true, true, 9, 22);
		 Park park3 = new Park("QLD", "Brisbane Quarter", 6.99, 1, 3, 6, true, true, false, true, 6, 24);
		
		ArrayList<Park> parkList = new ArrayList<>();  // Creates an empty ArrayList called parkList that will store Park objects.
		
		
		// adds each object to the list
		parkList.add(park1);
		parkList.add(park2);
		parkList.add(park3);
		
		// fires the method with parklist as its parameter to sort the park list 
		cheapaPark(parkList);
		
		// Displays the Sorted List of parks according to their prices
		System.out.println("Sorted lists of Parks : ");
		for(Park p : parkList) {
			System.out.println(p.getCarPark() + " - $" + p.getPrice());
		}
		
		// asks user for a booking time
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your booking time (just enter the hour in 24 hour format): ");
	    int bookingTime = scanner.nextInt();
		
	    
	    //sorts outs and display the available parks after checkcing the customers time with the parks time
	    System.out.println("Available Parks:");
	    for (int i = 0; i < parkList.size(); i++) {
            Park park = parkList.get(i);
            if (isBookingTimeWithinOpeningHours(park, bookingTime)) {
                System.out.println((i + 1) + ". " + park.getCarPark());
                Car c1 = new Car();
                Car c2 = new Car();
            }
        }
	    //prompts the customer to choose the available park they want to go forward with 
	    System.out.println("Enter the number of park you want to choose : ");
	    int selectedParkIndex =  scanner.nextInt();
	    
        // Validate the selected park index
        if (selectedParkIndex >= 1 && selectedParkIndex <= parkList.size()) {
            Park selectedPark = parkList.get(selectedParkIndex - 1);
            System.out.println("You have selected Park: " + selectedPark.getCarPark());

            // Display additional attributes for the selected park
            displayAdditionalAttributes(selectedPark);
            // Further processing for booking the selected park can be added here
        } else {
            System.out.println("Invalid park selection.");
        }
    }
}

//these are just a standard way of making an abstract class and have sub class to make our program much more usuable but 
// it as no use as of in our current program as nothing as been stated in our rubric that would involve the below code. its created just to meet the point o0
abstract class Vehicle {
    // Define common attributes and methods for vehicles here
	private String color;
    private int numberOfWheels;
}

class Car extends Vehicle {
    // Car-specific attributes and methods here
	private int numberOfDoors;
}

class Motorcycle extends Vehicle {
    // Motorcycle-specific attributes and methods here
	private boolean hasSidecar;
}

