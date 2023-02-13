import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers:");

    double first = sc.nextDouble();
    double second = sc.nextDouble();

    System.out.println("Enter an operator (+, -, *, /): ");
    char operator = sc.next().charAt(0);

    double result;
    switch (operator) {
      case '+':
        result = first + second;
        break;
      case '-':
        result = first - second;
        break;
      case '*':
        result = first * second;
        break;
      case '/':
        result = first / second;
        break;
      default:
        System.out.println("Error! operator is not correct");
        return;
    }

    System.out.println(first + " " + operator + " " + second + " = " + result);
  }
}
