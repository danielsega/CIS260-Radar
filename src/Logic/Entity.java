/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author dmattos18
 */
public class Entity {
    private Vector2d mVelocity;
    private Vector2d mPosition;
    //Damage
    //HP
    
    Entity()
    {
    }
    
    public void setVelocity(float x, float y)
    {
        mVelocity.setX(x);
        mVelocity.setY(y);
    }
    
    public void setVelocity(Vector2d vec)
    {
        mVelocity = vec;
    }
    
    public Vector2d getVelocity()
    {
        return mVelocity;
    }
    
    public void setPosition(float x, float y)
    {
        mPosition.setX(x);
        mPosition.setY(y);
    }
    
    public void setPosition(Vector2d vec)
    {
        mVelocity = vec;
    }
    
    public Vector2d getPosition()
    {
        return mPosition;
    }
}
