//Program to reverse the elements of an Array.

package SingleDimentionalArray;

import java.util.Arrays;

public class ReverseOrder {
	public static void main(String[] args) {
		int[] arr = {43, 65, 23, 87, 12};
		System.out.println("Given array is : "+ Arrays.toString(arr));
		reverseArr(arr);
		
	}
	static void reverseArr(int[] arr){
		for(int i=0; i<arr.length/2; i++){
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		System.out.println("Reverse order of the Array is : " + Arrays.toString(arr));
		
	}
}
