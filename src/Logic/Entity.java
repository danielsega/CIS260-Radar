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
public class Entity {
    Point2D position;
    Point2D velocity;
    
    Entity()
    {
        position = new Point2D.Float(0, 0);
        velocity = new Point2D.Float(0, 0);
    }
    
    public Point2D getPosition() {
        return position;
    }

    public void setPosition(Point2D position) {
        this.position = position;
    }

    public Point2D getVelocity() {
        return velocity;
    }

    public void setVelocity(Point2D velocity) {
        this.velocity = velocity;
    }
}
