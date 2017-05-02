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
                    sprites.clear();

                    sprites.add(ss.grabSprite(0, 325, 63, 60));
                    sprites.add(ss.grabSprite(63, 325, 63, 60));
                    sprites.add(ss.grabSprite(126, 325, 63, 60));
                    sprites.add(ss.grabSprite(190, 325, 63, 60));
                    sprites.add(ss.grabSprite(260, 325, 65, 60));
                    sprites.add(ss.grabSprite(320, 325, 65, 60));
                    sprites.add(ss.grabSprite(385, 325, 63, 60));
                    sprites.add(ss.grabSprite(450, 325, 63, 60));
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
                    sprites.clear();
                    sprites.add(ss.grabSprite(0, 1288, 63, 55));
                    sprites.add(ss.grabSprite(63, 1288, 63, 55));
                    sprites.add(ss.grabSprite(126, 1288, 63, 55));
                    sprites.add(ss.grabSprite(190, 1288, 63, 55));
                    sprites.add(ss.grabSprite(260, 1288, 65, 55));
                    sprites.add(ss.grabSprite(320, 1288, 65, 55));
                }
                else if (pos == "r")
                {
                    sprites.clear();
                    sprites.add(ss.grabSprite(0, 1288, 63, 55));
                    sprites.add(ss.grabSprite(63, 1288, 63, 55));
                    sprites.add(ss.grabSprite(126, 1288, 63, 55));
                    sprites.add(ss.grabSprite(190, 1288, 63, 55));
                    sprites.add(ss.grabSprite(260, 1288, 65, 55));
                    sprites.add(ss.grabSprite(320, 1288, 65, 55));
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

             ss = new SpriteSheet(spriteSheet);
            
            if (aType == "attack"){
                if (pos == "l")
                {
                    sprites.clear();
                    sprites.add(ss.grabSprite(15, 970, 63, 55));
                    sprites.add(ss.grabSprite(80, 970, 63, 55));
                    sprites.add(ss.grabSprite(140, 970, 63, 55));
                    sprites.add(ss.grabSprite(209, 970, 63, 55));
                    sprites.add(ss.grabSprite(275, 970, 65, 55));
                    sprites.add(ss.grabSprite(335, 970, 65, 55));
                }
                else if (pos == "r")
                {
                     sprites.clear();
                    sprites.add(ss.grabSprite(5, 840, 63, 55));
                    sprites.add(ss.grabSprite(70, 840, 63, 55));
                    sprites.add(ss.grabSprite(140, 840, 63, 55));
                    sprites.add(ss.grabSprite(190, 840, 63, 55));
                    sprites.add(ss.grabSprite(250, 840, 65, 55));
                    sprites.add(ss.grabSprite(320, 840, 65, 55));
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
                   sprites.clear();
                    sprites.add(ss.grabSprite(15, 135, 63, 55));
                    sprites.add(ss.grabSprite(75, 135, 63, 55));
                    sprites.add(ss.grabSprite(140, 135, 63, 55));
                    sprites.add(ss.grabSprite(200, 135, 63, 55));
                    sprites.add(ss.grabSprite(260, 135, 65, 55));
                    sprites.add(ss.grabSprite(325, 135, 65, 55)); 
                    sprites.add(ss.grabSprite(390, 135, 65, 55));
                }
                else if (pos == "r")
                {
                    sprites.clear();
                    sprites.add(ss.grabSprite(15, 135, 63, 55));
                    sprites.add(ss.grabSprite(75, 135, 63, 55));
                    sprites.add(ss.grabSprite(140, 135, 63, 55));
                    sprites.add(ss.grabSprite(200, 135, 63, 55));
                    sprites.add(ss.grabSprite(260, 135, 65, 55));
                    sprites.add(ss.grabSprite(325, 135, 65, 55)); 
                    sprites.add(ss.grabSprite(390, 135, 65, 55));
                }
            }
        }
        else if (cType == "Wizard")
        {
           
          
           try {
            spriteSheet = loader.loadImage("Wizard.png");
               } 
           catch (IOException ex) {
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
                      sprites.clear();
        
        sprites.add(ss.grabSprite(0, 558, 63, 63));
        sprites.add(ss.grabSprite(63, 558, 63, 63));
        sprites.add(ss.grabSprite(126, 558, 63, 63));
        sprites.add(ss.grabSprite(190, 558, 63, 63));
        sprites.add(ss.grabSprite(260, 558, 65, 63));
        sprites.add(ss.grabSprite(320, 558, 65, 63));
        sprites.add(ss.grabSprite(385, 558, 63, 63));
        sprites.add(ss.grabSprite(450, 558, 63, 63));
                  }
            }
            else if (aType == "cast")
            {
                if (pos == "l")
                {  
         sprites.clear();   
        sprites.add(ss.grabSprite(0, 970, 63, 63));
        sprites.add(ss.grabSprite(63, 970, 63, 63));
        sprites.add(ss.grabSprite(126, 970, 63, 63));
        sprites.add(ss.grabSprite(190, 970, 63, 63));
        sprites.add(ss.grabSprite(260, 970, 65, 63));
        sprites.add(ss.grabSprite(320, 970, 65, 63));
                 
                }
                else if (pos == "r")
                {
                   sprites.clear();   
        sprites.add(ss.grabSprite(0, 838, 63, 63));
        sprites.add(ss.grabSprite(63, 838, 63, 63));
        sprites.add(ss.grabSprite(126, 838, 63, 63));
        sprites.add(ss.grabSprite(190, 838, 63, 63));
        sprites.add(ss.grabSprite(260, 838, 65, 63));
        sprites.add(ss.grabSprite(320, 838, 65, 63));
                }
                
            }
            else if (aType == "block")
            {
                if (pos == "l")
                {
                   sprites.clear();   
        sprites.add(ss.grabSprite(0, 1290, 63, 52));
        sprites.add(ss.grabSprite(70, 1290, 63, 52));
        sprites.add(ss.grabSprite(140, 1290, 63, 52));
        sprites.add(ss.grabSprite(200, 1290, 63, 52));
        sprites.add(ss.grabSprite(260, 1290, 65, 52)); 
        sprites.add(ss.grabSprite(200, 1290, 63, 52));
        sprites.add(ss.grabSprite(140, 1290, 63, 52));
        sprites.add(ss.grabSprite(70, 1290, 63, 52));
        sprites.add(ss.grabSprite(0, 1290, 63, 52));
                }
                else if (pos == "r")
                {
                     sprites.clear();   
        sprites.add(ss.grabSprite(0, 1290, 63, 52));
        sprites.add(ss.grabSprite(70, 1290, 63, 52));
        sprites.add(ss.grabSprite(140, 1290, 63, 52));
        sprites.add(ss.grabSprite(200, 1290, 63, 52));
        sprites.add(ss.grabSprite(260, 1290, 65, 52)); 
        sprites.add(ss.grabSprite(200, 1290, 63, 52));
        sprites.add(ss.grabSprite(140, 1290, 63, 52));
        sprites.add(ss.grabSprite(70, 1290, 63, 52));
        sprites.add(ss.grabSprite(0, 1290, 63, 52));
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
 
            ss = new SpriteSheet(spriteSheet);
            
            if (aType == "attack"){
                if (pos == "l")
                {
                     sprites.clear();
                    sprites.add(ss.grabSprite(5, 1223, 63, 55));
                    sprites.add(ss.grabSprite(70, 1223, 63, 55));
                    sprites.add(ss.grabSprite(133, 1223, 63, 55));
                    sprites.add(ss.grabSprite(200, 1223, 63, 55));
                    sprites.add(ss.grabSprite(255, 1223, 65, 55));
                    sprites.add(ss.grabSprite(325, 1223, 65, 55)); 
                    sprites.add(ss.grabSprite(388, 1223, 65, 55));
                    sprites.add(ss.grabSprite(454, 1223, 63, 55));
                    sprites.add(ss.grabSprite(516, 1223, 63, 55));
                    sprites.add(ss.grabSprite(580, 1223, 63, 55));
                    sprites.add(ss.grabSprite(646, 1223, 63, 55));
                    sprites.add(ss.grabSprite(710, 1223, 65, 55));
                    sprites.add(ss.grabSprite(775, 1223, 65, 55));  
                    
                }
                else if (pos == "r")
                {
                   sprites.clear();
                    sprites.add(ss.grabSprite(5, 1096, 63, 55));
                    sprites.add(ss.grabSprite(70, 1096, 63, 55));
                    sprites.add(ss.grabSprite(133, 1096, 63, 55));
                    sprites.add(ss.grabSprite(200, 1096, 63, 55));
                    sprites.add(ss.grabSprite(255, 1096, 65, 55));
                    sprites.add(ss.grabSprite(325, 1096, 65, 55)); 
                    sprites.add(ss.grabSprite(388, 1096, 65, 55));
                    sprites.add(ss.grabSprite(454, 1096, 63, 55));
                    sprites.add(ss.grabSprite(516, 1096, 63, 55));
                    sprites.add(ss.grabSprite(580, 1096, 63, 55));
                    sprites.add(ss.grabSprite(646, 1096, 63, 55));
                    sprites.add(ss.grabSprite(710, 1096, 65, 55));
                    sprites.add(ss.grabSprite(775, 1096, 65, 55));
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
                     sprites.clear();
                    sprites.add(ss.grabSprite(10, 1284, 63, 59));
                    sprites.add(ss.grabSprite(70, 1284, 63, 59));
                    sprites.add(ss.grabSprite(143, 1284, 63, 59));
                    sprites.add(ss.grabSprite(205, 1284, 63, 59));
                    sprites.add(ss.grabSprite(270, 1284, 65, 59));
                    sprites.add(ss.grabSprite(205, 1284, 65, 59)); 
                    sprites.add(ss.grabSprite(143, 1284, 65, 59));
                    sprites.add(ss.grabSprite(70, 1284, 63, 59));
                    sprites.add(ss.grabSprite(10, 1284, 63, 59));
                   
                }
                else if (pos == "r")
                {
                    sprites.clear();
                    sprites.add(ss.grabSprite(10, 1284, 63, 59));
                    sprites.add(ss.grabSprite(70, 1284, 63, 59));
                    sprites.add(ss.grabSprite(143, 1284, 63, 59));
                    sprites.add(ss.grabSprite(205, 1284, 63, 59));
                    sprites.add(ss.grabSprite(270, 1284, 65, 59));
                    sprites.add(ss.grabSprite(205, 1284, 65, 59)); 
                    sprites.add(ss.grabSprite(143, 1284, 65, 59));
                    sprites.add(ss.grabSprite(70, 1284, 63, 59));
                    sprites.add(ss.grabSprite(10, 1284, 63, 59));
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
