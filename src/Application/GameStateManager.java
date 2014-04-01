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
public class GameStateManager {
    private ArrayList<GameState> states;
    private GameState mState;
    /*public enum States{
        SPLASH, MENU, MAIN, COMBAT, CONVOY
    }*/
    
    public static short SPLASH = 0;
    public static short MENU = 1;    
    public static short MAIN = 2;    
    public static short COMBAT = 3;    
    public static short CONVOY = 4;
    
    public GameStateManager() {
        
    }
       
    public void changeState(GameState state){
        mState = state;
    }
    
    public void pushState(GameState state){
        this.states.add(state);
    }
    
    public void popState(){
        this.states.clear();
    }
}
