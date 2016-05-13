/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicpoa;

import IHM.FenetreIdentification;
import IHM.FenetrePrincipale;
import accesAuxDonnees.DAOVIP;
import accesAuxDonnees.SourceMySQL;
import java.net.PasswordAuthentication;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import javax.swing.JOptionPane;
import modeleTable.ModeleJTable;
import static sun.security.jgss.GSSUtil.login;

/**
 *
 * @author poncho
 */
public class AppliCPOA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        
         DAOVIP leDao = null ;
  
  
   DataSource laSourceDeDonnees = null;
     Connection laConnexion = null;  
     
     ModeleJTable lemodele ;
 
        
       // leDao = new DAOVIP( (Connection) SourceMySQL.getSource( login));
      
        
          boolean etat = false;
        do {
            FenetreIdentification fi = new FenetreIdentification(null);
            PasswordAuthentication login = fi.identifier();
            try {
              laSourceDeDonnees =SourceMySQL.getSource(login); //211695   p1401535
                laConnexion = laSourceDeDonnees.getConnection();
                etat = true;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "login incorrect : " + ex.getMessage(),
                        "avertissement", JOptionPane.WARNING_MESSAGE);
            }
        } while (etat == false); 
        
        
        leDao = new DAOVIP(laConnexion);
        
        lemodele = new ModeleJTable(leDao);
        lemodele.chargerVip();
        
        
        try {
            FenetrePrincipale fenetre = new FenetrePrincipale(leDao,lemodele);
            fenetre.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(AppliCPOA.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
