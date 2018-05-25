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
                return new Suma();
            case 2:
                return new Resta();
            case 3:
                return new Multiplicacion();
            case 4:
                return new Division();
                
            default:
                return  null;
                
        }
    }

    @Override
    public Conversor getconv(int type) {
        return null;
    }
}

    