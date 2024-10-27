package Vector02;
import java.util.Scanner;
/*
 * Aim:Write a program to perform division of two numbers accepted from user. Handle the
NumberFormatException and also handle the divide by exception using nested try catch block.
Name: Vikas Gupta
Roll No: 10
UIN: 231P056
Class:SE-A
 * */
public class DivisionWithNestedTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
        
        try {
            // Outer try block to handle NumberFormatException
            System.out.print("Enter the first number: ");
            int num1 = Integer.parseInt(scanner.nextLine());  // Reading and converting input to integer

            System.out.print("Enter the second number: ");
            int num2 = Integer.parseInt(scanner.nextLine());  // Reading and converting input to integer

            try {
                // Inner try block to handle ArithmeticException (division by zero)
                int result = num1 / num2;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by zero.");
            }

        } catch (NumberFormatException e) {
            // Catching invalid number format
            System.out.println("Error: Please enter valid numbers.");
        } finally {
            scanner.close();  // Closing scanner
        }
	}

}
