/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic.Commands;

import Application.GameObject.Missile;
import Logic.Command;

/**
 *
 * @author GW
 */
public class CommandFireMissiles extends Command{
    Missile mMissile;
    
    public CommandFireMissiles(Missile missile) {
        mMissile = missile;
    }
    
    @Override
    public void action() {
        mMissile.FireMissile();
    }

}
