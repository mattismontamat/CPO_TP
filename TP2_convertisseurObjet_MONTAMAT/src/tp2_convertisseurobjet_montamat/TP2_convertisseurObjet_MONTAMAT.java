/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_montamat;

import java.util.Scanner;

/**
 *
 * @author matti
 */
public class TP2_convertisseurObjet_MONTAMAT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double saisi_n; //initialisation de la variable saisi de la valeur température 

        double saisi_c;//initialisation de la variable saisi de la comparaison souhaitée
        double value;
        
        

        Scanner sc;
        sc = new Scanner(System.in);
        Convertisseur c = new Convertisseur();
        

        saisi_c = 0;
        do {

            System.out.println("Quelle conversion souhaitez vous faire ? \n1: Celcius vers Kelvin\n2: Celcius vers Farenheit\n3: Kelvin vers Celcius\n4: Kelvin vers Farenheit\n5: Farenheit vers Celcius\n6: Farenheit vers Kelvin\n7 aucune je souhaite quitter");
           saisi_c = sc.nextDouble();
            if(saisi_c==7){
                break;
            }
            System.out.println("saisissez la valeur de votre température");
            saisi_n = sc.nextDouble();

            if (saisi_c == 1) {
                value = c.CVersK(saisi_n);
                System.out.println("=" + value + "K");

            }
            if (saisi_c == 2) {
                value = c.CVersF(saisi_n);
                System.out.println("=" + value + "F");

            }
            if (saisi_c == 3) {
                value = c.KVersC(saisi_n);
                System.out.println("=" + value + "°C");

            }
            if (saisi_c == 4) {
                value = c.KVersF(saisi_n);
                System.out.println("=" + value + "F");

            }
            if (saisi_c == 5) {
                value = c.FVersC(saisi_n);
                System.out.println("=" + value + "°C");

            }
            if (saisi_c == 6) {
                value = c.FVersK(saisi_n);
                System.out.println("=" + value + "K");

            }

        } while (saisi_c != 7);
        
        System.out.println( c );

    }
}
