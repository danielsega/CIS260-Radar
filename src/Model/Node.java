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
    
    Node()
    {
        mParent = null;
    }
    
    public void attachChild(Node child)
    {
        child.mParent = this;
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
