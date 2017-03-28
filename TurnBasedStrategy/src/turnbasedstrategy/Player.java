package turnbasedstrategy;

import java.io.Serializable;

/**
 *
 * @author Nick
 */
public class Player implements Serializable
{
    private String name;
    private String playerClass;
    
    public Player(String n, String pC)
    {
        name = n;
        playerClass = pC;
    }
    
    public String toString()
    {
        return "Name: " + name + "\tClass: " + playerClass;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getPlayerClass()
    {
        return playerClass;
    }
}
