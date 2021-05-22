/*siempre declaramos el nombre del paquete p package que se declaro en 
la configuracion del proyecto*/
package com.javaexamples;
/*importamos un archivo con clases Scanner para ingreso/salida de datos*/
import java.util.Scanner;
/*Esta es la clase que pertenece al nombre del archivo.java
este es un programa que permite verificar un numero con respecto al 0*/
public class Determinacion_Ceros {
 public static void main(String[] args) {
     //Inicializacion de variables
        int cantidad = 0, ncantidad = 0;
        Scanner teclado = new Scanner(System.in);//Instancia para lectura
        //Se ingresa la cantidad de Repeticiones para comprobar numeros
        System.out.println("Digite la cantidad de Repeticiones: ");
        ncantidad = teclado.nextInt();
        //Loop for para controlar la cantidad de repeticiones para comprobacion 
        //de los numeros con respecto al 0
        for (int i = 1; i <= ncantidad; i++) {
            System.out.println("Digite el numero ("+i+" repeticiones): ");
            cantidad = teclado.nextInt();
            if (cantidad == 0) {
                System.out.println(cantidad+" es igual a cero ");
            }
            if (cantidad > 0) {
                System.out.println(cantidad+" es mayor a cero.");
            }
            if (cantidad < 0) {
                System.out.println(cantidad+" es menor a cero.");
            }   
        }        
    }  
}
