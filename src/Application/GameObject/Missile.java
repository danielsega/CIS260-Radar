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
        fired = true;
        System.err.println("Fired");
        double x = getPosition().getX() + getVelocity().getX();        
        getAt().setToTranslation(x, 0);
        setPosition(x, getPosition().getY());
    }
    
    public void keepForward(){
        movingX*=1.03;
        getAt().setToTranslation(movingX, getPosition().getY());
    }
    
    private void init(){
        setVelocity(1, 1);
        fired = false;
        movingX = 1;
    }
    
    public boolean isFired() {
        return fired;
    }

    public void setFired(boolean fired) {
        this.fired = fired;
    }
}
