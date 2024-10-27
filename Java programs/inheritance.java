//Name: Vikas Gupta 
//UIN:231p056/10
//batch:b1
package java_B1_05;
import java.util.Scanner;
class Student
{
int rollNumber;
void getNumber(int n)
{
rollNumber=n;
}
void printNumber()
{
System.out.println("RollNo is " +rollNumber);
}
}
class Test extends Student
{
float part1,part2;
void getMarks(float a, float b)
{
part1=a;
part2=b;
} void putMarks()
{
System.out.println("Marks Part1 "+part1);
System.out.println("Marks Part2 "+part2);
}
}
interface Sports
{
float sportwt=6.0F;
void putwt();
}
class Results extends Test implements Sports
{
float total;
public void putwt()
{
System.out.println("Sports Marks "+ sportwt);
}
void display()
{
total=part1+part2+sportwt;
System.out.println("Total marks of " +rollNumber+" is "+total);
}
}
public class inheritance
{
public static void main(String srgs[])
{
	int n;
	float p1,p2;
	Scanner sc = new Scanner(System.in);
Results a=new Results();
System.out.println("Enter the roll no");
n=sc.nextInt();
a.getNumber(n);
a.printNumber();
System.out.println("Enter part1 and part2 marks");
p1=sc.nextFloat();
p2=sc.nextFloat();
a.getMarks(p1,p2);
a.putMarks();
a.putwt();
a.display();
}
}