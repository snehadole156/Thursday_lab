/*Q2) "Multilevel:
WAP to create a class Reverse No, second class SOD, Third class use both the class property and display the output*/
package inheritance;
import java.util.Scanner;
public class Multi_Inheritance {

	public static void Reverse() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");   //getting the number from user
		int num=sc.nextInt();
		int rev=0;          //this variable only use in this block of body
		while(num!=0)
		{
			rev=rev*10+num%10;   //in rev store the reverse number
			num=num/10;    //finds the last digit of the given number
		}
System.out.println("Reverse Number is:"+rev);   //printing the output
	}

}
--------------------------
package inheritance;
import java.util.Scanner;
public class Mul_Inherit extends Multi_Inheritance{

	public static void SOD() {
		int number, digit, sum = 0;  //this variable only use in this block of body 
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number: ");  //getting the number from user
		number = sc.nextInt();  
		while(number > 0)  
		{  
		digit = number % 10;  //finds the last digit of the given number
		sum = sum + digit;   //adds last digit to the variable sum  
		number = number / 10;  //removes the last digit from the number 
		} 
		System.out.println("Sum of Digits: "+sum); //printing the output

	}

}
------------------------------------
package inheritance;

public class Multi_In extends Mul_Inherit    ////acquires properties from Mul_Inherit
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.out.println("high display");
       Reverse();     ////calling the methods using object 
       SOD();
	}

}
