
//NAme: Vikas Gupta
//UIN/rollno:231P056/10
//b1

package bakarb1;
import java.util.*;
abstract class Shape
{
abstract void draw();
}
class Hemisphere extends Shape
{ int h;
Hemisphere() 
{Scanner sc=new Scanner(System.in);
System.out.println("\n\n\n\n\n\n");
System.out.println("******Hemisphere******");
System.out.println("Enter the radius of hemisphere");
h=sc.nextInt();
}

void draw()
{
System.out.println("volume of hemisphere = "+(h*h*h*3.14*0.66));
}
}

class sphere extends Shape
{ double r;
sphere()
{Scanner sc=new Scanner(System.in);
System.out.println("******sphere******");
System.out.println("Enter radius of sphere");
r=sc.nextDouble();
}
void draw()
{
System.out.println("Volume of shpere = "+(1.33*3.14*r*r*r));
}
}



public class postlabq2
{
public static void main(String args[]) 
{
 sphere sc=new sphere();
sc.draw();
Hemisphere d=new Hemisphere();

d.draw();
}
}