/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic.Commands;

import Application.GameObject.Missile;
import Logic.ICommand;

/**
 *
 * @author GW
 */
public class FireMissiles implements ICommand{
    Missile mMissile;
    
    public FireMissiles(Missile missile) {
        mMissile = missile;
    }
    
    @Override
    public void action() {
    }

    @Override
    public void undo() {
    }
    
}
