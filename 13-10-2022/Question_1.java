/*WAP to create a class which contain the method Palindrom the second class will use the proetry of first
class and display the output."*/
package inheritance;

import java.util.Scanner;
public class PalindromeNum {

	public static void A()     //method
  {
		String original, reverse = ""; // Objects of String class  
Scanner in = new Scanner(System.in);   
System.out.println("Enter a number to check if it is a palindrome");  
original = in.nextLine();   
int length = original.length();   
for ( int i = length - 1; i >= 0; i-- )  
   reverse = reverse + original.charAt(i);  
if (original.equals(reverse))  
   System.out.println("this number is a palindrome.");  
else  
   System.out.println("this number isn't a palindrome.");  
}
}
------------------------------------------------
package inheritance;

public class PldNo extends PalindromeNum     // acquires properties from PalindromeNum
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 A();                //calling of  A Method
	}

}
