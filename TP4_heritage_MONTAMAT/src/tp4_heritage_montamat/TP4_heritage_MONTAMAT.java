/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4_heritage_montamat;

import Personnages.Guerrier;
import Personnages.Magicien;
import Personnages.Personnages;
import ARMES.epée;
import ARMES.baton;
import ARMES.Arme;
import java.util.ArrayList;

/**
 *
 * @author matti
 */
public class TP4_heritage_MONTAMAT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    epée Exc = new epée ("Excalibur", 7, 5  ) ;
    epée Dur = new epée ("Durendal", 4, 7  ) ;
    baton Che = new baton ("Chene", 4, 5 );
    baton Char = new baton ("Charme", 5, 6 );
     ArrayList<Arme> tab = new ArrayList ();
   tab.add( Exc);
   tab.add( Dur);
   tab.add( Che);
   tab.add( Char);
   
   


int a;

a= tab.size();
for(int i=0;i<a;i++) {
    System.out.println(tab.get(i));
}

Magicien n1 = new Magicien("Gandalf",65,true);
Magicien n2 = new Magicien ("Garcimore", 44, false);
Guerrier N1 = new Guerrier ("Conan",78,false);
Guerrier N2 = new Guerrier ("Lannister",45,true);

ArrayList<Personnages> pers = new ArrayList ();
pers.add(n1);
pers.add(n2);
pers.add(N1);
pers.add(N2);

int b;

b= pers.size();
for(int i=0;i<b;i++) { 
    System.out.println(pers.get(i));    
    }



    }
}
    
    
    
    
  
   
   
   
