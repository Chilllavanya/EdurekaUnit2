//Program to display second largest element in the Array with or without sorting the Array.

package SingleDimentionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array numbers : ");
		for(int i=0; i<5; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Your Array is : " + Arrays.toString(arr));
		
		Arrays.sort(arr);
		
		System.out.println("Your Array after sorting : " + Arrays.toString(arr));
		
		int index = arr[arr.length-2];
		System.out.println("Second largest number in the Array is : " + index);
	}
}
