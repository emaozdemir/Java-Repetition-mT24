package Exceptions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// Exceptions - When Things Go Wrong!

/* Use Exceptions when you need to:
1. Handle exceptions gracefully
2. Recover from problems
3. Give meaningful messages
*/

/* 
 * There are two main types of Exceptions:
 * Checked (must be handled/declared) and Unchecked (runtime)
 * 
 * Common methods when working with exceptions:
 * getMessage() --> Gets the error message
 * printStackTrace() --> Prints the full error trace
 * getClass() --> Gets the type of exception
 */

 /* 
  * 
  */

// We create a "custom" exception that we can use in our program. 
class PetCatException extends Exception {
    public PetCatException(String message) {
        super(message);
    }
}

public class ExceptionsDemo {
    public static void main(String[] args) {
        // Let's try some array operations that will fail (Index out of bounds)
        int[] numbers = {1, 2, 3};

        System.out.println("\n=== ArrayIndexOutOfBounds ===\n");
        System.out.println("Accessing index 5 of numbers array (3 elements)");
        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Oops, that index doesn't exist!");
            System.out.println("Error message: " + e.getMessage());
        }

        // Let's try to read a file that doesn't exist
        System.out.println("\n=== IOException ===\n");
        System.out.println("Trying to open the file totally_real_file_not_malware");
        try {
            FileReader reader = new FileReader("totally_real_file_not_malware.txt");
        } catch (IOException e) {
            System.out.println("Couldn't find that file!");
            System.out.println("Error message: " + e.getMessage());
        }

        // Let's see what happens with a null pointer
        System.out.println("\n=== NullPointerException ===\n");
        System.out.println("Trying to get the length of a null String");
        String nullString = null;
        try {
            System.out.println(nullString.length());
        } catch (NullPointerException e) {
            System.out.println("Can't get length of null!");
            System.out.println("Error Message: " + e.getMessage());
        }

        // We can also use finally to always execute some code
        System.out.println("\n=== InterruptedException ===\n");
        System.out.println("Trying to cause an InterruptedException with sleeping threads.");
        try {
            System.out.println("Trying something...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Got interrupted!");
        } finally {
            System.out.println("FINALLY! This always prints! ");
        }

        // Let's try multiple catch blocks
        System.out.println("\n=== Multiple Exceptions ===\n");
        System.out.println("Division by zero will cause ArithmeticException");
        System.out.println("Fix that and run the code again, should cause NullPointerException");
    
        try {
                int x = 1 / 0;  
                String s = null;
                s.length();    
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero!");
        } catch (NullPointerException e) {
            System.out.println("Found a null pointer!");
        }

        // Let's try our custom PetCatException
        // Trying to go to work without petting the cat!
        System.out.println("\n=== Custom Exception Example ===\n");
        System.out.println("We throw PetCatException and send the message: \n"
        + "\"Cat Error: \" + e.getMessage()\"");
        System.out.println("I just woke up, let's go to work!");
        try {
            goToWork(false); 
        } catch (PetCatException e) {
            System.out.println("Cat Error: " + e.getMessage());
        }
        
        System.out.println("\n Let's try that again...");
        System.out.println("*** Pet cat for 2 hours *** ");
        try {
            goToWork(true);
            System.out.println("Cat is happy. Have a great day at work!");
        } catch (PetCatException e) {
            System.out.println("Cat Error: " + e.getMessage());
        }
    }

    // Method that uses our custom exception
    private static void goToWork(boolean hasPettedCat) throws PetCatException {
        if (!hasPettedCat) {
            throw new PetCatException("You can't leave for work without petting the cat first!");
        }
    }
}