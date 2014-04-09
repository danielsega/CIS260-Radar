/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.awt.geom.Point2D;

/**
 *
 * @author dmattos18
 */
public class Entity extends Node{
    private int hp;

    private Point2D position;
    private Point2D velocity;
    
    Entity(int hitpoints)
    {
        this.hp = hitpoints;
        position = new Point2D.Float(0, 0);
        velocity = new Point2D.Float(0, 0);
    }
    
    void repair(int points){
        if(hp > 0)
            hp += points;
    }
    
    void damage(int points){
        if(this.hp > 0)
            hp -= points;
    }
    
    void destroy(){
        hp = 0;
    }
    
    final boolean isDestroyed(){
        if(hp <= 0)
            return true;
        else 
            return false;
    }
    
    public void update(){
        
    }
    
    //--Getters and Setters    
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    
    public Point2D getPosition() {
        return position;
    }

    public void setPosition(Point2D position) {
        this.position = position;
    }
    
    public void setPosition(float x, float y) {
        this.position.setLocation(x, y);
    }
    
    public Point2D getVelocity() {
        return velocity;
    }

    public void setVelocity(Point2D velocity) {
        this.velocity = velocity;
    }
    
     public void setVelocity(float x, float y) {
        this.velocity.setLocation(x, y);
    }
}
