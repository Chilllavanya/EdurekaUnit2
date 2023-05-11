/*Question Statement 2
		2. Write another function display() with Employee ID array and Employee name array as arguments.
		(Note: here we are using concept of function overloading). This function will display the content of
		the 2 arrays in the following format.*/

package EmployeeData;

import java.util.Scanner;

public class DisplayOverloading {
	static int[] empId = new int[5];
	static String[] empName = new String[5];
	static float[] empSalary = new float[5];
	
	static void display(String[] empName, float[] empSalary){
		System.out.println("      Name         " + "       Salary         ");
		for(int i = 0; i < 5; i++){
			System.out.println(empName[i] + "                     " + empSalary[i]);
		}
	}
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
		display(empName, empSalary);
	}
}
