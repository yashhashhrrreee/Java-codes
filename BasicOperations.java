import java.util.Scanner;

abstract class Operation 
{
    int num1, num2;

    public Operation(int num1, int num2) 
    {
        this.num1 = num1;
        this.num2 = num2;
    }

    abstract int calculate();
}

class Addition extends Operation 
{
    public Addition(int num1, int num2) 
    {
        super(num1, num2);
    }

    int calculate() 
    {
        return num1 + num2;
    }
}

class Subtraction extends Operation 
{
    public Subtraction(int num1, int num2) 
    {
        super(num1, num2);
    }

    int calculate() 
    {
        return num1 - num2;
    }
}

class Multiplication extends Operation 
{
    public Multiplication(int num1, int num2) 
    {
        super(num1, num2);
    }

    int calculate() 
    {
        return num1 * num2;
    }
}

class Division extends Operation 
{
    public Division(int num1, int num2) 
    {
        super(num1, num2);
    }

    int calculate() 
    {
        if (num2 != 0)
            return num1 / num2;
        else
            throw new IllegalArgumentException("Error: division by zero");
    }
}

public class BasicOperations
{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            int num1, num2, choice;
            while (true) 
            {
                System.out.print("Enter first number: ");
                if (sc.hasNextInt()) 
                {
                    num1 = sc.nextInt();
                    break;
                } 
                else 
                {
                    System.out.println("Error: invalid input, please enter an integer");
                    sc.nextLine(); // clear the input buffer
                }
            }
            while (true) 
            {
                System.out.print("Enter second number: ");
                if (sc.hasNextInt()) 
                {
                    num2 = sc.nextInt();
                    break;
                } 
                else 
                {
                    System.out.println("Error: invalid input, please enter an integer");
                    sc.nextLine(); // clear the input buffer
                }
            }
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Exit");

            while (true) 
            {
                System.out.print("Enter your choice: ");
                if (sc.hasNextInt()) 
                {
                    choice = sc.nextInt();
                    if (choice >= 0 && choice <= 4) 
                    {
                        if (choice == 0) 
                        {
                            break;
                        }

                        Operation op;
                        switch (choice) 
                        {
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
                                continue; // should never happen
                        }

                        int result = op.calculate();
                        System.out.println("Result: " + result);
                    } 
                    else 
                    {
                        System.out.println("Invalid Choice");
                        sc.nextLine(); // clear the input buffer
                    }
                } 
                else 
                {
                    System.out.println("Error: invalid input, please enter an integer");
                    sc.nextLine(); // clear the input buffer
                }
            }
        }
    }
}
