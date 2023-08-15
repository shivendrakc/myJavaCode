package Assignments;
import java.util.Scanner;


// We created seperate methods for max value and min value as it is easier to write and understand code this way
public class Question_3 {
	public static int getMaxValue(int[] numbers){  
		  int maxValue =numbers[0];
		  for(int i=1;i < numbers.length;i++){   // here we are scanning the entire array by using for loop 
		    if(numbers[i] > maxValue){			// This condition checks that if maxvalue is greater than the array element 
		      maxValue = numbers[i];			// if array element is greater max value gets new greater value assigned 
		    }
		  }
		  return maxValue;
		  }
	public static int getMinValue(int[] numbers){   // this method uses same algorithm as above only difference is
		  int minValue = numbers[0];                   
		  for(int i=1;i<numbers.length;i++){
		    if(numbers[i] < minValue){				// Condition checks if array value is less 
		      minValue = numbers[i];
		    }
		  }
		  return minValue;
		}
	public static void getPercentage(double number, int[] numbers) {  // this is a simple method that takes two arguments and uses it in percentage formula 
		double percentage = (number/numbers.length) * 100;
		System.out.println(percentage + "% of total students failed ");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numberOfStudents;
		System.out.print("Enter the number of students : ");
		numberOfStudents = sc.nextInt();   // taking an input for number of student which will be our array size
		int students[] = new int[numberOfStudents];// creating an array to store the quiz marks of students 
		
		System.out.println("Enter the quiz Marks from 0 to 10");
		for(int i = 0; i < students.length; i++) {  // creating a loop to get an input and store in array as per the array size
			int number;
			System.out.print("Enter the marks for student " + (i+1) + ": "); 
			number = sc.nextInt();
			if (number <= 10 && number >= 0) { // validating the number if its 0 to 10
				students[i] = number;  // if stored it will go back to for to ask another array else
				}else {   
					do{    // here we are doing validation check for user input if its over 10 or below 0 the loop will repeatedly ask for a valid number
						System.out.print("Number is not valid enter again for student " + (i+1) + ": " );
						number = sc.nextInt();
						if (number <= 10 && number >= 0) {
							students[i] = number;}
						}while(number >= 11 && number <= 0); // if its a valid number it will simply go back to for loop to take another user marks
				}
		}
		double failedStudents = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] < 5) {
				failedStudents++;
			}
		}
		System.out.println(failedStudents + " " + students.length);
		getPercentage(failedStudents, students);
		System.out.println("The maximum marks is "+getMaxValue(students)+ " and miminum marks is "+getMinValue(students));
	}

}
