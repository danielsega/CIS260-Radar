/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author GW
 */
public class CommandQueue {

    private Queue<Command> commands;

    public CommandQueue() {
        commands = new LinkedList<>();
    }

    public boolean isEmpty() {
        if (commands.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void addCommand(Command input) {
        commands.add(input);
    }
}
