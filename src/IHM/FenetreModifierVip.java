/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import Metier.Vip;
import accesAuxDonnees.DAODivers;
import modeleComboBox.ComboBoxModele;

/**
 *
 * @author poncho
 */
public class FenetreModifierVip extends javax.swing.JDialog {

    Vip leVip ;
    
    boolean etat ;
    
    
    DAODivers leDaoDivers ;
    public FenetreModifierVip(java.awt.Frame parent, Vip vip,DAODivers leDaoDivers) {
        super(parent, true);
        
        this.leVip = vip ;
        
        this.leDaoDivers = leDaoDivers ;
        initComponents();
        
        this.txtNumVip.setEnabled(false);
    }

   boolean doModal ()
   {
        this.setVisible(true);
        
        
        return etat;
       
   }
   
   
   public void remplirChamps()
   {
       
       
       txtNumVip.setText(String.valueOf(this.leVip.getNumVip()));
       txtNom.setText(this.leVip.getNom());
       txtPrenom.setText(this.leVip.getPrenom());
       
       // on précoche les radio boutons selon les attributs du Vip
     if( leVip.getCodeActeur().equals("A"))
     {
         this.radioBtnActeurM.setSelected(true);
         
         
     }
     else if (leVip.getCodeActeur().equals("R"))
     {
         
         this.radioBtnRealisateurM.setSelected(true);
     }
     else if (leVip.getCodeActeur().equals("AR"))
         {
       
        this.radioBtnARM.setSelected(true);
   }else
     {
         
         this.radioBtnAutreM.setSelected(true);
         
     }
      
     
     if( this.leVip.getCodeStatut().equals("C"))
     {
         
         this.radioBtnCelibataireM.setSelected(true);
     }
     else
     {
         
         this.radioBtnMarieM.setSelected(true);
     }
      
      
      
       txtDateNaissance.setText(this.leVip.getDateNaissance());
       txtLieuxNaissance.setText(this.leVip.getLieuxNaissance());
       this.jComboBoxPays.setSelectedItem(this.leVip.getPays());
       
       
      if(this.leVip.getCivilitee().equals("Mr"))
      {
          
          this.radioBtnMrM.setSelected(true);
      }
      else
      {
          
          this.radioBtnMmeM.setSelected(true);
          
      }
       
      
       
       
       
   }
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupCM = new javax.swing.ButtonGroup();
        buttonGroupCodeActeurM = new javax.swing.ButtonGroup();
        buttonGroupCodeStatut = new javax.swing.ButtonGroup();
        txtPrenom = new javax.swing.JTextField();
        txtNumVip = new javax.swing.JTextField();
        txtDateNaissance = new javax.swing.JTextField();
        txtLieuxNaissance = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnCreerVip = new javax.swing.JButton();
        radioBtnMmeM = new javax.swing.JRadioButton();
        radioBtnMrM = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        radioBtnARM = new javax.swing.JRadioButton();
        radioBtnRealisateurM = new javax.swing.JRadioButton();
        radioBtnActeurM = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        radioBtnMarieM = new javax.swing.JRadioButton();
        radioBtnCelibataireM = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        radioBtnAutreM = new javax.swing.JRadioButton();
        jComboBoxPays = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();

        buttonGroupCM.add(radioBtnMrM);
        buttonGroupCM.add(radioBtnMmeM);

        buttonGroupCodeActeurM.add(radioBtnActeurM);
        buttonGroupCodeActeurM.add(radioBtnRealisateurM);
        buttonGroupCodeActeurM.add(radioBtnARM);
        buttonGroupCodeActeurM.add(radioBtnAutreM);

        buttonGroupCodeStatut.add(radioBtnMarieM);
        buttonGroupCodeStatut.add(radioBtnCelibataireM);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtPrenom.setText("t");
        txtPrenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrenomActionPerformed(evt);
            }
        });

        txtNumVip.setText("22");
        txtNumVip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumVipActionPerformed(evt);
            }
        });

        txtDateNaissance.setText("01-01-01");

        txtLieuxNaissance.setText("t");

        txtNom.setText("t");
        txtNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomActionPerformed(evt);
            }
        });

        jLabel1.setText("Nom :");

        jLabel2.setText("Prenom :");

        jLabel3.setText("NumVip");

        jLabel5.setText("Date de naissance");

        jLabel6.setText("Lieux de naissance");

        jLabel9.setText("Pays");

        btnCreerVip.setText("Modifier");
        btnCreerVip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreerVipActionPerformed(evt);
            }
        });

        radioBtnMmeM.setText("Mme");

        radioBtnMrM.setText("Mr");
        radioBtnMrM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnMrMActionPerformed(evt);
            }
        });

        jLabel4.setText("Civilitée");

        radioBtnARM.setText("Acteur/Réalisateur");
        radioBtnARM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnARMActionPerformed(evt);
            }
        });

        radioBtnRealisateurM.setText("Réalisateur");

        radioBtnActeurM.setText("Acteur");

        jLabel7.setText("Code acteur");

        radioBtnMarieM.setText("Marié");

        radioBtnCelibataireM.setText("Célibataire");

        jLabel8.setText("Code statut");

        radioBtnAutreM.setText("Autre");

        try{
            jComboBoxPays.setModel(new ComboBoxModele(this.leDaoDivers.getPays()));
        }
        catch ( Exception E)
        {

        }

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Modifier un Vip");

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
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtLieuxNaissance, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDateNaissance, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                .addComponent(txtNumVip, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radioBtnActeurM)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioBtnRealisateurM))
                                    .addComponent(radioBtnCelibataireM))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radioBtnMarieM)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radioBtnARM)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioBtnAutreM))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtPrenom, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNom, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(radioBtnMrM)
                                    .addGap(18, 18, 18)
                                    .addComponent(radioBtnMmeM)))
                            .addComponent(jComboBoxPays, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(btnCreerVip))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel10)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(39, 39, 39)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radioBtnMrM)
                        .addComponent(radioBtnMmeM)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDateNaissance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtLieuxNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioBtnActeurM)
                            .addComponent(radioBtnRealisateurM)
                            .addComponent(radioBtnARM)
                            .addComponent(radioBtnAutreM))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radioBtnCelibataireM)
                        .addComponent(radioBtnMarieM)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jComboBoxPays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE)
                .addComponent(btnCreerVip)
                .addContainerGap())
        );

        radioBtnMrM.setSelected(true);
        radioBtnActeurM.setSelected(true);
        radioBtnCelibataireM.setSelected(true);

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
         
         // on vérifie les sélections des radio boutons, et on met les resultats dans des variables
       
       if ( radioBtnMrM.isSelected()) {
           
           civilitee = "Mr";
           
           
       }
       else
       {
           
           civilitee = "Mme";
           
       }
       
           this.leVip.setCivilitee(civilitee);
      
       String codeActeur = "AR" ;
       
       
       if (this.radioBtnActeurM.isSelected())
       {
           
           codeActeur = "A";
           
           
       }
        if (this.radioBtnRealisateurM.isSelected())
       {
           codeActeur = "R";
           
       }
      
        this.leVip.setCodeActeur(codeActeur);
        
           String codeStatut = null ;
        
        if ( radioBtnCelibataireM.isSelected()) {
           
          codeStatut = "C";
       }
       else
       {
           
           codeStatut= "M";
           
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

    private void radioBtnMrMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnMrMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnMrMActionPerformed

    private void radioBtnARMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnARMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnARMActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreerVip;
    private javax.swing.ButtonGroup buttonGroupCM;
    private javax.swing.ButtonGroup buttonGroupCodeActeurM;
    private javax.swing.ButtonGroup buttonGroupCodeStatut;
    private javax.swing.JComboBox jComboBoxPays;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton radioBtnARM;
    private javax.swing.JRadioButton radioBtnActeurM;
    private javax.swing.JRadioButton radioBtnAutreM;
    private javax.swing.JRadioButton radioBtnCelibataireM;
    private javax.swing.JRadioButton radioBtnMarieM;
    private javax.swing.JRadioButton radioBtnMmeM;
    private javax.swing.JRadioButton radioBtnMrM;
    private javax.swing.JRadioButton radioBtnRealisateurM;
    private javax.swing.JTextField txtDateNaissance;
    private javax.swing.JTextField txtLieuxNaissance;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtNumVip;
    private javax.swing.JTextField txtPrenom;
    // End of variables declaration//GEN-END:variables
}
