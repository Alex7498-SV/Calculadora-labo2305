/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import Aritmetico.Aritmetica;
import Conversor.Conversor;
/**
 *
 * @author LN710Q
 */
public interface AbstractFactory{
    Aritmetica getop (int type);
    Conversor getconv (int type);
}