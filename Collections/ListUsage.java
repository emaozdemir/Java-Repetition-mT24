import java.util.ArrayList;
import java.util.List;

// List - When Order Matters

/*  Use List when you need:
1. Ordered elements
2. Duplicate elements
3. Index access
*/

/* 
 * There's different versions of lists,
 * most commonly used one is likely the ArrayList.
 * Another List example is a LinkedList. 
 */

public class ListUsage {
public static void main(String[] args){
    List<String> todoList = new ArrayList<>();
    todoList.add("Wake up");          
    todoList.add("Make coffee");      
    todoList.add("Check emails");  
    
    // We can get the element on a certain index using ".get(index)"
    // We can remove elements at a certain index using ".remove(index)"
    System.out.println("Alarm is now ringing for the 10th time... Let's start the day!");
    System.out.println("First on my list is..." + todoList.get(0));
    todoList.remove(0);

    // We can also use enhanced for loops to iterate over the elements. 
    for (String todo : todoList){
        System.out.println("Next task: " + todo);
        System.out.println("Done!");
        }
    }
}
