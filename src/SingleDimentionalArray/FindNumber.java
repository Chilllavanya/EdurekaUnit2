//Program to search an element in the Array.

package SingleDimentionalArray;

import java.util.Scanner;

public class FindNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Enter five number to sort: ");
		for(int i=0; i<5; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println(findNumber(arr, 23));
	}
	public static int findNumber(int[] nums, int numToFind) {
		for (int i=0; i < nums.length; i++) {
			if (nums[i] == numToFind)
				return i;
		}
		return -1;
	}
}
