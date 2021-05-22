/*siempre declaramos el nombre del paquete p package que se declaro en 
la configuracion del proyecto*/
package com.javaexamples;
/*importamos un archivo con clases Scanner para ingreso/salida de datos*/
import java.util.Scanner;
/*Esta es la clase que pertenece al nombre del archivo.java
este es un programa que permite vwerificar el color de los focos*/
public class Focos {
    public static void main(String[] args) {
        //Inicializacion de variables
        int cantidad = 0,color,verde = 0,rojo = 0,blanco = 0;
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite la cantidad de Focos a ingresar: ");
        cantidad = tec.nextInt();
        System.out.println("Colores: \n Verde  (presione 1). \n Rojo   (presione 2). \n Blanco (presiona 3).");
        for (int i = 1; i <= cantidad; i++) {// condicion para registrar la cantidad de focos
            System.out.println("El foco " + i + " es de color: ");
            color = tec.nextInt();
            if (color == 1) {//si es verde
                verde++;
                System.out.println("verde");    
            }else if (color == 2) { //si es rojo
                rojo++;
                System.out.println("rojo");
            }else if (color == 3) {//si es blanco
                blanco++;
                System.out.println("blanco");
            }else{
                System.out.println("No existe esa clase de color en el menu.");
                i--;//se disminuye uno para que la cantidad de focos sea el mismo
            }
        }
        System.out.println("Se ingreso "+verde+" focos de color Verde.");
        System.out.println("Se ingreso "+rojo+" focos de color rojo.");
        System.out.println("Se ingreso "+blanco+" focos de color blanco.");
    }
}
