
//NAme: Vikas Gupta
//UIN/rollno:231P056/10
//b1

package vikasb1;
import java.util.*;
abstract class Shape
{
abstract void draw();
}
class Rectangle extends Shape
{ int l,w;
Rectangle() 
{Scanner sc=new Scanner(System.in);
System.out.println("\n\n\n\n\n\n");
System.out.println("******Rectangle******");
System.out.println("Enter Length and width of Rectangle");
l=sc.nextInt();
w=sc.nextInt();
}

void draw()
{
System.out.println("Area of Rectangle = "+(l*w));
}
}

class Circle extends Shape
{ double r;
Circle()
{Scanner sc=new Scanner(System.in);
System.out.println("******Circle******");
System.out.println("Enter Radius of a Circle");
r=sc.nextDouble();
}
void draw()
{
System.out.println("Area of Circle = "+(3.14*r*r));
}
}



public class postlabq2
{
public static void main(String args[]) 
{
Circle c=new Circle();
c.draw();
Rectangle d=new Rectangle();

d.draw();
}
}