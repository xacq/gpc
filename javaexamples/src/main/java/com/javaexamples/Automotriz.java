package com.javaexamples;

import java.util.Scanner;

public class Automotriz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, n, clave;
        double categoria_1=0, categoria_2=0, categoria_3=0, costo;
        double impuesto, impuesto_a_pagar=0;
        impuesto_a_pagar = 0;
        System.out.print("Ingrese el numero de Procesos: ");
        n = in.nextInt();
        in.nextLine();
            for (i=1; i<=n; i++) {
                System.out.print("PROCESO Nro. " + i);
                System.out.print("Ingrese el valor de clave: ");
                clave = in.nextInt();
                System.out.print("Ingrese el valor de costo: ");
                costo = in.nextDouble();
                impuesto=0;
                switch (clave) {
                    case 1 -> {
                        impuesto = costo*0.1;
                        categoria_1 = categoria_1+impuesto;
                        impuesto_a_pagar = impuesto_a_pagar + impuesto;
                        System.out.println("Valor de impuesto: " + impuesto);
                        System.out.println();
                    }
                    case 2 -> {
                        impuesto = costo*0.07;
                        categoria_2 = categoria_2+impuesto;
                        impuesto_a_pagar = impuesto_a_pagar + impuesto;
                        System.out.println("Valor de impuesto: " + impuesto);
                        System.out.println();
                    }
                    case 3 -> {
                        impuesto = costo*0.05;
                        categoria_3 = categoria_3+impuesto;
                        impuesto_a_pagar = impuesto_a_pagar + impuesto;
                        System.out.println("Valor de impuesto: " + impuesto);
                        System.out.println();
                    }
                    default -> {
                        System.out.println("Este codigo no existe.");
                        i--;
                    }
                }
            }
        System.out.println("Valor de categoria 1: " + categoria_1);
        System.out.println("Valor de categoria 2: " + categoria_2);
        System.out.println("Valor de categoria 3: " + categoria_3);
        System.out.println("Valor de impuesto a pagar: " + impuesto_a_pagar);
    }
}
