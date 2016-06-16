/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import Metier.Film;
import accesAuxDonnees.DAODivers;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import modeleComboBox.ComboBoxModele;

/**
 *
 * @author poncho
 */
public class FenetreAjoutFilm extends javax.swing.JDialog {

 
       Film leFilm ;
    
    boolean etat ;
    
    DAODivers leDao ;
    public FenetreAjoutFilm(java.awt.Frame parent, Film leFilm, DAODivers leDaoDivers) {
        super(parent, true);
        this.leFilm = leFilm ;
        this.leDao  = leDaoDivers ;
        
        initComponents();
        
        this.jComboBoxGenre.setSelectedIndex(1);
    }
boolean doModal ()
   {
        this.setVisible(true);
        
        
        return etat;
       
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        btnValider = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtVisa = new javax.swing.JTextField();
        txtTitre = new javax.swing.JTextField();
        txtAnnee = new javax.swing.JTextField();
        jComboBoxGenre = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnValider.setText("Valider");
        btnValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValiderActionPerformed(evt);
            }
        });

        jLabel1.setText("Numero de visa :");

        jLabel2.setText("Titre :");

        jLabel3.setText("Annee de sortie :");

        jLabel4.setText("libelleGenre :");

        try{
            jComboBoxGenre.setModel(new ComboBoxModele ( this.leDao.getGenre()));
        }
        catch( Exception E)
        {

        }

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Nouveau Film");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnValider)
                            .addComponent(txtAnnee, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(txtTitre)
                            .addComponent(txtVisa)
                            .addComponent(jComboBoxGenre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel5)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtVisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTitre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(btnValider)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValiderActionPerformed
       
        
        if ( !(this.txtAnnee.getText().equals("")) && !(this.txtTitre.getText().equals("")) && !(this.txtVisa.getText().equals( "")) && this.jComboBoxGenre.getSelectedIndex() != -1)
        
        {
        try{
        this.leFilm.setNumVisa(Integer.parseInt(txtVisa.getText()));
       this.leFilm.setTitre(txtTitre.getText());
       
       
       this.leFilm.setAnnee(txtAnnee.getText());
       this.leFilm.setLibelleGenre((String)this.jComboBoxGenre.getSelectedItem());
       
        etat = true ;
       
       this.dispose(); 
        }
        catch(Exception E)
        {
            
                                       JOptionPane.showMessageDialog(this,"erreur sur les informations, verifier que le type des champs soit correct" , "attention", INFORMATION_MESSAGE);

        }
        
        }
        else
        {
            
                                      JOptionPane.showMessageDialog(this,"erreur sur les informations, verifier que tous les champs soit bien remplis " , "attention", INFORMATION_MESSAGE);

        }
       
      
    }//GEN-LAST:event_btnValiderActionPerformed

  
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnValider;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox jComboBoxGenre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtAnnee;
    private javax.swing.JTextField txtTitre;
    private javax.swing.JTextField txtVisa;
    // End of variables declaration//GEN-END:variables
}
