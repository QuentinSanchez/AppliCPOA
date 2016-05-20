/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import java.util.Objects;

/**
 *
 * @author poncho
 */
public class Vip {
    
    private int numVip ;
    private String nom ;
    private String  prenom ;
    private String dateNaissance ;
    private String codeActeur ;
    private String codeStatut ;
    private String Pays ;
    private String lieuxNaissance ;
    private String civilitee ;

    public Vip(int numVip, String nom, String prenom, String civilitee, String dateNaissance, String lieuxNaissance, String codeActeur, String codeStatut, String Pays) {
        this.numVip = numVip;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.codeActeur = codeActeur;
        this.codeStatut = codeStatut;
        this.Pays = Pays;
        this.lieuxNaissance = lieuxNaissance;
        this.civilitee = civilitee;
    }

    public Vip() {
         this.numVip = 0;
        this.nom = null;
        this.prenom = null;
        this.dateNaissance = null;
        this.codeActeur = null;
        this.codeStatut = null;
        this.Pays = null;
        this.lieuxNaissance = null;
        this.civilitee = null;
        
    }

    public Vip(int numVip) {
        this.numVip = numVip;
    }

    public Vip(int numVip, String nom) {
        this.numVip = numVip;
        this.nom = nom;
    }

    
    
    
    
    

    public int getNumVip() {
        return numVip;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public String getCodeActeur() {
        return codeActeur;
    }

    public String getCodeStatut() {
        return codeStatut;
    }

    public String getPays() {
        return Pays;
    }

    public String getLieuxNaissance() {
        return lieuxNaissance;
    }

    public String getCivilitee() {
        return civilitee;
    }

    public void setNumVip(int numVip) {
        this.numVip = numVip;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setCodeActeur(String codeActeur) {
        this.codeActeur = codeActeur;
    }

    public void setCodeStatut(String codeStatut) {
        this.codeStatut = codeStatut;
    }

    public void setPays(String Pays) {
        this.Pays = Pays;
    }

    public void setLieuxNaissance(String lieuxNaissance) {
        this.lieuxNaissance = lieuxNaissance;
    }

    public void setCivilitee(String civilitee) {
        this.civilitee = civilitee;
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
        final Vip other = (Vip) obj;
        if (!Objects.equals(this.numVip, other.numVip)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
    
    
}
