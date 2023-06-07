
import java.util.Scanner;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b, double c) {
        return a + b + c;
    }
}

public class Overloading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calc = new Calculator();

        // Prompt user for two integers and perform integer addition
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();
        int sum1 = calc.add(num1, num2);
        System.out.println("Sum of integers: " + sum1);

        // Prompt user for two doubles and perform double addition
        System.out.print("Enter first double: ");
        double num3 = input.nextDouble();
        System.out.print("Enter second double: ");
        double num4 = input.nextDouble();
        double sum2 = calc.add(num3, num4);
        System.out.println("Sum of doubles: " + sum2);

        // // Prompt user for three integers and perform integer addition
        // System.out.print("Enter first integer: ");
        // int num5 = input.nextInt();
        // System.out.print("Enter second integer: ");
        // int num6 = input.nextInt();
        // System.out.print("Enter third integer: ");
        // int num7 = input.nextInt();
        // int sum3 = calc.add(num5, num6, num7);
        // System.out.println("Sum of integers: " + sum3);

        // // Prompt user for three doubles and perform double addition
        // System.out.print("Enter first double: ");
        // double num8 = input.nextDouble();
        // System.out.print("Enter second double: ");
        // double num9 = input.nextDouble();
        // System.out.print("Enter third double: ");
        // double num10 = input.nextDouble();
        // double sum4 = calc.add(num8, num9, num10);
        // System.out.println("Sum of doubles: " + sum4);
    }
}
