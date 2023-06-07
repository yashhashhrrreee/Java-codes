import java.util.*;
public class Coolectionframework {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int choice = 0;
            
            do {
                System.out.println("1. ArrayList");
                System.out.println("2. LinkedList");
                System.out.println("3. Stack");
                System.out.println("4. Queue");
                System.out.println("5. HashMap");
                System.out.println("6. HashSet");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");
                // Check if input is available before reading it
                if (scanner.hasNextInt()) 
                {
                    choice = scanner.nextInt();
                } 
                else 
                {
                    // Clear scanner buffer to prevent infinite loop
                    scanner.next();
                    System.out.println("Invalid input. Please enter a number.");
                    continue;
                }
                switch (choice) {
                    case 1:
                        arrayListDemo();
                        break;
                    case 2:
                        linkedListDemo();
                        break;
                    case 3:
                        stackDemo();
                        break;
                    case 4:
                        queueDemo();
                        break;
                    case 5:
                        hashMapDemo();
                        break;
                    case 6:
                        hashSetDemo();
                        break;
                    case 0:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
                System.out.println();
            } while (choice != 0);
        }
    }
    
    public static void arrayListDemo() {
        ArrayList<String> list = new ArrayList<String>();
        try (Scanner scanner = new Scanner(System.in)) {
            int choice = 0;
            
            do {
                System.out.println("1. Add element");
                System.out.println("2. Remove element");
                System.out.println("3. Display elements");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");
                if (scanner.hasNextInt()) 
                {
                    choice = scanner.nextInt();
                } 
                else 
                {
                    // Clear scanner buffer to prevent infinite loop
                    scanner.next();
                    System.out.println("Invalid input. Please enter a number.");
                    continue;
                }
                switch (choice) 
                {
                    case 1:
                        System.out.print("Enter element to add: ");
                        String element = scanner.next();
                        list.add(element);
                        break;
                    case 2:
                        System.out.print("Enter index of element to remove: ");
                        int index = scanner.nextInt();
                        list.remove(index);
                        break;
                    case 3:
                        System.out.println(list);
                        break;
                    case 0:
                        System.out.println("Returning to main menu...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
                System.out.println();
            } while (choice != 0);
        }
    }
    
    public static void linkedListDemo() 
    {
        LinkedList<String> list = new LinkedList<String>();
        try (Scanner scanner = new Scanner(System.in)) {
            int choice = 0;
            
            do {
                System.out.println("1. Add element");
                System.out.println("2. Remove element");
                System.out.println("3. Display elements");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");
                if (scanner.hasNextInt()) 
                {
                    choice = scanner.nextInt();
                } 
                else 
                {
                    // Clear scanner buffer to prevent infinite loop
                    scanner.next();
                    System.out.println("Invalid input. Please enter a number.");
                    continue;
                }
                switch (choice) {
                    case 1:
                        System.out.print("Enter element to add: ");
                        String element = scanner.next();
                        list.add(element);
                        break;
                    case 2:
                        System.out.print("Enter index of element to remove: ");
                        int index = scanner.nextInt();
                        list.remove(index);
                        break;
                    case 3:
                        System.out.println(list);
                        break;
                    case 0:
                        System.out.println("Returning to main menu...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
                System.out.println();
            } while (choice != 0);
        }
    }

    public static void stackDemo() {
        Stack<String> stack = new Stack<String>();
        try (Scanner scanner = new Scanner(System.in)) {
            int choice = 0;
            
            do {
                System.out.println("1. Push element");
                System.out.println("2. Pop element");
                System.out.println("3. Peek element");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");
                if (scanner.hasNextInt()) 
                {
                    choice = scanner.nextInt();
                } 
                else 
                {
                    // Clear scanner buffer to prevent infinite loop
                    scanner.next();
                    System.out.println("Invalid input. Please enter a number.");
                    continue;
                }
                switch (choice) {
                    case 1:
                        System.out.print("Enter element to push: ");
                        String element = scanner.next();
                        stack.push(element);
                        break;
                    case 2:
                        if (!stack.isEmpty()) {
                            String poppedElement = stack.pop();
                            System.out.println("Popped element: " + poppedElement);
                        } else {
                            System.out.println("Stack is empty.");
                        }
                        break;
                    case 3:
                        if (!stack.isEmpty()) {
                            String peekedElement = stack.peek();
                            System.out.println("Peeked element: " + peekedElement);
                        } else {
                            System.out.println("Stack is empty.");
                        }
                        break;
                    case 0:
                        System.out.println("Returning to main menu...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
                System.out.println();
            } while (choice != 0);
        }
    }
    
    public static void queueDemo() {
        Queue<String> queue = new LinkedList<String>();
        try (Scanner scanner = new Scanner(System.in)) {
            int choice = 0;
            
            do {
                System.out.println("1. Add element");
                System.out.println("2. Remove element");
                System.out.println("3. Display elements");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");
                if (scanner.hasNextInt()) 
                {
                    choice = scanner.nextInt();
                } 
                else 
                {
                    // Clear scanner buffer to prevent infinite loop
                    scanner.next();
                    System.out.println("Invalid input. Please enter a number.");
                    continue;
                }
                switch (choice) {
                    case 1:
                        System.out.print("Enter element to add: ");
                        String element = scanner.next();
                        queue.add(element);
                        break;
                    case 2:
                        if (!queue.isEmpty()) {
                            String removedElement = queue.remove();
                            System.out.println("Removed element: " + removedElement);
                        } else {
                            System.out.println("Queue is empty.");
                        }
                        break;
                    case 3:
                        System.out.println(queue);
                        break;
                    case 0:
                        System.out.println("Returning to main menu...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
                System.out.println();
            } while (choice != 0);
        }
    }
    
    public static void hashMapDemo() 
    {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        try (Scanner scanner = new Scanner(System.in)) {
            int choice = 0;
            
            do {
                System.out.println("1. Add element");
                System.out.println("2. Remove element");
                System.out.println("3. Display elements");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");
                if (scanner.hasNextInt()) 
                {
                    choice = scanner.nextInt();
                } 
                else 
                {
                    // Clear scanner buffer to prevent infinite loop
                    scanner.next();
                    System.out.println("Invalid input. Please enter a number.");
                    continue;
                }
                switch (choice) {
                    case 1:
                        System.out.print("Enter key: ");
                        int key = scanner.nextInt();
                        System.out.print("Enter value: ");
                        String value = scanner.next();
                        map.put(key, value);
                        break;
                    case 2:
                        System.out.print("Enter key to remove: ");
                        int keyToRemove = scanner.nextInt();
                        map.remove(keyToRemove);
                        break;
                    case 3:
                        System.out.println(map);
                        break;
                    case 0:
                        System.out.println("Returning to main menu...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
                System.out.println();
            } while (choice != 0);
        }
    }
    
    public static void hashSetDemo() {
        HashSet<String> set = new HashSet<String>();
        try (Scanner scanner = new Scanner(System.in)) {
            int choice = 0;
            
            do {
                System.out.println("1. Add element");
                System.out.println("2. Remove element");
                System.out.println("3. Display elements");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");
                if (scanner.hasNextInt()) 
                {
                    choice = scanner.nextInt();
                } 
                else 
                {
                    // Clear scanner buffer to prevent infinite loop
                    scanner.next();
                    System.out.println("Invalid input. Please enter a number.");
                    continue;
                }
                switch (choice) {
                    case 1:
                        System.out.print("Enter element to add: ");
                        String element = scanner.next();
                        set.add(element);
                        break;
                    case 2:
                        System.out.print("Enter element to remove: ");
                        String elementToRemove = scanner.next();
                        set.remove(elementToRemove);
                        break;
                    case 3:
                        System.out.println(set);
                        break;
                    case 0:
                        System.out.println("Returning to main menu...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
                System.out.println();
            } while (choice != 0);
        }
    }
}    
    

       
