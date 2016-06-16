/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeleTable;

import Metier.Vip;
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
public class ModeleJTable extends AbstractTableModel{

    
    private List<Vip> conteneur ;
    
    private String[] titre ;
    
    private DAOVIP leDao ;
    
    public ModeleJTable(DAOVIP leDao)
    {
        this.leDao = leDao ;
        
        this.titre = new String[]{"NumVip", "Nom", "Prenom","civilitee","dateNaissance","LieuxNaissance","codeActeur","codeStatut","pays"};
        
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
        
        Vip leVip = conteneur.get(rowIndex);
        
        if ( columnIndex == 0)
        {
            
            return leVip.getNumVip();
            
        }
        else if(columnIndex == 1)
        {
            
             return leVip.getNom();
        }
         else if(columnIndex == 2)
        {
            
             return leVip.getPrenom();
        }
         else if(columnIndex == 3)
        {
            
             return leVip.getCivilitee();
        }
         else if(columnIndex == 4)
        {
            
             return leVip.getDateNaissance();
        }
         else if(columnIndex == 5)
        {
            
             return leVip.getLieuxNaissance();
        }
         else if(columnIndex == 6)
        {
            
             return leVip.getCodeActeur();
        }
         else if(columnIndex == 7)
        {
            
             return leVip.getCodeStatut();
        }
         else
        {
            
             return leVip.getPays();
        }
        
    }
    
    
      @Override
    public String getColumnName(int column) {
        return titre[column];
    }
    
    
     public void insererVIP(Vip vip) throws SQLException {
        leDao.insererVIP(vip);
        conteneur.add(vip);
        this.fireTableDataChanged();
    }
  
        public void chargerVip() throws SQLException
        {
            
            leDao.lireVip(this.conteneur );
            
            this.fireTableDataChanged();
        }
        
        
        public void insererVip ( Vip leVip) throws SQLException
        {
            leDao.insererVIP(leVip);
            
            
            this.fireTableDataChanged();
            
            
            
        }
        
        
          
          
          
        
        
        
          public void modifierVip(Vip leVip, int index) throws SQLException
          {
              
              this.leDao.modifierVip(leVip);
              conteneur.remove(index);
              conteneur.add(index, leVip);
              
              
              
              this.fireTableDataChanged();
              
              
              
              
          }

   
    
}
