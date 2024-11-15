package Classes.Interface;

public class GameConsole implements Playable{
    
    @Override
    public void play(){
        // Logic to play a game
    }

    @Override
    public void pause(){
        // Logic to pause a game when the user 
        // to goes to console menu
    }

    @Override
    public void stop(){
        // Logic to stop playing a game
    }
}


