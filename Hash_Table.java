
import java.util.Hashtable;

public class Hash_Table {
    public static void main(String[] args) {
        // Creating a Hashtable instance
        Hashtable<String, Integer> studentMarks = new Hashtable<>();

        // Adding values to the Hashtable
        studentMarks.put("John", 85);
        studentMarks.put("Mary", 92);
        studentMarks.put("Bob", 78);
        studentMarks.put("Alice", 90);

        // Retrieving values from the Hashtable
        int johnMarks = studentMarks.get("John");
        int maryMarks = studentMarks.get("Mary");
        int bobMarks = studentMarks.get("Bob");
        int aliceMarks = studentMarks.get("Alice");

        // Printing the marks of each student
        System.out.println("John's marks: " + johnMarks);
        System.out.println("Mary's marks: " + maryMarks);
        System.out.println("Bob's marks: " + bobMarks);
        System.out.println("Alice's marks: " + aliceMarks);
    }
}
