package com.javaexamples;

import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int reprobada=0,aprobada=0,contador = 1;
        int n, Nota,bandera,promedio=0, cantidad, Nnotas = 0;
        System.out.println("Digite el Numero de Estudiantes: ");
        cantidad = teclado.nextInt();
            while (contador <= cantidad) {
                contador++;
                System.out.println("Ingrese el numero de calificaciones que tiene el estudiante " + contador);
                Nnotas = teclado.nextInt();
                bandera = 0;
                n=1;
                while(n <= Nnotas){
                    System.out.println("Digite La nota del Estudiante: "  );
                    Nota = teclado.nextInt();
                    if (Nota >= 0 && Nota <= 10) {
                        n++;
                        bandera = bandera+Nota;
                        promedio = bandera/Nnotas;
                        if (promedio >= 7) {
                            aprobada++;
                        } 
                        else {
                            reprobada++;
                        }
                    }
                    else{
                        System.out.println("Nota mal ingresada.");
                    }
                }
            }
        System.out.println("El Promedio del estudiante es: " + promedio);
        System.out.println("**********************************************");
        System.out.println("\n El total de Alumnos Aprobados son: \n "+aprobada);
        System.out.println("**********************************************");
        System.out.println("\n El total de Alumnos Reprobados son: \n"+reprobada);
    }    
}
