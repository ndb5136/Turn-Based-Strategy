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
    private int level, ID, characterType, experience;
    private double health, mana, attack, spAttack, defense, spDefense, speed;
    private ArrayList<Action> moveSet;
    
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
        return "Name: " + name + "\nHealth: " + health + "\tMana: " + mana
                + "\nAttack: " + attack + "\tDefense: " + defense
                + "\nSp Att: " + spAttack + "\tSp Def: " + spDefense
                + "\nSpeed: " + speed;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getPlayerClass()
    {
        return getPlayerCharacter();
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the playerCharacter
     */
    public String getPlayerCharacter() {
        return playerCharacter;
    }

    /**
     * @param playerCharacter the playerCharacter to set
     */
    public void setPlayerCharacter(String playerCharacter) {
        this.playerCharacter = playerCharacter;
    }

    /**
     * @return the level
     */
    public int getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the health
     */
    public double getHealth() {
        return health;
    }

    /**
     * @param health the health to set
     */
    public void setHealth(double health) {
        this.health = health;
    }

    /**
     * @return the mana
     */
    public double getMana() {
        return mana;
    }

    /**
     * @param mana the mana to set
     */
    public void setMana(double mana) {
        this.mana = mana;
    }

    /**
     * @return the attack
     */
    public double getAttack() {
        return attack;
    }

    /**
     * @param attack the attack to set
     */
    public void setAttack(double attack) {
        this.attack = attack;
    }

    /**
     * @return the spAttack
     */
    public double getSpAttack() {
        return spAttack;
    }

    /**
     * @param spAttack the spAttack to set
     */
    public void setSpAttack(double spAttack) {
        this.spAttack = spAttack;
    }

    /**
     * @return the defense
     */
    public double getDefense() {
        return defense;
    }

    /**
     * @param defense the defense to set
     */
    public void setDefense(double defense) {
        this.defense = defense;
    }

    /**
     * @return the spDefense
     */
    public double getSpDefense() {
        return spDefense;
    }

    /**
     * @param spDefense the spDefense to set
     */
    public void setSpDefense(double spDefense) {
        this.spDefense = spDefense;
    }

    /**
     * @return the speed
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    /**
     * @return the moveSet
     */
    public ArrayList<Action> getMoveSet() {
        return moveSet;
    }

    /**
     * @param moveSet the moveSet to set
     */
    public void setMoveSet(ArrayList<Action> moveSet) {
        this.moveSet = moveSet;
    }

    /**
     * @return the characterType
     */
    public int getCharacterType() {
        return characterType;
    }

    /**
     * @param characterType the characterType to set
     */
    public void setCharacterType(int characterType) {
        this.characterType = characterType;
    }

    /**
     * @return the experience
     */
    public int getExperience() {
        return experience;
    }

    /**
     * @param experience the experience to set
     */
    public void setExperience(int experience) {
        this.experience = experience;
    }
}
