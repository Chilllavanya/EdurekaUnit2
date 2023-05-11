//Program to sort an Array in ascending order.

package SingleDimentionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Enter five number to sort: ");
		for(int i=0; i<5; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Given array is : " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorted array is : " + Arrays.toString(arr));

	}
}
