package SingleDimentionalArray;

import java.util.Scanner;

public class FindLargestFromArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Enter five number to sort: ");
		for(int i=0; i<5; i++){
			arr[i] = sc.nextInt();
		}
		int largeNumber = 0;
		for (int i = 0; i < arr.length; i++){
			if(arr[i] > largeNumber){
				largeNumber = arr[i];
			}
		}
		System.out.println(largeNumber);
	}
}
