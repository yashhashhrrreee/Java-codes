import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsFramework 
{
  public static void main(String[] args) 
  {
    List<String> names = new ArrayList<>();
    names.add("John");
    names.add("Emily");
    names.add("Michael");
    names.add("Sarah");
    
    System.out.println("Original List: " + names);
    Collections.sort(names);
    System.out.println("Sorted List: " + names);
    Collections.reverse(names);
    System.out.println("Reversed List: " + names);
    Collections.shuffle(names);
    System.out.println("Shuffled List: " + names);
    System.out.println("Minimum Element: " + Collections.min(names));
    System.out.println("Maximum Element: " + Collections.max(names));
    Collections.fill(names, "Unknown");
    System.out.println("Filled List: " + names);
  }
}
