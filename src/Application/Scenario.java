/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import Application.GameObject.Submarine;
import Logic.CommandManager;
import Logic.CommandQueue;

/**
 *
 * @author dmattos18
 */
//--Singlenton
public class Scenario {

    private static int counter;
    private CommandQueue mQueue;
    private CommandManager commandMgr;
    private Submarine sub;

    private Scenario() {
        counter = 0;
        mQueue = new CommandQueue();
        commandMgr = new CommandManager(mQueue);

        sub = new Submarine("sub.png");
    }

    public static Scenario getInstance() {
        if (counter == 0) {
            counter++;
            return new Scenario();
        } else {
            return null;
        }
    }
}
