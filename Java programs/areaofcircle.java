// Aim: Write a program to find Area of Circle using method overloading
package Collegeassignments;
/*
 * Name: Vikas gupta
 * Class: SE
 * Div: A
 * UIN/Roll no. : 231P056/10
 */

package MainMain;
import java.util.*;

class AreaOfMethodOverload
{
	double r;

	void areaCircle( )
	{
		r=5;
	}

	void areaCircle(double radious)
	{
		r=radious;
	}

	void areaCircle(int radious)
	{
		r=radious;
	}

	void display( )
	{ 
		System.out.println(" Area of the Circle = "+(3.14*r*r)); 
	}
}

public class FindAreaOverload
{
	public static void main(String[] args)
	{ 
		double r1;
		int r2;
		Scanner sc =new Scanner(System.in);
		
		AreaOfMethodOverload a=new AreaOfMethodOverload ( );
		a.areaCircle();
		
		System.out.print("Enter First Radius: ");
		r1 =sc.nextDouble();
		AreaOfMethodOverload b=new AreaOfMethodOverload();
		b.areaCircle(r1);

		System.out.print("Enter Second Radius: ");
		r2 =sc.nextInt();
		AreaOfMethodOverload c=new AreaOfMethodOverload();
		c.areaCircle(r2);
		
		System.out.print("Radius = 5 :");
		a.display();
		System.out.print("Radius = " + r1 + " : ");
		b.display();
		System.out.print("Radius = " + r2 + " : ");
		c.display();
		
	}
}