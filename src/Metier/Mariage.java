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
public class Mariage {
    
    
    
    private int numVip ;
    
    private int numVipConjoint ;
    
    
    private String date ;

    public Mariage(int numVip, int numVipConjoint, String date) {
        this.numVip = numVip;
        this.numVipConjoint = numVipConjoint;
        this.date = date;
    }
    
    
    

    public Mariage(int numVip, int numVipConjoint) {
        this.numVip = numVip;
        this.numVipConjoint = numVipConjoint;
    }

    public int getNumVip() {
        return numVip;
    }

    public int getNumVipConjoint() {
        return numVipConjoint;
    }

    public String getDate() {
        return date;
    }
    
    

    public void setNumVip(int numVip) {
        this.numVip = numVip;
    }

    public void setNumVipConjoint(int numVipConjoint) {
        this.numVipConjoint = numVipConjoint;
    }

    public void setDate(String date) {
        this.date = date;
    }
    

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Mariage other = (Mariage) obj;
        if (this.numVip != other.numVip) {
            return false;
        }
        if (this.numVipConjoint != other.numVipConjoint) {
            return false;
        }
        return true;
    }
   
    
    
    
    
    
}
