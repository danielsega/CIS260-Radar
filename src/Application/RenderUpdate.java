package Application;

import View.Radar.FrameRadar;

/**
 * @author GW
 */

//--Old render thread
public class RenderUpdate implements Runnable {

    //--Constant Variables
    final static short FRAMES_PER_SECOND = 60;
    final static double SKIP_TICKS = 1000 / FRAMES_PER_SECOND;

    //--Data members
    long lastTime = System.nanoTime();
    double ns = 1000000000 / FRAMES_PER_SECOND;
    float deltaTime;
    long timer = System.currentTimeMillis();
    int fps;
    int frames;
    FrameRadar fRadar;

    public RenderUpdate() {
        deltaTime = 0;
        fps = 0;
        frames = 0;
    }

    @Override
    public void run() {
        while (true) {
            long now = System.nanoTime();
            deltaTime += (now - lastTime) / ns;
            lastTime = now;
            
            while (deltaTime > 1) 
            {
                renderGame();//--Update
                fps++;
                deltaTime--;
            }
            //--Render
            frames++;

            if (System.currentTimeMillis() - timer > 1000) 
            {
                timer += 1000;
                System.out.println("FPS: " + frames + " FPS: " + fps);
                frames = 0;
                fps = 0;
            }
            //Render
        }
    }

    private void renderGame() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                //fRadar.Update();
            }
        });
    }
}
