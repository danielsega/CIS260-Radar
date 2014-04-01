/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

/**
 *
 * @author dmattos18
 */
public class Application {
    private boolean running;
    
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
    
    public void quitApp(){
        running = false;
    }
    
    private boolean getRunning() {
        return running;
    }
}
