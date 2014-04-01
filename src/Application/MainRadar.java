/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import View.FrameRadar;

/**
 *
 * @author dmattos18
 */
public class MainRadar {
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FrameRadar fRadar = new FrameRadar();
                fRadar.setVisible(true);
                RenderUpdate renderUp = new RenderUpdate(fRadar);
                Thread th = new Thread(renderUp);
                th.start();                
            }
        });
    }
}
