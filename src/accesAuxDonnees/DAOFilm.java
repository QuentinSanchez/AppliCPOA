/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesAuxDonnees;

import Metier.AfficheFilm;
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
  
/**
 *
 * @author poncho
 */
public class DAOFilm {
    
    private final Connection connexion;
    
     public DAOFilm(Connection connexion) throws SQLException {
        this.connexion = connexion;     
    }
     
       public void lireFilm(List<Film> listeFilm) throws SQLException {    
        String requete = "select * from Film";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        ResultSet rset = pstmt.executeQuery(requete);
        while (rset.next()) { 
            
        int numVisa = rset.getInt(1);
        String titre = rset.getString(2);
        String annee = rset.getString(3);
        String libelleGenre = rset.getString(4);
       
        
        Film temp = new Film(numVisa,titre,annee,libelleGenre);
        
        listeFilm.add(temp);
            
           
        }
        rset.close();
        pstmt.close(); 
        
    }
     
     
       public void insererFilm (Film leFilm ) throws SQLException
    {
       String requete = "insert into Film values (?,?,?,?)";
       
       PreparedStatement pstm = connexion.prepareStatement(requete);
       
       pstm.setInt(1, leFilm.getNumVisa());
       pstm.setString(2, leFilm.getTitre());
       pstm.setString(3, leFilm.getAnnee());
       pstm.setString(4,  leFilm.getLibelleGenre());
      
       
       
       pstm.executeUpdate();
       
       
        requete = "insert into AfficheFilm values (?,?)"; // on insére aussi une ligne dans la table affiche film
        pstm = connexion.prepareStatement(requete);
         pstm.setInt(1, leFilm.getNumVisa());
         pstm.setString(2,"defaut.png");
         
         pstm.executeUpdate();
         
         
       
       pstm.close();
       
        
        
        
    }
       
       
        public void supprimerFilm(Film leFilm) throws SQLException
    {
         String requete = " delete from AfficheFilm where numVisa = ?";
        
         PreparedStatement pstmt = connexion.prepareStatement(requete);
         
         pstmt.setString(1,String.valueOf(leFilm.getNumVisa()));
         
         pstmt.executeUpdate();
         
                
                
                
      requete = " delete from Film where numVisa = ?";
        
          pstmt = connexion.prepareStatement(requete);
         
         pstmt.setString(1,String.valueOf(leFilm.getNumVisa()));
         
         pstmt.executeUpdate();
         pstmt.close();
         
         
        
        
        
    }
        
         public void modifierFilm(Film leFilm) throws SQLException
    {
         String requete = "Update Film set numVisa =? , titre = ? ,annee = ?, libelleGenre = ?  where numVisa = ?";
       
       PreparedStatement pstm = connexion.prepareStatement(requete);
       
       pstm.setInt(1,leFilm.getNumVisa());
       pstm.setString(2, leFilm.getTitre());
       pstm.setString(3, leFilm.getAnnee());
       pstm.setString(4,  leFilm.getLibelleGenre());
       pstm.setInt(5,  leFilm.getNumVisa());
      
       
       
       pstm.executeUpdate();
       
       pstm.close();
    }
         
         
           public Film getFilm(int numVisa) throws SQLException {    
        String requete = "select * from Film where numVisa = ?";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        
        pstmt.setInt(1, numVisa);
        
        ResultSet rset = pstmt.executeQuery();
        
        int numV = 0 ;
        
        String titre = null, annee = null , libelleGenre = null ;
        while (rset.next()) { 
            
        numV = rset.getInt(1);
        titre = rset.getString(2);
        annee = rset.getString(3);
        libelleGenre = rset.getString(4);
       
        
        Film temp = new Film(numVisa,titre,annee,libelleGenre);
        
       
            
           
        }
        
         Film temp = new Film(numVisa,titre,annee,libelleGenre);
        rset.close();
        pstmt.close(); 
        
        
        return temp ;
        
    }
           
           
           public void ajoutAffiche(AfficheFilm affiche) throws SQLException
           {
               
               String requete = "Update AfficheFilm set nomAffiche = ? where numVisa = ?";
               
               PreparedStatement pstmt = connexion.prepareStatement(requete);
               
               
               pstmt.setString(1,affiche.getNom());
               
               pstmt.setInt(2,affiche.getNumVisa());
               
               
               pstmt.executeUpdate();
               
               pstmt.close();
               
           }
           
           
              public List<String>listeFilm() throws SQLException { 
                  
               List<String> listeFilm = new ArrayList<>();   
        String requete = "select * from Film";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        ResultSet rset = pstmt.executeQuery(requete);
        while (rset.next()) { 
            
        int numVisa = rset.getInt(1);
        String titre = rset.getString(2);
      
       
        
        
        
        listeFilm.add(numVisa + "_"+titre);
            
           
        }
        rset.close();
        pstmt.close(); 
        
        return listeFilm ;
        
    }
    
    
}
