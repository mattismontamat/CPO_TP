/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_montamat;

/**
 *
 * @author matti
 */
public class TP2_bieres_MONTAMAT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0, "Dubuisson") ;
        uneBiere.lireEtiquette();
        
        BouteilleBiere SndBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        SndBiere.lireEtiquette();
        
        BouteilleBiere TrdBiere = new BouteilleBiere("Heinken", 5.0, "Heinken international") ;
        TrdBiere.lireEtiquette();
        
        BouteilleBiere FthBiere = new BouteilleBiere("Desperados", 5.9, "brasserie de l'Esperence") ;
        FthBiere.lireEtiquette();
        
        BouteilleBiere FvBiere = new BouteilleBiere("Desperados", 4.5, "grupo Modelo") ;
        FvBiere.lireEtiquette();

        
                

    }
   
}
