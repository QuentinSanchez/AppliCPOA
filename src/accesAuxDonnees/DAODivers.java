/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesAuxDonnees;

import Metier.Article;
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
    
    
    public List<String> getPays() throws SQLException // renvois la liste des pays pour les jcombobox
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
    
     public List<String> getGenre() throws SQLException // renvois la liste des genres pour les jcombobox
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
     
     
     public void insererCasting(int numVip, int numVisa, String codeRole) throws SQLException // insére un casting
     {
         String requete = null ;
         if ( codeRole.equals("A")) // on teste le codeRole inséré
         {
         
           requete = "insert into Casting values (?,?,'A')";
           
         }
         
        else
         {
             
              requete = "insert into Casting values (?,?,'R')";
         }
       
       PreparedStatement pstmt = this.connexion.prepareStatement(requete);
       
     pstmt.setInt (1,numVip);
     
     pstmt.setInt(2,numVisa);
       
      pstmt.executeUpdate();
      
      pstmt.close();
        
        
       
        
        
        
         
     }
     
     
     public void insérerArticle(Article article) throws SQLException // permet l'insertion d'un article
     {
         String requete = "select MAX(idArticle) from Articles"; // selectionne les dernier idArticle utilisé pour une incrémentation automatique
         
          PreparedStatement pstmt = this.connexion.prepareStatement(requete);
          
        ResultSet rset=  pstmt.executeQuery();
        
        int idArticle = 0;
        
        while(rset.next())
        {
            idArticle = rset.getInt(1)+1;
            
        }
          
          
         
         
         requete = "insert into Articles values(?,?,?,?,?,?,?)";
         
         
          pstmt = this.connexion.prepareStatement(requete);
         
         pstmt.setInt(1,idArticle);
         pstmt.setString(2,article.getTitre());
         pstmt.setString(3,article.getAuteur());
         pstmt.setString(4,article.getContenu());
         pstmt.setString(5,article.getDate());
         pstmt.setString(6,article.getHeure());
          pstmt.setString(7,article.getNomPhoto());
         
         
         pstmt.executeUpdate();
         
         pstmt.close();
         
         
     }
     
    
}
