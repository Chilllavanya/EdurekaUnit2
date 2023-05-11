//Write a program to check given number is prime or not.

package Functions;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println( isPrime(23));
	}
	static boolean isPrime(int num){
		boolean result;
		int count = 0;
		for(int i = 1; i < num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count > 2) {
//			System.out.println("Not a prime Number.");
			result = false;
		}
		else {
//			System.out.println("Prime Number.");
			result = true;
		}
		return result;
	}
	
}
