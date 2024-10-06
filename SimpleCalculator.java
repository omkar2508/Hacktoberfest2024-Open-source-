import java.util.Scanner;  // Import the Scanner class

public class SimpleCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask for the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Ask for the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform the addition
        double result = num1 + num2;

        // Display the result
        System.out.println("The sum is: " + result);
        
        // Close the scanner object
        scanner.close();
    }
}
