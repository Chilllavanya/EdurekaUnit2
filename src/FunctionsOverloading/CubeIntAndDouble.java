//write a program to cube of an Integer and Double values using function overloading.

package FunctionsOverloading;

public class CubeIntAndDouble {
	public static void main(String[] args) {
		System.out.println(cubeMethod(2));
		System.out.println(cubeMethod(3.80));
		
	}
	static int cubeMethod(int num){
		int cube = num * num * num;
		return cube;
	}
	static Double cubeMethod(double num){
		double cubeDouble = num * num * num;
		return cubeDouble;
	}
}
