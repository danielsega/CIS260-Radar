/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author dmattos18
 */
public class CommandQueue {
    private Queue<Command> mQueue;
    
    public CommandQueue(){
        mQueue = new LinkedList<Command>();
    }
    
    public CommandQueue(Command command){
        mQueue = new LinkedList<Command>();
        mQueue.add(command);
    }
    
    public void add(Command c){
        mQueue.add(c);
    }
    
    //--Retries and Remove
    public Command pool(){
        return mQueue.poll();
    }
    
    //--Retrieves and does not remove
    public Command peek(){
        return mQueue.peek();
    }
    
    public void remove(Command c){
        mQueue.remove(c);
    }
    
    public void removeHead(){
        mQueue.remove();
    }
    
    public boolean isEmpty(){
        return mQueue.isEmpty();
    }
    
    public void clear(){
        mQueue.clear();
    }
}
