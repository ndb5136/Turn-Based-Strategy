
package turnbasedstrategy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author cxz5100
 */
public class jpCharacters extends javax.swing.JPanel {
   
    DBConnection connect = new DBConnection();
    Connection con = connect.connectToDB();
    // Declare character name and stats variables
    int ID;
    static String characterName;
    double physicalAttack;
    double specialAttack;
    double physicalDefense;
    double specialDefense;
    double speed;
    double mana;
    double health;
    int exp;
    static int level;
    
    PreparedStatement ps;
    ResultSet rs;
    ResultSetMetaData rsMD;
    int column;
    String S;
    JFrame frame;
    
    /**
     * Creates new form Characters
     */
    public jpCharacters() {
        initComponents();
        jButton3.setEnabled(false);
    }  
    
    public void finalize(){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(jpCharacters.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane5 = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPane6 = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextPane7 = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextPane8 = new javax.swing.JTextPane();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        jLabel1.setText("Health");

        jProgressBar1.setToolTipText("");
        jProgressBar1.setRequestFocusEnabled(false);
        jProgressBar1.setString(getToolTipText());
        jProgressBar1.setStringPainted(true);

        jLabel3.setText("Attack");

        jLabel4.setText("Special Attack");

        jLabel5.setText("Defense");

        jLabel6.setText("Special Defense");

        jLabel7.setText("Mana");

        jLabel2.setText("Speed");

        jButton1.setText("New Character");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Load Character");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Save Character");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jTextPane2);

        jScrollPane3.setViewportView(jTextPane3);

        jScrollPane4.setViewportView(jTextPane4);

        jScrollPane5.setViewportView(jTextPane5);

        jScrollPane6.setViewportView(jTextPane6);

        jScrollPane7.setViewportView(jTextPane7);

        jScrollPane8.setViewportView(jTextPane8);

        jTextField1.setText("Character Name");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTextPane1);

        jLabel8.setText("Level");

        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1))
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(50, 50, 50)
                                .addComponent(jButton3)
                                .addGap(50, 50, 50)
                                .addComponent(jButton2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jButton4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        saveCharacter();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jpNewCharacter characters = new jpNewCharacter();
        characters.setVisible(true);
        JDialog jdCharacters = new JDialog();
        JPanel Characters = new jpNewCharacter();
        jdCharacters.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        jdCharacters.add(Characters);
        jdCharacters.setSize(400, 350);
        jdCharacters.setModal(true);
        jdCharacters.setVisible(true);
        characterName = jpNewCharacter.characterName;

        jButton3.setEnabled(true);
        newCharacter();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jpLoadCharacter characters = new jpLoadCharacter();
        characters.setVisible(true);
        JDialog jdCharacters = new JDialog();
        JPanel Characters = new jpLoadCharacter();
        jdCharacters.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        jdCharacters.add(Characters);
        jdCharacters.setSize(400, 100);
        jdCharacters.setModal(true);
        jdCharacters.setVisible(true);
        characterName = jpLoadCharacter.characterName;
        
        jButton3.setEnabled(true);
        loadCharacter();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(characterName == null){
            JOptionPane.showMessageDialog(frame, "Please choose a character.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try {
                ps = con.prepareStatement("SELECT characterName FROM defaultCharacters;");

                rs = ps.executeQuery();
                rsMD = rs.getMetaData();
                column = rsMD.getColumnCount();
                int x = 0;
                while(rs.next() == true){
                    for(int n = 1; n <= column; n++){
                        S = rs.getString(n);
                        if(characterName.equals(S))
                            x++;
                    }
                }
                if(x == 0){    
                    this.getTopLevelAncestor().setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(frame, "Please save your character before continuing.", "Error", JOptionPane.ERROR_MESSAGE);    
                }
            } catch (SQLException ex) {
            Logger.getLogger(jpCharacters.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    // Choose new character type and load base stats from the server
    public void newCharacter(){
        try {
            jTextField1.setText(characterName);
            
            ps = con.prepareStatement("SELECT ID FROM defaultCharacters WHERE characterName = '" + characterName + "';");
            rs = ps.executeQuery();
            S = rs.getString(1);
            ID = Integer.parseInt(S);
            
            ps = con.prepareStatement("SELECT health FROM defaultCharacters WHERE characterName = '" + characterName + "';");
            rs = ps.executeQuery();
            S = rs.getString(1);
            health = Double.parseDouble(S);
            jTextPane2.setText(S);
            
            ps = con.prepareStatement("SELECT mana FROM defaultCharacters WHERE characterName = '" + characterName + "';");
            rs = ps.executeQuery();
            S = rs.getString(1);
            mana = Double.parseDouble(S);
            jTextPane3.setText(S);
            
            ps = con.prepareStatement("SELECT attack FROM defaultCharacters WHERE characterName = '" + characterName + "';");
            rs = ps.executeQuery();
            S = rs.getString(1);
            physicalAttack = Double.parseDouble(S);
            jTextPane4.setText(S);
            
            ps = con.prepareStatement("SELECT specialAttack FROM defaultCharacters WHERE characterName = '" + characterName + "';");
            rs = ps.executeQuery();
            S = rs.getString(1);
            specialAttack = Double.parseDouble(S);
            jTextPane5.setText(S);
            
            ps = con.prepareStatement("SELECT defense FROM defaultCharacters WHERE characterName = '" + characterName + "';");
            rs = ps.executeQuery();
            S = rs.getString(1);
            physicalDefense = Double.parseDouble(S);
            jTextPane6.setText(S);
            
            ps = con.prepareStatement("SELECT specialDefense FROM defaultCharacters WHERE characterName = '" + characterName + "';");
            rs = ps.executeQuery();
            S = rs.getString(1);
            specialDefense = Double.parseDouble(S);
            jTextPane7.setText(S);
            
            ps = con.prepareStatement("SELECT speed FROM defaultCharacters WHERE characterName = '" + characterName + "';");
            rs = ps.executeQuery();
            S = rs.getString(1);
            speed = Double.parseDouble(S);
            jTextPane8.setText(S);
            
            ps = con.prepareStatement("SELECT exp FROM defaultCharacters WHERE characterName = '" + characterName + "';");
            rs = ps.executeQuery();
            S = rs.getString(1);
            exp = Integer.parseInt(S);
            jProgressBar1.setValue(exp);
            
            level = 1;
            S = Integer.toString(level);
            jTextPane1.setText(S);
                    
        } catch (SQLException ex) {
            Logger.getLogger(jpCharacters.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Choose previously saved character and load current stats
    public void loadCharacter(){
        try {
            jTextField1.setText(characterName);
            
            ps = con.prepareStatement("SELECT ID FROM characters WHERE characterName = '" + characterName + "';");
            rs = ps.executeQuery();
            S = rs.getString(1);
            ID = Integer.parseInt(S);
            
            ps = con.prepareStatement("SELECT health FROM characters WHERE ID = " + ID + ";");
            rs = ps.executeQuery();
            S = rs.getString(1);
            health = Double.parseDouble(S);
            jTextPane2.setText(S);
            
            ps = con.prepareStatement("SELECT mana FROM characters WHERE ID = " + ID + ";");
            rs = ps.executeQuery();
            S = rs.getString(1);
            mana = Double.parseDouble(S);
            jTextPane3.setText(S);
            
            ps = con.prepareStatement("SELECT attack FROM characters WHERE ID = " + ID + ";");
            rs = ps.executeQuery();
            S = rs.getString(1);
            physicalAttack = Double.parseDouble(S);
            jTextPane4.setText(S);
            
            ps = con.prepareStatement("SELECT specialAttack FROM characters WHERE ID = " + ID + ";");
            rs = ps.executeQuery();
            S = rs.getString(1);
            specialAttack = Double.parseDouble(S);
            jTextPane5.setText(S);
            
            ps = con.prepareStatement("SELECT defense FROM characters WHERE ID = " + ID + ";");
            rs = ps.executeQuery();
            S = rs.getString(1);
            physicalDefense = Double.parseDouble(S);
            jTextPane6.setText(S);
            
            ps = con.prepareStatement("SELECT specialDefense FROM characters WHERE ID = " + ID + ";");
            rs = ps.executeQuery();
            S = rs.getString(1);
            specialDefense = Double.parseDouble(S);
            jTextPane7.setText(S);
            
            ps = con.prepareStatement("SELECT speed FROM characters WHERE ID = " + ID + ";");
            rs = ps.executeQuery();
            S = rs.getString(1);
            speed = Double.parseDouble(S);
            jTextPane8.setText(S);
            
            ps = con.prepareStatement("SELECT exp FROM characters WHERE ID = '" + ID + "';");
            rs = ps.executeQuery();
            S = rs.getString(1);
            exp = Integer.parseInt(S);
            
            
            int n = exp;
            int z = 100;
            level = 1;
            while(exp > z){
                level++;
                z = z + (level * 100);
            }
            z = z - (level * 100);
            n = n - z;
            
            jProgressBar1.setMaximum(z);
            jProgressBar1.setValue(n);
            S = Integer.toString(level);
            jTextPane1.setText(S);
            
        } catch (SQLException ex) {
            Logger.getLogger(jpCharacters.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Save current character level and stats
    public void saveCharacter(){
        characterName = jTextField1.getText();
        
        try {
            ps = con.prepareStatement("SELECT characterName FROM characters;");
        
            rs = ps.executeQuery();
            rsMD = rs.getMetaData();
            column = rsMD.getColumnCount();
            int x = 0;
            while(rs.next() == true){
                for(int n = 1; n <= column; n++){
                    S = rs.getString(n);
                    if(characterName.equals(S))
                        x++;
                }
            }
            ps = con.prepareStatement("SELECT characterName FROM defaultCharacters;");
        
            rs = ps.executeQuery();
            rsMD = rs.getMetaData();
            column = rsMD.getColumnCount();
            int y = 0;
            while(rs.next() == true){
                for(int n = 1; n <= column; n++){
                    S = rs.getString(n);
                    if(characterName.equals(S))
                        y++;
                }
            }
            if(x == 0 && y == 0){    
                ps = con.prepareStatement("INSERT INTO characters (characterName, health, mana, attack, specialAttack, defense, specialDefense, speed, exp) VALUES ("
                + "'" + characterName + "', " + health + ", " + mana + ", " + physicalAttack + ", " + specialAttack + ", " + physicalDefense + ", " + specialDefense + ", " + speed + ", " + exp + ");");
                ps.executeUpdate();
            }
            else if (x > 0){
                JOptionPane.showMessageDialog(frame, "That name has already been taken. Please choose a new name.", "Error", JOptionPane.ERROR_MESSAGE);    
            }
            else
                JOptionPane.showMessageDialog(frame, "That name is a default character name. Please choose a new name.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
        Logger.getLogger(jpCharacters.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane4;
    private javax.swing.JTextPane jTextPane5;
    private javax.swing.JTextPane jTextPane6;
    private javax.swing.JTextPane jTextPane7;
    private javax.swing.JTextPane jTextPane8;
    // End of variables declaration//GEN-END:variables
}
