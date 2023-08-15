package Assignments;

import java.util.Scanner;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to select an option
            System.out.println("Enter an integer to select an option:");
            System.out.println("1. Calculate factorial");
            System.out.println("2. Calculate power of a number");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Calculate factorial selected");
                    System.out.print("Enter a non-negative integer: ");
                    int n = scanner.nextInt();

                    // Calculate the factorial
                    long factorial = computeFactorial(n);

                    // Display the factorial result
                    System.out.println("Factorial of " + n + " is " + factorial);
                    break;

                case 2:
                    System.out.println("Calculate power of a number selected");
                    System.out.print("Enter the base: ");
                    int base = scanner.nextInt();
                    System.out.print("Enter the exponent: ");
                    int exponent = scanner.nextInt();

                    // Calculate the power
                    long power = calculatePower(base, exponent);

                    // Display the power result
                    System.out.println(base + " raised to the power " + exponent + " is " + power);
                    break;

                default:
                    System.out.println("Invalid option selected");
                    break;
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static long computeFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * computeFactorial(n - 1);
        }
    }

    public static long calculatePower(int base, int exponent) {
    	
    	    if (exponent == 0) {
    	        return 1;
    	    } else if (exponent < 0) {
    	        return (long) (1.0 / calculatePower(base, -exponent));
    	    } else {
    	        return base * calculatePower(base, exponent - 1);
    	    }
    	

    }
}

