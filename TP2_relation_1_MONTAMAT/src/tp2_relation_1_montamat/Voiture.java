/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_montamat;

/**
 *
 * @author matti
 */
public class Voiture {

    String modele;
    String marque;
    int PuissanceCV;
    Personne Proprietaire;

    public Voiture(String mod, String mar, int CV) {
        modele = mod;
        marque = mar;
        PuissanceCV = CV;
        Proprietaire=null;

    }

    @Override
    public String toString() {

        String a;
a =  "\nmodele:"+  modele +"\nmarque:" +  marque + "\nnbCV:" +  PuissanceCV ;

return a ;

    }

}
