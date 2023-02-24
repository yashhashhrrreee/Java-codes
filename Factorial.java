import java.util.Scanner;

public class A2 
{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n;
            while (true) {
                try {
                    System.out.print("Enter a non-negative integer to calculate its factorial: ");
                    n = scanner.nextInt();
                    if (n < 0) 
                    {
                        throw new IllegalArgumentException("Error: the number must be non-negative");
                    }
                    break;
                } 
                catch (IllegalArgumentException ex) 
                {
                    System.out.println(ex.getMessage());
                } 
                catch (Exception ex) 
                {
                    System.out.println("Error: invalid input, please enter a non-negative integer");
                    scanner.nextLine(); // clear the input buffer
                }
            }
            long factorial = calculateFactorial(n);
            System.out.printf("%d! = %d", n, factorial);
        }
    }

    private static long calculateFactorial(int n) 
    {
        long factorial = 1;
        for (int i = 2; i <= n; i++) 
        {
            factorial *= i;
        }
        return factorial;
    }
}

