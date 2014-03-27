/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author dmattos18
 */
public class Node implements INode{
    //--Data Members
    private Node mParent;
    private ArrayList<Node> mChildren;
    private int nodeID;
    
    Node()
    {
        mParent = null;
        nodeID = 0;
    }
    
    public void attachChild(Node child)
    {
        child.mParent = this;
        child.nodeID = mParent.nodeID + 1;
        mChildren.add(child);
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
