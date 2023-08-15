package JavaCIHE;
import java.util.Scanner;

public class Index {
	
	
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int numberOfStudents;
			System.out.print("Enter the number of students : ");
			numberOfStudents = sc.nextInt();   
			int numbers[] = new int[numberOfStudents];
			
			System.out.println("Enter the quiz Marks from 0 to 10");
			for(int i = 0; i < numbers.length; i++) {  
				int number;
				System.out.print("Enter the marks for student " + (i+1) + ": "); 
				number = sc.nextInt();
				if (number <= 10 && number >= 0) {
					numbers[i] = number;  
					}else {   
						do{    
							System.out.print("Number is not valid enter again for student " + (i+1) + ": " );
							number = sc.nextInt();
							if (number <= 10 && number >= 0) {
								numbers[i] = number;}
							}while(number >= 11 && number <= 0); 
					}
			}
			int high =numbers[0];
			  for(int i=1;i < numbers.length;i++){   
			    if(numbers[i] > high){			 
			      high = numbers[i];			 
			    }
			  }
			  int low = numbers[0];                   
			  for(int i=1;i<numbers.length;i++){
			    if(numbers[i] < low){				
			      low = numbers[i];
			    }
			  }
			  
			  
			double failedStudents = 0;
			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] < 5) {
					failedStudents++;
				}
			}
			double percentage = (failedStudents/numbers.length) * 100;
			System.out.println(percentage + "% of total students failed ");
			System.out.println("The maximum marks is "+high+ " and miminum marks is "+low);
		}
	}

}
