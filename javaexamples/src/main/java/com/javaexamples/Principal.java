/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaexamples;

/**
 *
 * @author green
 */
public class Principal {
    
        public static void main(String[] args) {
        double ahorro_anual, ahorro_diario, i;
        ahorro_anual = 0;
        for (i=1; i<=365; i++) {
            System.out.print("PROCESO " + i);
            ahorro_anual=ahorro_anual+0.01*Math.pow(3,i);
            ahorro_diario=ahorro_anual;
            System.out.println("Valor de ahorro diario: " + ahorro_diario);
            System.out.println();
        }
        System.out.println("Valor de ahorro anual: " + ahorro_anual);
    }
    
    
}
