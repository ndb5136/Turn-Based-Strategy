/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turnbasedstrategy;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import turnbasedstrategy.Server.clientThread;

/**
 *
 * @author eih5176
 */
public class BattleGround extends javax.swing.JFrame {

    private clientThread playerOne, playerTwo;
    private boolean full;
    
    ClassAnimations animate = new ClassAnimations();
    
    
    
    /**
     * Creates new form BattleGround
     */
    public BattleGround() {

        initComponents();
        JFrame frame = new JFrame();
        frame.setSize(1000, 1000);
        
        
        animate.setAnimation("cast", "Wizard", "l");
        
        animate.runAnimation();
       
        frame.add(animate);
        animate.setVisible(true);
        frame.setVisible(true);
        
        
        
        
//        init();
    }
    
//    BufferedImage sprites;
//    
//    Animator Knight;
//    
//    private void init(){
//        BufferedImageLoader loader = new BufferedImageLoader();
//        BufferedImage spriteSheet = null;
//        try {
//            spriteSheet = loader.loadImage("Knight.png");
//        } catch (IOException ex) {
//            Logger.getLogger(BattleGround.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        SpriteSheet ss = new SpriteSheet(spriteSheet);
//        
//        ArrayList<BufferedImage> sprites = new ArrayList<BufferedImage>();
//        
//        sprites.add(ss.grabSprite(0, 450, 63, 63));
//        sprites.add(ss.grabSprite(63, 450, 63, 63));
//        sprites.add(ss.grabSprite(126, 450, 63, 63));
//        sprites.add(ss.grabSprite(190, 450, 63, 63));
//        sprites.add(ss.grabSprite(260, 450, 65, 63));
//        sprites.add(ss.grabSprite(320, 450, 65, 63));
//        sprites.add(ss.grabSprite(385, 450, 63, 63));
//        sprites.add(ss.grabSprite(450, 450, 63, 63));
//        
//        Knight = new Animator(sprites);
//        Knight.setSpeed(150);
//        Knight.play();
//    }
    
    public BattleGround(clientThread pOne) 
    {
        playerOne = pOne;
        full = false;
        
        initComponents();
    }
    
    public void writePlayersToEachOther()
    {
        try 
        {
            playerOne.output.writeObject(playerOne.getPlayer());
            System.out.println("\nPlayer One : " + playerTwo.input.readObject() + "\n");
            playerTwo.output.writeObject(playerTwo.getPlayer());
            System.out.println("\nPlayer Two : " + playerOne.input.readObject() + "\n");
        } 
        catch (IOException | ClassNotFoundException ex) 
        {
            Logger.getLogger(BattleGround.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void playGame()
    {
        writePlayersToEachOther();
        
    }
    
    public void connectPlayers()
    {
        
        //playerOne.setOpponentStream(playerTwo);
        //playerTwo.setOpponentStream(playerOne);
        
    }
    
    public void getPlayerTwo(clientThread pTwo)
    {
        System.out.println("Got into getPlayerTwo");
        
        playerTwo = pTwo;
        full = true;
        
        connectPlayers();
        
        System.out.println("Got past ConnectPlayers()");
        
        playGame();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(744, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BattleGround.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BattleGround.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BattleGround.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BattleGround.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BattleGround().setVisible(true);
            }
        });

        
    }
//        Image dbImage;
//        Graphics dbg;
//        
//    
//        @Override
//        public void paint(Graphics g){
//            dbImage = createImage(getWidth(), getHeight());
//            dbg = dbImage.getGraphics();
//            paintComponent(dbg);
//            
//            
//            g.drawImage(dbImage, 100, 100, null);
//        }
//        
//        public void paintComponent(Graphics g) {
//            if(Knight != null ) {
//                Knight.update(System.currentTimeMillis());
//                g.drawImage(Knight.sprite, 100, 100, null);
//            }
//            
//            repaint();
//        }
//        
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
