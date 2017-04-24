package turnbasedstrategy;

import java.io.Serializable;

/**
 *
 * @author Nick
 */
public class Player implements Serializable
{
    private String name;
    private String playerCharacter;
    
    public Player()
    {
        
    }
    
    public Player(String n, String pC)
    {
        name = n;
        playerCharacter = pC;
    }
    
    public String toString()
    {
        return "Name: " + name + "\tClass: " + playerCharacter;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getPlayerClass()
    {
        return playerCharacter;
    }
}
