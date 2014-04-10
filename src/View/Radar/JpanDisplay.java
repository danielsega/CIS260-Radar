/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Radar;

import Application.IApplication;
import Logic.SpriteNode;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.*;

/**
 *
 * @author dmattos18
 */
public class JpanDisplay extends javax.swing.JPanel implements IApplication{
//--Example: http://zetcode.com/tutorials/javaswingtutorial/painting/
    private BufferedImage mWater;
    private TexturePaint mWaterTexture;
    private SpriteNode submarine;
    private int deltax;
    /**
     * Creates new form jpanDisplay
     */
    public JpanDisplay(){
        init();
        initComponents();        
    }

    @Override
    public void paintComponent(Graphics graph)
    {
        super.paintComponent(graph);
        Graphics2D g2d = (Graphics2D) graph;
        
        mWaterTexture = new TexturePaint(mWater, new Rectangle(deltax,0,mWater.getWidth()/2,mWater.getHeight())); 
        
        g2d.setPaint(mWaterTexture);
        g2d.fillRect(0, 0, this.getWidth(),this.getHeight());
        g2d.drawImage(submarine.getImage(), submarine.getAt(), this);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    @Override
    public void init() {
        try {
            mWater = ImageIO.read(this.getClass().getResource("/Assets/water.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(JpanDisplay.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        submarine = new SpriteNode("sub.png");
        deltax = 0;
    }

    @Override
    public void cleanUp() {
    }

    @Override
    public void handleEvents() {
        
    }

    @Override
    public void update() {
        deltax++;
    }

    /**
     *
     */
    @Override
    public void draw() {
        this.repaint();
    }

}
