/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Aritmetico;

/**
 *
 * @author alex
 */
public class Multiplicacion implements Aritmetica {
    float result;
    
    public Multiplicacion() {
    }

    @Override
    public String operar(float a, float b) {
        this.result = (a * b);
        return Float.toString(this.result);
    }

}
