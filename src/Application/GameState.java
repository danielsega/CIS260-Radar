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
    protected GameState(){
        
    }
    public abstract void Init();
    public abstract void cleanUp();
    
    public abstract void handleEvents(Application app);
    public abstract void update(Application app);
    public abstract void draw(Application app);
}
