/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

/**
 *
 * @author dmattos18
 */
public interface IApplication {
    public void Init();
    public void cleanUp();
    
    public void handleEvents();
    public void update();
    public void draw();
}
