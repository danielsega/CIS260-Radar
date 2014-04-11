/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Application.GameObject;

import Logic.SpriteNode;

/**
 *
 * @author GW
 */
public class Submarine extends SpriteNode {
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

    public final void init() {
        mMissile1 = new Missile();
        mMissile2 = new Missile();
        mMissile3 = new Missile();
        mMissile4 = new Missile();
        mMissile5 = new Missile();
        mMissile3 = new Missile();
        
        attachChild(mMissile1);
        attachChild(mMissile2);
        attachChild(mMissile3);
        attachChild(mMissile4);
        attachChild(mMissile5);
        attachChild(mMissile6);
        
        setVelocity(1, 1);
    }

    public void MoveForward(){
        double x = getPosition().getX() + getVelocity().getX();        
        getAt().setToTranslation(x, 0);
        setPosition(x, getPosition().getY());
    }
    
    public void MoveBackward(){
        double x = getPosition().getX() + getVelocity().getX();
        x *= -1;
        getAt().setToTranslation(x, 0);
        setPosition(x, getPosition().getY());
    }
    
    public void keepForward(int x){
        getAt().setToTranslation(x, getPosition().getY());
    }
    
    public void keepBackward(int x){
        x *= -1;
        getAt().setToTranslation(x, getPosition().getY());
    }
    
    public void Halt(){
        
    }
    
    public void Move(){
        
    }
    
    public void submerge(){
        getAt().setToTranslation(getPosition().getX(), getPosition().getY());
    }
}
