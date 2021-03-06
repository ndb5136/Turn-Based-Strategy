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
public class PhysicalAttack extends Action{
    public String move;
    
    public double amount;
    
    
    public PhysicalAttack(String t, String stat, double a) {
        super(t, stat, a);
    }
    
    public void setMoveName(String move){
        this.move=move;
    }
    
    public String getMoveName(){
        return move;
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
            return "Move: " + getMoveName() + "\nType: " + getType() + "\nStat: " + getStatEffected() + "\nAmount: " + getAmount();
    }
}

/*
name of move
base damage (to start)
stat changes

*/