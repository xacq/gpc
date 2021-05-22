package com.javaexamples;

import java.util.Scanner;

public class Ventas {
    public static void main(String[] args) {
        int cantidad = 0, Total = 0, costoVenta, menor = 0, mayor = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite el Numero de Ventas ");
        cantidad = teclado.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("ingrese el Costo de la Venta:" + i + "\n");
            costoVenta = teclado.nextInt();
                if (costoVenta <= 100) {
                    menor = menor + costoVenta;
                    } 
                else if (costoVenta > 100 && costoVenta <= 200) {
                    mayor = mayor + costoVenta;
                }
        }
        Total = mayor + menor;
            System.out.println(".....................................");
            System.out.println("El total de ventas menores o iguales a 100 $ es :" + menor);

            System.out.println(".....................................");
            System.out.println("El total de ventas mayores a 100 $ y menores a 200$ es :" + mayor);

            System.out.println(".....................................");
            System.out.println("El total de las ventas es :" + Total);
    }
}
