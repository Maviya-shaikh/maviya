//Name: Vikas Gupta
//UIN:231p056/10

package bakarb1;
import java.util.Scanner;

//Base class to accept the radius from the user
class BaseClass {
 protected double radius;

 // Method to accept radius from the user
 public void acceptData() {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter the radius: ");
     radius = scanner.nextDouble();
     System.out.println("Radius accepted in BaseClass: " + radius);
 }
}

//Derived class to calculate the area of a circle (overrides acceptData method)
class Circle extends BaseClass {
 protected double area;

 @Override
 public void acceptData() {
     super.acceptData();  // Call the base class method
     System.out.println("Data accepted and passed to Circle class.");
 }

 // Method to calculate the area of a circle
 public void calculateArea() {
     area = Math.PI * radius * radius;
 }

 public void displayArea() {
     System.out.println("Area of the circle: " + area);
 }
}

//Further derived class to calculate the volume of a sphere (overrides acceptData method)
class Sphere extends Circle {
 private double volume;

 @Override
 public void acceptData() {
     super.acceptData();  // Call the Circle class method
     System.out.println("Data accepted and passed to Sphere class.");
 }

 // Method to calculate the volume of a sphere
 public void calculateVolume() {
     volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
 }

 // Method to display the volume of the sphere
 public void displayVolume() {
     System.out.println("Volume of the sphere: " + volume);
 }
}

//Main class to demonstrate multilevel inheritance and method overriding
public class MultilevelInheritanceWithOverriding {
 public static void main(String[] args) {
     // Create an object of the Sphere class
     Sphere sphere = new Sphere();

     // Accept radius (method overridden in Sphere class)
     sphere.acceptData();

     // Calculate and display the area of the circle
     sphere.calculateArea();
     sphere.displayArea();

     // Calculate and display the volume of the sphere
     sphere.calculateVolume();
     sphere.displayVolume();
 }
}