package Application;

import Logic.CommandQueue;

/**
 * @author GW
 */

//--The Hearth of the Application
class GameEngine {

    private boolean running;
    GameStateManager gsm;
    CommandQueue mQueue;

    public GameEngine() {
        running = true;
        gsm = new GameStateManager();
    }

    //--Game Loop
    public void run() {
        while (running) {
            //while(!mQueue.isEmpty()){
                handleEvents();
            //}
            update();
            draw();

            try {
                Thread.sleep(1000/60);
            } catch (InterruptedException e) {
            }

        }
    }

    public void handleEvents() {
        gsm.handleEvents();
    }

    public void update() {
        gsm.update();
    }

    public void draw() {
        gsm.draw();
    }

}//--End of Engine
