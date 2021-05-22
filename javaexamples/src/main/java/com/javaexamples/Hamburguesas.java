/*siempre declaramos el nombre del paquete p package que se declaro en 
la configuracion del proyecto*/
package com.javaexamples;
/*importamos un archivo con clases Scanner para ingreso/salida de datos*/
import java.util.Scanner;
/*Esta es la clase que pertenece al nombre del archivo.java
este es un programa que permite calcular el valor de un pedido de Hamburguesas*/
public class Hamburguesas {
    public static void main(String[] args) {
        int tipo,cantidad;
        double pagar=0;
        double Tarjeta = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Tipo de Hamburguesas \n Sencillas $2 (presione 1). \n Dobles $4 (presione 2). \n Triples $5 (presione 3).");
        System.out.println("Que tipo de Hamburguesas desea:");
        tipo = teclado.nextInt();
        System.out.println("Cuantas Hamburguesas desea:");
        cantidad = teclado.nextInt();
        if (tipo == 1) { //Caso de hamburguesas Sencillas
            pagar = cantidad * 2;
            Tarjeta = pagar * 0.105;
            System.out.println("Usted ha solicitado "+cantidad+ " Hamburguesa(s) Simple(s)");
            System.out.println("Valor: $"+pagar+" + Imp.: $" + Tarjeta);
            System.out.println("Valor Final: $"+ (pagar+Tarjeta));
            }
        else if(tipo == 2) { //Caso de hamburguesas Dobles
            pagar = cantidad * 4;
            Tarjeta = pagar * 0.105;
            System.out.println("Usted ha solicitado "+cantidad+ " Hamburguesa(s) Doble(s)");
            System.out.println("Valor: $"+pagar+" + Imp.: $" + Tarjeta);
            System.out.println("Valor Final: $"+ (pagar+Tarjeta));
            }
        else if (tipo == 3) { //Caso de hamburguesas Triples
            pagar = cantidad * 5;
            Tarjeta = pagar * 0.105;
            System.out.println("Usted ha solicitado "+cantidad+ " Hamburguesa(s) Triple(s)");
            System.out.println("Valor: $"+pagar+" + Imp.: $" + Tarjeta);
            System.out.println("Valor Final: $"+ (pagar+Tarjeta));
            }
        else  {
            System.out.println("No existe ese tipo de Hamburguesas");
            }  
    }
    
}
