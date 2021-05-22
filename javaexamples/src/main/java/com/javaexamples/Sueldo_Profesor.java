/*siempre declaramos el nombre del paquete p package que se declaro en 
la configuracion del proyecto*/
package com.javaexamples;
/*importamos un archivo con clases Scanner para ingreso/salida de datos*/
import java.util.Scanner;
/*Esta es la clase que pertenece al nombre del archivo.java
este es un programa que permite calcular la division de 2 numeros*/
public class Sueldo_Profesor {
    public static void main(String[] args) {
        double sueldoTotal = 0;
        double sueldoAnual = 0;
        double sueldo = 0;
        int anios = 0;
        Scanner pro = new Scanner(System.in);
        System.out.println("Ingrese el sueldo mensual:");
        sueldo = pro.nextDouble();
        System.out.println("Ingrese los años en que se considera el sueldo:");
        anios = pro.nextInt();
       
        sueldoAnual = sueldo * 12;
        sueldoTotal = sueldoAnual * anios;

        System.out.println("El salario Anual es: " + sueldoAnual);
        System.out.println("El salario total por "+anios+ " año(s) de trabajo es: "+ sueldoTotal);
    }
}
