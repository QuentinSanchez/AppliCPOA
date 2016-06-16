/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesAuxDonnees;

import Metier.Film;
import Metier.Mariage;
import Metier.Photo;
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
  
public class DAOVIP {
    
      private final Connection connexion;

    public DAOVIP(Connection connexion) throws SQLException {
        this.connexion = connexion;     
    }
    
    
    
    
     public void insererVIP (Vip leVip ) throws SQLException
    {
       String requete = "insert into VIP values (?,?,?,?,?,?,?,?,?)";
       
       PreparedStatement pstm = connexion.prepareStatement(requete);
       
       pstm.setInt(1, leVip.getNumVip());
       pstm.setString(2, leVip.getNom());
       pstm.setString(3, leVip.getPrenom());
       pstm.setString(4,  leVip.getCivilitee());
       pstm.setString(5,  leVip.getDateNaissance());
       pstm.setString(6,  leVip.getLieuxNaissance());
       pstm.setString(7,  leVip.getCodeActeur());
       pstm.setString(8,  leVip.getCodeStatut());
       pstm.setString(9,  leVip.getPays());
       
       
       pstm.executeUpdate();
       
      
       
       
       
       
       requete = "insert into PhotoProfilVIP values (?,?)";
        pstm = connexion.prepareStatement(requete);
         pstm.setInt(1, leVip.getNumVip());
         pstm.setString(2,"defaut.png");
         
         pstm.executeUpdate();
         pstm.close();
         
         
    }
     
      
    public void lireVip(List<Vip> listeVip) throws SQLException {    
        String requete = "select * from VIP";
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        ResultSet rset = pstmt.executeQuery(requete);
        while (rset.next()) { 
            
        int numVip = rset.getInt(1);
        String nom = rset.getString(2);
        String prenom = rset.getString(3);
        String civ = rset.getString(4);
        String dateNaissance = rset.getString(5);
        String lieuxNaissance = rset.getString(6);
        String codeA = rset.getString(7);
        String codeS = rset.getString(8);
        String pays = rset.getString(9);
        
        Vip temp = new Vip(numVip,nom,prenom,civ,dateNaissance,lieuxNaissance,codeA,codeS,pays);
        
        listeVip.add(temp);
            
           
        }
        rset.close();
        pstmt.close(); 
        
    }
    
    
    public void supprimerVip(Vip leVip) throws SQLException
    {
        
          String requete = "delete from PhotoProfilVIP where numVip = ? ";
      PreparedStatement  pstmt = connexion.prepareStatement(requete);
         pstmt.setInt(1, leVip.getNumVip());
        
         
         pstmt.executeUpdate();
         
         
          requete = "delete from PhotoVIP where numVip = ? ";
        pstmt = connexion.prepareStatement(requete);
         pstmt.setInt(1, leVip.getNumVip());
        
         
         pstmt.executeUpdate();
         
       requete = " delete from VIP where numVip = ?";
        
       pstmt = connexion.prepareStatement(requete);
         
         pstmt.setString(1,String.valueOf(leVip.getNumVip()));
         
         pstmt.executeUpdate();
         
    
         
         pstmt.close();
         
         
        
        
        
    }
    
    
    public List<String> vipMarié( List<Mariage> listeMariage) 
    {
          try {
              
              //listeMariage = new ArrayList<Mariage>(); // sert uniquement pour la fenetre princiaple et non pour l'affichage
              List<String> listeItems = new ArrayList<>() ;
              
              listeMariage.clear();
              
              String requete = " select nomVip, VIP.numVip, Evenement.numVipConjoint, Evenement.numVip, Evenement.dateMariage from Evenement, VIP where (VIP.numVip = Evenement.numVip OR VIP.numVip = Evenement.numVipConjoint) AND Evenement.dateDivorce IS NULL ";
              
              PreparedStatement pstmt = connexion.prepareStatement(requete);
              
              ResultSet rset = pstmt.executeQuery(requete);
              
              int i = 0;
              
              while (rset.next()) {
                  
                  
                
                  
                  if ( i%2 == 0)
                  {
                      
                       listeItems.add(rset.getString(1).concat("_"+String.valueOf(rset.getInt(2))));
                       i++ ;
                       
                        Mariage mariage = (new Mariage(rset.getInt(4),rset.getInt(3),rset.getString(5)));
                 
               
                  listeMariage.add(mariage) ;
                      
                  }
                  else
                  {
                      
                    listeItems.set(i-listeItems.size(),listeItems.get(i-listeItems.size()).concat(" et " +rset.getString(1).concat("_"+String.valueOf(rset.getInt(2)))));
                      
                    i++ ;
                  }
                  
                  
                
                 
                 
                  
                
              }
              
              
              
              pstmt.close();
              
              return listeItems ;
          } catch (SQLException ex) {
              Logger.getLogger(DAOVIP.class.getName()).log(Level.SEVERE, null, ex);
          }
          return null;
         
        
        
    
    
    
    }
    
    
    
    
    
    public void divorcerVip(Mariage mariage, String dateD) throws SQLException
    {
        
        
        String requete = "Update Evenement set dateDivorce = ?  Where Evenement.numVIP = ? and Evenement.numVIPConjoint = ? and dateMariage = ? " ;
        
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        
        pstmt.setString(1,dateD);
        pstmt.setInt(2, mariage.getNumVip());
        pstmt.setInt(3, mariage.getNumVipConjoint());
        pstmt.setString(4, mariage.getDate());
        
        
        pstmt.executeUpdate();
        
        
        requete = "Update VIP set codeStatut = 'C' where numVip = ? ";
        
         pstmt = connexion.prepareStatement(requete);
         pstmt.setInt(1, mariage.getNumVip());
         pstmt.executeUpdate();
         
          requete = "Update VIP set codeStatut = 'C'  where numVip = ? ";
          
           pstmt = connexion.prepareStatement(requete);
         pstmt.setInt(1, mariage.getNumVipConjoint());
         
         pstmt.executeUpdate();
        
        pstmt.close();
                
        
        
    }
    
    
    public List<String> getCelibataire(List<Vip> listeVip) 
    {
          try {
              String requete = "select numVIP, nomVIP from VIP WHERE codestatut = 'C'";
              
             
              listeVip.clear();
              
              PreparedStatement pstmt = connexion.prepareStatement(requete);
              
              ResultSet rset = pstmt.executeQuery() ;
              
              String nom ;
              int num ;
              
              
              List<String> listeItem = new ArrayList<>();
              
              while(rset.next())
              {
                  
                  nom = rset.getString(2);
                  num = rset.getInt(1);
                  
                  Vip temp = new Vip(num,nom);
                  
                
                  listeVip.add(temp);
                  
                  
                  
                  listeItem.add(nom +"_"+ String.valueOf(num));
                  
                  
                  
              }
              
              
              return listeItem ;
          } catch (SQLException ex) {
              Logger.getLogger(DAOVIP.class.getName()).log(Level.SEVERE, null, ex);
          }
                
                
                
             return null;   
                
                
    }
    
    
    
    public void marierVip(Vip vip1, Vip vip2, String date, String lieux) throws SQLException
    {
        if ( vip1.getNumVip() != vip2.getNumVip())
        {
         
        String requete = "INSERT INTO Evenement Values (?,?,?,?,NULL)" ;
        
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        
        pstmt.setString(2,date);
        pstmt.setInt(1, vip1.getNumVip());
        pstmt.setInt(3, vip2.getNumVip());
        pstmt.setString(4,lieux);
        
        
        pstmt.executeUpdate();
        
        
        requete = "Update VIP set codeStatut = 'M' where numVip = ? ";
        
         pstmt = connexion.prepareStatement(requete);
         pstmt.setInt(1, vip1.getNumVip());
         pstmt.executeUpdate();
         
          requete = "Update VIP set codeStatut = 'M'  where numVip = ? ";
          
           pstmt = connexion.prepareStatement(requete);
         pstmt.setInt(1, vip2.getNumVip());
         
         pstmt.executeUpdate();
        
        pstmt.close();
        }
        
    }
    
    
    public void modifierVip(Vip leVip) throws SQLException
    {
         String requete = "Update VIP set numVip =? , nomVip = ? ,prenomVip = ?, civilite = ?, dateNaissance =? , lieuNaissance = ?, codeRole = ?, codeStatut = ?, pays = ? where numVip = ?";
       
       PreparedStatement pstm = connexion.prepareStatement(requete);
       
       pstm.setInt(1, leVip.getNumVip());
       pstm.setString(2, leVip.getNom());
       pstm.setString(3, leVip.getPrenom());
       pstm.setString(4,  leVip.getCivilitee());
       pstm.setString(5,  leVip.getDateNaissance());
       pstm.setString(6,  leVip.getLieuxNaissance());
       pstm.setString(7,  leVip.getCodeActeur());
       pstm.setString(8,  leVip.getCodeStatut());
       pstm.setString(9,  leVip.getPays());
        pstm.setInt(10, leVip.getNumVip());
       
       
       pstm.executeUpdate();
       
       pstm.close();
    }
    
    
    
    public Vip getVip(int numVip) throws SQLException
    {
        
        String requete = "select * from VIP where numVip = ?";
        
        PreparedStatement pstmt = connexion.prepareStatement(requete);
        pstmt.setInt(1, numVip);
        
        ResultSet rset = pstmt.executeQuery();
        
        String nom = null,prenom = null,civ = null,dateNaissance = null,codeA = null,codeS = null,pays = null,lieuxNaissance = null;
        
        
        while( rset.next())
        {
             
         nom = rset.getString(2);
         prenom = rset.getString(3);
         civ = rset.getString(4);
         dateNaissance = rset.getString(5);
         lieuxNaissance = rset.getString(6);
         codeA = rset.getString(7);
         codeS = rset.getString(8);
         pays = rset.getString(9);
            
            
            
            
            
        }
        
        Vip leVip = new Vip(numVip,nom,prenom,civ,dateNaissance,lieuxNaissance,codeA,codeS,pays);
        return leVip;
        
    }
    
    
    
    public void ajouterPhoto( Photo photo) throws SQLException
    {
        String requete = "INSERT INTO PhotoVIP VALUES (?,?,?,?)";
        
          PreparedStatement pstmt = connexion.prepareStatement(requete);
        pstmt.setInt(1, photo.getNumeroVip());
        pstmt.setString(2, photo.getNomPhoto());
         pstmt.setString(3, photo.getDatePhoto());
         
         pstmt.setString(4, photo.getLieu());
         
        pstmt.executeUpdate();
        
        pstmt.close();
        
    }
   
     public void ajouterPhotoProfil( Photo photo) throws SQLException
    {
        
          
         String requete = "SELECT * from PhotoProfilVIP where numVIP =?";
        
         
         
          PreparedStatement pstmt = connexion.prepareStatement(requete);
         pstmt.setInt(1, photo.getNumeroVip());
         
           ResultSet rset = pstmt.executeQuery();
           
          int i = 0 ;
          
          
           
           String test = null ;
           
           
           while ( rset.next())
           {
               test = rset.getString(2);
               
           }
        
           if ( test.equals("defaut.png"))
           {
               
        
        requete = "UPDATE PhotoProfilVIP set numPhoto = ?  where numVIP = ?";
        
           pstmt = connexion.prepareStatement(requete);
        pstmt.setInt(2, photo.getNumeroVip());
        
        pstmt.setString(1, photo.getNomPhoto());
        
        pstmt.executeUpdate();
           }
           
         
       
        
        pstmt.close();
        
    }
     
     
      public List<String> getActeur() 
    {
          try {
              String requete = "select numVIP, nomVIP from VIP WHERE codeRole = 'A 'OR codeRole ='AR' ";
              
             
             
              
              PreparedStatement pstmt = connexion.prepareStatement(requete);
              
              ResultSet rset = pstmt.executeQuery() ;
              
              String nom ;
              int num ;
              
              
              List<String> listeItem = new ArrayList<>();
              
              while(rset.next())
              {
                  
                  nom = rset.getString(2);
                  num = rset.getInt(1);
                  
                
                  
                
                  
                  listeItem.add(nom +"_"+ String.valueOf(num));
                  
                  
                  
              }
              
              
              return listeItem ;
          } catch (SQLException ex) {
              Logger.getLogger(DAOVIP.class.getName()).log(Level.SEVERE, null, ex);
          }
                
                
                
             return null;   
                
                
    }
      
        public List<String> getRealisateur() 
    {
          try {
              String requete = "select numVIP, nomVIP from VIP WHERE codeRole = 'R 'OR codeRole ='AR' ";
              
             
             
              
              PreparedStatement pstmt = connexion.prepareStatement(requete);
              
              ResultSet rset = pstmt.executeQuery() ;
              
              String nom ;
              int num ;
              
              
              List<String> listeItem = new ArrayList<>();
              
              while(rset.next())
              {
                  
                  nom = rset.getString(2);
                  num = rset.getInt(1);
                  
                
                  
                
                  
                  listeItem.add(nom +"_"+ String.valueOf(num));
                  
                  
                  
              }
              
              
              return listeItem ;
          } catch (SQLException ex) {
              Logger.getLogger(DAOVIP.class.getName()).log(Level.SEVERE, null, ex);
          }
                
                
                
             return null;   
                
                
    }
        
  
        
    public int getDernierNumero() throws SQLException
    {
          String requete = "select MAX(numVIP) from VIP ";
              
             
             
              
              PreparedStatement pstmt = connexion.prepareStatement(requete);
              
              ResultSet rset = pstmt.executeQuery() ;
              
              
              int numero = 0;
              
              while(rset.next())
              {
              
              numero = rset.getInt(1);
              }
              
              return numero ;
        
    }
     
}
    
