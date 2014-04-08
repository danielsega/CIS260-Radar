/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author GW
 */
public class Sprite {
    private AffineTransformOp at;
    private BufferedImage mBufferedImage;
    private TexturePaint mTexturePaint;
    private Rectangle rec;

    public BufferedImage getmBufferedImage() {
        return mBufferedImage;
    }

    public void setmBufferedImage(BufferedImage mWater) {
        this.mBufferedImage = mWater;
    }

    private String fileName;
    private int x;
    private int y;
    private int width;
    private int heigh;

    public Sprite(String name) {
        x = 0;
        y = 0;
        fileName = "/Assets/" + name;
        init();
    }

    private void init() {
        try {
            mBufferedImage = ImageIO.read(this.getClass().getResource(fileName));
        } catch (IOException ex) {
            Logger.getLogger(Sprite.class.getName()).log(Level.SEVERE, null, ex);
        }
        width = mBufferedImage.getWidth();
        heigh = mBufferedImage.getHeight();

        mTexturePaint = new TexturePaint(mBufferedImage, rec);

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public TexturePaint getmTexturePaint() {
        return mTexturePaint;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigh() {
        return heigh;
    }

    public void setHeigh(int heigh) {
        this.heigh = heigh;
    }
    
    public Rectangle getRec() {
        return rec;
    }

    public void setRec(Rectangle rec) {
        this.rec = rec;
    }
}
