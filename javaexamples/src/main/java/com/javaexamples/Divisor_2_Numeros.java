/*siempre declaramos el nombre del paquete p package que se declaro en 
la configuracion del proyecto*/
package com.javaexamples;
/*importamos un archivo con clases Scanner para ingreso/salida de datos*/
import java.util.Scanner;
/*Esta es la clase que pertenece al nombre del archivo.java
este es un programa que permite calcular la division de 2 numeros*/
public class Divisor_2_Numeros {
    public static void main(String[] args) {
        int numero;
        int dividendo;
        int divisor;
        Scanner es = new Scanner(System.in);
        System.out.println("Ingrese el dividendo: ");
        dividendo = es.nextInt();
        System.out.println("Ingrese el divisor: ");
        divisor = es.nextInt();
        numero = dividendo;
        /*Se declara una variable de tipo boolean para darle un estado de 
        verdadero.   Esta variable controlara el funcionamiento de el loop
        while que se mantendra realizando hasta que las consiciones lleguen
        a dar con los breaks*/
        boolean valor = false;
        while (!valor) { 
            if (divisor == 0){ /*ondicion que verifica division para 0*/
                System.out.println("No se puede dividir para 0");
                break;
            }
            else{
                if (numero % divisor == 0) {
                numero = numero / divisor;
                System.out.println("Son divisores de "+dividendo+" el "+ numero);
                }
                else {
                break; 
                }
            }    
        }
    }
}
