//Write a program to check given string is palindrome or not.

package Functions;

public class Palindrome {
	public static void main(String[] args) {
		isPalindrome("dad");
	}
	static void isPalindrome(String s){
		boolean result;
		String rev = "";
		
		for ( int i =s.length()-1; i>0; i--){
			rev += s.charAt(i);
			if(s == rev){
				System.out.println("Palindrome");
			}
			else{
				System.out.println("Not a Palindrome");
			}
		}
	}
}
