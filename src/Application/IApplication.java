package Application;

//--IApplication is a work around Netbeans GUI Designer
//--For not allowing to extend class from JFRAME
public interface IApplication {
    public abstract void init();
    public abstract void cleanUp();
    
    public abstract void handleEvents();
    public abstract void update();
    public abstract void draw();
}//End of IApplication
