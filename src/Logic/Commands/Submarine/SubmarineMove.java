/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic.Commands.Submarine;

import Application.GameObject.Submarine;
import Logic.Command;

/**
 *
 * @author GW
 */
public class SubmarineMove extends Command{

    private Submarine mSub;
    public SubmarineMove(Submarine sub) {
        mSub = sub;
    }

    @Override
    public void action() {
        mSub.Move();
    }

}