package com.javaexamples;

import java.util.Scanner;

public class Registradora {
        public static void main(String[] args) {
        
            int contador = 0;// contador para loop while
            int contaB;
            int tipo=0;
            int cantidad;// variable que va a guardar la cantidad de billetes y monedas
            int TotalBillete = 0; // variable que guarda la cantidad de billetes
            
            double valorMoneda; //variable que guarda las moonedas
            double TotalMoneda = 0;
            double TotalValorMoneda = 0;
            double dineroTotal = 0;
        
            Scanner teclado = new Scanner(System.in);// instancia para ingreso de datos
            
            System.out.println("Digite el Total de Billetes y Monedas que posee: ");
            
            cantidad = teclado.nextInt();
            
            while (contador < cantidad) {
                contador++;
                System.out.println("Ingrese el Tipo que desea contar:");
                System.out.println("- Para ingresar un billete presione 1.\n- Para ingresar una moneda presione 2. )");
                tipo = teclado.nextInt();
                switch (tipo) {
                    case 1 -> {
                        System.out.println("Digite el valor del Billete en numeros Enteros: ");
                        contaB = teclado.nextInt();
                        TotalBillete = TotalBillete + contaB;
                    }
                    case 2 -> {
                        System.out.println("Digite el valor de la Moneda en decimales con separador punto (.): ");
                        valorMoneda = teclado.nextDouble();
                        TotalMoneda = TotalMoneda + valorMoneda;
                        if (TotalMoneda >= 1) {
                            TotalValorMoneda = TotalValorMoneda + TotalMoneda;
                        }
                    }
                    default -> System.out.println("No existe.");
                }
            }
        dineroTotal = TotalMoneda + TotalValorMoneda + TotalBillete;
        System.out.println("**********************************************");
        System.out.println("\n Total de dinero en la caja es: " + dineroTotal);
    }
}
