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
public class Division implements Aritmetica {
    float result;
    
    public Division() {
    }

    @Override
    public String operar(float a, float b) {
        if(b==0){
            return "Guantelete de Infinito";
        }
        this.result = (a /b);
        return Float.toString(this.result);
    }

}
