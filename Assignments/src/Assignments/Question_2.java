package Assignments;
import java.util.Scanner;
public class Question_2 {

	public static void EvenNumbers(int number) {
		int i = 0;
		System.out.print("EvenNumbers: ");
		do {		
			int even_number = i%2; // the modulus sign prints the remainder here we divided it by 2 so that we can filter even numbers
			if(even_number == 0) { // when dividing by 2 only even numbers gives 0 remainder where this condition becomes true and executes the program
				System.out.print(i + " ");
			}
			i++;
		}while(number >= i);
		System.out.println("\n");
	}
	public static void OddNumbers(int number) {
		int i = 0;
		System.out.print("OddNumbers: ");
		while(i <= number){
			int odd_number = i%2; 
			if(odd_number != 0) {  // here we did exact opposite than above program where the condition becomes true only if the remainder is not zero which are only odd numbers
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println("\n");
	}
	public static void countDown(int number) {
		int j;
		System.out.print("CountDown: ");
		for(j = 0; j<=number; number--) {  // here we declare j as 0 then see if its lesser than the limit and if true it decrease the limit value 
			System.out.print(number + " ");
		}
		System.out.println("\n");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // created an object of a class Scanner
		int limit;
		System.out.println("Enter a limit: "); 
		limit = sc.nextInt();
		// calling all the methods we created above after taking the limit from user
		EvenNumbers(limit);
		OddNumbers(limit);
		countDown(limit);
 	}

}
