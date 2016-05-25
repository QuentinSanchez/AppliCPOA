/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeleTable;

import Metier.Film;
import Metier.Vip;
import accesAuxDonnees.DAOFilm;
import accesAuxDonnees.DAOVIP;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author poncho
 */
public class ModeleJTableFilm extends AbstractTableModel{

    
    private List<Film> conteneur ;
    
    private String[] titre ;
    
    private DAOFilm leDao ;
    
    public ModeleJTableFilm(DAOFilm leDaoFilm)
    {
        this.leDao = leDaoFilm ;
        
        this.titre = new String[]{"NumVisa", "titre", "année","libelleGenre"};
        
        this.conteneur = new ArrayList<>();
        
        
    }
    
    
    
    @Override
    public int getRowCount() {
       return conteneur.size();
    }

    @Override
    public int getColumnCount() {
       return titre.length ;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        Film leFilm = conteneur.get(rowIndex);
        
        if ( columnIndex == 0)
        {
            
            return leFilm.getNumVisa();
            
        }
        else if(columnIndex == 1)
        {
            
             return leFilm.getTitre();
        }
         else if(columnIndex == 2)
        {
            
             return leFilm.getAnnee();
        }
         else if(columnIndex == 3)
        {
            
             return leFilm.getLibelleGenre();
        }
         else return null ;
      
      
        
    }
    
    
      @Override
    public String getColumnName(int column) {
        return titre[column];
    }
    
    
    
  
        public void chargerFilm() throws SQLException
        {
            
            leDao.lireFilm(this.conteneur );
            
            this.fireTableDataChanged();
        }
        
        
        public void insererFilm ( Film leFilm) throws SQLException
        {
            leDao.insererFilm(leFilm);
            
            conteneur.add(leFilm);
            
            
            this.fireTableDataChanged();
            
            
            
        }
        
          public void supprimerFilm ( Film leFilm) 
        {
        try {
            leDao.supprimerFilm(leFilm);
            
        } catch (SQLException ex) {
            Logger.getLogger(ModeleJTable.class.getName()).log(Level.SEVERE, null, ex); //mettre une fenetre d'erreur
            
        }
        
       int index = this.conteneur.indexOf(leFilm);
        
       
       if (index >= 0)
       {
           this.conteneur.remove(index);
       }
            
            
            
            
            this.fireTableDataChanged();
            
            
            
        }
          
          
          
          public void modifierFilm(Film leFilm, int index) throws SQLException
          {
              this.leDao.modifierFilm(leFilm);
              conteneur.remove(index);
              conteneur.add(index, leFilm);
              
              
              
              this.fireTableDataChanged();
              
            
              
              
              
          }

   
    
}
