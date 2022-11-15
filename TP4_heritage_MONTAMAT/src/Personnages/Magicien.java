/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Personnages.Personnages;

/**
 *
 * @author matti
 */
public class Magicien extends Personnages {
    
    boolean confirmé;
    
    public Magicien (String nom, int pv, boolean conf){
        super(nom,pv);
        this.confirmé=conf;
    }

    public boolean isConfirmé() {
        return confirmé;
    }

    public void setConfirmé(boolean confirmé) {
        this.confirmé = confirmé;
    }
    

    
}
