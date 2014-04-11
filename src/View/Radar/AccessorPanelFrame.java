package View.Radar;

//--Accessor class return a reference for Jpan

import Application.Scenario;

//--It is my quick working around Netbeans GUI Designer 
//--For not allowing us to change the variable type
public class AccessorPanelFrame {
    private JpanDisplay mDisplay;
    private JpanRadar mRadar;

    AccessorPanelFrame(Scenario scenario) {
        mDisplay = new JpanDisplay(scenario);
        mRadar = new JpanRadar(scenario);
    }

    public JpanDisplay getmDisplay() {
        return mDisplay;
    }

    public JpanRadar getmRadar() {
        return mRadar;
    }
}
