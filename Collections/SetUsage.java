import java.util.HashSet;
import java.util.Set;

// Used in examples
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

// Set - When Uniqueness Matters

/* Use Set when you need:
1. Unique elements
2. Fast lookup
3. No duplicates */

/* 
 * Note that we can't remove elements using
 * the index as we are able to do with Lists. 
 * We can still call .remove(index) but it 
 * shouldn't be used.
 * Instead, remove something using .remove(objectToRemove);
 * 
 * Other methods: 
 * .contains(object) --> Boolean
 * .isEmpty() --> Boolean
 * .clear() --> Clears your set
 * and many more...
 */

public class SetUsage {
    public static void main(String[] args){
        // Set is an interface, so we can't just say new Set. 
        // HashSet is the most commonly used Set. 
        Set<String> usernames = new HashSet<>(); 
        usernames.add("xX_alice_n0_sc0p3_1337_Xx");
        usernames.add(".:Em0~L0rd:.");
        usernames.add("xX_alice_n0_sc0p3_1337_Xx"); // Won't be added - duplicate (username taken)
        usernames.add("LeLennyCool65");
        usernames.add("1337_G4M3R_GRILL");
        usernames.add("xX_alice_n0_sc0p3_1337_Xx"); // Still won't be added - duplicate (username taken)

        System.out.println(usernames); // Note the order that is being printed, it isn't as inserted!
        
        // We can use enhanced for loops as well
        System.out.println("\nUsernames in database: ");
        for (String username : usernames){
            System.out.println(username);
        }
        System.out.println("\nEnd of database reached. Total users: " + usernames.size() + "\n");
        
        // Let's create a list to show how we can remove duplicates from it using a set!  
        List<Integer> myInts = new ArrayList<>();
        myInts.add(1);
        myInts.add(2);
        myInts.add(3);
        myInts.add(4);
        myInts.add(1);
        myInts.add(2);
        myInts.add(1);
        myInts.add(2);

        System.out.println("Before removing duplicates: " + myInts);

        Set<Integer> intSet = new HashSet<>();
        intSet.addAll(myInts);

        System.out.println("Now it's a set, no more dupes: " + intSet);

        // We can even skip the addAll using the parameterized constructor and 
        // just pass in our list of integeres through that: 
        Set<Integer> intParamSet = new HashSet<>(myInts);
        System.out.println("Set from a parameterized constructor: " + intParamSet);


        // Below are some more more "advanced" examples for the curious
        System.out.println("\n=== Advanced Topics ===\n");
        
        // Let's use Lambdas (outside scope of this course, but still cool!)
        System.out.println("Lambda!");
        usernames.forEach(System.out::println);

        // Using an iterator instead
        System.out.println("\n Using iterator!");
        Iterator<String> usernameIterator = usernames.iterator();
        while (usernameIterator.hasNext()){
            System.out.println(usernameIterator.next());
        }
    }
}




