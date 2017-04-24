/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turnbasedstrategy;

/**
 *
 * @author pmo5053
 */
public class Block extends Action{

    public Block(String t, String stat, double a) {
        super(t, stat, a);
    }
    
    public String toString()
    {
        if (type.equals("end"))
            return "end";
        else if (type.equals("Waiting for Player"))
            return "Server is waiting";
        else if (type.equals("Server has 2 players already"))
            return "Server has 2 players already";
        else
            return "\nStat: " + getStatEffected() + "\nAmount: " + getAmount();
    }
}
