/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aritmetico;

/**
 *
 * @author LN710Q
 */
public class Suma implements Aritmetica {
    float a, b, result;
    
    public Suma() {
    }

    @Override
    public float operar(float a, float b) {
        this.a = a;
        this.b = b;
        
        result = (a + b);
        
        return result;
        
    }
    
}
