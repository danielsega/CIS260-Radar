package Application;

//--Main Class
public class MainRadar {
    //--Main Thread
    public static void main(String args[]) {
        /*RenderUpdate renderUp = new RenderUpdate();
        Thread th = new Thread(renderUp);
        th.start();  */
        GameEngine game = new GameEngine(); 
        game.run();
    }
}//--End of Main Radar
