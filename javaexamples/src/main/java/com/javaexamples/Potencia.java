/*siempre declaramos el nombre del paquete p package que se declaro en 
la configuracion del proyecto*/
package com.javaexamples;
/*importamos un archivo con clases Scanner para ingreso/salida de datos*/
import java.util.Scanner;
/*Esta es la clase que pertenece al nombre del archivo.java
este es un programa que permite calcular la Potencia de un numero*/
public class Potencia {
        /*Toda clase publica tiene funcion void que no devuelve valores junto al
        nombre main*/
    public static void main(String[] args) {
    /*inicializamos las variables para el calculo requerido*/
    int base; /*la base a calcular*/
    int exponente; /*el exponente de la potencia*/
    int resultado = 1; /*guardara el resultado del calculo*/
    /*Declaramos una instancia de clase Scanner para ingresos de datos*/    
    Scanner pot = new Scanner (System.in);
    /*mostramos la solicitud de ingreso de la base*/
    System.out.println("Cual es la base?:");
    /*Se guarda en la variable el valor ingresado*/
    base = pot.nextInt();
    /*mostramos la solicitud de ingreso de la potencia*/
    System.out.println("Cual es el exponente?:");
    /*Se guarda en la variable el valor ingresado*/
    exponente = pot.nextInt();
        /*a traves del loop for ralizamos el control del calculo, i es un
        nombre reservado que se utiliza para este loop y es el contador
        el for indica que i empieza en 1 y mientras i sea menor o igual
        al exponente ingresado, se realice el proceso que se encuentra
        dentro de este loop y se aumente en 1 dicho contador i*/
        for (int i = 1; i <= exponente; i++) {
            /*como resultado se inicializa en 1 no hay problemas de el 
            valor con el que se inicia el proceso de multiplicacion entre 
            el resultado anterior y la base ingresada*/
            resultado = resultado * base;  
        }
    /*Se muestra el resultado en pantalla*/
    System.out.println("El numero "+base+" elevado a la potencia "+exponente+" es ="+resultado);
    }
}
