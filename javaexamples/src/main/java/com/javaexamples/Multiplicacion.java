package com.javaexamples;

import java.util.Scanner;// libreria para funciones de manejo de datos

public class Multiplicacion {
    public static void main(String[] args) {
        int n1, n2;// declaracion de variables
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer Factor:");
        n1 = teclado.nextInt();
        System.out.println("Ingrese el segundo Factor:");
        n2 = teclado.nextInt();
        //Se muestra directamente la multiplicacion de los dos numeros
        System.out.println("La multiplicación es :"+n1*n2);
    }
}
