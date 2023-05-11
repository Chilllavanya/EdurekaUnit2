//Program to transpose a Matrix.

import java.util.Scanner;

public class TransposeMatrix {
	public static void main(String[] args) {
		Matrix matrix = new Matrix();
		matrix.display();
		matrix.transpose().display();
	}
}

class Matrix {
	int[][] mat;
	int rows, cols;
	
	public Matrix() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of matrix : ");
		rows = sc.nextInt();
		cols = sc.nextInt();
		mat = new int[rows][cols];
		
		System.out.println("Enter the numbers of matrix: ");
		for(int i = 0; i<rows; i++){
			for(int j=0; j<cols; j++){
				mat[i][j]=sc.nextInt();
			}
		}
	}
	
	public Matrix(int[][] mat) {
		this.mat = mat;
		this.rows = mat.length;
		this.cols = mat[0].length;
	}
	
	public void display(){
		System.out.println("Display the matrix before transpose: ");
		for(int i = 0; i<rows; i++){
			for(int j=0; j<cols; j++){
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public Matrix transpose() {
		int[][] matTransposed = new int[cols][rows];
		for(int i=0; i< mat.length; i++){
			for(int j=0; j<mat[0].length; j++){
				
				matTransposed[j][i] = mat[i][j];
			}
			System.out.println();
		}
		
		mat = matTransposed;
		
		rows += cols;
		cols = rows-cols;
		rows = rows-cols;
		
		return this;
	}
}
