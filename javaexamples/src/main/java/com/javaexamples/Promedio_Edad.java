package com.javaexamples;
import java.util.Scanner;

public class Promedio_Edad {
    public static void main(String[] args) {
        int i,j, bandera, numestudiantes = 0, edad, promedio = 0; 
        int proTotal, cantidad = 0, Total = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Numero de aula a calcular: ");
        cantidad = teclado.nextInt();
        for ( i = 1; i <= cantidad; i++) {
            System.out.println("Numero de Estudiantes del aula "+i+": ");
            numestudiantes = teclado.nextInt();
            bandera = 0;
            promedio = 0;
            for ( j = 1; j <= numestudiantes; j++) {
                System.out.println("Edad del estudiante # "+j+" del aula "+i+": ");
                edad = teclado.nextInt();
                bandera = bandera + edad;
            }
        promedio = bandera / numestudiantes;
        System.out.println("Edad promedio del aula #"+i+" es: "+promedio);
        Total = Total + promedio;
        }  
    proTotal = Total / cantidad;
    System.out.println("La edad promedio de la escuela es: " + proTotal);
    }
}
