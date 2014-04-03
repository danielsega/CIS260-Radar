package Application;

/**
 * @author dmattos18
 */

//--Abstract class to handle change of state
public abstract class GameState {
    protected GameStateManager gsm;
    
    public abstract void init();
    public abstract void cleanUp();
    
    public abstract void handleEvents();
    public abstract void update();
    public abstract void draw();
}//--End of GameState
