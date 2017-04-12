/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turnbasedstrategy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Cody Zerbe
 */
public class jpSignUp extends javax.swing.JPanel {

    DBConnection connect = new DBConnection();
    Connection con = connect.connectToDB();
    
    String username;
    String password;
    String confirmPassword;
    PreparedStatement ps;
    ResultSet rs;
    ResultSetMetaData rsMD;
    int column;
    String S;
    JFrame frame;
    /**
     * Creates new form jpSignUp
     */
    public jpSignUp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();

        jLabel1.setText("Username:");

        jLabel2.setText("Password:");

        jLabel3.setText("Confirm Password:");

        jButton1.setText("Sign Up");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(99, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            username = jTextField1.getText();
            password = jPasswordField1.getText();
            confirmPassword = jPasswordField2.getText();
            
            ps = con.prepareStatement("SELECT username FROM player;");
            rs = ps.executeQuery();
            rsMD = rs.getMetaData();
            column = rsMD.getColumnCount();
            int y = 0;
            while(rs.next() == true){
                for(int n = 1; n <= column; n++){
                    S = rs.getString(n);
                    if(username.equals(S)){
                        y++;
                        JOptionPane.showMessageDialog(frame, "That username is already in use. Please choose a new username.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        
                    }    
                }
            }
            if(y == 0){
                if(password.equals(confirmPassword)){
                    ps = con.prepareStatement("INSERT INTO player (username, password) VALUES ('" + username + "', '" + password + "');");
                    ps.executeUpdate();
                    ps.close();
                    con.close();
                    this.getTopLevelAncestor().setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(frame, "The passwords do not match.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(jpSignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        try {
            username = jTextField1.getText();
            password = jPasswordField1.getText();
            confirmPassword = jPasswordField2.getText();
            
            ps = con.prepareStatement("SELECT username FROM player;");
            rs = ps.executeQuery();
            rsMD = rs.getMetaData();
            column = rsMD.getColumnCount();
            int y = 0;
            while(rs.next() == true){
                for(int n = 1; n <= column; n++){
                    S = rs.getString(n);
                    if(username.equals(S)){
                        y++;
                        JOptionPane.showMessageDialog(frame, "That username is already in use. Please choose a new username.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        
                    }    
                }
            }
            if(y == 0){
                if(password.equals(confirmPassword)){
                    ps = con.prepareStatement("INSERT INTO player (username, password) VALUES ('" + username + "', '" + password + "');");
                    ps.executeUpdate();
                    ps.close();
                    con.close();
                    this.getTopLevelAncestor().setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(frame, "The passwords do not match.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(jpSignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jPasswordField2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
