/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import java.util.ArrayList;

/**
 *
 * @author dmattos18
 */
public class Application {
    private boolean running;
    ArrayList<GameState> game_states;
    
    Application(){
        running = true;
    }
    
    public void Init(){
    }
    public void cleanUp(){
    }
    
    public void handleEvents(){
    }
    public void update(){
    }
    public void draw(){
    }
    
    void changeState(GameState state){
        //
    }
    
    void pushState(){
    }
    void popState(){
    }
    
    public void quitApp(){
        running = false;
    }
    
    private boolean getRunning() {
        return running;
    }
}
