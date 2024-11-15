# Interfaces
Use when...  
___
## Primary Use Cases
``` 
I. Defining a contract for behavior without implementation details  
II. When classes need to support multiple types  
III. When different classes need to be treated as the same type despite different hierarchies  
IV. When focusing on WHAT an object can do, not HOW it does it  
```
___  
## Example Scenario
```java
// Good Interface Example
interface Playable {
    void play();
    void pause();
    void stop();
}

// Multiple classes can implement this interface
class MusicPlayer implements Playable {
    // Implementation for music
}

class VideoPlayer implements Playable {
    // Implementation for video
}

class GameConsole implements Playable {
    // Implementation for games
}
```

## When to Choose Interfaces
```
I. You want to define common behavior across unrelated classes  
II. You need to support multiple inheritance  
III. You're designing an API that others will implement  
IV. You want to ensure loose coupling between components  
```