/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turnbasedstrategy;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author eih5176
 */
public class Animator {
    
    ArrayList<BufferedImage> frames;
    
    BufferedImage sprite;
    
    private volatile boolean attacking = false;
    
    private long previousTime, speed;
    private int frameAtPause, currentFrame;
    
    
    
    public Animator(ArrayList<BufferedImage> frames) {
        this.frames = frames;
    }
    
    public void setSpeed(long s){
        speed = s;
        
    }
    
    public void update(long time) {
        if(attacking){
        if (time - previousTime >= speed) {
            
            currentFrame++;
            try{
                sprite = frames.get(currentFrame);
            }catch(IndexOutOfBoundsException e){
                currentFrame = 0;
                sprite = frames.get(currentFrame);
            }
            
            
            
            previousTime = time;
        }    
        }
    }
    
    public void play(){
        attacking = true;
    }
    
    public void stop(){
        attacking = false;
        previousTime = 0;
        frameAtPause = 0;
        currentFrame = 0;
    }
    
    public void pause(){
        frameAtPause = currentFrame;
        attacking = false;
}
    
    
    
}
