/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import Metier.Photo;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

import javax.swing.JFileChooser;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPSClient;

/**
 *
 * @author poncho
 */
public class FenetreAjoutPhoto extends javax.swing.JDialog {

  private File f ;
  
  private String nomPhoto ;
  
  private Photo laPhoto ;
  
  
  private boolean etat ;
  
  private String nomF;
    public FenetreAjoutPhoto(java.awt.Frame parent,  Photo laPhoto) {
        super(parent, true);
        
        this.laPhoto= laPhoto ;
        
        etat = false ;
        
        initComponents();
    }
    
    public boolean doModal()
    {
        this.setVisible(true);
        return etat ;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupP = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtNomPhoto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLieu = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtAnneeD = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtMoisD = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtJourD = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        radioBtnPhotoP = new javax.swing.JRadioButton();
        radioBtnPhoto = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        buttonGroupP.add(radioBtnPhotoP);
        buttonGroupP.add(radioBtnPhoto);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Choisir photo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Upload");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtNomPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomPhotoActionPerformed(evt);
            }
        });

        jLabel1.setText("Nom de la photo :");

        jLabel2.setText("Lieu de la photo :");

        jLabel17.setText("aaaa");

        jLabel18.setText("mm ");

        txtMoisD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMoisDActionPerformed(evt);
            }
        });

        jLabel19.setText("jj");

        jLabel3.setText("Date :");

        radioBtnPhotoP.setText("PhotoProfil");

        radioBtnPhoto.setText("Photo");

        jLabel4.setText("Type de la photo :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Ajouter une photo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(121, 121, 121)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtNomPhoto)
                                        .addComponent(txtLieu)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(80, 80, 80))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel2))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel17))
                                        .addComponent(jLabel4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtAnneeD, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel18)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtMoisD, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(radioBtnPhotoP))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(radioBtnPhoto)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addComponent(jLabel19)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtJourD, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(64, 64, 64))))
                        .addContainerGap(84, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(59, 59, 59)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnneeD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(txtMoisD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJourD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioBtnPhotoP)
                            .addComponent(radioBtnPhoto)
                            .addComponent(jLabel4))
                        .addContainerGap(60, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        JFileChooser chooser = new JFileChooser( new File("."));
        
        chooser.setDialogTitle("ouvrir une image");
        
        int reponse = chooser.showOpenDialog(this);
        
        if (reponse == JFileChooser.APPROVE_OPTION)
        {
            
             InputStream input = null;
           
                f = chooser.getSelectedFile();
                
                
               nomPhoto = f.getName() ;
                nomF = f.getAbsolutePath();
                
               
                txtNomPhoto.setText(nomPhoto);
                
                
                
                
                
     
            
          
        }
                                              

 
                                   

 
     
    }//GEN-LAST:event_jButton1ActionPerformed

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
     
     String remote = null ;
     
     if(this.radioBtnPhoto.isSelected())
     {
          remote = "public_html/CPOA/Site/assets/photos/" + txtNomPhoto.getText() ;
          
          this.laPhoto.setTypePhoto(1);
          
          
         
     }
     else if ((this.radioBtnPhotoP.isSelected()))
     {
          remote = "public_html/CPOA/Site/assets/photoProfil/" + txtNomPhoto.getText() ;
         this.laPhoto.setTypePhoto(2);
     }
  
  
    
    String test[] =  txtNomPhoto.getText().split("\\.") ;
    
    
   //String nomPhotoBase = txtNomPhoto.getText().split("\\.")[0];
    
    
    //System.out.println(nomPhotoBase) ;
    
    
    
          boolean done = ftpClient.storeFile(remote, input);
          input.close();
          
          if( done)
          {
              
              System.out.println("reussi");
              
              this.laPhoto.setNomPhoto(txtNomPhoto.getText());
              
              this.laPhoto.setLieu(txtLieu.getText());
              
              String dateD = txtAnneeD.getText() +"-"+txtMoisD.getText()+"-"+txtJourD.getText() ;
              this.laPhoto.setDatePhoto(dateD);
              
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

    private void txtNomPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomPhotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomPhotoActionPerformed

    private void txtMoisDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMoisDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMoisDActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupP;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton radioBtnPhoto;
    private javax.swing.JRadioButton radioBtnPhotoP;
    private javax.swing.JTextField txtAnneeD;
    private javax.swing.JTextField txtJourD;
    private javax.swing.JTextField txtLieu;
    private javax.swing.JTextField txtMoisD;
    private javax.swing.JTextField txtNomPhoto;
    // End of variables declaration//GEN-END:variables

}