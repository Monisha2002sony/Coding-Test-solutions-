package practice;

import java.util.Scanner;

class Calculator {
    public double calculate(double a, double b, String operation) {
        switch (operation.toLowerCase()) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    System.out.println("Error: Division by zero");
                    return Double.NaN;
                }
                return a / b;
            default:
                System.out.println("Invalid operation. Please enter add, subtract, multiply, or divide.");
                return Double.NaN;
        }
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter value for a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value for b: ");
        double b = sc.nextDouble();

        sc.nextLine();  

        System.out.print("Enter operation (+,-,*,/): ");
        String operation = sc.nextLine();

        double result = calc.calculate(a, b, operation);
        if (!Double.isNaN(result)) {
            System.out.println("Result: " + result);
        }

        sc.close();
    }
}
