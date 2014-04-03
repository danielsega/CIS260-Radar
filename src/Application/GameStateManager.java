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
    private short currentState;
    
    public static class StatesID{      
        public final static short SPLASH = 0;
        public final static short MENU = 1;
        public final static short GAME = 2;
        public final static short COMABT = 3;
        public final static short CONVOY = 4;
    }
    
    public GameStateManager() {
        states = new ArrayList<>();        
        
        currentState = StatesID.SPLASH;
        states.add(new StateMainGame());
    }
       
    public void changeState(short id){
        currentState = id;
        states.get(id).init();
    }
    
    public void pushState(GameState state){
        this.states.add(state);
    }
    
    public void popState(short id){
        this.states.remove(id);
    }
    
    public void handleEvents(){
        this.states.get(currentState).handleEvents();
    }
    
    public void update(){
        states.get(currentState).update();
    }
    
    public void draw(){
        states.get(currentState).draw();
    }
}
