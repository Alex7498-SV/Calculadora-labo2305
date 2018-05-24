/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Conversor;

import AbstractFactory.AbstractFactory;
import Aritmetico.Aritmetica;

/**
 *
 * @author alex
 */
public class FactoryConversor implements AbstractFactory{

    @Override
    public Aritmetica getop(int type) {
        return null;
    }

    @Override
    public Conversor getconv(int type) {
        
        switch (type){
            case 1:
                return new binario();
                
            default:
                return null;
        }
    }

}
