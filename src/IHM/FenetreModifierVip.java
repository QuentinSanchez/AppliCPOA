/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import Metier.Vip;

/**
 *
 * @author poncho
 */
public class FenetreModifierVip extends javax.swing.JDialog {

    Vip leVip ;
    
    boolean etat ;
    public FenetreModifierVip(java.awt.Frame parent, Vip vip) {
        super(parent, true);
        
        this.leVip = vip ;
        initComponents();
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
       txtCodeActeur.setText(this.leVip.getCodeActeur());
       txtCodeStatut.setText(this.leVip.getCodeStatut());
       txtDateNaissance.setText(this.leVip.getDateNaissance());
       txtLieuxNaissance.setText(this.leVip.getLieuxNaissance());
       txtPays.setText(this.leVip.getPays());
       txtCivilitee.setText(this.leVip.getCivilitee());
       
       btnCreerVip.setText("modifier");
       
       
       
   }
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPrenom = new javax.swing.JTextField();
        txtNumVip = new javax.swing.JTextField();
        txtCivilitee = new javax.swing.JTextField();
        txtDateNaissance = new javax.swing.JTextField();
        txtLieuxNaissance = new javax.swing.JTextField();
        txtCodeActeur = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        txtCodeStatut = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPays = new javax.swing.JTextField();
        btnCreerVip = new javax.swing.JButton();

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

        txtCivilitee.setText("M");

        txtDateNaissance.setText("01-01-01");

        txtLieuxNaissance.setText("t");

        txtCodeActeur.setText("A");

        txtNom.setText("t");
        txtNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomActionPerformed(evt);
            }
        });

        txtCodeStatut.setText("C");

        jLabel1.setText("Nom :");

        jLabel2.setText("Prenom :");

        jLabel3.setText("NumVip");

        jLabel4.setText("Civilitée");

        jLabel5.setText("Date de naissance");

        jLabel6.setText("Lieux de naissance");

        jLabel7.setText("Code acteur");

        jLabel8.setText("Code statut");

        jLabel9.setText("Pays");

        txtPays.setText("USA");
        txtPays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaysActionPerformed(evt);
            }
        });

        btnCreerVip.setText("Creer");
        btnCreerVip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreerVipActionPerformed(evt);
            }
        });

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
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPays, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodeStatut, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodeActeur, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLieuxNaissance, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDateNaissance, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCivilitee, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumVip, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrenom, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(btnCreerVip)))
                .addContainerGap(111, Short.MAX_VALUE))
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
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCivilitee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addComponent(txtDateNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtLieuxNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(txtCodeActeur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCodeStatut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(btnCreerVip)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumVipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumVipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumVipActionPerformed

    private void txtNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomActionPerformed

    private void txtPaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaysActionPerformed

    private void btnCreerVipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreerVipActionPerformed
      
        
       this.leVip.setNumVip(Integer.parseInt(txtNumVip.getText()));
       this.leVip.setNom(txtNom.getText());
       this.leVip.setPrenom(txtPrenom.getText());
       this.leVip.setPays(txtPays.getText());
       this.leVip.setCivilitee(txtCivilitee.getText());
       this.leVip.setCodeActeur(txtCodeActeur.getText());
       this.leVip.setCodeStatut(txtCodeStatut.getText());
       this.leVip.setDateNaissance(txtDateNaissance.getText());
       this.leVip.setLieuxNaissance(txtLieuxNaissance.getText());
       
       etat = true ;
       
       this.dispose();
       
    }//GEN-LAST:event_btnCreerVipActionPerformed

    private void txtPrenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrenomActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreerVip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCivilitee;
    private javax.swing.JTextField txtCodeActeur;
    private javax.swing.JTextField txtCodeStatut;
    private javax.swing.JTextField txtDateNaissance;
    private javax.swing.JTextField txtLieuxNaissance;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtNumVip;
    private javax.swing.JTextField txtPays;
    private javax.swing.JTextField txtPrenom;
    // End of variables declaration//GEN-END:variables
}
