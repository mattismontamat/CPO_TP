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
    public Convertisseur (){
    nbConversions= 0;
            }
    
    public void Convertisseur(){
}
    public double CversK (double a ){
        a=a+273 ;
 
        return a;
}
    public double KVersC (double b){
        b=b-273;
        return b;
    }
    public double FVersC (double c){
        c=(c*1.8)+32;
     return c;
    }
    public double CVersF (double d){
        d=(d-32)/1.8;
        return d;
        
    }
    public double FVersK (double e){
       e = (e + 459.67) * 5/9 ;
       return e;
    }
    public double KVersF (double f){
      f=(f *9/5) - 459.67;
      return f; 
    }
    public double toString (){
        
    }

}
    

    
    
