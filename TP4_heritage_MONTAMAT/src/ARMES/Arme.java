/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ARMES;

/**
 *
 * @author matti
 */
public class Arme {
    String name;
    int PA; 
    
    public Arme(String nom,int att){
        name=nom;
        PA=att; 
        
    }
    
    
    @Override
    public String toString() {

        String a;
a =  "\narme: "+  name +"\npoints d'attaque: " +  PA ;

return a ;

    }
    
}
