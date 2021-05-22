/*siempre declaramos el nombre del paquete p package que se declaro en 
la configuracion del proyecto*/
package com.javaexamples;
/*importamos un archivo con clases Scanner para ingreso/salida de datos*/
import java.util.Scanner;
/*Esta es la clase que pertenece al nombre del archivo.java
este es un programa que permite calcular la Potencia de un numero*/
public class Perfecto {
/*Toda clase publica tiene funcion void que no devuelve valores junto al
nombre main*/
        public static void main(String[] args) {
        /*Declaracion en linea de variables*/
            int i, suma = 0, numero;
            /*Declaramos una instancia de clase Scanner para ingresos de datos*/  
            Scanner es = new Scanner (System.in);
            System.out.println("Ingrese un numero par verificar que es Perfecto:");
            numero = es.nextInt();
            /*variable for que contiene un contador i el cual ira desde 1 hasta
            n el cual es el numero a verificar*/
            for (i = 1; i < numero; i++) {
                if (i % numero == 0) {
                    suma = suma + i; /*se suma sus divisores i*/    
                }
            } /*Condicion que indica si la suma de los divisores es igual al 
                numero ingresado*/
            if (suma == numero) { 
                System.out.println(numero+" es un numero Perfecto");
                } 
            else{
                System.out.println(numero+" no es un numero Perfecto");
                }
        }
}
