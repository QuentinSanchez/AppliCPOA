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
   
   int dernierNumero ;
    
    boolean etat ;
    public FenetreAjoutVip(java.awt.Frame parent, Vip vip, DAODivers leDaoDivers,int dernierNum) {
        super(parent, true);
        
        this.leDaoDivers =  leDaoDivers ;
        
        this.leVip = vip ;
        
        this.dernierNumero  = dernierNum;
        
        
        
        initComponents();
        
        this.txtNumVip.setText( String.valueOf(dernierNumero+1)) ;
        
        this.txtNumVip.setEnabled(false);
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
        txtLieuxNaissance = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
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
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtAnneeA = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtMoisA = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtJourA = new javax.swing.JTextField();
        radioBtnAutre = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();

        buttonGroupC.add(radioBtnMr);
        buttonGroupC.add(radioBtnMme);

        buttonGroupCodeActeur.add(radioBtnActeur);
        buttonGroupCodeActeur.add(radioBtnRealisateur);
        buttonGroupCodeActeur.add(radioBtnAR);
        buttonGroupCodeActeur.add(radioBtnAutre);

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

        jLabel10.setText("Date de naissance :");

        jLabel17.setText("aaaa");

        jLabel18.setText("mm ");

        txtMoisA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMoisAActionPerformed(evt);
            }
        });

        jLabel19.setText("jj");

        radioBtnAutre.setText("autre");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Nouveau Vip");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel10))
                                .addGap(48, 48, 48))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addGap(31, 31, 31)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNumVip, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLieuxNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtAnneeA, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel18)
                                        .addGap(8, 8, 8)
                                        .addComponent(txtMoisA, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel19)
                                        .addGap(9, 9, 9)
                                        .addComponent(txtJourA, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtPrenom, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNom, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(radioBtnMr)
                                            .addGap(18, 18, 18)
                                            .addComponent(radioBtnMme)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radioBtnCelibataire)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radioBtnMarie))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radioBtnActeur)
                                                .addGap(18, 18, 18)
                                                .addComponent(radioBtnRealisateur))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jComboBoxPays, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(11, 11, 11)
                                .addComponent(radioBtnAR))
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(radioBtnAutre))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(btnCreerVip)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumVip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(radioBtnMr)
                        .addComponent(radioBtnMme)))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnneeA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(txtMoisA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJourA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel10))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtLieuxNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioBtnActeur)
                            .addComponent(radioBtnRealisateur)
                            .addComponent(radioBtnAR)
                            .addComponent(radioBtnAutre)))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(radioBtnCelibataire)
                    .addComponent(radioBtnMarie))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBoxPays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
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
       else if (this.radioBtnAR.isSelected())
       {
           
          codeActeur = "AR";
           
       }
       else
       {
            codeActeur = "O";
           
       }
       
       this.leVip.setCodeActeur(codeActeur);
       
        String codeStatut = null ;
        
        if ( radioBtnCelibataire.isSelected()) {
           
           codeStatut = "C";
       }
       else
       {
           
           codeStatut = "M";
           
       }
       
           
       
       
       this.leVip.setCodeStatut(codeStatut);
       
        String date = txtAnneeA.getText() +"-"+txtMoisA.getText()+"-"+txtJourA.getText() ;
       this.leVip.setDateNaissance(date);
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

    private void txtMoisAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMoisAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMoisAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreerVip;
    private javax.swing.ButtonGroup buttonGroupC;
    private javax.swing.ButtonGroup buttonGroupCodeActeur;
    private javax.swing.ButtonGroup buttonGroupCodeStatut;
    private javax.swing.JComboBox jComboBoxPays;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JRadioButton radioBtnAutre;
    private javax.swing.JRadioButton radioBtnCelibataire;
    private javax.swing.JRadioButton radioBtnMarie;
    private javax.swing.JRadioButton radioBtnMme;
    private javax.swing.JRadioButton radioBtnMr;
    private javax.swing.JRadioButton radioBtnRealisateur;
    private javax.swing.JTextField txtAnneeA;
    private javax.swing.JTextField txtJourA;
    private javax.swing.JTextField txtLieuxNaissance;
    private javax.swing.JTextField txtMoisA;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtNumVip;
    private javax.swing.JTextField txtPrenom;
    // End of variables declaration//GEN-END:variables
}
