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
public class Photo {
    
    private String nomPhoto ;
    
    private int numeroVip ;
    
    private String datePhoto ;
    
    private String lieu ;
    
    private int typePhoto ;

    public Photo(String nomPhoto, int numeroVip, String datePhoto, String lieu) {
        this.nomPhoto = nomPhoto;
        this.numeroVip = numeroVip;
        this.datePhoto = datePhoto;
        this.lieu = lieu;
    }

    public Photo(int numeroVip) {
        this.numeroVip = numeroVip;
    }

    public String getNomPhoto() {
        return nomPhoto;
    }

    public int getTypePhoto() {
        return typePhoto;
    }
    
    

    public int getNumeroVip() {
        return numeroVip;
    }

    public String getDatePhoto() {
        return datePhoto;
    }

    public String getLieu() {
        return lieu;
    }

    public void setNomPhoto(String nomPhoto) {
        this.nomPhoto = nomPhoto;
    }

    public void setNumeroVip(int numeroVip) {
        this.numeroVip = numeroVip;
    }

    public void setDatePhoto(String datePhoto) {
        this.datePhoto = datePhoto;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public void setTypePhoto(int typePhoto) {
        this.typePhoto = typePhoto;
    }
    
    
    
    
    
    
}
