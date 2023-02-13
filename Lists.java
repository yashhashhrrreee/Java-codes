import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionDemo {
   private static List<String> list = new ArrayList<>();

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int choice = 0;

      while (choice != 4) {
         System.out.println("1. Add an element to the list");
         System.out.println("2. Remove an element from the list");
         System.out.println("3. Get an element from the list");
         System.out.println("4. Quit");
         System.out.print("Enter your choice: ");
         choice = scanner.nextInt();
         scanner.nextLine();

         switch (choice) {
            case 1:
               System.out.print("Enter an element to add: ");
               String element = scanner.nextLine();
               addElement(element);
               break;
            case 2:
               System.out.print("Enter the index of the element to remove: ");
               int index = scanner.nextInt();
               removeElement(index);
               break;
            case 3:
               System.out.print("Enter the index of the element to retrieve: ");
               index = scanner.nextInt();
               getElement(index);
               break;
            case 4:
               System.out.println("Exiting the program");
               break;
            default:
               System.out.println("Invalid choice, try again");
               break;
         }
      }
      scanner.close();
   }

   private static void addElement(String element) {
      list.add(element);
      System.out.println("Element added successfully");
   }

   private static void removeElement(int index) {
      if (index >= 0 && index < list.size()) {
         list.remove(index);
         System.out.println("Element removed successfully");
      } else {
         System.out.println("Invalid index, try again");
      }
   }

   private static void getElement(int index) {
      if (index >= 0 && index < list.size()) {
         System.out.println("Element: " + list.get(index));
      } else {
         System.out.println("Invalid index, try again");
      }
   }
}
