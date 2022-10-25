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
 
    double saisi_n;
    saisi_n=0;
    double saisi_c;
    saisi_c=0;
    double value;
    value=0;
    
    Scanner sc;
    sc=new Scanner(System.in);
    
    System.out.println("saisissez la valeur de votre température");
    saisi_n=sc.nextDouble();
    System.out.println("Quelle conversion souhaitez vous faire ? \n1: Celcius vers Kelvin\n2: Celcius vers Farenheit\n3: Kelvin vers Celcius\n4: Kelvin vers Farenheit\n5: Farenheit vers Celcius\n6: Farenheit vers Kelvin");
    saisi_c= sc.nextDouble();
            
  if (saisi_c==1) {
      value= CVersK(saisi_n);
      System.out.println("="+value+"K");
  }
}
}