//Program to add all elements of the matrix.

package TwoDimentionalArray;

import java.util.Scanner;

public class AddAll {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the matrix rows and columns number : ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] matrix = new int[row] [col];
		
		
		System.out.println("Enter the numbers for matrix rows and columns : ");
		for (int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				matrix[i][j] = sc.nextInt();
			}
		}
		
		int sum = 0;
		for (int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				System.out.print(matrix[i][j] + "\t");
				sum += (matrix[i][j]);
			}
			System.out.println();
		}
		System.out.println(sum);
	}
}
