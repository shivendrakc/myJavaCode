package JavaCIHE;
import java.util.Scanner;

public class Index2 {
	
	public static int count(int A[], int item) {

	    return countHelper(A, item, 0, A.length - 1);

	}



	private static int countHelper(int A[], int item, int start, int end) {

	    // base case: if start and end indices cross, the item is not in the array

	    if (start > end) {

	        return 0;

	    }



	    // divide the array in half and recursively count the occurrences of the item

	    int mid = (start + end) / 2;

	    int leftCount = countHelper(A, item, start, mid - 1);

	    int rightCount = countHelper(A, item, mid + 1, end);



	    // count the occurrences of the item in the current subarray

	    int currentCount = 0;

	    if (A[mid] == item) {

	        currentCount++;

	        // check for adjacent occurrences of the item in the left and right subarrays

	        int left = mid - 1;

	        int right = mid + 1;

	        while (left >= start && A[left] == item) {

	            currentCount++;

	            left--;

	        }

	        while (right <= end && A[right] == item) {

	            currentCount++;

	            right++;

	        }

	    }



	    return leftCount + rightCount + currentCount;

	}


	public static void main(String[] args) {
		
		
	}

}
