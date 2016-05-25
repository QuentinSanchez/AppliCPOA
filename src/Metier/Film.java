/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import java.util.logging.Logger;

/**
 *
 * @author poncho
 */
public class Film {
    
    private int numVisa;
    
    private String titre;
    
    private String annee;
    
    private String libelleGenre;

    public Film(int numVisa, String titre, String annee, String libelleGenre) {
        this.numVisa = numVisa;
        this.titre = titre;
        this.annee = annee;
        this.libelleGenre = libelleGenre;
    }

    public Film() {
       this.numVisa = 0;
        this.titre = null;
        this.annee = null;
        this.libelleGenre = null;
    }
    
      public Film(int numVisa) {
       this.numVisa = numVisa;
        this.titre = null;
        this.annee = null;
        this.libelleGenre = null;
    }
    
    
    

    public int getNumVisa() {
        return numVisa;
    }

    public String getTitre() {
        return titre;
    }

    public String getAnnee() {
        return annee;
    }

    public String getLibelleGenre() {
        return libelleGenre;
    }

    public void setNumVisa(int numVisa) {
        this.numVisa = numVisa;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public void setLibelleGenre(String libelleGenre) {
        this.libelleGenre = libelleGenre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Film other = (Film) obj;
        if (this.numVisa != other.numVisa) {
            return false;
        }
        return true;
    }
   
    
    
    
    
}
