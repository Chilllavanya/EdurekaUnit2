//Write a program to check the given number is Even or Odd.

package Functions;


public class EvenOdd {
	public static void main(String[] args) {
	EvenOddMethod(3);
	}
	static void EvenOddMethod(int num){
		if (num % 2 == 0){
			System.out.println(num + " number is Even.");
		}
		else {
			System.out.println(num + " number is Odd.");
		}
	}
}
