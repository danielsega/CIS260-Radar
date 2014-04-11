/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Application;

import Application.GameObject.BattleShip;
import Application.GameObject.Missile;
import Application.GameObject.Submarine;
import Logic.SceneNode;
import Logic.SpriteNode;
import java.util.ArrayList;

/**
 *
 * @author GW
 */
public class GameObjects {
    //--Main Object Holder
    public ArrayList<SpriteNode> gameObjects;
    
    public Submarine userSub;
    
    public GameObjects(){
        gameObjects = new ArrayList<>();
        initGameObjects();
        
        userSub = new Submarine("sub.png");
    }
    
    public void addToStack(SceneNode node){
    }
    
    private void initGameObjects(){
        gameObjects.add(userSub);
    }
    
    private void initGameSubmarines(){
        
    }
}
