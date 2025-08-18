import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String again = "y";

        while (again.equalsIgnoreCase("y")) {

            System.out.print("Enter first number: ");
            double num1 = input.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = input.nextDouble();

            System.out.print("Enter operation (+, -, *, /): ");
            char op = input.next().charAt(0);

            double result = 0;
            boolean valid = true;

            if (op == '+') {
                result = num1 + num2;
            } else if (op == '-') {
                result = num1 - num2;
            } else if (op == '*') {
                result = num1 * num2;
            } else if (op == '/') {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero not allowed!");
                    valid = false;
                }
            } else {
                System.out.println("Invalid operation!");
                valid = false;
            }

            if (valid) {
                System.out.println("Result: " + result);
            }

            System.out.print("Do you want to continue? (y/n): ");
            again = input.next();
        }

        System.out.println("Thank you for using the calculator!");
        input.close();
    }
}