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
    
    public void playAnimation(String a, String c, String p)
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
            
        
        sprites.clear();
        
        sprites.add(ss.grabSprite(0, 450, 63, 63));
        sprites.add(ss.grabSprite(63, 450, 63, 63));
        sprites.add(ss.grabSprite(126, 450, 63, 63));
        sprites.add(ss.grabSprite(190, 450, 63, 63));
        sprites.add(ss.grabSprite(260, 450, 65, 63));
        sprites.add(ss.grabSprite(320, 450, 65, 63));
        sprites.add(ss.grabSprite(385, 450, 63, 63));
        sprites.add(ss.grabSprite(450, 450, 63, 63));
        
            animate.setSpeed(150);
            animate.play();
        
            }
            else if (aType == "cast")
            {
                
            }
            else if (aType == "block")
            {
                
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
                
            }
            else if (aType == "cast")
            {
                
            }
            else if (aType == "block")
            {
                
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
            else if (aType == "cast")
            {
                
            }
            else if (aType == "block")
            {
                
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
                
            }
            else if (aType == "cast")
            {
                
            }
            else if (aType == "block")
            {
                
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
                
            }
            else if (aType == "cast")
            {
                
            }
            else if (aType == "block")
            {
                
            }
        }
    }
    
    
   @Override
        public void paint(Graphics g){
            animate = new Animator(sprites);
        animate.setSpeed(150);
        animate.play();
            
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
