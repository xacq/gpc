/*siempre declaramos el nombre del paquete p package que se declaro en 
la configuracion del proyecto*/
package com.javaexamples;
/*importamos un archivo con clases Scanner para ingreso/salida de datos*/
import java.util.Scanner;
/*Esta es la clase que pertenece al nombre del archivo.java
este es un programa que permite calcular la Potencia de un numero*/
public class Primo {
public static void main(String[] args) {
    /*Declaracion de variables*/
    int numero, contador = 0;
    /*Instancia para captura de datos desde el scanner*/
    Scanner es = new Scanner(System.in);
    System.out.println("Ingrese el numero a verificar si es primo:"); 
    numero = es.nextInt();
    /*Loop for que recorrrera desde 1 hasta el numero ingresado con el objeto de
    verificar para cuantos numeros genera un residuo 0.  Como la regla es que 
    un numero primo es SOLO divisible para si mismo y para la unidad, el 
    contador controla cuantas veces se cumple esto*/
        for (int i = 1; i < numero; i++) {
            if ((numero % i) == 0) {
                contador ++;
            }
        }
        /*Condicion que verifica si solamente fueron dos numeros los que se 
        dividieron con residuo 0 si es mayor a 2 ya no es primo*/
        if (contador <= 2) {
            System.out.println(numero +" es primo");
        } 
        else {
            System.out.println(numero +" no es primo");
        }
    } 
}
