// ExceptionsDemo.java

/*
 * This class demonstrates different types of Exceptions in Java and how to handle them.
 * This code was generated using Claude.ai and has only gone through minor revisions. 
 * If you just want to look at the basics of Exceptions, check out "ExceptionsDemo.java"
 * 
 * Key concepts covered:
 * 1. Checked vs Unchecked Exceptions
 * 2. Try/Catch blocks
 * 3. Finally clause
 * 4. Creating custom exceptions
 * 5. Exception call stack
 * 6. Multiple catch blocks
 */
package Exceptions;

 import java.io.File;
 import java.io.FileReader;
 import java.io.IOException;
 import java.util.Scanner;
 
 // First, let's create our own custom Exception class, we'll use this later.
 class CoffeeMachineException extends Exception {
     public CoffeeMachineException(String message) {
         super(message);
     }
 }
 
 public class ExceptionsDemoAdvanced {
     public static void main(String[] args) {
         ExceptionsDemoAdvanced demo = new ExceptionsDemoAdvanced();
         
         System.out.println("=== Welcome to the Exception Demo! ===\n");
         
         // 1. Demonstrating Unchecked (Runtime) Exception
         System.out.println("1. Demonstrating Unchecked Exceptions:");
         demo.demonstrateUnchecked();
         
         // 2. Demonstrating Checked Exception
         System.out.println("\n2. Demonstrating Checked Exceptions:");
         demo.demonstrateChecked();
         
         // 3. Demonstrating try-catch-finally
         System.out.println("\n3. Demonstrating try-catch-finally:");
         demo.demonstrateTryCatchFinally();
         
         // 4. Demonstrating custom exceptions
         System.out.println("\n4. Demonstrating Custom Exceptions:");
         demo.demonstrateCustomException();
         
         // 5. Demonstrating multiple catch blocks
         System.out.println("\n5. Demonstrating Multiple Catch Blocks:");
         demo.demonstrateMultipleCatch();
     }
     
     // Demonstration of Unchecked (Runtime) Exceptions
     // This will cause ArrayIndexOutOfBoundsException
     private void demonstrateUnchecked() {
         try {
             int[] numbers = {1, 2, 3};
             System.out.println(numbers[5]); 
         } catch (ArrayIndexOutOfBoundsException e) {
             System.out.println("Caught an unchecked exception: " + e.getMessage());
             System.out.println("This type of exception doesn't need to be declared with throws!");
         }
     }
     
     // Checked Exception - IOException
     private void demonstrateChecked() {
         try {
             FileReader file = new FileReader("nonexistent.txt");
         } catch (IOException e) {
             System.out.println("Caught a checked exception: " + e.getMessage());
             System.out.println("This type of exception MUST be handled or declared!");
         }
     }
     
     // Demonstration of try-catch-finally
     // This could throw InterruptedException
     private void demonstrateTryCatchFinally() {
         Scanner scanner = new Scanner(System.in);
         try {
             System.out.println("Try block: Simulating some work...");
             Thread.sleep(1000); 
         } catch (InterruptedException e) {
             System.out.println("Catch block: Something went wrong!");
         } finally {
             System.out.println("Finally block: This always executes!");
             scanner.close();
         }
     }
     
     // Demonstration of custom exceptions
     private void demonstrateCustomException() {
         try {
             makeCoffee(false);
         } catch (CoffeeMachineException e) {
             System.out.println("Coffee machine error: " + e.getMessage());
         }
     }
     
     private void makeCoffee(boolean waterAvailable) throws CoffeeMachineException {
         if (!waterAvailable) {
             throw new CoffeeMachineException("Out of water!");
         }
         System.out.println("Coffee is ready!");
     }
     
     // Demonstration of multiple catch blocks
     private void demonstrateMultipleCatch() {
         try {
             // This code might throw different types of exceptions
             String str = null;
             File file = new File("nonexistent.txt");
             
             if (Math.random() < 0.5) {
                 str.length(); // Will throw NullPointerException
             } else {
                 new FileReader(file); // Will throw IOException
             }
             
         } catch (NullPointerException e) {
             System.out.println("Caught NullPointerException: " + e.getMessage());
             
             // Demonstrating stack trace
             System.out.println("\nStack Trace Example:");
             e.printStackTrace();
             
         } catch (IOException e) {
             System.out.println("Caught IOException: " + e.getMessage());
             
         } catch (Exception e) {
             // Catch-all for any other exceptions
             System.out.println("Caught generic Exception: " + e.getMessage());
         }
         System.out.println("extra");
     }
 }