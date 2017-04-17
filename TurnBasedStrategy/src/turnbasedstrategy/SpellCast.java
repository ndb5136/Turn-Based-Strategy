/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turnbasedstrategy;

/**
 *
 * @author eih5176
 */
public class SpellCast extends Action{
    
    public int ManaUsage;
    
   
    // Constructor
    public SpellCast(String s) {
        super(s);
    }
    
    // Constructor
    public SpellCast (String t, String stat, double a, int mu)
    {
       super(t, stat, a);
       ManaUsage = mu;
        
    }
    // Sets the mana the spell will consume
    public void setManaUse (int m){
        ManaUsage = m;
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
            return "Type: " + getType() + "\nStat: " + getStatEffected() + "\nAmount: " + getAmount() + "\nMana Usage: " + getManaUse();
    }
    
    // returns the mana the spell will consume
    public int getManaUse (){
        return ManaUsage;
    }
    
}
