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
    private Queue<ICommand> mQueue;
    
    public CommandQueue(){
        mQueue = new LinkedList<ICommand>();
    }
    
    public CommandQueue(ICommand command){
        mQueue = new LinkedList<ICommand>();
        mQueue.add(command);
    }
    
    public void add(ICommand c){
        mQueue.add(c);
    }
    
    //--Retries and Remove
    public ICommand pool(){
        return mQueue.poll();
    }
    
    //--Retrieves and does not remove
    public ICommand peek(){
        return mQueue.peek();
    }
    
    public void remove(ICommand c){
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
