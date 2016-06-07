/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesAuxDonnees;

import Metier.Film;
import Metier.Mariage;
import Metier.Vip;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
public class DAODivers {
    
     private final Connection connexion;

    public DAODivers(Connection connexion) throws SQLException {
        this.connexion = connexion;     
    }
    
    
    public List<String> getPays() throws SQLException
    {
       String requete = "select * from Pays";
       
       PreparedStatement pstmt = this.connexion.prepareStatement(requete);
       
       List<String> listePays = new ArrayList<>();
       
       
       ResultSet rset = pstmt.executeQuery();
       
       
       while( rset.next())
       {
           
           listePays.add(rset.getString(1));
       }
        
        
        return listePays ;
        
        
        
        
        
    }
    
     public List<String> getGenre() throws SQLException
    {
       String requete = "select * from Genre";
       
       PreparedStatement pstmt = this.connexion.prepareStatement(requete);
       
       List<String> listeGenre = new ArrayList<>();
       
       
       ResultSet rset = pstmt.executeQuery();
       
       
       while( rset.next())
       {
           
           listeGenre.add(rset.getString(1));
       }
        
        
        return listeGenre ;
        
        
        
        
        
    }
    
}
