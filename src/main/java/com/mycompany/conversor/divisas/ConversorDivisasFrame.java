/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conversor.divisas;

import View.RESTExchangeRateLoader;
import java.awt.Color;

/**
 *
 * @author Jonay
 */
public class ConversorDivisasFrame extends javax.swing.JFrame {

    private double EURtoUSDRate;
    private double USDtoEURRate;

    /**
     * Creates new form ConversorDivisasFrame
     */
    public ConversorDivisasFrame() {
        this.EURtoUSDRate = RESTExchangeRateLoader.getEURtoUSDRate();
        this.USDtoEURRate = RESTExchangeRateLoader.getUSDtoEURRate();
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

        fromEURLabel = new javax.swing.JLabel();
        fromEURField = new javax.swing.JTextField();
        convertToUSDButton = new javax.swing.JButton();
        toUSDLabel = new javax.swing.JLabel();
        toUSDField = new javax.swing.JTextField();
        jonayLabel = new javax.swing.JLabel();
        samuelLabel = new javax.swing.JLabel();
        fromUSDLabel = new javax.swing.JLabel();
        fromUSDField = new javax.swing.JTextField();
        convertToEURButton = new javax.swing.JButton();
        toEURLabel = new javax.swing.JLabel();
        toEURField = new javax.swing.JTextField();
        warningLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor de divisas EUR/USD");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        fromEURLabel.setText("EUR:*");

        fromEURField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fromEURFieldKeyReleased(evt);
            }
        });

        convertToUSDButton.setText("Convertir EUR a USD");
        convertToUSDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertToUSDButtonActionPerformed(evt);
            }
        });

        toUSDLabel.setText("USD:");

        toUSDField.setEditable(false);

        jonayLabel.setText("Jonay Suárez Ramírez");

        samuelLabel.setText("Samuel Trujillo Santana");

        fromUSDLabel.setText("USD:*");

        fromUSDField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fromUSDFieldKeyReleased(evt);
            }
        });

        convertToEURButton.setText("Convertir USD a EUR");
        convertToEURButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertToEURButtonActionPerformed(evt);
            }
        });

        toEURLabel.setText("EUR:");

        toEURField.setEditable(false);

        warningLabel.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        warningLabel.setText("* Introduzca solo números y use el '.' como separador decimal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fromUSDLabel)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(209, 209, 209)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(samuelLabel)
                                    .addComponent(jonayLabel)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fromUSDField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(convertToEURButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(toEURLabel)
                                .addGap(99, 99, 99))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(toEURField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(fromEURLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fromEURField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(convertToUSDButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(toUSDLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(toUSDField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fromEURLabel)
                    .addComponent(fromEURField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(convertToUSDButton)
                    .addComponent(toUSDLabel)
                    .addComponent(toUSDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fromUSDLabel)
                    .addComponent(fromUSDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(convertToEURButton)
                    .addComponent(toEURLabel)
                    .addComponent(toEURField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(warningLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jonayLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(samuelLabel)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void convertToUSDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertToUSDButtonActionPerformed
        String EURinput = fromEURField.getText();
        double euros;
        try {
            euros = Double.parseDouble(EURinput);
        } catch (NumberFormatException e){
            warningLabel.setForeground(Color.red);
            fromEURField.setForeground(Color.red);
            return;
        }
        warningLabel.setForeground(Color.black);
        double usd = euros*EURtoUSDRate;
        toUSDField.setText("" + Math.round(usd * 100.0) / 100.0);
    }//GEN-LAST:event_convertToUSDButtonActionPerformed

    private void convertToEURButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertToEURButtonActionPerformed
        String USDinput = fromUSDField.getText();
        double usd;
        try {
            usd = Double.parseDouble(USDinput);
        } catch (NumberFormatException e){
            warningLabel.setForeground(Color.red);
            fromUSDField.setForeground(Color.red);
            return;
        }
        warningLabel.setForeground(Color.black);
        double euros = usd*USDtoEURRate;
        toEURField.setText("" + Math.round(euros * 100.0) / 100.0);
    }//GEN-LAST:event_convertToEURButtonActionPerformed

    private void fromEURFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fromEURFieldKeyReleased
        String fromEURInput = fromEURField.getText();
        if(fromEURInput.matches("\\d*\\.?\\d*")){
            fromEURField.setForeground(Color.black);
        } else {
            fromEURField.setForeground(Color.red);
        }
    }//GEN-LAST:event_fromEURFieldKeyReleased

    private void fromUSDFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fromUSDFieldKeyReleased
        String fromUSDInput = fromUSDField.getText();
        if(fromUSDInput.matches("\\d*\\.?\\d*")){
            fromUSDField.setForeground(Color.black);
        } else {
            fromUSDField.setForeground(Color.red);
        }
    }//GEN-LAST:event_fromUSDFieldKeyReleased

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
            javax.swing.UIManager.setLookAndFeel(
                    javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConversorDivisasFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConversorDivisasFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConversorDivisasFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConversorDivisasFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConversorDivisasFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton convertToEURButton;
    private javax.swing.JButton convertToUSDButton;
    private javax.swing.JTextField fromEURField;
    private javax.swing.JLabel fromEURLabel;
    private javax.swing.JTextField fromUSDField;
    private javax.swing.JLabel fromUSDLabel;
    private javax.swing.JLabel jonayLabel;
    private javax.swing.JLabel samuelLabel;
    private javax.swing.JTextField toEURField;
    private javax.swing.JLabel toEURLabel;
    private javax.swing.JTextField toUSDField;
    private javax.swing.JLabel toUSDLabel;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables
}
