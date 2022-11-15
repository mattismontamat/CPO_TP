/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4_heritage_montamat;

/**
 *
 * @author matti
 */
public class Magicien extends Personnages {
    
    boolean confirmé;
    
    public Magicien (String nom, int pv, boolean conf){
        super(nom,pv);
        confirmé=conf;
    }
}
