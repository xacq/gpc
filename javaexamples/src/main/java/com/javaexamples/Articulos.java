/*siempre declaramos el nombre del paquete p package que se declaro en 
la configuracion del proyecto*/
package com.javaexamples;

import java.util.Scanner;
/*Esta es la clase que pertenece al nombre del archivo.java
este es un programa que permite */
public class Articulos {
    public static void main(String[] args) {
        int bandera, cantidad = 0, Total = 0, costoArt, subtotal=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite la cantidad de articulos a ingresar: ");
        cantidad = teclado.nextInt();
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Valor del articulo " + i +" :");
            costoArt = teclado.nextInt();
            if (costoArt >= 200) {
                bandera = costoArt-(costoArt*15/100);//descuenta el 15 %
                System.out.println("Valor: $"+costoArt+". Valor con descuento: $"+bandera+".");
                subtotal+=bandera;
                System.out.println("Subtotal:$ " + subtotal);
            }
            else if (costoArt >100 && costoArt< 200) {
                bandera = costoArt-(costoArt*12/100);//descuenta el 12 %
                System.out.println("Valor: $"+costoArt+". Valor con descuento: $"+bandera+".");
                subtotal+=bandera;
                System.out.println("Subtotal " + subtotal);
            }
            else if (costoArt <= 100) {
                bandera = costoArt-(costoArt*10/100);//descuenta el 10 %
                System.out.println("Valor: $"+costoArt+". Valor con descuento: $"+bandera+".");
                subtotal+=bandera;
                System.out.println("Subtotal " + subtotal);
            }
        }
        System.out.println("..........................");
        System.out.println("El total es: $" + subtotal );
    }
}
