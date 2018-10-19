/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcula;

import java.util.ArrayList;

/**
 *
 * @author Leonardo
 */
public class CalculaMedia implements InterfaceCalcula{

    @Override
    public double calcula(ArrayList<Integer> list) {
        double media;
        double soma = 0;
        for(int i = 0; i < list.size(); i++){
            soma += list.get(i);
        }
        media = soma/list.size();
        return media;
    }
    
}
