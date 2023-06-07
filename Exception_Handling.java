import java.lang.ClassNotFoundException;
import java.io.*;

public class Exception_Handling {
	public static void main(String[] args) {
		int a = 10, b = 5, c = 5, result;
		// Arithmetic
		try {
			result = a / (b - c);
			System.out.println("result" + result);
		}

		catch (ArithmeticException e) {
			System.out.println("Exception caught:Division by zero");
		}

		// Null pointer
		try {
			String d = null; // null value
			if (d != null) {
				System.out.println(d.charAt(0));
			} 
			else {
				System.out.println("d is null");
			}
		} catch (NullPointerException e) {
			System.out.println("NullPointerException..");
		}

		// StringIndexOutOfBound Exception
		try {
			String g = "This is like chipping "; // length is 22
			char h = g.charAt(24); // accessing 25th element
			System.out.println(h);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException");
		}

		// FileNotFound Exception
		try {
			// Following file does not exist
			File file = new File("E://file.txt");
			try (FileReader fr = new FileReader(file)) {
			} catch (FileNotFoundException e) {
				throw e;
			} catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist");
		}
		// ArrayIndexOutOfBounds
		try {
			int i[] = new int[5];
			i[6] = 9; // accessing 7th element in an array of
						// size 5
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index is Out Of Bounds");
		}
		// classnotfound
		try {
			Class.forName("Class1"); // Class1 is not defined
		} catch (ClassNotFoundException e) {
			System.out.println(e);
			System.out.println("Class Not Found...");
		}
		// i/o exception
		try {
			// Creating an instance of FileReader class
			FileReader fileReader = new FileReader("Test.txt");
			System.out.println(fileReader.read());
			fileReader.close();
		} catch (IOException e) {
			// e.printStackTrace();
			System.out.println("File not found: ");
		}
	}
}
