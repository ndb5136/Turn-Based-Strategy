
package turnbasedstrategy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author cody
 */
public class jpPlayer extends javax.swing.JPanel {

    DBConnection connect = new DBConnection();
    Connection con = connect.connectToDB();
    Player player;
    Client client;
    
    static int playerID;
    static String username;
    String characterName;
    int level = 1;
    int exp;
    
    PreparedStatement ps;
    ResultSet rs;
    String S;
    
    /**
     * Creates new form jpPlayer
     */
    public jpPlayer() {
        initComponents();
        
        username = jpLogin.username;
        jTextPane1.setText(username);
        
        if(jpCharacters.characterName != null){
            try {
                characterName = jpCharacters.characterName;
                jTextPane2.setText(characterName);
                
                ps = con.prepareStatement("SELECT exp FROM characters WHERE characterName = '" + characterName + "';");
                rs = ps.executeQuery();
                S = rs.getString(1);
                exp = Integer.parseInt(S);
                
                int z = 100;
                level = 1;
                while(exp >= z){
                    level++;
                    z = z + (level * 100);
                }                
                S = Integer.toString(level);
                jTextPane3.setText(S);
            } catch (SQLException ex) {
                Logger.getLogger(jpPlayer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            jButton2.setEnabled(false);
            jButton6.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        jTextPane1.setEditable(false);
        jScrollPane1.setViewportView(jTextPane1);

        jButton1.setText("View Character");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Launch Game vs. AI");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextPane2.setEditable(false);
        jScrollPane2.setViewportView(jTextPane2);

        jLabel1.setText("Selected Character");

        jTextPane3.setEditable(false);
        jScrollPane3.setViewportView(jTextPane3);

        jLabel2.setText("Level");

        jButton6.setText("Join PvP Game");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(232, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton6)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 306, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            ps = con.prepareStatement("SELECT ID FROM player WHERE username = '" + username + "';");
            rs = ps.executeQuery();
            S = rs.getString(1);
            playerID = Integer.parseInt(S);
                    
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(jpPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jpCharacters characters = new jpCharacters();
        characters.setVisible(true);
        JDialog jdCharacters = new JDialog();
        jpCharacters Characters = new jpCharacters();
        jdCharacters.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        jdCharacters.add(Characters);
        jdCharacters.setSize(500, 600);
        jdCharacters.setModal(true);
        jdCharacters.setVisible(true);

        player = Characters.getPlayer();
        System.out.println("Player:\n" + player);
        
        try {
            characterName = jpCharacters.characterName;
            jTextPane2.setText(characterName);
                
            ps = con.prepareStatement("SELECT exp FROM characters WHERE characterName = '" + characterName + "';");
            rs = ps.executeQuery();
            S = rs.getString(1);
            exp = Integer.parseInt(S);
                
            level = 1;
            int z = 100;
            while(exp >= z){
                level++;
                z = z + (level * 100);
            }                
            S = Integer.toString(level);
            jTextPane3.setText(S);
        } catch (SQLException ex) {
            Logger.getLogger(jpPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jButton2.setEnabled(true);
        jButton6.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        this.getTopLevelAncestor().setVisible(false);
        Action action = new Action("Find Game");
        client.sendAction(action);
        
        jpBattleground battleground = new jpBattleground();
        battleground.setVisible(true);
        JDialog jdBattleground = new JDialog();
        JPanel Battleground = new jpBattleground();
        jdBattleground.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        jdBattleground.add(Battleground);
        jdBattleground.setSize(800, 630);
        jdBattleground.setModal(true);
        jdBattleground.setVisible(true);

    }//GEN-LAST:event_jButton6ActionPerformed

    public void levelUp(){
        exp += 100;                     
        int levelNow = 1;
        int z = 100;
        while(exp >= z){
            levelNow++;
            z = z + (levelNow * 100);
        }                
        S = Integer.toString(level);
        jTextPane3.setText(S);
        if(levelNow > level){
            jpLevelUp.level = levelNow;
            jpLevelUp.exp = exp;
            jpLevelUp.levelUpPoints = 2 * (levelNow - level);
            jpLevelUp levelUp = new jpLevelUp();
            levelUp.setVisible(true);
            JDialog jdLevelUp = new JDialog();
            JPanel LevelUp = new jpLevelUp();
            jdLevelUp.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            jdLevelUp.add(LevelUp);
            jdLevelUp.setSize(500, 400);
            jdLevelUp.setModal(true);
            jdLevelUp.setVisible(true);
            
            level = levelNow;
            S = Integer.toString(level);
            jTextPane3.setText(S);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    // End of variables declaration//GEN-END:variables
}
