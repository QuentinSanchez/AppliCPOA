/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import Metier.Film;
import accesAuxDonnees.DAODivers;
import modeleComboBox.ComboBoxModele;

/**
 *
 * @author poncho
 */
public class FenetreModificationFilm extends javax.swing.JDialog {

 
       Film leFilm ;
    
    boolean etat ;
    
    
    DAODivers leDaoDivers ;
    public FenetreModificationFilm(java.awt.Frame parent, Film leFilm, DAODivers leDao) {
        super(parent, true);
        this.leFilm = leFilm ;
        this.leDaoDivers = leDao ;
        
        initComponents();
        
        this.txtVisa.setEnabled(false);
    }
boolean doModal ()
   {
        this.setVisible(true);
        
        
        return etat;
       
   }

 public void remplirChamps()
   {
       
       
       txtVisa.setText(String.valueOf(this.leFilm.getNumVisa()));
       txtTitre.setText(this.leFilm.getTitre());
       txtAnnee.setText(this.leFilm.getAnnee());
       
       
       this.jComboBoxGenre.setSelectedItem(leFilm.getLibelleGenre());
       
       
      
       
       
       
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnValider.setText("Modifier");
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
            jComboBoxGenre.setModel(new ComboBoxModele ( this.leDaoDivers.getGenre()));
        }
        catch( Exception E)
        {

        }

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Modifier un film");

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
                        .addGap(148, 148, 148)
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
       
        
        
        
       this.leFilm.setNumVisa(Integer.parseInt(txtVisa.getText()));
       this.leFilm.setTitre(txtTitre.getText());
       this.leFilm.setAnnee(txtAnnee.getText());
       this.leFilm.setLibelleGenre((String) this.jComboBoxGenre.getSelectedItem());
       
       etat = true ;
       
       this.dispose(); 
        
    }//GEN-LAST:event_btnValiderActionPerformed

  
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnValider;
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
