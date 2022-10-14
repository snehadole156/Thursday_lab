/* Q4) Write a program to accpet the positive numbers from user and display the sum of that number
*/
import java.util.Scanner;
public class PositiveNumber {
	public static void main (String args[]) {
		   int num=0,sum=0;      //initialize the variables
	          Scanner input = new Scanner(System.in);
	          do {
	        	  sum+=num;
	          System.out.print("Enter the Number  :");
	          num=input.nextInt();
	              }
	          while(num>=0);     // condition used for number is greater than 0
	          
	          System.out.println( "The total sum is : " +sum);   //print the sum of positive numbers
	}

}
