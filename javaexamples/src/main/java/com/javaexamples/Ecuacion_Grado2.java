/*siempre declaramos el nombre del paquete p package que se declaro en 
la configuracion del proyecto*/
package com.javaexamples;
/*importamos un archivo con clases Scanner para ingreso/salida de datos*/
import java.util.Scanner;
/*Esta es la clase que pertenece al nombre del archivo.java
este es un programa que permite calcular la division de 2 numeros*/
public class Ecuacion_Grado2 {
    public static void main(String[] args) {
        int a, b, c; //inicializamos variables para cada valor del termino
        double x1, x2; //inicializamos x1 y x2 para resultados en decimal/double
        Scanner leer = new Scanner(System.in); //se crea instancia Scanner
        System.out.println("Ingrese terminos separados por ',': ");
        //Se guarda la expresion separada por , en un string o cadena
        String valores = leer.nextLine(); //obtiene los terminos 
        //Se saca del string valores las comas y se guarda en la cadena 
        //numeros
        String[] numeros = valores.split(","); 
        //Usamos parseint de Integer para convertir a entero el string
        a = Integer.parseInt(numeros[0]); //guardamos trasformado a int
        b = Integer.parseInt(numeros[1]); //guardamos trasformado a int
        c = Integer.parseInt(numeros[2]); //guardamos trasformado a int
        //Obtien los valores x1,x2 de la ecuacion
        x1 = (-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
        x2 = (-b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
        //Se imprime la resolucion de la ecuacion en segundo grado
        System.out.println("La solucion de x1: " + x1);
        System.out.println("La solucion de x2: " + x2);
    }
}
