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
public class baton extends Arme{
    
    int age;
    
    public baton (String nom, int att, int a){
        super (nom,att);
        age=a;
    }
}
