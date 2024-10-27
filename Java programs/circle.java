package Collegeassignments;
/*
 * Name: Vikas gupta
 * Class: SE
 * Div: A
 * UIN/Roll no. : 231P056/10
 */
import java.util.Scanner;

public class Circle_1 {
    private double radius;
    private double area;

    public void acceptRadius() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        this.radius = scanner.nextDouble();
    }

    public void calculateArea() {
        this.area = Math.PI * Math.pow(this.radius, 2);
    }

    public void displayArea() {
        System.out.println("The area of the circle with radius " + this.radius + " is " + this.area);
    }

    public static void main(String[] args) {
        Circle_1 circle = new Circle_1();
        circle.acceptRadius();
        circle.calculateArea();
        circle.displayArea();
    }
}