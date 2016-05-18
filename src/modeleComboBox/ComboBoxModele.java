/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeleComboBox;

import java.util.Arrays;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author poncho
 */
public class ComboBoxModele 
    
     extends DefaultComboBoxModel<String> {

    private List<String> listeItems;
    

    public ComboBoxModele(List<String> listeItems) {
        super();
       this.listeItems = listeItems;
    }

    public void addElement(String uneChaine) {
        super.addElement(uneChaine);
    }

    @Override
    public String getElementAt(int i) {
        return listeItems.get(i);
    }

    @Override
    public int getSize() {
        return listeItems.size();
    }

    
}
