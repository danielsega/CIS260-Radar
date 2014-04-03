/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

/**
 *
 * @author dmattos18
 */
public abstract class GameState {
    protected GameStateManager gsm;
    
    public abstract void init();
    public abstract void cleanUp();
    
    public abstract void handleEvents();
    public abstract void update();
    public abstract void draw();
}
