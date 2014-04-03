/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

/**
 *
 * @author GW
 */
class GameEngine {

    private boolean running;
    GameStateManager gsm;

    public GameEngine() {
        running = true;
        gsm = new GameStateManager();
    }

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

}
