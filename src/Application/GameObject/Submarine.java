/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Application.GameObject;

import Application.IApplication;
import Logic.SpriteNode;

/**
 *
 * @author GW
 */
public class Submarine extends SpriteNode implements IApplication{
    //--Game Objects
    Missile mMissile1;
    Missile mMissile2;
    Missile mMissile3;
    Missile mMissile4;
    Missile mMissile5;
    Missile mMissile6;
    //--TODO: Balistic
    
    public Submarine(String name) {
        super(name);
        init();
    }

    @Override
    public final void init() {
        mMissile1 = new Missile();
        mMissile2 = new Missile();
        mMissile3 = new Missile();
        mMissile4 = new Missile();
        mMissile5 = new Missile();
        mMissile3 = new Missile();
    }

    @Override
    public void cleanUp() {
    }

    @Override
    public void handleEvents() {
    }
    
    @Override
    public void update(){
        
    }
    
    @Override
    public void draw(){
        
    }
    
    public void MoveForward(){
        
    }
    
    public void MoveBackward(){
        
    }
    
    public void Halt(){
        
    }
    
    public void Move(){
        
    }
    
    public void submerge(){
        
    }
}
