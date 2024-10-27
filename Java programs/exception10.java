//Name: Vikas gupta
//UIN:231P056/10
//Aim: Program to implement user defined exception in java

package Vector02;
import java.util.*;
public class exception {

	public static void main(String args[])
	{
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the month number:");
	n=sc.nextInt();
	try
	{
	if(n>12||n<1)
	throw new ArithmeticException();
	System.out.println("Month number entered is="+n);

	}
	catch(ArithmeticException ae)
	{
	System.out.println("Invalid Number!");
	}
	
	}
}
