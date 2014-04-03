/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import java.awt.Graphics;

/**
 *
 * @author dmattos18
 */
public interface IApplication {
    public abstract void init();
    public abstract void cleanUp();
    
    public abstract void handleEvents();
    public abstract void update();
    public abstract void draw();
}
