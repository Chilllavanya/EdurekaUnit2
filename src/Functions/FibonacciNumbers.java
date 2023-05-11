//Write a program to generate 'n' Fibonacci numbers.

package Functions;

public class FibonacciNumbers {
	public static void main(String[] args) {
//		static void fibonacci(int n){
			int[] NumArr = new int[5];
			NumArr[0] = 0;
			NumArr[1] = 1;
			for (int i = 1; i < 4; i++){
				
				NumArr[i+1] = NumArr[i] + NumArr[i-1];
				
			}
			System.out.println(NumArr);
		
	}

}
