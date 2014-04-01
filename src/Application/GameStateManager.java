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
    ArrayList<GameState> gsm;
    
    public GameStateManager() {
        
    }
    
    enum States{
        SPLASH, MENU, MAIN, COMBAT, CONVOY
    }
}
