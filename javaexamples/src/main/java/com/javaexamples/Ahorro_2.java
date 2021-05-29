/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaexamples;

import java.util.Scanner;

/**
 *
 * @author green
 */
public class Ahorro_2 {
      public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;
        double ahorro_del_mes, ahorro_en_un_ano, cantidad_depositada;
        ahorro_en_un_ano = 0;
        for (i=1; i<=12; i++) {
            System.out.println("PROCESO " + i);
            System.out.println("Ingrese el valor de cantidad depositada: ");
            cantidad_depositada = in.nextDouble();//depositando el valor mensual
            
            ahorro_en_un_ano=ahorro_en_un_ano+cantidad_depositada;//guardando en variable anual
           
            System.out.println("Valor de ahorro del mes: " + cantidad_depositada);
            System.out.println();
        }
        System.out.println("Valor de ahorro en un ano: " + ahorro_en_un_ano);
    }  
}
