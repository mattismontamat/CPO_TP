/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_montamat;

/**
 *
 * @author matti
 */
public class Convertisseur {
    
    int nbConversions;
    int a;
    public Convertisseur (){
    nbConversions= 0;
            }
    
    public void Convertisseur(){
}
    public double CVersK (double a ){
        a=a+273 ;
 nbConversions+=1;
        return a;
}
    public double KVersC (double a){
        a=a-273;
        nbConversions+=1;
        return a;
    }
    public double FVersC (double a){
        a=(a*1.8)+32;
        nbConversions+=1;
     return a;
    }
    public double CVersF (double a){
        a=(a-32)/1.8;
        nbConversions+=1;
        return a;
        
        
    }
    public double FVersK (double a){
       a = (a + 459.67) * 5/9 ;
       nbConversions+=1;
       return a;
    }
    public double KVersF (double a){
      a=(a *9/5) - 459.67;
      nbConversions+=1;
      return a; 
    }
@Override
public String toString () {
 return "nb de conversions"+ nbConversions;
}


}
    

    
    
