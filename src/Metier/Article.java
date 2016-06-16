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
public class Article {
    
    private int idArticle ;
    private String auteur ;
    
    private String date ;
    private String heure ;
    
    private String contenu ;
    
    private String titre ;
    
    private String nomPhoto ;

    public Article(int idArticle, String auteur, String date, String heure, String contenu, String titre, String nomPhoto) {
        this.idArticle = idArticle;
        this.auteur = auteur;
        this.date = date;
        this.heure = heure;
        this.contenu = contenu;
        this.titre = titre;
        this.nomPhoto = nomPhoto;
    }

   

    public Article() {
        
        
    }

    public int getIdArticle() {
        return idArticle;
    }

    public String getNomPhoto() {
        return nomPhoto;
    }

   

    public String getAuteur() {
        return auteur;
    }

    public String getDate() {
        return date;
    }

    public String getHeure() {
        return heure;
    }

    public String getContenu() {
        return contenu;
    }

    public String getTitre() {
        return titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setIdArticle(int idArticle) {
        this.idArticle = idArticle;
    }

    public void setNomPhoto(String nomPhoto) {
        this.nomPhoto = nomPhoto;
    }
    
    
    
    
    
    
    
}
