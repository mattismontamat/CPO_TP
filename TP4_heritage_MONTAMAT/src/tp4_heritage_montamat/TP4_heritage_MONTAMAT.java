/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4_heritage_montamat;

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
     ArrayList<Arme> tab = new ArrayList<Arme> ();
   tab.add( Exc);
   tab.add( Dur);
   tab.add( Che);
   tab.add( Char);
   String result =  tab.toString();
   


int a;
String b;
a= tab.size();
for(int i=0;i<a;i++) {
   
    
    System.out.println(tab.get(i));
    
    
}

    }
    
    
    
    
  
   
   
}
