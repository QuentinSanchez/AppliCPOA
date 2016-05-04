/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesAuxDonnees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
  
public class DAOVIP {
    
      private final Connection connexion;

    public DAOVIP(Connection connexion) throws SQLException {
        this.connexion = connexion;     
    }
    
    
    
    
     public void insererVIP (String numVIP ,String nom, String prenom,String civilite,String dateNaissance,String lieuxNaissance,String codeActeur, String codeStatut, String pays ) throws SQLException
    {
       String requete = "insert into vip values (?,?,?,?,?,?,?,?)";
       
       PreparedStatement pstm = connexion.prepareStatement(requete);
       
       pstm.setString(1, numVIP);
       pstm.setString(2, nom);
       pstm.setString(3, prenom);
       pstm.setString(4, civilite);
       pstm.setString(5, dateNaissance);
       pstm.setString(6, lieuxNaissance);
       pstm.setString(7, codeActeur);
       pstm.setString(8, codeStatut);
       pstm.setString(9, pays);
       
       
       pstm.executeUpdate();
       
        
        
        
    }
     
     
    }
    

