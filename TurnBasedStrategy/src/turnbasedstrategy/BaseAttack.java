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
public class BaseAttack extends Action{
    
    public BaseAttack(String s)
    {
        super(s);
    }

    public BaseAttack(String t, String stat, double a)
    {
        super(t, stat, a);
    }
    
}
