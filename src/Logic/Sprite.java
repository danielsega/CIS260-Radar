/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.awt.Rectangle;
import java.awt.TexturePaint;
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

    private BufferedImage mWater;
    private TexturePaint mWaterTexture;

    private String fileName;
    private int x;
    private int y;

    Sprite(String name) {
        x = 0;
        y = 0;
        fileName = "/Assets/" + name;
        init();
    }

    private void init() {
        try {
            mWater = ImageIO.read(this.getClass().getResource(fileName));
        } catch (IOException ex) {
            Logger.getLogger(Sprite.class.getName()).log(Level.SEVERE, null, ex);
        }
        mWaterTexture = new TexturePaint(mWater, new Rectangle(x, y, mWater.getWidth(), mWater.getHeight()));

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

    public TexturePaint getmWaterTexture() {
        return mWaterTexture;
    }
}
