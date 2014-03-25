/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author dmattos18
 */

//--This is vector 2d class
public class Vector2d {
    private float x;
    private float y;
    
    Vector2d()
    {
        x = 0;
        y = 0;
    }
    
    Vector2d(float x, float y)
    {
        this.x = x;
        this.y = y;        
    }
    
    Vector2d(Vector2d vec)
    {
        this.x = vec.x;
        this.y = vec.y;
    }
    
    void setX(float x)
    {
        this.x = x;
    }
    
    void setY(float y)
    {
        this.y = y;
    }
    
    float getX()
    {
        return x;
    }
    
    float getY()
    {
        return y;
    }
    
    Vector2d add(Vector2d other)
    {
        this.x += other.x;
        this.y += other.y;
        return this;
    }
    
    Vector2d sub(Vector2d other)
    {
        this.x -= other.x;
        this.y -= other.y;
        return this;
    }
    
    @Override
    public String toString()
    {
        return ("Vector 2D.X value is: " + x + "Vector 2D.Y value is: " + y);        
    }
    
    float cross(Vector2d vec)
    {
        return ((x * vec.y) - (y * vec.x));
    }
    
    Vector2d crossProduct(Vector2d vec)
    {
        this.x = x* vec.y;
        this.y = y* vec.x;
        return this;        
    }
    
    float dot(Vector2d vec)
    {
        return ((vec.x * x) - (vec.y * y));
    }
    
    Vector2d dotProduct(Vector2d vec)
    {
        this.x *= vec.x;
        this.y *= vec.y;
        return this;
    }
    
    Vector2d scale(double amount)
    {
        this.x *= amount;
        this.y *= amount;
        return this;
    }
}
