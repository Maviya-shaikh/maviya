// Aim: Write a program to find Area of Circle using constructor overloading
/*
 * Name: Vikas gupta
 * Class: SE
 * Div: A
 * UIN/Roll no. : 231P056/10
 */

package MainMain;
import java.util.*;

class AreaOf
{
	double r;
	
	AreaOf()
	{
		r = 5;
	}
	
	AreaOf(double radius)
	{
		r = radius;
	}
	
	AreaOf(int radius)
	{
		r = radius;
	}
	
	void display()
	{
		System.out.println("Area of the Circle = " + (3.14*r*r));
	}
}

public class FindArea {

	public static void main(String[] args) {
		double r1;
		int r2;
		Scanner sc = new Scanner(System.in);
		
		AreaOf obj1 = new AreaOf();
		
		System.out.print("Enter First Radius: ");
		r1 = sc.nextDouble();
		AreaOf obj2 = new AreaOf(r1);
		
		System.out.print("Enter Second Radius: ");
		r2 = sc.nextInt();
		AreaOf obj3 = new AreaOf(r2);
		
		System.out.print("Radius = 5 :");
		obj1.display();
		System.out.print("Radius = " + r1 + " : ");
		obj2.display();
		System.out.print("Radius = " + r2 + " : ");
		obj3.display();

	}

}
