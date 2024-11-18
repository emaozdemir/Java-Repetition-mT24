import java.util.LinkedList;
import java.util.Queue;

// Queue - When Order of Processing Matters (FIFO - First In, First Out)

/* Use Queue when you need:
1. FIFO (First In, First Out) behavior
2. Process elements in the order they were added
3. Managing tasks, requests, or any sequential processing
*/

/* 
 * Queue is an interface, so we need to use a class that implements Queue.
 * LinkedList is commonly used as it implements both Queue and Deque interfaces.
 * Other implementations include PriorityQueue (which orders elements by priority (think of a hospital)).
 */

public class QueueUsage {
    public static void main(String[] args) {
        // Creating our Queue
        Queue<String> printQueue = new LinkedList<>();
        
        // Adding elements to our queue using offer()
        // Note: add() also exists but offer() is preferred as it returns false if full
        System.out.println("=== Adding print jobs to queue ===");
        printQueue.offer("homework.pdf");
        printQueue.offer("cat_pictures.jpg");
        printQueue.offer("important_document.doc");
        
        // Peek at the first element (without removing it)
        System.out.println("\nNext document to print: " + printQueue.peek());
        
        System.out.println("\n=== Processing print queue ===");
        while (!printQueue.isEmpty()) {
            // poll() removes and returns the head of the queue
            // Note: remove() also exists but poll() is preferred as it returns null if empty
            String document = printQueue.poll();
            System.out.println("Printing: " + document);
            System.out.println("Documents remaining in queue: " + printQueue.size());
        }
        
        // Let's try some error handling examples
        System.out.println("\n=== Error handling examples ===");
        
        // Trying to peek at an empty queue
        System.out.println("Peeking empty queue: " + printQueue.peek()); // Returns null
        
        // Trying to poll from an empty queue
        System.out.println("Polling empty queue: " + printQueue.poll()); // Returns null
        
        // Let's demonstrate the difference between offer/add and poll/remove
        Queue<String> smallQueue = new LinkedList<>();
        
        // Using offer (preferred method)
        System.out.println("\n=== Using offer() ===");
        System.out.println("Adding 'first.txt': " + smallQueue.offer("first.txt")); 
        
        // Using poll (preferred method)
        System.out.println("\n=== Using poll() vs remove() ===");
        System.out.println("Polling first element: " + smallQueue.poll()); 
        System.out.println("Polling empty queue: " + smallQueue.poll());
        
        try {
            // Using remove() on empty queue - will throw exception
            smallQueue.remove();
        } catch (Exception e) {
            System.out.println("Exception when using remove() on empty queue: " + e.getClass().getSimpleName());
        }
        
        // Practical example: Processing customer support tickets
        System.out.println("\n=== Customer Support Queue Example ===");
        Queue<String> supportQueue = new LinkedList<>();
        
        supportQueue.offer("User can't login");
        supportQueue.offer("Printer not responding");
        supportQueue.offer("Network connection issues");
        
        System.out.println("Current support tickets: " + supportQueue);
        System.out.println("Next ticket to handle: " + supportQueue.peek());
        
        // Process highest priority ticket
        String currentTicket = supportQueue.poll();
        System.out.println("Processing ticket: " + currentTicket);
        System.out.println("Remaining tickets: " + supportQueue);
    }
}