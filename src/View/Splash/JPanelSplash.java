/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View.Splash;

import Application.IApplication;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.Timer;

/**
 *
 * @author GW
 */
public class JPanelSplash extends javax.swing.JPanel implements IApplication{
    /**
     * Creates new form JPanelSplash
     */
    
    private int delay;
    private Timer time;
    
    public JPanelSplash() {
        init();
        initComponents();
    }
    
    @Override
     public void paintComponent(Graphics graph){
         super.paintComponent(graph);
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
        this.setBackground(Color.BLACK);
        delay = 1000; //In Milliseconds
        time = new Timer(delay, null);
    }

    @Override
    public void cleanUp() {
        
    }

    @Override
    public void handleEvents() {
    }

    @Override
    public void update() {
        time.start();
    }

    @Override
    public void draw() {
        this.repaint();
    }
}
