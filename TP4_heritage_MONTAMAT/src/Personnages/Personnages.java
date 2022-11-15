/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import ARMES.Arme;
import java.util.ArrayList;

/**
 *
 * @author matti
 */
public class Personnages {
    String name;
    int PV;
    ArrayList<Arme> inventaire = new ArrayList (5);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPV() {
        return PV;
    }

    public void setPV(int PV) {
        if (PV>0){
        this.PV = PV;
        }
    }
    public Personnages(String nom,int pv){
        this.name=nom;
        this.PV=pv;
    }
    
    @Override
    public String toString() {

        String a;
a =  "\nnom: "+  name +"\npoints de vie: " +  PV ;

return a ;
    
    
}
}
