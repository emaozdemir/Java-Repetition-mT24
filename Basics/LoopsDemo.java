package Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This class demonstrates different types of loops in Java and their appropriate use cases.
 */
public class LoopsDemo {

    public static void main(String[] args) {
        demonstrateForLoops();
        demonstrateWhileLoops();
        demonstrateDoWhileLoop();
        demonstrateCommonMistakes();
    }

    /*
     * Demonstrates different types of for loops and their use cases
     */
    private static void demonstrateForLoops() {
        System.out.println("\n=== FOR LOOP DEMONSTRATIONS ===");
        
        // Example 1: Basic counting
        System.out.println("\n1. Basic counting with for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        // Example 2: Array iteration
        System.out.println("\n2. Array iteration with traditional for loop:");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Array index " + i + ": " + numbers[i]);
        }

        // Example 3: Enhanced for loop with collection
        System.out.println("\n3. Collection iteration with enhanced for loop:");
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }

    /*
     * Demonstrates while loops and their use cases
     */
    private static void demonstrateWhileLoops() {
        System.out.println("\n=== WHILE LOOP DEMONSTRATIONS ===");

        // Example 1: Basic countdown
        System.out.println("\n1. Countdown with while loop:");
        int countdown = 5;
        while (countdown > 0) {
            System.out.println("Time remaining: " + countdown);
            countdown--;
        }

        // Example 2: Conditional processing
        System.out.println("\n2. Processing with condition:");
        int number = 1;
        while (number < 100) {
            System.out.println("Current number: " + number);
            number *= 2; // Double the number each time
        }
    }

    /*
     * Demonstrates do-while loop with a menu system
     */
    private static void demonstrateDoWhileLoop() {
        System.out.println("\n=== DO-WHILE LOOP DEMONSTRATION ===");
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nSimple Menu:");
            System.out.println("1. Say Hello");
            System.out.println("2. Say Goodbye");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1 -> System.out.println("Hello!");
                case 2 -> System.out.println("Goodbye!");
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 0);
        scanner.close();
    }

    /*
     * Demonstrates common loop mistakes and their corrections
     */
    private static void demonstrateCommonMistakes() {
        System.out.println("\n=== COMMON MISTAKES AND CORRECTIONS ===");

        int[] array = {1, 2, 3, 4, 5};

        // Mistake 1: Infinite loop due to missing increment
        System.out.println("\n1. Missing Increment Fix:");
        System.out.println("Wrong:");
        System.out.println("for (int i = 0; i < 10; ) { // Missing i++ }");
        System.out.println("Correct:");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }

        // Mistake 2: Array bounds
        System.out.println("\n\n2. Array Bounds Fix:");
        System.out.println("Wrong:");
        System.out.println("for (int i = 0; i <= array.length; i++) // Causes IndexOutOfBounds");
        System.out.println("Correct:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // Mistake 3: Infinite while loop fix
        System.out.println("\n\n3. Infinite While Loop Fix:");
        System.out.println("Wrong:");
        System.out.println("while (true) { // No exit condition }");
        System.out.println("Correct:");
        int count = 0;
        while (count < 5) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println();
    }
}

