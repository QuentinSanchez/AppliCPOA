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

    public void setNumVip(int numVip) {
        this.numVip = numVip;
    }

    public void setNumVipConjoint(int numVipConjoint) {
        this.numVipConjoint = numVipConjoint;
    }
   
    
    
    
    
    
}
