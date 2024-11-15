// A drawable object can be rendered on screen

import java.io.Closeable;
import java.io.Serializable;
import java.util.List;

interface Drawable {
    void draw();
}

// A movable object can change its position
interface Movable {
    void moveLeft();
    void moveRight();
    void moveUp();
    void moveDown();
}

// A resizable object can change its dimensions
interface Resizable {
    void setSize(int width, int height);
    void scale(double factor);
}

// A game sprite needs all these capabilities
class GameSprite implements Drawable, Movable, Resizable {
    private int x, y;
    private int width, height;
    
    // Implementing Drawable
    @Override
    public void draw() {
        System.out.println("Drawing sprite at " + x + "," + y);
    }
    
    // Implementing Movable
    @Override
    public void moveLeft() { x--; }
    
    @Override
    public void moveRight() { x++; }
    
    @Override
    public void moveUp() { y--; }
    
    @Override
    public void moveDown() { y++; }
    
    // Implementing Resizable
    @Override
    public void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    @Override
    public void scale(double factor) {
        this.width *= factor;
        this.height *= factor;
    }
}


// Different use cases for the same GameSprite object
public class Game {
    public void renderAll(List<Drawable> drawables) {
        for(Drawable d : drawables) {
            d.draw();  // GameSprite can be used here
        }
    }
    
    public void moveObjects(List<Movable> movables) {
        for(Movable m : movables) {
            m.moveRight();  // GameSprite can be used here too
        }
    }
    
    public void resizeAll(List<Resizable> resizables, double factor) {
        for(Resizable r : resizables) {
            r.scale(factor);  // And here!
        }
    }
    
    public void main() {
        GameSprite sprite = new GameSprite();
        
        // The same sprite object can be used in all these contexts
        List<Drawable> drawables = List.of(sprite);
        List<Movable> movables = List.of(sprite);
        List<Resizable> resizables = List.of(sprite);
        
        renderAll(drawables);
        moveObjects(movables);
        resizeAll(resizables, 1.5);
    }
}


class Button implements Clickable, Drawable, Animated {
    // A button needs to be drawn, handle clicks, and show animations
}

class FileHandler implements Readable, Writable, Closeable {
    // A file handler needs to read, write, and be safely closed
}

class UserRecord implements Serializable, Comparable<UserRecord>, Cloneable {
    // A user record needs to be saved to disk, compared, and copied
}




abstract class Vehicle {
    protected String make;
    protected String model;
}

class Car extends Vehicle {
    private int numDoors;
}

abstract class Animal {
    protected String name;
    protected int age;
}

class Dog extends Animal {
    private String breed;
}

// Interface that allows treating both hierarchies as the same type
interface Trackable {
    String getId();
    Location getLocation();
    void updateLocation(Location newLocation);
}

// Now both hierarchies can be tracked in the same system
class TrackableCar extends Car implements Trackable {
    private String trackingId;
    private Location currentLocation;
    
    @Override
    public String getId() { return trackingId; }
    
    @Override
    public Location getLocation() { return currentLocation; }
    
    @Override
    public void updateLocation(Location newLocation) {
        this.currentLocation = newLocation;
    }
}

class TrackableDog extends Dog implements Trackable {
    private String trackingId;
    private Location currentLocation;
    
    // Same implementation as TrackableCar
}

// Single system can track both cars and dogs
class TrackingSystem {
    public void track(List<Trackable> items) {
        for (Trackable item : items) {
            System.out.println("Tracking " + 
                            item.getId() + " at " 
                            + item.getLocation());
        }
    }
}



// Array declaration and initialization
// datatype[] name = new datatype[size];
int[] numbers = new int[5];
String[] names = {"Anna", "Erik", "Maria"};

//2D Array of integers - 3 Rows, 5 Columns
int[][] matrix = new int[3][5];
for (int[] row : matrix) {
    System.out.println();
    for (int number : row) {
        System.out.print(number);
    }
}


// Fixed size
String[] names = new String[3];
// Cannot resize after creation

// No built-in methods for common operations
names[0] = "Anna";
names[1] = "Erik";
// No simple way to insert/remove elements

// No type safety with Object arrays
// Risky! 
Object[] objects = new Object[3];
objects[0] = "String";
objects[1] = 42;  

// Array full? Create new array and copy elements...
String[] newNames = new String[names.length * 2];
System.arraycopy(names, 0, newNames, 0, names.length);

