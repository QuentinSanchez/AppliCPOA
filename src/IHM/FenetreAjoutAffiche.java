/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import Metier.AfficheFilm;
import Metier.Photo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPSClient;

/**
 *
 * @author poncho
 */
public class FenetreAjoutAffiche extends javax.swing.JDialog {

  private File f ;
  
  private String nomAffiche ;
  
  private AfficheFilm affiche ;
  
  private String nomF;
  
  private boolean etat ;
   
    public FenetreAjoutAffiche(java.awt.Frame parent, AfficheFilm affiche, int numVisa ) {
        super(parent, true);
        
        
        this.affiche = affiche ;
        
        this.affiche.setNumVisa(numVisa);
        
        initComponents();
    }

  public boolean doModal()
  {
      this.setVisible(true);
      return this.etat ;
  }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAffiche = new javax.swing.JButton();
        txtNomPhoto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnAffiche.setText("Choisir affiche");
        btnAffiche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfficheActionPerformed(evt);
            }
        });

        txtNomPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomPhotoActionPerformed(evt);
            }
        });

        jLabel1.setText("Nom de la photo :");

        jButton2.setText("Upload");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Ajouter une affiche");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAffiche))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(65, 65, 65)
                        .addComponent(txtNomPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel2)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(btnAffiche)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNomPhoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAfficheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfficheActionPerformed

        JFileChooser chooser = new JFileChooser( new File("."));

        chooser.setDialogTitle("ouvrir une image");

        int reponse = chooser.showOpenDialog(this);
        
        boolean etat ;

        if (reponse == JFileChooser.APPROVE_OPTION)
        {

            InputStream input = null;

            f = chooser.getSelectedFile();

            nomAffiche = f.getName() ;
            nomF = f.getAbsolutePath();

            txtNomPhoto.setText(nomAffiche);

        }

    }//GEN-LAST:event_btnAfficheActionPerformed

    private void txtNomPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomPhotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomPhotoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            FileInputStream input = null;
            try {
                input = new FileInputStream(nomF);

            } catch (FileNotFoundException ex) {
                Logger.getLogger(FenetreAjoutPhoto.class.getName()).log(Level.SEVERE, null, ex);
            }
            FTPSClient ftpClient = new FTPSClient();

            ftpClient.connect("iutdoua-samba.univ-lyon1.fr",990);
            Properties props = new Properties();
            FileInputStream fichier = new FileInputStream("src/info.properties");
            props.load(fichier);
            ftpClient.login(props.getProperty("login"), props.getProperty("password"));

            System.out.println(ftpClient.getReplyString());

            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);

            ftpClient.setFileTransferMode(FTP.BINARY_FILE_TYPE);
            ftpClient.enterLocalPassiveMode();

            String remote ;

           
                remote = "public_html/CPOA/Site/assets/affichesFilm/" + txtNomPhoto.getText() ;

           

         

            boolean done = ftpClient.storeFile(remote, input);
            input.close();

            if( done)
            {

                System.out.println("reussi");

                this.affiche.setNom(txtNomPhoto.getText());

               

              

                etat = true ;

                this.dispose();
            }
            else
            {
                System.out.println(ftpClient.getReplyString());
                this.dispose();
            }

        } catch (IOException ex) {
            Logger.getLogger(FenetreAjoutPhoto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

   
  
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAffiche;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtNomPhoto;
    // End of variables declaration//GEN-END:variables

    
}
