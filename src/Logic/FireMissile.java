/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic;


/**
 * @author GW
 */

//--COMMAND INTERFACE
interface Command{
    void action();
    void undo();
}

//-- -------------COMMAND INHERETANCES------------------

public class FireMissile implements Command{

    FireMissile(/*DEVICES*/){
        
    }
    
    @Override
    public void action() {
    }

    @Override
    public void undo() {
    }
    
}