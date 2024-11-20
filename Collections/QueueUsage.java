import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;

// Queue - When Order of Processing Matters!

/* Use Queue when you need:
1. FIFO (First In, First Out) behavior
2. Process elements in order they arrived
3. Handle tasks one at a time
*/

/* 
 * Queue is an interface, so we can't instantiate "Queue"
 * We often use LinkedList or PriorityQueue
 * LinkedList - Normal queue, first in first out
 * PriorityQueue - Orders elements by priority
 */

public class QueueUsage {
    public static void main(String[] args) {
        // Let's create a queue to handle customers at a coffee shop
        Queue<String> customerQueue = new LinkedList<>();
        
        // Adding customers to our queue
        customerQueue.offer("Stina-Kalle");   // First in
        customerQueue.offer("Bobby");     
        customerQueue.offer("Chad"); 

        // Let's see who's first in line
        // We use peek, which shows us the first customer,
        // it doesn't remove the customer from the list. 
        System.out.println("Next customer: " + customerQueue.peek());

        // Time to serve our customers, we now use poll,
        // which returns AND removes the first customer in our line. 
        while (!customerQueue.isEmpty()) {
            String customer = customerQueue.poll();
            System.out.println("Now serving: " + customer);
        }

        // Let's try a PriorityQueue for a hospital emergency room
        // PriorityQueue will automatically sort by priority (1 = most urgent)
        Queue<Patient> emergencyRoom = new PriorityQueue<>();

        // We create some patients that we add to a priority queue 
        // Note the priorityLevel 
        // When we have more than 1 patient at the highest prio the one added first will be the first one

        emergencyRoom.offer(new Patient("Gusten", 3));    // Onion-induced teary eyes. 
        emergencyRoom.offer(new Patient("Mac Donald", 1));  // Heart attack (high priority)
        emergencyRoom.offer(new Patient("Charlie", 2)); // Scratched by cat 
        emergencyRoom.offer(new Patient("Mr.Goblin", 1)); // Hospital Owner (stubbed toe) (high prio)
        emergencyRoom.offer(new Patient("Karen", 4)); // Asked to speak to the manager

        System.out.println("\nTreating emergency room patients:");
        while (!emergencyRoom.isEmpty()) {
            Patient patient = emergencyRoom.poll();
            System.out.println("Treating " + patient.name + " (Priority level: " + patient.priorityLevel + ")");
        }
    }
}

// We create a Patient class for our priority queue example.

class Patient implements Comparable<Patient> {
    String name;
    int priorityLevel;

    public Patient(String name, int priorityLevel) {
        this.name = name;
        this.priorityLevel = priorityLevel;
    }

    @Override
    public int compareTo(Patient other) {
        return this.priorityLevel - other.priorityLevel;
    }
}