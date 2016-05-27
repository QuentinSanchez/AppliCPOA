/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import Metier.Vip;
import accesAuxDonnees.DAODivers;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modeleComboBox.ComboBoxModele;

/**
 *
 * @author poncho
 */
public class FenetreAjoutVip extends javax.swing.JDialog {

    Vip leVip ;
    
    
   DAODivers leDaoDivers ;
    
    boolean etat ;
    public FenetreAjoutVip(java.awt.Frame parent, Vip vip, DAODivers leDaoDivers) {
        super(parent, true);
        
        this.leDaoDivers =  leDaoDivers ;
        
        this.leVip = vip ;
        initComponents();
    }

   boolean doModal ()
   {
        this.setVisible(true);
        
        
        return etat;
       
   }
   
   
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupC = new javax.swing.ButtonGroup();
        buttonGroupCodeActeur = new javax.swing.ButtonGroup();
        buttonGroupCodeStatut = new javax.swing.ButtonGroup();
        txtPrenom = new javax.swing.JTextField();
        txtNumVip = new javax.swing.JTextField();
        txtDateNaissance = new javax.swing.JTextField();
        txtLieuxNaissance = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnCreerVip = new javax.swing.JButton();
        radioBtnMr = new javax.swing.JRadioButton();
        radioBtnMme = new javax.swing.JRadioButton();
        radioBtnActeur = new javax.swing.JRadioButton();
        radioBtnRealisateur = new javax.swing.JRadioButton();
        radioBtnAR = new javax.swing.JRadioButton();
        jComboBoxPays = new javax.swing.JComboBox();
        radioBtnCelibataire = new javax.swing.JRadioButton();
        radioBtnMarie = new javax.swing.JRadioButton();

        buttonGroupC.add(radioBtnMr);
        buttonGroupC.add(radioBtnMme);

        buttonGroupCodeActeur.add(radioBtnActeur);
        buttonGroupCodeActeur.add(radioBtnRealisateur);
        buttonGroupCodeActeur.add(radioBtnAR);

        buttonGroupCodeStatut.add(radioBtnCelibataire);
        buttonGroupCodeStatut.add(radioBtnMarie);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtPrenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrenomActionPerformed(evt);
            }
        });

        txtNumVip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumVipActionPerformed(evt);
            }
        });

        txtNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomActionPerformed(evt);
            }
        });

        jLabel1.setText("Nom :");

        jLabel2.setText("Prenom :");

        jLabel3.setText("NumVip");

        jLabel4.setText("Civilitée");

        jLabel5.setText("Date de naissance");

        jLabel6.setText("Lieux de naissance");

        jLabel7.setText("Code acteur");

        jLabel8.setText("Code statut");

        jLabel9.setText("Pays");

        btnCreerVip.setText("Creer");
        btnCreerVip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreerVipActionPerformed(evt);
            }
        });

        radioBtnMr.setText("Mr");
        radioBtnMr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnMrActionPerformed(evt);
            }
        });

        radioBtnMme.setText("Mme");

        radioBtnActeur.setText("Acteur");

        radioBtnRealisateur.setText("Réalisateur");

        radioBtnAR.setText("Acteur/Réalisateur");
        radioBtnAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnARActionPerformed(evt);
            }
        });

        try{
            jComboBoxPays.setModel(new ComboBoxModele(this.leDaoDivers.getPays()));
        }
        catch ( Exception E)
        {

        }

        radioBtnCelibataire.setText("Célibataire");

        radioBtnMarie.setText("Marié");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(radioBtnMr))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(radioBtnActeur)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtLieuxNaissance, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDateNaissance, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNumVip, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPrenom, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jComboBoxPays, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(radioBtnCelibataire))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioBtnRealisateur)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioBtnAR))
                            .addComponent(radioBtnMme)
                            .addComponent(radioBtnMarie)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(btnCreerVip)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1))
                                        .addGap(16, 16, 16)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtNumVip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addGap(38, 38, 38))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(radioBtnMr)
                                        .addComponent(radioBtnMme)))
                                .addGap(18, 18, 18)
                                .addComponent(txtDateNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtLieuxNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioBtnActeur)
                            .addComponent(radioBtnRealisateur)
                            .addComponent(radioBtnAR)))
                    .addComponent(jLabel7))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(radioBtnCelibataire)
                    .addComponent(radioBtnMarie))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBoxPays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCreerVip)
                .addContainerGap())
        );

        radioBtnMr.setSelected(true);
        radioBtnActeur.setSelected(true);
        radioBtnCelibataire.setSelected(true);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumVipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumVipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumVipActionPerformed

    private void txtNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomActionPerformed

    private void btnCreerVipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreerVipActionPerformed
      
        
       this.leVip.setNumVip(Integer.parseInt(txtNumVip.getText()));
       this.leVip.setNom(txtNom.getText());
       this.leVip.setPrenom(txtPrenom.getText());
       this.leVip.setPays((String) this.jComboBoxPays.getSelectedItem());
       
       String civilitee ;
        if ( radioBtnMr.isSelected()) {
           
           civilitee = "Mr";
       }
       else
       {
           
           civilitee = "Mme";
           
       }
       
           this.leVip.setCivilitee(civilitee);
      
       String codeActeur ;
       
       
       if (this.radioBtnActeur.isSelected())
       {
           
           codeActeur = "A";
           
           
       }
       else if (this.radioBtnRealisateur.isSelected())
       {
           codeActeur = "R";
           
       }
       else
       {
           
          codeActeur = "AR";
           
       }
       
       this.leVip.setCodeActeur(codeActeur);
       
        String codeStatut = null ;
        
        if ( radioBtnCelibataire.isSelected()) {
           
           civilitee = "C";
       }
       else
       {
           
           civilitee = "M";
           
       }
       
           
       
       
       this.leVip.setCodeStatut(codeStatut);
       this.leVip.setDateNaissance(txtDateNaissance.getText());
       this.leVip.setLieuxNaissance(txtLieuxNaissance.getText());
       
       etat = true ;
       
       this.dispose();
       
    }//GEN-LAST:event_btnCreerVipActionPerformed

    private void txtPrenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrenomActionPerformed

    private void radioBtnMrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnMrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnMrActionPerformed

    private void radioBtnARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnARActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreerVip;
    private javax.swing.ButtonGroup buttonGroupC;
    private javax.swing.ButtonGroup buttonGroupCodeActeur;
    private javax.swing.ButtonGroup buttonGroupCodeStatut;
    private javax.swing.JComboBox jComboBoxPays;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton radioBtnAR;
    private javax.swing.JRadioButton radioBtnActeur;
    private javax.swing.JRadioButton radioBtnCelibataire;
    private javax.swing.JRadioButton radioBtnMarie;
    private javax.swing.JRadioButton radioBtnMme;
    private javax.swing.JRadioButton radioBtnMr;
    private javax.swing.JRadioButton radioBtnRealisateur;
    private javax.swing.JTextField txtDateNaissance;
    private javax.swing.JTextField txtLieuxNaissance;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtNumVip;
    private javax.swing.JTextField txtPrenom;
    // End of variables declaration//GEN-END:variables
}
