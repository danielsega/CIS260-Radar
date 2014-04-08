package Application;

import View.Radar.FrameRadar;

/**
 *
 * @author GW
 */
//--GameState for FrameRadar
final class StateMainGame extends GameState {

    private FrameRadar mFrame;

    public StateMainGame() {
        init();
    }

    @Override
    public void init() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("System".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameRadar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                mFrame = new FrameRadar();
                mFrame.setVisible(true);
            }
        });
    }

    @Override
    public void cleanUp() {
        mFrame.setVisible(false);
    }

    @Override
    public void handleEvents() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                mFrame.handleEvents();
            }
        });
    }

    @Override
    public void update() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                mFrame.update();
            }
        });
    }

    @Override
    public void draw() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                mFrame.draw();
            }
        });
    }

}//--End of StateMainGame
