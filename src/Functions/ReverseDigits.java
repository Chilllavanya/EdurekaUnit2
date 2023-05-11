//Write a program to reverse the digits of a number.

package Functions;

public class ReverseDigits {
	public static void main(String[] args) {
		reverseDigitsMethod(123);
	}
	static int reverseDigitsMethod(int num){
		int rev = 0;
		while(num > 0) {
			rev = (rev * 10) + (num % 10);
			num = num / 10;
		}
		System.out.println(rev);
		return rev;
	}
}
