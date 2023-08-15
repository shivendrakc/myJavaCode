package Assignments;
import java.util.Scanner;
public class Question_4{
public static void main(String[] Args) // it was String() which is wrong as it should represent array so i replaced it with String[]
{
	Scanner input = new Scanner(System.in);  // Instance of scanner was created without importing its java.util.Scanner so imported the Scanner on top
	System.out.println("Enter a list of nonnegative scores."); // an end comma was missing here so i added the "
	System.out.println("Mark the end with a negative number."); //the semicolon was missing so i added the ;
	System.out.println("I will compute their average.");
	double next, sum = 0 ;  // sum was used later without initiating so i initiated it here with as 0 would comply with the logic of program
	int count = 0;
	next =input.nextDouble( );
	while(next >= 0)
		{
		sum = sum + next; // an error was thrown but i initiated the sum above as zero now it works fine
		count++; //only one + was used so i corrected it by using ++ as increment operator is ++
		//unknown object keyboard is used we only have created one object to take input from user that is "input"
		next = input.nextDouble( ); //replacing keyboard with input as its the object we created to take input 
		}
	if (count == 0)
		System.out.println("No scores entered.");
	else
		{
		double average = sum/count;
		System.out.println(count + " scores read."); // there is a typo for system as it should be System so i fixed it
		System.out.println("The average is " + average);
	}
}
}