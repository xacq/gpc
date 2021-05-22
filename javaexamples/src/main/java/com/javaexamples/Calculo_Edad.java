package com.javaexamples;
import java.time.LocalDate;/*Libreria para trabajar con fechas*/
import java.time.Period;/*Libreria para declarar variables tipo fecha*/
import java.util.Scanner;

public class Calculo_Edad {
    public static void main(String[] args) {
        /*Declaracion de variables*/
        int dia, mes, anio;
        Scanner teclado = new Scanner(System.in);
        /*Se solicita el ingreso de datos*/
        System.out.println("Ingrese los siguientes datos:");
        System.out.println("Dia de Nacimiento:");
        dia = teclado.nextInt();
        System.out.println("Mes de Nacimiento:");
        mes = teclado.nextInt();
        System.out.println("Año de nacimiento:");
        anio = teclado.nextInt();
        /*Usamos la funcions LocalDate.now que devuelve la fecha actual a una
        variable tipo fecha*/
        LocalDate fHoy = LocalDate.now();
        /*ingresamos los datos ingresados al tipo de dato LocalDate*/
	LocalDate fNac = LocalDate.of(anio, mes, dia);
        /*Declaramos una variable Period que es compatible con la funcion Period*/
        Period periodo;
        /*Usamos la instruccion between de la funcion Period que compara y resta
        la Fecha de Nacimiento con la Fecha Actual*/
        periodo = Period.between(fNac, fHoy);
        System.out.print("Usted tiene: "+periodo.getYears()+" año(s),");
        System.out.print(periodo.getMonths()+" mes(es) y ");
        System.out.print(periodo.getDays()+" dia(s).");        
    }
}
