
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.TreeMap;

public class Menu_ArrayList_HashMap_HashTable_TreeMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> namesList = new ArrayList<>();
        HashMap<Integer, String> studentMap = new HashMap<>();
        Hashtable<Integer, String> employeeTable = new Hashtable<>();
        TreeMap<String, Integer> marksMap = new TreeMap<>();

        int choice;
        do {
            System.out.println("Choose an option:");
            System.out.println("1. Add a name to the ArrayList");
            System.out.println("2. Display the names in the ArrayList");
            System.out.println("3. Add a student to the HashMap");
            System.out.println("4. Display the students in the HashMap");
            System.out.println("5. Add an employee to the HashTable");
            System.out.println("6. Display the employees in the HashTable");
            System.out.println("7. Add a student's marks to the TreeMap");
            System.out.println("8. Display the students' marks in the TreeMap");
            System.out.println("0. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter a name:");
                    String name = scanner.next();
                    namesList.add(name);
                    System.out.println("Name added to the ArrayList");
                    break;
                case 2:
                    System.out.println("Names in the ArrayList:");
                    for (String n : namesList) {
                        System.out.println(n);
                    }
                    break;
                case 3:
                    System.out.println("Enter a student ID:");
                    int id = scanner.nextInt();
                    System.out.println("Enter the student's name:");
                    String studentName = scanner.next();
                    studentMap.put(id, studentName);
                    System.out.println("Student added to the HashMap");
                    break;
                case 4:
                    System.out.println("Students in the HashMap:");
                    for (int i : studentMap.keySet()) {
                        System.out.println("ID: " + i + ", Name: " + studentMap.get(i));
                    }
                    break;
                case 5:
                    System.out.println("Enter an employee ID:");
                    int empId = scanner.nextInt();
                    System.out.println("Enter the employee's name:");
                    String empName = scanner.next();
                    employeeTable.put(empId, empName);
                    System.out.println("Employee added to the HashTable");
                    break;
                case 6:
                    System.out.println("Employees in the HashTable:");
                    for (int i : employeeTable.keySet()) {
                        System.out.println("ID: " + i + ", Name: " + employeeTable.get(i));
                    }
                    break;
                case 7:
                    System.out.println("Enter a student name:");
                    String student = scanner.next();
                    System.out.println("Enter the student's marks:");
                    int marks = scanner.nextInt();
                    marksMap.put(student, marks);
                    System.out.println("Student's marks added to the TreeMap");
                    break;
                case 8:
                    System.out.println("Students' marks in the TreeMap:");
                    for (String s : marksMap.keySet()) {
                        System.out.println("Name: " + s + ", Marks: " + marksMap.get(s));
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}
