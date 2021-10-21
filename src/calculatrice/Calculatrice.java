/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice;

/**
 *
 * @author xafree
 */
public class Calculatrice {
    
    
    public Calculatrice(){}
    
    
    public int somme( int a, int b){
        return a+b;
    }
    
    public int soustraction(int a, int b){
        return a-b;
    }
    
    public int division(int diviseur, int diviser){
        if(diviseur!=0){
            return diviser/diviseur;
        }
        return 0;
    }
    
    public int mutiplication(int a, int b){
        return a*b;
    }
    
}
