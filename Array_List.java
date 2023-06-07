
import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {

    public static void main(String[] args) {
        
        // Create an empty ArrayList of Strings
        ArrayList<String> list = new ArrayList<String>();
        
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Display menu options
        System.out.println("ArrayList Demo:");
        System.out.println("1. Add an element to the list");
        System.out.println("2. Remove an element from the list");
        System.out.println("3. Print the list");
        System.out.println("4. Quit");
        
        // Loop until user selects "Quit" option
        boolean quit = false;
        while (!quit) {
            
            // Prompt user for menu selection
            System.out.print("\nEnter your choice: ");
            int choice = input.nextInt();
            
            // Process user selection
            switch (choice) {
            
                case 1:
                    // Add an element to the list
                    System.out.print("Enter the element to add: ");
                    String element = input.next();
                    list.add(element);
                    break;
                
                case 2:
                    // Remove an element from the list
                    System.out.print("Enter the index of the element to remove: ");
                    int index = input.nextInt();
                    if (index >= 0 && index < list.size()) {
                        list.remove(index);
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                
                case 3:
                    // Print the list
                    System.out.println("Elements in the list:");
                    for (String str : list) {
                        System.out.println(str);
                    }
                    break;
                
                case 4:
                    // Quit the program
                    quit = true;
                    break;
                    
                default:
                    // Invalid menu option
                    System.out.println("Invalid choice.");
                    break;
            }
        }
        
        // Close the Scanner object
        input.close();
        
        // Exit the program
        System.out.println("\nGoodbye!");
        System.exit(0);
    }
}
