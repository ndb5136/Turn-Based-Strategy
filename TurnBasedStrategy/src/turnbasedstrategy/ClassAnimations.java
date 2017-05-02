/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turnbasedstrategy;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;


/**
 *
 * @author eih5176
 */
public class ClassAnimations extends JPanel{
    
   String aType, cType, pos;
   Graphics dbg;
   Image dbImage;
   ArrayList<BufferedImage> sprites = new ArrayList<BufferedImage>();
   Animator animate;
   
   
   
    public ClassAnimations()
    {

    }
    
    public void runAnimation()
    {
            animate = new Animator(sprites);
            animate.setSpeed(150);
            animate.play();
    }
    
    public void setAnimation(String a, String c, String p)
    {
        aType = a;
        cType = c;
        pos = p;
        BufferedImage spriteSheet = null;
        SpriteSheet ss;
        
        
        BufferedImageLoader loader = new BufferedImageLoader();
        
        if (cType == "Knight"){
                
        try {
            spriteSheet = loader.loadImage("Knight.png");
            
        } catch (IOException ex) {
            Logger.getLogger(BattleGround.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            ss = new SpriteSheet(spriteSheet);
            if (aType == "attack"){
                if (pos == "l"){
                    sprites.clear();

                    sprites.add(ss.grabSprite(0, 450, 63, 63));
                    sprites.add(ss.grabSprite(63, 450, 63, 63));
                    sprites.add(ss.grabSprite(126, 450, 63, 63));
                    sprites.add(ss.grabSprite(190, 450, 63, 63));
                    sprites.add(ss.grabSprite(260, 450, 65, 63));
                    sprites.add(ss.grabSprite(320, 450, 65, 63));
                    sprites.add(ss.grabSprite(385, 450, 63, 63));
                    sprites.add(ss.grabSprite(450, 450, 63, 63)); 
                    }
                else if(pos == "r"){
                    
                }
            }
            else if (aType == "cast")
            {
                if (pos == "l")
                {
                    
                }
                else if (pos == "r")
                {
                    
                }
            }
            else if (aType == "block")
            {
                if (pos == "l")
                {
                    
                }
                else if (pos == "r")
                {
                    
                }
            }
            
        }
        else if (cType == "Assassin")
        {
             try {
            spriteSheet = loader.loadImage("Assassin.png");
        } catch (IOException ex) {
            Logger.getLogger(BattleGround.class.getName()).log(Level.SEVERE, null, ex);
        }

            
            
            if (aType == "attack"){
                if (pos == "l")
                {
                    
                }
                else if (pos == "r")
                {
                    
                }
            }
            else if (aType == "cast")
            {
                if (pos == "l")
                {
                    
                }
                else if (pos == "r")
                {
                    
                }
            }
            else if (aType == "block")
            {
                if (pos == "l")
                {
                    
                }
                else if (pos == "r")
                {
                    
                }
            }
        }
        else if (cType == "Wizard")
        {
           
                         try {
            spriteSheet = loader.loadImage("Wizard.png");
        } catch (IOException ex) {
            Logger.getLogger(BattleGround.class.getName()).log(Level.SEVERE, null, ex);
        }
            ss = new SpriteSheet(spriteSheet);
            
            if (aType == "attack"){
                
                  if (pos == "l")
                  {
        sprites.clear();
        
        sprites.add(ss.grabSprite(0, 450, 63, 63));
        sprites.add(ss.grabSprite(63, 450, 63, 63));
        sprites.add(ss.grabSprite(126, 450, 63, 63));
        sprites.add(ss.grabSprite(190, 450, 63, 63));
        sprites.add(ss.grabSprite(260, 450, 65, 63));
        sprites.add(ss.grabSprite(320, 450, 65, 63));
        sprites.add(ss.grabSprite(385, 450, 63, 63));
        sprites.add(ss.grabSprite(450, 450, 63, 63));
                  }
                  else if (pos == "r")
                  {
                      
                  }
            }
            else if (aType == "cast")
            {
                if (pos == "l")
                {  
        sprites.add(ss.grabSprite(0, 970, 63, 63));
        sprites.add(ss.grabSprite(63, 970, 63, 63));
        sprites.add(ss.grabSprite(126, 970, 63, 63));
        sprites.add(ss.grabSprite(190, 970, 63, 63));
        sprites.add(ss.grabSprite(260, 970, 65, 63));
        sprites.add(ss.grabSprite(320, 970, 65, 63));
                }
                else if (pos == "r")
                {
                    
                }
                
            }
            else if (aType == "block")
            {
                if (pos == "l")
                {
                    
                }
                else if (pos == "r")
                {
                    
                }
            }
        }
        else if (cType == "Mage")
        {
                        try {
            spriteSheet = loader.loadImage("Mage.png");
        } catch (IOException ex) {
            Logger.getLogger(BattleGround.class.getName()).log(Level.SEVERE, null, ex);
        }

            
            
            if (aType == "attack"){
                if (pos == "l")
                {
                    
                }
                else if (pos == "r")
                {
                    
                }
            }
            else if (aType == "cast")
            {
                if (pos == "l")
                {
                    
                }
                else if (pos == "r")
                {
                    
                }
            }
            else if (aType == "block")
            {
                if (pos == "l")
                {
                    
                }
                else if (pos == "r")
                {
                    
                }
            }
        }
        else if (cType == "Ranger")
        {
                        try {
            spriteSheet = loader.loadImage("Ranger.png");
        } catch (IOException ex) {
            Logger.getLogger(BattleGround.class.getName()).log(Level.SEVERE, null, ex);
        }
 
            
            
            if (aType == "attack"){
                if (pos == "l")
                {
                    
                }
                else if (pos == "r")
                {
                    
                }
            }
            else if (aType == "cast")
            {
                if (pos == "l")
                {
                    
                }
                else if (pos == "r")
                {
                    
                }
            }
            else if (aType == "block")
            {
                if (pos == "l")
                {
                    
                }
                else if (pos == "r")
                {
                    
                }
            }
        }
    }
    
    
   @Override
        public void paint(Graphics g){

            
            dbImage = createImage(getWidth(), getHeight());
            dbg = dbImage.getGraphics();
            paintComponent(dbg);
            
            
            g.drawImage(dbImage, 100, 100, null);
        }
        
   @Override
        public void paintComponent(Graphics g) {
            if(animate != null ) {
                animate.update(System.currentTimeMillis());
                g.drawImage(animate.sprite, 100, 100, null);
            }
            repaint();
            
        }
    
    
    
}
