import java.util.*;

public class CollectionsFramework 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    List<String> names = new ArrayList<>();
    System.out.println("Enter the names (Enter -1 to stop): ");
    while (true) 
    {
      String name = input.nextLine();
      if (name.equals("-1")) 
      {
        break;
      }
      names.add(name);
    }

    System.out.println("Original List: " + names);

   Collections.sort(names);
   System.out.println("Sorted List: " + names);

   Collections.reverse(names);
   System.out.println("Reversed List: " + names);

   Collections.shuffle(names);
   System.out.println("Shuffled List: " + names);

   System.out.println("Minimum Element: " + Collections.min(names));
   System.out.println("Maximum Element: " + Collections.max(names));

   System.out.println("Enter a name to fill the list with: ");
   String fillName = input.nextLine();
   Collections.fill(names, fillName);
   System.out.println("Filled List: " + names);
  }
}
