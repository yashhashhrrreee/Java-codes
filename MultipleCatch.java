
import java.io.*;

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]); // Throws ArrayIndexOutOfBoundsException

            String str = null;
            System.out.println(str.length()); // Throws NullPointerException

            FileInputStream file = new FileInputStream("input.txt");
            InputStreamReader input = new InputStreamReader(file);
            char[] buffer = new char[10];
            input.read(buffer, 0, 11); // Throws IOException

            String s = "hello";
            System.out.println(s.charAt(10)); // Throws StringIndexOutOfBoundsException

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds error: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Null pointer error: " + e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("File not found error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String index out of bounds error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("This code will always execute, regardless of whether an exception was thrown or not.");
        }
    }
}
