/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
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
    private BufferedImage mBufferedImage;
    private String fileName;

    public SpriteNode() {
        init();
    }

    public SpriteNode(String name) {
        fileName = "/Assets/" + name;
        init();
    }

    private void init() {
        if (!fileName.isEmpty()) {
            try {
                mBufferedImage = ImageIO.read(this.getClass().getResource(fileName));
            } catch (IOException ex) {
                Logger.getLogger(SpriteNode.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            image = mBufferedImage;
        } else {
            mBufferedImage = new BufferedImage(50, 50, 1);
            image = mBufferedImage;
        }
        
        at = new AffineTransform();
    }

    public void setName(String name) {
        fileName = name;
    }

    public Image getImage() {
        return image;
    }

    public BufferedImage getmBufferedImage() {
        return mBufferedImage;
    }

    public AffineTransform getAt() {
        return at;
    }
}
