/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author GW
 */
public class SpriteNode extends Entity {

    private Image image;
    private AffineTransform at;
    private String fileName;

    public SpriteNode() {
        try {
            image = ImageIO.read(this.getClass().getResource("/Assets/placeholder.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(SpriteNode.class.getName()).log(Level.SEVERE, null, ex);
        }
        at = new AffineTransform();
    }

    public SpriteNode(String name) {
        fileName = "/Assets/" + name;
        try {
            image = ImageIO.read(this.getClass().getResource(fileName));
        } catch (IOException ex) {
            Logger.getLogger(SpriteNode.class.getName()).log(Level.SEVERE, null, ex);
        }
        at = new AffineTransform();
    }

    public void setAt(AffineTransform at) {
        this.at = at;
    }

    public void setName(String name) {
        fileName = name;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public void setInvisible() {
        try {
            image = ImageIO.read(this.getClass().getResource("/Assets/blank.png"));
        } catch (IOException ex) {
            Logger.getLogger(SpriteNode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setVisible() {
        try {
            image = ImageIO.read(this.getClass().getResource(fileName));
        } catch (IOException ex) {
            Logger.getLogger(SpriteNode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Image getImage() {
        return image;
    }

    public AffineTransform getAt() {
        return at;
    }
}
