/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic;

/**
 *
 * @author GW
 */
public class Player {
    public enum Action{
        Backward,Forward, Move, Halt, EscMove, EscHalt, Flare, Signal, BattleMode,
        GuidedMissile, Missile1, Missile2, Missile3, Missile4, Missile5, Missile6,
        Ballistic, Submersion
    }
    
    public enum ScenarioStatus{
        Running, Success, Failure
    }
    
    public void handleEvent(){
    }
}
