package Application;

/**
 * @author GW
 */

//--The Hearth of the Application
class GameEngine {

    private final boolean running;
    GameStateManager gsm;

    public GameEngine() {
        running = true;
        gsm = new GameStateManager();
    }

    //--Game Loop
    public void run() {
        while (running) {
            handleEvents();
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
