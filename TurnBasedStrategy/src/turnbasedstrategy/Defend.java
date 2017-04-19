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
public class Defend extends Action{
    double DefensePercent;
    
    
    public Defend (String s)
    {
        super(s);
    }
    
    public Defend (String t, String stat, double a, double dp)
    {
        super(t, stat, a);
        DefensePercent = dp;
    }
    
    public void setDefense(double dp)
    {
        DefensePercent = dp;
    }
    
    public double getDefense(){
        return DefensePercent;
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
            return "Type: " + getType() + "\nStat: " + getStatEffected() + "\nAmount: " + getAmount() + "\nDefense Percent: " + getDefense();
    }
}
