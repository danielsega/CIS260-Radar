/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import View.Radar.FrameRadar;

/**
 *
 * @author GW
 */
final class StateMainGame extends GameState {

    private FrameRadar mFrame;

    public StateMainGame() {
        init();
    }

    @Override
    public void init() {
        mFrame = new FrameRadar();
        mFrame.setVisible(true);
    }

    @Override
    public void cleanUp() {
        mFrame.setVisible(false);
    }

    @Override
    public void handleEvents() {
        //mFrame.handleEvents();
    }

    @Override
    public void update() {
        mFrame.update();
    }

    @Override
    public void draw() {
        mFrame.draw();
    }

}
