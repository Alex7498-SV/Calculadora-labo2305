/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Conversor;

/**
 *
 * @author alex
 */
public class binario implements Conversor{
    int a;
    
    @Override
    public String convertir(int a) {
        this.a = a;
        
        String binres = "";
        int res;
     

        while (a != 0) {

            res = (a % 2);
            binres = res + binres; 
            a /= 2; 

        }
        return binres;
        
    }
    

}
