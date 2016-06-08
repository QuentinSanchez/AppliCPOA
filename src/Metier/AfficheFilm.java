/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

/**
 *
 * @author poncho
 */
public class AfficheFilm {
    
    
    private String nom;
    
    private int numVisa ;

    public AfficheFilm(String nom, int numVisa) {
        this.nom = nom;
        this.numVisa = numVisa;
    }

    public AfficheFilm() {
    }

    public String getNom() {
        return nom;
    }

    public int getNumVisa() {
        return numVisa;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNumVisa(int numVisa) {
        this.numVisa = numVisa;
    }
    
    
    
}
