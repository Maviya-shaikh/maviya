package Vector02;
/*
 * Aim:Write a program to perform division of two numbers accepted from user. Handle the
IOException, NumberFormatException and also handle the divide by exception using multiple try
catch block.
Name: Vikas Gupta
Roll No: 10
UIN: 231P056
Class:SE-A
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exception {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input1 = null;
        String input2 = null;
        double num1 = 0;
        double num2 = 0;
        
        try {
            System.out.print("Enter the first number: ");
            input1 = reader.readLine();
            num1 = Double.parseDouble(input1);
        } catch (IOException e) {
            System.out.println("Input/Output error occurred: " + e.getMessage());
            return; // Exit the program if there's an I/O error
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format for the first number: " + e.getMessage());
            return; // Exit the program if the input is not a valid number
        }

        try {
            System.out.print("Enter the second number: ");
            input2 = reader.readLine();
            num2 = Double.parseDouble(input2);
        } catch (IOException e) {
            System.out.println("Input/Output error occurred: " + e.getMessage());
            return; // Exit the program if there's an I/O error
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format for the second number: " + e.getMessage());
            return; // Exit the program if the input is not a valid number
        }

        try {
            double result = num1 / num2;
            System.out.println("The result of division is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero: " + e.getMessage());
        }
    }
}