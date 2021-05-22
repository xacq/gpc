/*siempre declaramos el nombre del paquete p package que se declaro en 
la configuracion del proyecto*/
package com.javaexamples;
/*importamos un archivo con clases Scanner para ingreso/salida de datos*/
import java.util.Scanner;
/*Esta es la clase que pertenece al nombre del archivo.java
este es un programa que permite calcular los divisores de un numero*/
public class Divisores_Numero {
 
    public static void main(String[] args) {
        /*inicializamos las variables para el calculo requerido*/
        int numero;
        /*Declaramos una instancia de clase Scanner para ingresos de datos*/
        Scanner div = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        numero = div.nextInt();
        System.out.println("Tabla de divisores("+numero+")");
        /*a traves del loop for realizamos el control del calculo, i es un
        nombre reservado que se utiliza para este loop y es el contador
        del for indica que i empieza en 1 y mientras i sea menor o igual
        al numero ingresado, se realice el proceso que se encuentra
        dentro de este loop y se aumente en 1 dicho contador i*/
        for (int i = 1; i <= numero; i++) {
            /*El signo % devuelve el residuo de la division entre la variable 
            numero ingresado por el usuario y el contador i*/
            if (numero % i == 0) {
                System.out.println("El numero "+i+" es divisor de "+numero);
                }
            } 
        } 
    }

