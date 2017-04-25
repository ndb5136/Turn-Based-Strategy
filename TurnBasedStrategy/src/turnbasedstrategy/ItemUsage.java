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
public class ItemUsage extends Action{
    public String itemName;
    
    public ItemUsage(String t, String stat, double a) {
        super(t, stat, a);
    }
    
    public void setItemName(String itemName){
        this.itemName = itemName;
    }
    
    public String getItemName(){
        return itemName;
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
            return "Item: " + getItemName() + "\nStat: " + getStatEffected() + "\nAmount: " + getAmount();
    }
}
