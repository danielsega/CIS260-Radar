/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.ArrayList;

/**
 *
 * @author dmattos18
 */

public class SceneNode{
    public int ID;
    
    private SceneNode parent;
    private ArrayList<SceneNode> children;

    public SceneNode() {
        ID = java.lang.System.identityHashCode(ID);
        parent=  null;
        children = new ArrayList<>();        
    }

    public void attachChild(SceneNode child){
        parent = this;
        children.add(child);
    }
    
    public void dettachChild(SceneNode child){
        for(SceneNode node : children){
            if(node == child){
                node.parent = null;
                children.clear();
            }
        }
    }
    
    public void update(){
         updateChildren();
    }
    
    public void updateChildren(){
        for(SceneNode node : children){
            node.update();
        }
    }
    
    public void draw(){
        drawChildren();
    }
    
    public void drawChildren(){
        for(SceneNode node : children){
            node.draw();
        }
    }
}
