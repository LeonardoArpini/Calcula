/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcula;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Leonardo
 */
public class Calcula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*double valorMedia;
        double valorMediana;
        
        ArrayList<Integer> lista = new ArrayList<>(); 
        CalculaMedia media = new CalculaMedia();
        CalculaMediana mediana = new CalculaMediana();
        Integer[] numerosParaAdicionar = { 10, 50, 20, 12, 11, 15, 29, 25, 500};
        lista.addAll(Arrays.asList(numerosParaAdicionar));
        
        valorMedia = media.calcula(lista);
        System.out.print("O valor da média é: " + valorMedia + "\n");
        valorMediana = mediana.calcula(lista);             
        System.out.print("O valor da mediana é: " + valorMediana + "\n");*/ // Teste de verificação de resultados;
        
        CalculaMedia media = new CalculaMedia();
        CalculaMediana mediana = new CalculaMediana();
        
        System.out.print("Calculando média ............. \n");
        calcula(media);
        System.out.print("Calculando mediana ............. \n");
        calcula(mediana);
    } 
    public static void calcula(InterfaceCalcula  operacao){
        
        ArrayList<Integer> lista = new ArrayList<>();
        Integer[] numerosParaAdicionar = { 10, 50, 20, 12, 11, 15, 29, 25, 500};
        lista.addAll(Arrays.asList(numerosParaAdicionar));
        
        double resultado = operacao.calcula(lista);
        System.out.print("O resultado é: " + resultado + "\n");              
}
}
