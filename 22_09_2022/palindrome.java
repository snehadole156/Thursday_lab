//Write a program to accept a number from the user and check if a given number is palindrome or not.
import java.util.Scanner;                              
public class palindrome{                              
    public static void main(String args[])
    {
	 Scanner in = new Scanner(System.in);                // Create a Scanner object
     System.out.print("Enter a number: ");            //accept user input
     int n = in.nextInt();                           // Read user input
     int sum = 0, r;                                
	 int temp = n;                                   
     while(n>0)                                    // checks value is greater than 0
	   {    
        r = n % 10;                                  
        sum = (sum*10)+r;                           //for reversing a number and stores it in sum
        n = n/10;                                      
       }    
      if(temp==sum)                                 //check if  input 'n' is equal to reverse value 
        System.out.println("It is a Palindrome number.");    
      else                                           //if the condition is false the code will be visible
        System.out.println("Not a palindrome");    
     }  
}
