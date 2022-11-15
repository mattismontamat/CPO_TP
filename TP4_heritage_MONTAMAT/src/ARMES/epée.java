/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ARMES;

import ARMES.Arme;

/**
 *
 * @author matti
 */
public class epée extends Arme {
    int finesse;
    
    public epée (String nom, int att, int fin){
        super (nom,att);
        finesse=fin;
    }
    
   
    
}
