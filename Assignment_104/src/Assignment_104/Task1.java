/**

This program contains two recursive methods: computeFactorial() and getPower()
and a switch statement to select an option to calculate factorial or power of a number.
The computeFactorial() method takes an integer n and calculates its factorial recursively.
The getPower() method takes two integers base and power and calculates the power of the base recursively.
The program prompts the user to select an option to calculate factorial or power of a number.
If the user selects option 1, the program prompts the user to enter an integer and computes its factorial.
If the user selects option 2, the program prompts the user to enter a base and a power value and computes the power of the base.
@author Shivendra K C
@version 2023/5/5
*/
package Assignment_104;
import java.util.Scanner;

public class Task1 {
	/**
	 * The main method prompts the user to select an option to calculate factorial or power of a number.
	 * If the user selects option 1, the program prompts the user to enter an integer and computes its factorial.
	 * If the user selects option 2, the program prompts the user to enter a base and a power value and computes the power of the base.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
	    // Create a scanner object to read user input
	    Scanner scanner = new Scanner(System.in);
	    
	    try {
	        // Prompt the user to select an option
	        System.out.println("Enter an integer to select an option:");
	        System.out.println("1. Factorial recursive program");
	        System.out.println("2. Recursive program to compute the power of a number");
	        int option = scanner.nextInt();

	        switch (option) {
	            case 1:
	                System.out.println("Factorial recursive program selected");
	                System.out.print("Enter an integer: ");
	                int n = scanner.nextInt();
	                
	                // Calculate the factorial of the entered integer
	                long factorial = computeFactorial(n);
	                
	                // Display the factorial result
	                System.out.println("Factorial of " + n + " is " + factorial);
	                break;
	                
	            case 2:
	                System.out.println("Recursive program to compute the power of a number");
	                System.out.println("Enter a base value");
	                int base = scanner.nextInt();
	                System.out.println("Enter a power value");
	                int power = scanner.nextInt();
	                
	                // Calculate the power of the entered base and power values
	                long powerValue = getPower(base, power);
	                
	                // Display the power result
	                System.out.println("The value of a base " + base + " to the power " + power + " is " + powerValue);
	                break;
	                
	            default:
	                System.out.println("Invalid option selected");
	                break;
	        }
	    } catch (Exception e) {
	        // Catch any exception that occurred during execution and display an error message
	        System.out.println("An error occurred: " + e.getMessage());
	    } finally {
	        // Close the scanner object to release system resources
	        scanner.close();
	    }
	}


	/**
	 * The computeFactorial() method takes an integer n and calculates its factorial recursively.
	 * 
	 * @param n an integer to calculate its factorial
	 * @return the factorial of n
	 */
	public static long computeFactorial(int n) {
	    if (n == 0) {
	        return 1;
	    } else {
	        return n * computeFactorial(n - 1);
	    }
	}

	/**
	 * The getPower() method takes two integers base and power and calculates the power of the base recursively.
	 * 
	 * @param base the base value to be raised to a power
	 * @param power the power value
	 * @return the value of the base raised to the power
	 */
	public static long getPower(int base, int power) {
		 if (power == 0) {
 	        return 1;
 	    } else if (power < 0) {
 	        return (long) (1.0 / getPower(base, -power));
 	    } else {
 	        return base * getPower(base, power - 1);
 	    }
	}

}

