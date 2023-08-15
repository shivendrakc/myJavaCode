package JavaCIHE;
import java.util.Scanner;
public class temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double Celcius,Fahrenhiet,Kelvin;
		
		System.out.println("Enter the degree K for Kelvin C for Celcius and F for Farenheit: ");
		String degree = sc.next().toUpperCase();
		System.out.println(degree);
		System.out.println("Enter the Temperature : ");
		double temp = sc.nextInt();
		

		if(degree == "F") {
			System.out.println("Your temperature in : \n Fahrenheit : " + temp);
			System.out.println("Kelvin : "+((temp-32)*5/9+273.15));
			System.out.println("Celcius : " + (temp-32)*5/9);
	
		}else {
			System.out.println("Somethings not working");
		}
		
	}

}
