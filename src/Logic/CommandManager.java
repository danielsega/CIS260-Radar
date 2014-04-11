/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

//Invoker


import Application.GameObjects;

public class CommandManager {
    GameObjects mStack;
    CommandQueue mQueue;
    Command command;

    public CommandManager(CommandQueue queue, GameObjects stack) {
        mQueue = queue;
        mStack = stack;
    }

    public void HandleCommands(){
        while(!mQueue.isEmpty()){
            
            if(mQueue.peek() == null){
                mQueue.removeHead();
            }
            
            
            command = mQueue.pool();
            
            command.action();
        }
    }
    
    public void setCommand(Command c) {
        command = c;
    }

    public void executeCommnad() {
        command.action();
    }

}
