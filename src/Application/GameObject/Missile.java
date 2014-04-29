/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Application.GameObject;

/**
 *
 * @author dmattos18
 */

public class Missile extends Projectile{
    //--TODO: Time Stamp
    private boolean fired;
    private double movingX;
    
    public Missile() {
        init();
    }
    
    public Missile(String name) {
        super(name);
        init();
    }
    
    public void FireMissile(){
        setVisible();
        fired = true;
        getAt().setToTranslation(getPosition().getX(), getPosition().getY());
        setPosition(getPosition().getX(), getPosition().getY());
    }
    
    public void keepForward(){
        movingX++;
        movingX*=1.03;
        getAt().setToTranslation(movingX, getPosition().getY());
    }
    
    private void init(){
        setVelocity(1, 1);
        setInvisible();
        fired = false;
        movingX = getPosition().getX();
    }

    public double getMovingX() {
        return movingX;
    }
    
    public boolean isFired() {
        return fired;
    }

    public void setFired(boolean fired) {
        this.fired = fired;
    }
}
