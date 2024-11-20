import java.util.HashMap;

public class MapUsage {

    public static void main(String[] args) {
        
        // Creating our HashMap
        // Just like with Set, Map is an interface, so we can't instantiate "Map"
        // Note that we are also using "Integer", not "int", since we can't use 
        // primitive types (Integer is called a wrapper class)
        HashMap<String, Integer> employeeIds = new HashMap<>(); 

        employeeIds.put("Stina-Kalle", 1);
        employeeIds.put("Max", 9201);
        employeeIds.put("Sofia", 8723);
        
        System.out.println(employeeIds); // Note that our ordering differs from how we added them. 

        // Let's get Stina-Kalles ID 
        System.out.println("ID of employee: " + employeeIds.get("Stina-Kalle"));

        // Let's see if Benny is employed (nope... false)
        System.out.println(employeeIds.containsKey("Benny"));

        // Let's see if we have an employee with ID 9201 (true)
        System.out.println(employeeIds.containsValue(9201));

        // What if we add a duplicate key? Let's try to add "Max" but with a different ID!
        employeeIds.put("Max", 1010);

        // Max now has the ID 1010 instead. 
        System.out.println("Max ID is now: " + employeeIds.get("Max"));

        /*We can also use "replace" instead of "put". The difference being that if we use 
         replace and there is no key with the value we are replacing, it will not be added
        to our HashMap. 
        */
        employeeIds.replace("Benny", 123); 

        // Still false!
        System.out.println(employeeIds.containsKey("Benny")); 

        // Another example is using putIfAbsent which will only add the key, value pair if
        // it is not already in our HashMap: 
        employeeIds.putIfAbsent("Benny", 123);
        employeeIds.putIfAbsent("Max", 999); // <-- Won't be changed
        System.out.println("Benny's ID: " + employeeIds.get("Benny"));
        System.out.println("Max ID: " + employeeIds.get("Max"));

        // Let's fire Benny, he's a burden to our company! 
        employeeIds.remove("Benny"); 

    }
}
