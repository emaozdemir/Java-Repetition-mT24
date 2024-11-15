import java.util.HashSet;
import java.util.Set;

// Set - When Uniqueness Matters

/* Use Set when you need:
1. Unique elements
2. Fast lookup
3. No duplicates */

public class SetUsage {
    public static void main(String[] args){
        Set<String> usernames = new HashSet<>();
        usernames.add("alice123");
        usernames.add("bob456");
        usernames.add("alice123");  // Won't be added - duplicate
        System.out.println(usernames.size());  // Size is 2 (alice123 and bob456)
    }
}
