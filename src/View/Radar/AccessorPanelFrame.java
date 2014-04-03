/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Radar;

/**
 *
 * @author GW
 */
public class AccessorPanelFrame {

    private JpanDisplay mDisplay;
    private JpanRadar mRadar;

    AccessorPanelFrame() {
        mDisplay = new JpanDisplay();
        mRadar = new JpanRadar();
    }

    public JpanDisplay getmDisplay() {
        return mDisplay;
    }

    public JpanRadar getmRadar() {
        return mRadar;
    }
}
