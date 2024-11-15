package Basics; 

public class Variables {
    public static void main(String[] args){
        // type name = value; 
        //Variable declarations
        int number = 42; // Skapar en variabel av typ int med namn number som tilldelas värdet 42. 
        String text = "Hello World!"; // String är speciell
        double pi_decimals = 3.14159265358979323846264338327950288419716939; // osv...

        // Simple operations
        String combineStrings = text + "\nYou're All-Stars!"; // concatenate strings
        int numberMultiplied = number * number;
        double pi_decimalsOperations = pi_decimals + 3.14 - 12.1 / 3.0 + pi_decimals % 1.11; // * Why is this bad? 

        // Printing new line and same line
        System.out.println("combineString: " + combineStrings);
        System.out.println(numberMultiplied);
        System.out.print("Pi decimals: " + pi_decimals + " ...");
        System.out.print(" Pi decimals with a bunch of operations: " + pi_decimalsOperations);
        
        // More on why * is bad
        System.out.println(pi_decimals + 3.14 - (12.1 / 3.0 + (pi_decimals % 1.11)));
        System.out.println(pi_decimals + 3.14 - 12.1 / 3.0 + pi_decimals % 1.11);
        System.out.println(pi_decimals + 3.14 - (12.1 / 3.0 + pi_decimals % 1.11));
        System.out.println(pi_decimals + (3.14 - 12.1 / 3.0) + pi_decimals % 1.11);
        System.out.println(pi_decimals * (3.14 - 12.1) / 3.0 + pi_decimals % 1.11);
        System.out.println(pi_decimals * (3.14 - 12.1 / 3.0) + pi_decimals % 1.11);
        System.out.println(pi_decimals * 3.14 - 12.1 / 3.0 + pi_decimals % 1.11);
    }
}

/*
Key Operators:
    Arithmetic: +, -, *, /, %
    Comparison: ==, !=, >, <, >=, <=
    Logical: &&, ||, ! 
*/
