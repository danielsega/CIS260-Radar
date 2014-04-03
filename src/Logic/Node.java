/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author dmattos18
 */
public abstract class Node{
    //--Data Members
    private Node mParent;
    private Node mChildren;
    private int nodeID;
    private static int IDCounter;
    
    Node()
    {
        IDCounter = 0;
        mParent = null;
        mChildren = null;
    }
    
    public void attachChild(Node child)
    {
        IDCounter++;
        child.mParent = this;
        child.nodeID = Node.IDCounter;
        mChildren = child;
    }
    
    public void dettachChild(Node child)
    {
        
    }
    
    public void update(/*Delta time*/)
    {
        
    }
    
    public void draw()
    {
        
    }
}
