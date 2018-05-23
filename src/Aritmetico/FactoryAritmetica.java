/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aritmetico;

import AbstractFactory.AbstractFactory;
import Conversor.Conversor;

/**
 *
 * @author LN710Q
 */
public class FactoryAritmetica implements AbstractFactory {

    @Override
    public Aritmetica getop(int type) {
        switch (type) {
            case 1:
                return new Suma(float a, float b);
            case 2:
                return new Resta(float a, float b);
            case 3:
                return new Multiplicacion(float a, float b);
            case 4:
                return new Division(float a, float b);
                
            
                
        }
    }

    @Override
    public Conversor getconv(int type) {
        return null;
    }
    
}
