/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import Aritmetico.FactoryAritmetica;
import Conversor.FactoryConversor;

/**
 *
 * @author alex
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(int a){
        switch (a){
            case 1:
                return new FactoryAritmetica();
            case 2:
                return  new FactoryConversor();
            default:
                return null;
        }
    }
}
