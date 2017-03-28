/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turnbasedstrategy;

import java.io.Serializable;

/**
 *
 * @author Nick
 */
public class Action implements Serializable
{
    private String body;
    
    public Action(String body)
    {
        this.body = body;
    }
    
    public String toString()
    {
        return getBody();
    }

    /**
     * @return the body
     */
    public String getBody() {
        return body;
    }

    /**
     * @param body the body to set
     */
    public void setBody(String body) {
        this.body = body;
    }
}
