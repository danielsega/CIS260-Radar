/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Application.GameObject;

import Logic.SpriteNode;
import java.awt.geom.AffineTransform;

/**
 *
 * @author GW
 */
public class Submarine extends SpriteNode {
    //--Game Objects
    private Missile mMissile1;
    private Missile mMissile2;
    private Missile mMissile3;
    private Missile mMissile4;
    private Missile mMissile5;
    private Missile mMissile6;
    //--TODO: Balistic
    private AffineTransform mAt;
    
    public Submarine(String name) {
        super(name);
        init();
    }

    public final void init() {
        setVelocity(1, 1);
        mAt = getAt();
        mAt.setToTranslation(0, 120);
        setAt(mAt);
        setPosition(mAt.getTranslateX(), mAt.getTranslateY());
     
        mMissile1 = new Missile("missile.png");
        mMissile2 = new Missile("missile.png");
        mMissile3 = new Missile("missile.png");
        mMissile4 = new Missile("missile.png");
        mMissile5 = new Missile("missile.png");
        mMissile3 = new Missile("missile.png");
        
        mMissile1.setPosition(getPosition().getX(), getPosition().getY());
        attachChild(mMissile1);
        //mMissile2.setPosition(getPosition().getX(), getPosition().getY());
        attachChild(mMissile2);
        //mMissile3.setPosition(getPosition().getX(), getPosition().getY());
        attachChild(mMissile3);
        //mMissile4.setPosition(getPosition().getX(), getPosition().getY());
        attachChild(mMissile4);
        //mMissile5.setPosition(getPosition().getX(), getPosition().getY());
        attachChild(mMissile5);
        //mMissile6.setPosition(getPosition().getX(), getPosition().getY());
        attachChild(mMissile6);
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
        setPosition(getPosition().getX(), getPosition().getY() * 2);
        getAt().setToTranslation(getPosition().getX(), getPosition().getY());
    }
    
    public Missile getmMissile1() {
        return mMissile1;
    }

    public Missile getmMissile2() {
        return mMissile2;
    }

    public Missile getmMissile3() {
        return mMissile3;
    }

    public Missile getmMissile4() {
        return mMissile4;
    }

    public Missile getmMissile5() {
        return mMissile5;
    }

    public Missile getmMissile6() {
        return mMissile6;
    }
}
