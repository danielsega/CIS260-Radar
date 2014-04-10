/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic.Commands;

import Logic.ICommand;
import Logic.Entity;

/**
 *
 * @author GW
 */
public class FireMissiles implements ICommand{
    Entity mEntity;
    
    public FireMissiles(Entity entity) {
        mEntity = entity;
    }
    
    @Override
    public void action() {
    }

    @Override
    public void undo() {
    }
    
}
