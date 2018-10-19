/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcula;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Leonardo
 */
public class CalculaMediana implements InterfaceCalcula{
    @Override
    public double calcula(ArrayList<Integer> list) {
        Collections.sort(list);
        double mediana;
        //int soma = 0;
        if (list.size() % 2 == 0 ){
            mediana = list.get((list.size() / 2 )+ 1) + list.get((list.size() / 2 )- 1);
        }
        else{
            mediana = list.get(list.size() / 2);
        }

        return mediana;
    }
}
