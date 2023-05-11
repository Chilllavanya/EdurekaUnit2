//Write a program to find the factorial of the number

package Functions;

public class Factorial {
	public static void main(String[] args) {
		factorialMethod(3);
	}
	static void factorialMethod(int num){
		int fact = 1;
		while(num>0){
			fact *= num;
			num--;
		}
		System.out.println(fact + " is the factorial of the given number " + num);
	}
}
