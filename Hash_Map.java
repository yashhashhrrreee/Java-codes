
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hash_Map {

    public static void main(String[] args) {
        
        // Create an empty HashMap of String keys and Integer values
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Display menu options
        System.out.println("HashMap Demo:");
        System.out.println("1. Add a key-value pair to the map");
        System.out.println("2. Remove a key-value pair from the map");
        System.out.println("3. Print the keys in the map");
        System.out.println("4. Print the values in the map");
        System.out.println("5. Print the key-value pairs in the map");
        System.out.println("6. Quit");
        
        // Loop until user selects "Quit" option
        boolean quit = false;
        while (!quit) {
            
            // Prompt user for menu selection
            System.out.print("\nEnter your choice: ");
            int choice = input.nextInt();
            
            // Process user selection
            switch (choice) {
            
                case 1:
                    // Add a key-value pair to the map
                    System.out.print("Enter the key: ");
                    String key = input.next();
                    System.out.print("Enter the value: ");
                    int value = input.nextInt();
                    map.put(key, value);
                    break;
                
                case 2:
                    // Remove a key-value pair from the map
                    System.out.print("Enter the key to remove: ");
                    String removeKey = input.next();
                    if (map.containsKey(removeKey)) {
                        map.remove(removeKey);
                    } else {
                        System.out.println("Key not found.");
                    }
                    break;
                
                case 3:
                    // Print the keys in the map
                    System.out.println("Keys in the map:");
                    for (String k : map.keySet()) {
                        System.out.println(k);
                    }
                    break;
                
                case 4:
                    // Print the values in the map
                    System.out.println("Values in the map:");
                    for (int v : map.values()) {
                        System.out.println(v);
                    }
                    break;
                
                case 5:
                    // Print the key-value pairs in the map
                    System.out.println("Key-value pairs in the map:");
                    for (Map.Entry<String, Integer> entry : map.entrySet()) {
                        System.out.println(entry.getKey() + " = " + entry.getValue());
                    }
                    break;
                
                case 6:
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
