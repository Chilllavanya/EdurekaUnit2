//Write a program to print integer and String data using function overloading.

package FunctionsOverloading;

public class PrintIntAndString {
	public static void main(String[] args) {
		Overload(14);
		Overload("Please");
	}
	static void Overload(int num){
		System.out.println("Printing the int data : " + num);
	}
	static void Overload(String s){
		System.out.println("Printing the String data : " + s);
	}
}
