import java.util.Scanner;

abstract class Operation {
    int num1, num2;

    public Operation(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    abstract int calculate();
}

class Addition extends Operation {
    public Addition(int num1, int num2) {
        super(num1, num2);
    }

    int calculate() {
        return num1 + num2;
    }
}

class Subtraction extends Operation {
    public Subtraction(int num1, int num2) {
        super(num1, num2);
    }

    int calculate() {
        return num1 - num2;
    }
}

class Multiplication extends Operation {
    public Multiplication(int num1, int num2) {
        super(num1, num2);
    }

    int calculate() {
        return num1 * num2;
    }
}

class Division extends Operation {
    public Division(int num1, int num2) {
        super(num1, num2);
    }

    int calculate() {
        if (num2 != 0)
            return num1 / num2;
        else
            return 0;
    }
}

public class A1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num1, num2, choice;
            System.out.println("Enter first number: ");
            num1 = sc.nextInt();

            System.out.println("Enter second number: ");
            num2 = sc.nextInt();
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Exit");

            while (true) {
                System.out.println("Enter your choice: ");
                choice = sc.nextInt();

                if (choice == 0) {
                    break;
                }

                Operation op;
                switch (choice) {
                    case 1:
                        op = new Addition(num1, num2);
                        break;
                    case 2:
                        op = new Subtraction(num1, num2);
                        break;
                    case 3:
                        op = new Multiplication(num1, num2);
                        break;
                    case 4:
                        op = new Division(num1, num2);
                        break;
                    default:
                        System.out.println("Invalid Choice");
                        continue;
                }

                int result = op.calculate();
                System.out.println("Result: " + result);
            }
        }
    }
}
