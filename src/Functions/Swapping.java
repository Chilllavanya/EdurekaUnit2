//Write a program to swap two numbers.

package Functions;

public class Swapping {
	public static void main(String[] args) {
		swapTempMethod(13, 35);
		swapArithmetic(12,64);
	}
	static void swapTempMethod(int n1, int n2){
		System.out.println("n1 = " + n1 + " , " + "n2 = " + n2);
		
		int temp = 0;
		temp = n1;
		n1= n2;
		n2= temp;
		System.out.println("n1 = " + n1 + " , " + "n2 = " + n2);
		System.out.println();
	}
	static void swapArithmetic(int n1, int n2){
		System.out.println("n1 = " + n1 + " , " + "n2 = " + n2);
		
		int sum = n1 + n2;
		n1 = sum - n1;
		n2 = sum - n1;
		System.out.println("n1 = " + n1 + " , " + "n2 = " + n2);
		System.out.println();
	}
}
