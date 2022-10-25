/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_montamat;

/**
 *
 * @author matti
 */
public class Personne {

    String nom;
    String prenom;
    int nbVoitures ;
    Voiture [] liste_voitures ;

    public Personne(String surname, String name) {
        nom = surname;
        prenom = name;
        liste_voitures = new Voiture [3] ;
        nbVoitures=0;

    }
    
   public boolean ajouter_voiture (Voiture voiture_a_ajouter){
    if (voiture_a_ajouter.Proprietaire==null) {
        return true; 
    }  
    else{
        return false;
    }
   } 

    @Override
    public String toString() {

        return null;

    }
}
