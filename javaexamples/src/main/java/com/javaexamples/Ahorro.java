/*siempre declaramos el nombre del paquete p package que se declaro en 
la configuracion del proyecto*/
package com.javaexamples;
/*Esta es la clase que pertenece al nombre del archivo.java
este es un programa que permite verificar el ahorro en un anio con tasa fija*/
public class Ahorro {
    public static void main(String[] args) {
        double ahorroAnual=0, ahorroMensual=1, ahorroTotal=0;
        int i;
        for (i=1; i<=12; i++) {
            System.out.println("TRANSFERENCIA Nro. " + i +" : ");
            for (int j=1;j<30;j++){
                ahorroMensual=(0.01 * ahorroMensual)+ahorroMensual;
            }
            System.out.println("Ahorro "+1+" mes(es): $" + ahorroMensual);
            ahorroAnual=ahorroMensual + (0.01 * Math.pow(3,i));
            ahorroTotal = ahorroTotal + ahorroAnual;
        }
        System.out.println("Ahorro anual: $" + ahorroTotal);
    }
}
