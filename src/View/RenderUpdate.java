/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GW
 */
public class RenderUpdate implements Runnable {

    FrameRadar fRadar;

    public RenderUpdate(FrameRadar fRadar) {
        this.fRadar = fRadar;
    }

    @Override
    public void run() {
        while (true) {
            try {
                java.awt.EventQueue.invokeLater(new Runnable(){
                    @Override
                    public void run(){
                        fRadar.Update();
                    }
                });
                Thread.sleep(1000/60);
            } catch (InterruptedException ex) {
                Logger.getLogger(RenderUpdate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
