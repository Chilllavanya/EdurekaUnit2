/*
 Question Statement 1
		1. Write a program to accept 5 employee ID s and the corresponding names and their salaries from the user
		and store them in three arrays. Pass these arrays to a function display() as arguments. This display() will
		display the content of the arrays in the following format.
		ID
		Name
		Salary
		00
		J
		ohn
		600000
		002
		Clark
		550000
		003
		Nancy
		500000
		004
		Joe
		500000
		005
		Mary
		300000
*/

package EmployeeData;

import java.util.Scanner;

public class EmployeeDataDisplay {
	static int[] empId = new int[5];
	static String[] empName = new String[5];
	static float[] empSalary = new float[5];
	
	static void display(){
		System.out.println("    Id          " + "      Name         " + "       Salary         ");
		for(int i = 0; i < 5; i++){
			System.out.println(empId[i] + "                     " + empName[i] + "                     " + empSalary[i]);
		}
	}
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee Ids only upto five : ");
		for(int i = 0; i < 5; i++) {
			empId[i] = sc.nextInt();
		}
		System.out.println("Enter the Employee names only upto five : ");
		for(int i = 0; i < 5; i++) {
			empName[i] = sc.next();
		}
		
		System.out.println("Enter the Employee Salariess only upto five : ");
		for(int i = 0; i < 5; i++) {
			empSalary[i] = sc.nextFloat();
		}
		display();
	}
}
