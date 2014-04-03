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

}//--End of StateMainGame
