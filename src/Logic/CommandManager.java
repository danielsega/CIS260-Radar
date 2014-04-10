/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

//Invoker
public class CommandManager {
    CommandQueue mQueue;
    ICommand command;
    ICommand lastCommand;

    public CommandManager(CommandQueue queue) {
        mQueue = queue;
    }

    public void HandleCommands(){
        while(!mQueue.isEmpty()){
            
            if(mQueue.peek() == null){
                mQueue.removeHead();
            }
            
            command = mQueue.pool();
            command.action();
            lastCommand = command;
        }
    }
    
    public void setCommand(ICommand c) {
        command = c;
    }

    public void executeCommnad() {
        command.action();
        lastCommand = command;
    }

    public void undo() {
        lastCommand.action();
    }
}
