//Program to add and subtract two dimentional array of 2 x 2 matrix.

package TwoDimentionalArray;

import java.util.Scanner;

public class AddSubtract {
	
	public static void main(String[] args) {
		Matrix mat = new Matrix();
		
		mat.display();
		Matrix other = new Matrix();
		mat.add(other);
		mat.display();
	}
	
}

class Matrix {
	private int[][] mat;
	int rows;
	int cols;
	
	public Matrix() {
		createMatrix();
	}
	
	public Matrix(int[][] mat) {
		this.mat = mat;
		rows = mat.length;
		cols = mat[0].length;
	}
	
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	
	public int getCols() {
		return cols;
	}
	public void setCols(int cols) {
		this.cols = cols;
	}
	
	public int[][] getMat() {
		return mat;
	}
	public void setMat(int[][] other) {
		mat = other;
	}
	
	private void createMatrix() {
		System.out.println("enter numbers for matrix size : ");
		Scanner sc = new Scanner(System.in);
		
		rows = sc.nextInt();
		cols = sc.nextInt();
		mat = new int[rows][cols];
		
		System.out.println("enter the numbers for matrix: ");
		for(int i = 0; i<rows; i++){
			for(int j=0; j<cols; j++){
				mat[i][j] = sc.nextInt();
			}
		}
	}
	
	public void display() {
		for(int i = 0; i< mat.length; i++){
			for(int j=0; j<mat[i].length; j++){
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public Matrix add(Matrix other) {
		int[][] sumMat = new int[rows][cols];
		for(int i = 0; i< mat.length; i++){
			for(int j=0; j<mat[i].length; j++){
				sumMat[i][j] = mat[i][j] + other.getMat()[i][j];
			}
		}
		
		return new Matrix(sumMat);
	}
	
	public Matrix subtract(Matrix other) {
		int[][] subMat = new int[mat.length][mat[0].length];
		for(int i=0; i<mat.length; i++){
			for(int j=0; j<mat[0].length; j++){
				subMat[i][j] = mat[i][j] - other.getMat()[i][j];
			}
		}
		return new Matrix(subMat);
	}
}
