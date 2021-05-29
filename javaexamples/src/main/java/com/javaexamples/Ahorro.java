/*siempre declaramos el nombre del paquete p package que se declaro en 
la configuracion del proyecto*/
package com.javaexamples;
/*Esta es la clase que pertenece al nombre del archivo.java
este es un programa que permite verificar el ahorro en un anio con tasa fija*/
public class Ahorro {
    public static void main(String[] args) {
        double ahorro_anual, ahorro_diario; 
        int i;
        ahorro_anual = 0;
        for (i=1; i<=365; i++) {
            
            System.out.print("ESTE ES EL PROCESO #" + i + " :");
            
            double prueba= Math.pow(3,i);
            ahorro_anual=ahorro_anual + (0.01 * prueba);
            
            ahorro_diario=ahorro_anual;
            System.out.println("Valor de ahorro diario: " + ahorro_diario);
            System.out.println();
        }
        System.out.println("Valor de ahorro anual: " + ahorro_anual);
    }
}









