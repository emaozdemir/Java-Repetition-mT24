package Exceptions;

// Errors - When Really Bad Things Happen!

/* Errors are different from Exceptions:
1. They're usually fatal
2. They shouldn't be caught
3. They indicate serious problems
*/

/* 
 * Common types of Errors:
 * StackOverflowError - Too much recursion
 * OutOfMemoryError - JVM ran out of memory
 * NoClassDefFoundError - Can't find a class
 */

 public class ErrorDemo {
    public static void main(String[] args) {
        // Let's create a StackOverflowError with recursion
        System.out.println("=== Stack Overflow Example ===");
        System.out.println("(Comment out this section to run the rest)");
        //countForever(1);  // Uncomment to see StackOverflowError
        
        // Let's try to use too much memory
        System.out.println("\n=== Out of Memory Example ===");
        System.out.println("(Comment out this section to run the rest)");
        //long[] hugeArray = new long[Integer.MAX_VALUE];  // Uncomment to see OutOfMemoryError

        // Let's see the difference between Error and Exception
        try {
            System.out.println("Trying something dangerous...");
            //countForever(1);  // This would cause an Error
        } catch (Exception e) {  // Note: This won't catch Errors!
            System.out.println("Caught an Exception");
        }

        System.out.println("\nProgram finished!");
    }

    // This method calls itself forever until we get a StackOverflowError
    private static void countForever(int x) {
        System.out.println("Counting: " + x);
        countForever(x + 1);
    }
}