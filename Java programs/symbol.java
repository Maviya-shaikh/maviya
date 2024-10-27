//Menu Driven Calculator PROGRAM using words


import java.util.Scanner;

public class MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu: \n A: Addition \n S: Subtraction \n M: Multiplication \n D: Division \n E: Exit");
        System.out.print("Enter your choice (A/S/M/D/E): ");
        char choice = scanner.next().toUpperCase().charAt(0);

        double result = 0;
        boolean validChoice = true;

        if (choice != 'E') {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            switch (choice) {
                case 'A':
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case 'S':
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case 'M':
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case 'D':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
                    validChoice = false;
                    break;
            }
        } else {
            System.out.println("Exiting the program.");
        }
        
        scanner.close();
    }
}