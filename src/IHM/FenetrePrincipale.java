/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import Metier.Film;
import Metier.Mariage;
import Metier.Vip;
import accesAuxDonnees.DAODivers;
import accesAuxDonnees.DAOFilm;
import accesAuxDonnees.DAOVIP;
import accesAuxDonnees.SourceMySQL;
import java.net.PasswordAuthentication;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import javax.swing.JTable;
import modeleComboBox.ComboBoxModele;
import modeleTable.ModeleJTable;
import modeleTable.ModeleJTableFilm;


/**
 *
 * @author poncho
 */
public class FenetrePrincipale extends javax.swing.JFrame {

  DAOVIP leDao ;
  
   DAOFilm leDaoFilm ;
  SourceMySQL source ;
  
  DAODivers leDaoDivers ;
  
  Vip vip ;
  
  List<Mariage> listeMariage ;
  
  List<Vip> listeVip ;
  
  
  ModeleJTable lemodele ;
  
   ModeleJTableFilm lemodeleFilm ;
  
    public FenetrePrincipale(DAOVIP Dao,DAOFilm leDaoFilm, ModeleJTable modele, ModeleJTableFilm modeleFilm, DAODivers leDaoDivers) throws SQLException, Exception {
        vip = new Vip();
        
        this.lemodele = modele ;
        
        this.lemodeleFilm = modeleFilm ;
       this.leDao = Dao ;
       
       this.leDaoFilm = leDaoFilm ;
       
       this.leDaoDivers = leDaoDivers ;
       
       this.listeMariage = new ArrayList<>();
       
       this.listeVip = new ArrayList<>();
       
        initComponents();
    }
    
    public Vip getVip ()
    {
        return this.vip;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVip = new javax.swing.JTable();
        btnAjouterVip = new javax.swing.JButton();
        btnSupprimer = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        comboBoxMariage = new javax.swing.JComboBox();
        btnDivorcer = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtAnneeD = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtMoisD = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtJourD = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableFilm = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnSupprimerFilm = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboVip1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxVip2 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        btnAjouterVip2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtAnnee = new javax.swing.JTextField();
        txtLieux = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtMois = new javax.swing.JTextField();
        txtJour = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableVip.setModel(lemodele);
        jScrollPane1.setViewportView(tableVip);

        btnAjouterVip.setText("ajouterVip");
        btnAjouterVip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterVipActionPerformed(evt);
            }
        });

        btnSupprimer.setText("supprimer un Vip");
        btnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerActionPerformed(evt);
            }
        });

        jButton2.setText("Modifier");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAjouterVip, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSupprimer)
                        .addGap(30, 30, 30))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSupprimer)
                    .addComponent(btnAjouterVip)
                    .addComponent(jButton2))
                .addGap(21, 21, 21))
        );

        jTabbedPane2.addTab("VIP", jPanel1);

        comboBoxMariage.setModel(new ComboBoxModele(this.leDao.vipMarié(this.listeMariage)));

        btnDivorcer.setText("Divorcer les deux Vip");
        btnDivorcer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivorcerActionPerformed(evt);
            }
        });

        jLabel3.setText("Liste des mariages");

        jLabel1.setText("Date du divorce :");

        jLabel17.setText("aaaa");

        jLabel18.setText("mm ");

        txtMoisD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMoisDActionPerformed(evt);
            }
        });

        jLabel19.setText("jj");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboBoxMariage, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 110, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(188, 188, 188))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnDivorcer, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119))))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtAnneeD, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMoisD, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addGap(1, 1, 1)
                .addComponent(txtJourD, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboBoxMariage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtAnneeD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(txtMoisD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJourD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(btnDivorcer)
                .addGap(131, 131, 131))
        );

        //jComboBox1.setModel(new ComboBoxModele(this.leDao.vipMarié()));

        jTabbedPane2.addTab("Divorce", jPanel2);

        tableFilm.setModel(lemodeleFilm);
        jScrollPane2.setViewportView(tableFilm);

        jButton3.setText("Ajouter un film  ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("modifier un film");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnSupprimerFilm.setText("Supprimer un film");
        btnSupprimerFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerFilmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(40, 40, 40)
                        .addComponent(btnSupprimerFilm))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(btnSupprimerFilm))
                .addGap(21, 21, 21))
        );

        jTabbedPane2.addTab("Film", jPanel4);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setText("Film :");

        jLabel12.setText("Acteur:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(69, 69, 69)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, 0, 97, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(268, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(38, 38, 38)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(288, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Casting", jPanel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Photo", jPanel6);

        jLabel2.setText("Liste des célibataires :");

        jComboVip1.setModel(new ComboBoxModele(this.leDao.getCelibataire(this.listeVip)) );

        jLabel4.setText("Mariage");

        jLabel5.setText("VIP 1 :");

        jLabel6.setText("VIP 2 :");

        jLabel7.setText("Liste des célibataires :");

        jComboBoxVip2.setModel(new ComboBoxModele(this.leDao.getCelibataire(this.listeVip)) );

        jLabel8.setText("ou :");

        btnAjouterVip2.setText("AjouterVip");
        btnAjouterVip2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterVip2ActionPerformed(evt);
            }
        });

        jButton1.setText("Marier les Vip");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setText("Date du mariage :");

        jLabel10.setText("lieux du mariage :");

        jLabel13.setText("aaaa");

        jLabel14.setText("mm ");

        txtMois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMoisActionPerformed(evt);
            }
        });

        jLabel15.setText("jj");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboVip1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLieux, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtMois, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel15))
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addComponent(jComboBoxVip2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jLabel8))
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(39, 39, 39)
                                                .addComponent(btnAjouterVip2))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(txtJour, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboVip1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jLabel6)
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxVip2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(btnAjouterVip2))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(txtMois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtLieux, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(34, 34, 34))
        );

        jTabbedPane2.addTab("Mariage", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSupprimerFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerFilmActionPerformed

        int reponse = JOptionPane.showConfirmDialog(this, "voulez vous vraiment supprimer le Film?","confirmation", YES_NO_OPTION);
        if( reponse == JOptionPane.YES_OPTION)
        {

            int leNumero = -1 ;

            int ligne = this.tableFilm.getSelectedRow();

            Film leFilm = new Film((int) lemodeleFilm.getValueAt(ligne, 0));

            lemodeleFilm.supprimerFilm(leFilm);
        }
    }//GEN-LAST:event_btnSupprimerFilmActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        int leNumero = -1 ;

        int ligne = this.tableFilm.getSelectedRow();

        if(ligne!= -1)
        {
            try {

                leNumero =(int) lemodeleFilm.getValueAt(ligne,0);

                Film leFilmM = leDaoFilm.getFilm(leNumero);

                FenetreModificationFilm fen4 = new FenetreModificationFilm(this, leFilmM);

                fen4.remplirChamps();

                if( fen4.doModal())
                {

                    this.lemodeleFilm.modifierFilm(leFilmM,ligne);

                }

            } catch (SQLException ex) {
                Logger.getLogger(FenetrePrincipale.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Film unFilm = new Film();

        FenetreAjoutFilm fen3 = new FenetreAjoutFilm(this,unFilm);

        if ( fen3.doModal() == true)
        {

            try {
                lemodeleFilm.insererFilm(unFilm);
            } catch (SQLException ex) {
                           JOptionPane.showMessageDialog(this,"erreur sur les informations, verifier que le numero de Visa ne soit pas dupliqué" , "attention", INFORMATION_MESSAGE);
            }

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnDivorcerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivorcerActionPerformed

        if (!(txtAnneeD.getText().equals("")) && !(comboBoxMariage.getSelectedIndex() == -1) &&!(txtMoisD.getText().equals(""))  &&!(txtJourD.getText().equals("")) )
        {

            try {

                int index = comboBoxMariage.getSelectedIndex();
                
                 String dateD = txtAnneeD.getText() +"-"+txtMoisD.getText()+"-"+txtJourD.getText() ;
                this.leDao.divorcerVip(this.listeMariage.get(comboBoxMariage.getSelectedIndex()),dateD );

                this.listeMariage.remove(index);

                this.comboBoxMariage.setModel(new ComboBoxModele(this.leDao.vipMarié(this.listeMariage)));
                this.jComboBoxVip2.setModel(new ComboBoxModele(leDao.getCelibataire(listeVip)));
                this.jComboVip1.setModel((new ComboBoxModele(leDao.getCelibataire(listeVip))));

            } catch (SQLException ex) {
                           JOptionPane.showMessageDialog(this,"le format de la date est mauvais, il boit etre come suivant" , "attention", INFORMATION_MESSAGE);

            }

        }
        else

        {

            JOptionPane.showMessageDialog(this,"attention vous n'avez pas renseigné la date ou le mariage" , "attention", INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnDivorcerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Vip vip1 = listeVip.get(this.jComboVip1.getSelectedIndex());
        Vip vip2 = listeVip.get(this.jComboBoxVip2.getSelectedIndex());

        if ( vip1.equals(vip2))
        {
            JOptionPane.showMessageDialog(this,"vous ne pouvez pas marier un Vip avec lui même" , "attention", INFORMATION_MESSAGE);

        }
        else
        {

            try {
                
                String date = txtAnnee.getText() +"-"+txtMois.getText()+"-"+txtJour.getText() ;
                leDao.marierVip(vip1, vip2, date, txtLieux.getText());

                txtAnnee.setText("");
                txtLieux.setText("");

                this.jComboBoxVip2.setModel(new ComboBoxModele(leDao.getCelibataire(listeVip)));
                this.jComboVip1.setModel((new ComboBoxModele(leDao.getCelibataire(listeVip))));

                this.comboBoxMariage.setModel(new ComboBoxModele(this.leDao.vipMarié(this.listeMariage)));
            } catch (SQLException ex) {
                Logger.getLogger(FenetrePrincipale.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAjouterVip2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterVip2ActionPerformed
        FenetreModifierVip fen = new FenetreModifierVip(this, vip);

        if ( fen.doModal() == true)
        {
            try {
                lemodele.insererVIP(vip);

                this.listeVip.add(vip);

                this.jComboBoxVip2.setModel(new ComboBoxModele(leDao.getCelibataire(listeVip)));

                this.jComboBoxVip2.setSelectedItem((vip.getNom())+"-"+vip.getNumVip());

            } catch (SQLException ex) {
                Logger.getLogger(FenetrePrincipale.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btnAjouterVip2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int leNumero = -1 ;

        int ligne = this.tableVip.getSelectedRow();

        if(ligne!= -1)
        {
            try {

                leNumero =(int) lemodele.getValueAt(ligne,0);

                Vip vipModifier = leDao.getVip(leNumero);

                FenetreModifierVip fen2 = new FenetreModifierVip(this, vipModifier);

                fen2.remplirChamps();

                if( fen2.doModal())
                {

                    this.lemodele.modifierVip(vipModifier,ligne);

                }

            } catch (SQLException ex) {
                           JOptionPane.showMessageDialog(this,"erreur sur les informations, verifier que le numero de Vip ne soit pas dupliqué ou que la date soit au bon format" , "attention", INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerActionPerformed

        int reponse = JOptionPane.showConfirmDialog(this, "voulz vous vraiment supprimer le Vip?","confirmation", YES_NO_OPTION);
        if( reponse == JOptionPane.YES_OPTION)
        {

            int leNumero = -1 ;

            int ligne = this.tableVip.getSelectedRow();

            Vip vip = new Vip((int) lemodele.getValueAt(ligne, 0));

            lemodele.supprimerVipTable(vip);
        }
    }//GEN-LAST:event_btnSupprimerActionPerformed

    private void btnAjouterVipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterVipActionPerformed

        Vip vipAjouter = new Vip();

        FenetreAjoutVip fen = new FenetreAjoutVip(this, vipAjouter, this.leDaoDivers );

        if ( fen.doModal() == true)
        {
            try {
                lemodele.insererVIP(vipAjouter );
            } catch (SQLException ex) {
                           JOptionPane.showMessageDialog(this,"erreur sur les informations, verifier que le numero de Vip ne soit pas dupliqué ou que la date soit au bon format" , "attention", INFORMATION_MESSAGE);
            }

        }
    }//GEN-LAST:event_btnAjouterVipActionPerformed

    private void txtMoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMoisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMoisActionPerformed

    private void txtMoisDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMoisDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMoisDActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjouterVip;
    private javax.swing.JButton btnAjouterVip2;
    private javax.swing.JButton btnDivorcer;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.JButton btnSupprimerFilm;
    private javax.swing.JComboBox comboBoxMariage;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBoxVip2;
    private javax.swing.JComboBox jComboVip1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable tableFilm;
    private javax.swing.JTable tableVip;
    private javax.swing.JTextField txtAnnee;
    private javax.swing.JTextField txtAnneeD;
    private javax.swing.JTextField txtJour;
    private javax.swing.JTextField txtJourD;
    private javax.swing.JTextField txtLieux;
    private javax.swing.JTextField txtMois;
    private javax.swing.JTextField txtMoisD;
    // End of variables declaration//GEN-END:variables
}
