/*

		Question Statement 3
		3. Write another function named display() which takes 4 arguments. The arguments are named as String
		and 3 arrays (Employee id, name and salary). Function prototype looks like: display (String name, int
		regno[], String Empname[], double salary[]). This function will search for the name in the Empname array
		and will display its corresponding id and salary in the below given format. For example, if Divya is given
		as the name to search then display () function will display the following record.
		ID
		Name
		Salary
		00
		J
		ohn
		600000
		Note: main() should have the following steps:
		 Declaring the arrays.
		 Accepting data for the arrays.
		 Calling the 2 display() functions which takes 3 and 2 arguments.
		 Accept a user name to search in the array and display the record by calling the display() function which
		takes 4 arguments.
*/

package EmployeeData;

import java.util.Scanner;

public class SearchEmployee {
	static int[] empId = new int[5];
	static String[] empName = new String[5];
	static float[] empSalary = new float[5];
	
	static void display(String name, int[] empId, String[] empName, float[] empSalary){
		System.out.println("    Id          " + "      Name         " + "       Salary         ");
		
		for(int i = 0; i < 5; i++) {
			if (empName[i].equals(name)) {
				System.out.println(empId[i] + "                     " + empName[i] + "                     " + empSalary[i]);
			}
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
		display("sa", empId,empName, empSalary);
	}
}
