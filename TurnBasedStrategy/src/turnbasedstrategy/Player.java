package turnbasedstrategy;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Nick
 */
public class Player implements Serializable
{
    private String name;
    private String playerCharacter;
    private int level;
    private double health, mana, attack, spAttack, defense, spDefense, speed;
    ArrayList<Action> moveSet;
    
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
