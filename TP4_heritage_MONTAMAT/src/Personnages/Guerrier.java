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
public class Guerrier extends Personnages {
    boolean cheval;
    
    public Guerrier (String nom, int pv, boolean chev){
        super(nom,pv);
        cheval=chev;
    }

    public boolean isCheval() {
        return cheval;
    }

    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }
    
}
