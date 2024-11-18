package Exceptions;
// ErrorDemo.java

/*
 * This class demonstrates different types of Errors in Java.
 * Note: Errors are different from Exceptions!
 * 
 * Key concepts covered:
 * 1. Different types of Errors
 * 2. Why Errors shouldn't be caught
 * 3. Common scenarios causing Errors
 * 4. Difference between Errors and Exceptions
 */

 /* 
  * Since the following code actually create errors, I found 
  * it best to comment out each method call. You'll need to 
  * uncomment the code to try the different errors out! 
  */

 public class ErrorDemoAdvanced {
    public static void main(String[] args) {
        ErrorDemoAdvanced demo = new ErrorDemoAdvanced();
        
        System.out.println("=== Welcome to the Error Demo! ===\n");
        System.out.println("Note: You need to uncomment lines to cause actual errors!");
        
        // 1. Demonstrating StackOverflowError

        // System.out.println("1. Demonstrating StackOverflowError:");
        
        //demo.demonstrateStackOverflowError(1);
        
        // 2. Demonstrating OutOfMemoryError
        //System.out.println("\n2. Demonstrating OutOfMemoryError:");
        //demo.demonstrateOutOfMemoryError();
        
        // 3. Demonstrating why we typically don't catch Errors
        System.out.println("\n3. Demonstrating Error handling (not recommended):");
        demo.demonstrateErrorHandling();
        
        // 4. Showing the difference between Errors and Exceptions
        System.out.println("\n4. Demonstrating Error vs Exception:");
        demo.demonstrateErrorVsException();
    }
    
    // Demonstration of StackOverflowError due to infinite recursion 
    private void demonstrateStackOverflowError(int x) {
        System.out.println("Stack level: " + x);
        demonstrateStackOverflowError(x + 1);
    }
    
    // Demonstration of OutOfMemoryError (we try to create a really large array)
    private void demonstrateOutOfMemoryError() {
        long[] array = new long[Integer.MAX_VALUE];
    }
    
    // We CAN catch errors, that doesn't mean we SHOULD (just don't do this normally)!  
    private void demonstrateErrorHandling() {
        try {
            //System.out.println("Trying something that might cause an Error...");
            //demonstrateStackOverflowError(1);
            
        } catch (StackOverflowError e) {
            // NOTE: This is just for demonstration!
            // In real applications, you typically shouldn't catch Errors
            System.out.println("Caught an Error (not recommended): " + e.getClass().getSimpleName());
            System.out.println("Errors indicate serious problems that applications shouldn't try to recover from!");
        }
    }
    
    // Demonstration of Error vs Exception
    private void demonstrateErrorVsException() {
        System.out.println("Key differences between Errors and Exceptions:");
        System.out.println("1. Errors are typically unrecoverable");
        System.out.println("2. Exceptions are for exceptional but recoverable conditions");
        System.out.println("3. You should handle Exceptions, but not Errors");
        System.out.println("4. Errors are typically caused by the environment, not the application");
        
        System.out.println("\nCommon Errors include:");
        System.out.println("- StackOverflowError (infinite recursion)");
        System.out.println("- OutOfMemoryError (JVM out of memory)");
        System.out.println("- NoClassDefFoundError (class not found at runtime)");
        
        System.out.println("\nCommon Exceptions include:");
        System.out.println("- NullPointerException");
        System.out.println("- ArrayIndexOutOfBoundsException");
        System.out.println("- IOException");
    }
}