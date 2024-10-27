// Aim: Write a program to add integer number and string using method overloading.
package Collegeassignments;
/*
 * Name: Vikas gupta
 * Class: SE
 * Div: A
 * UIN/Roll no. : 231P056/10
 */

package skl_op_package;
public class StringInteger {
	public static void main(String[] args) {
		StrInt obj = new StrInt();
		int sum = obj.add(5, 10);
		System.out.println("Sum of integers: " + sum); 
		String concatenatedString = obj.add("Hello ", "World");
		System.out.println("Concatenated String: " + concatenatedString);
	}
}

class StrInt
{
	public int add(int a, int b)
	{
		return a + b;
	}
	
		
	public String add(String a, String b) 
	{
		return a + b;
	}
}