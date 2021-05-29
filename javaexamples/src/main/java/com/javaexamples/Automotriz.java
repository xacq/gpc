package com.javaexamples;

import java.util.Scanner;

public class Automotriz {
    public static void main(String[] args) {
        int i, proceso;
        double categoria_1, categoria_2, categoria_3, clave, costo;
        double impuesto, impuesto_a_pagar;
        categoria_1 = 0;
        categoria_2 = 0;
        categoria_3 = 0;
        impuesto_a_pagar = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero de Procesos: ");
        proceso = teclado.nextInt();
        //Para contador i = 0 mientras i menor o igual al numero de procesos
        //siga sumando uno al contador i
        for (i=1; i<=proceso ; i++) {
            System.out.println(" PROCESO  : " + i+ " ");
            System.out.println("Ingrese el valor de clave: ");
            clave = teclado.nextDouble();
            System.out.println("Ingrese el valor de costo: ");
            costo = teclado.nextDouble();
            impuesto=0;
                if(clave==1){
                    impuesto=costo*0.1;
                    categoria_1=categoria_1+impuesto;
                    impuesto_a_pagar=impuesto_a_pagar+impuesto;
                    System.out.println("Valor de impuesto clave 1(10%): " + impuesto);
                }
                else if(clave==2){
                    impuesto=costo*0.07;
                    categoria_2=categoria_2+impuesto;
                    impuesto_a_pagar=impuesto_a_pagar+impuesto;
                    System.out.println("Valor de impuesto clave 2(7%): " + impuesto);
                }
                else if(clave==3){
                    impuesto=costo*0.05;
                    categoria_3=categoria_3+impuesto;
                    impuesto_a_pagar=impuesto_a_pagar+impuesto;
                    System.out.println("Valor de impuesto clave 3(5%): " + impuesto);
                }
                else{
                    System.out.println("No existe este codigo");
                    i--;
                }
        }
        System.out.println("Valor de categoria 1: " + categoria_1);
        System.out.println("Valor de categoria 2: " + categoria_2);
        System.out.println("Valor de categoria 3: " + categoria_3);
        System.out.println("Valor de impuesto a pagar: " + impuesto_a_pagar);
    }
}
