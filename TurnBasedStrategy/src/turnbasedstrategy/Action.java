package turnbasedstrategy;

import java.io.Serializable;

/**
 * Action that can be performed in TBS Game
 * @author Nick Beliveau
 * 
 * Created      4/10/17
 */
public class Action implements Serializable
{
    private String type;
    private String statEffected;
    private double amount;
    
    public Action(String s)
    {
        type = s;
        statEffected = "";
        amount = 0;
    }
    
    public Action(String t, String stat, double a)
    {
        type = t;
        statEffected = stat;
        amount = a;
    }
    
    public String toString()
    {
        if (type.equals("end")){
            return "end";
        }
        else if (type.equals("Waiting for Player"))
            return "Server is waiting";
        else if (type.equals("Server has 2 players already"))
            return "Server has 2 players already";
        else
            return "Type: " + getType() + "\nStat: " + getStatEffected() + "\nAmount: " + getAmount();
    }

    /**
     * @return the type (Attack, Ability, Item)
     */
    public String getType() {
        return type;
    }

    /**
     * @param body the body to set
     */
    public void setType(String t) {
        type = t;
    }

    /**
     * @return the statEffected
     */
    public String getStatEffected() {
        return statEffected;
    }

    /**
     * @param statEffected the statEffected to set
     */
    public void setStatEffected(String statEffected) {
        this.statEffected = statEffected;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }
}
