/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import Logic.CommandManager;
import Logic.CommandQueue;

/**
 *
 * @author dmattos18
 */
//--Singlenton
public class Scenario {

    public CommandQueue mQueue;
    public CommandManager commandMgr;
    
    public GameObjects gameObj;

    public Scenario() {
        mQueue = new CommandQueue();
        gameObj = new GameObjects();
        commandMgr = new CommandManager(mQueue, gameObj);        
    }

}
