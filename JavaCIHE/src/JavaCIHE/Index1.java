package JavaCIHE;
import java.util.Scanner;



public class Index1{
	 public static void bubbleSort(int[] arr) {
	        int n = arr.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    // swap arr[j] and arr[j+1]
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	    }
	 
	 public static void getArray() {
		 
	 }
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the size of Array : ");
		 int n = sc.nextInt();
		 
		 int[] arr = new int[n];
		 
		 System.out.println("Enter the Elements of the array");
		 for(int i = 0; i > n; i++) {
			 arr[i] = sc.nextInt();
		 }
		 
		 System.out.println("Your array is :: " + arr[n]);
		 
		 bubbleSort(arr);
		 System.out.println("Sorted Array : ");
		 for(int i = 0; i < arr.length; i++) {
			 System.out.print(arr[i] + " ");
		 }
	 }
}