/*siempre declaramos el nombre del paquete p package que se declaro en 
la configuracion del proyecto*/
package com.javaexamples;
/*importamos un archivo con clases Scanner para ingreso/salida de datos*/
import java.util.Scanner;
/*Esta es la clase que pertenece al nombre del archivo.java
este es un programa que permite calcular el Factorial de un numero*/
public class Factorial {
    /*Toda clase publica tiene funcion void que no devuelve valores junto al
    nombre main*/
    public static void main(String[] args) {
    /*inicializamos las variables para el calculo requerido*/
        int numero; /*variable con numero a calcular el Factorial*/ 
        int contador = 0; /* contador para el control del loop do*/
        int factor = 1; /*valor con el que arranca el calculo del Factorial*/
        /*Declaramos una instancia de clase Scanner para ingresos de datos*/    
        Scanner fac  = new Scanner (System.in);
        /*Mostramos en la pantalla y solicitamos el valor a calcular*/
        System.out.println("Ingrese el numero para calcular su factorial:");
        /*se guarda el valor ingresado a la variable entero numero*/
        numero = fac.nextInt();
        /*Mostramos en la pantalla el mensaje*/
        System.out.println("Tabla factorial:");
        /*Inicializamos un loop do while*/
        do {/*hacer o repetir sumar contador, multiplicar factor con contador
            mostrar y repetir el proceso hasta llegar al numero que se ingreso 
            que sera ek limite para el calculo del Factorial*/
            contador++; /*es lo mismo que decr contador = contador +1*/
            factor = factor * contador; /*multiplicamos el factor con contador*/
            System.out.println(factor); /*se muestra cada factor encontrado*/          
        } while (contador < numero); /*mientras que contador sea menor al 
                                    numero ingresado*/
        /*Se muestra en pantalla el factorial del numero ingresado*/
        System.out.println("El factorial de("+numero+") es ="+factor);
    }
}
