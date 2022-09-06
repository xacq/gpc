
package prog.interfacesabstractas;

import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FigurasAbstractas {


    public static void main(String[] args) {
        
        int select = -1; //opción elegida del usuario
        int x, y, z, radio, ancho, alto, profundidad, lado;
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        while(select != 0){
        //Try catch para evitar que el programa termine si hay un error
            try{
                System.out.println("*************** SISTEMA DE CLASES ABSTRACTAS ***************\n"+
                                "Eliga opción:\n"+
                                "1-> DIBUJAR UNA FIGURA RECTANGULAR \n" +
                                "2-> DIBUJAR UNA CIRCULO \n" +
                                "3-> DIBUJAR UN CUBO\n" +
                                "4-> DIBUJAR UNA PIRAMIDE\n" +
                                "0-> Salir");
                //Recoger una variable por consola
                select = Integer.parseInt(leer.readLine()); 

                //Ejemplo de switch case en Java
                switch(select){
                case 1: 
                        System.out.println("**** INGRESO DE DATOS PARA FIGURA GEOMETRICA ****");
                        System.out.println("Ingrese la posicion en x: ");
                        x = Integer.parseInt(leer.readLine());
                        System.out.println("Ingrese la posicion en y: ");
                        y = Integer.parseInt(leer.readLine());
                        System.out.println("Ingrese el ancho de la figura: ");
                        ancho = Integer.parseInt(leer.readLine());
                        System.out.println("Ingrese el alto de la figura: ");
                        alto = Integer.parseInt(leer.readLine());
                        Cuadrado nuevoR = new Cuadrado(x,y,ancho,alto);
                        nuevoR.dibujar();
                        nuevoR.mover();
                        System.out.println("El area de la figura es de: " + nuevoR.area() +".");
                        
                        break;
                case 2: 
                        System.out.println("**** INGRESO DE DATOS PARA CIRCULO ****");
                        System.out.println("Ingrese la posicion en x: ");
                        x = Integer.parseInt(leer.readLine());
                        System.out.println("Ingrese la posicion en y: ");
                        y = Integer.parseInt(leer.readLine());
                        System.out.println("Ingrese el radio: ");
                        radio = Integer.parseInt(leer.readLine());
                        Circulo nuevoC = new Circulo(x,y,radio);
                        nuevoC.dibujar();
                        nuevoC.mover();
                        System.out.println("El area de la figura es de: " + nuevoC.area() +".");

                        break;
                case 3: 
                        System.out.println("**** INGRESO DE DATOS PARA CUBO****");
                        System.out.println("Ingrese la posicion en x: ");
                        x = Integer.parseInt(leer.readLine());
                        System.out.println("Ingrese la posicion en y: ");
                        y = Integer.parseInt(leer.readLine());
                        System.out.println("Ingrese la posicion en z: ");
                        z = Integer.parseInt(leer.readLine());
                        System.out.println("Ingrese el ancho: ");
                        ancho = Integer.parseInt(leer.readLine());
                        System.out.println("Ingrese el alto: ");
                        alto = Integer.parseInt(leer.readLine());
                        System.out.println("Ingrese la profundidad: ");
                        profundidad = Integer.parseInt(leer.readLine());                        
                        Cubo nuevoCu = new Cubo(x,y,z,ancho, alto, profundidad);
                        nuevoCu.dibujar();
                        nuevoCu.mover();
                        System.out.println("El volumen de la figura es de: " + nuevoCu.volumen() +".");

                        break;
                case 4: 
                        System.out.println("**** INGRESO DE DATOS PARA PIRAMIDE ****");
                        System.out.println("Ingrese la posicion en x: ");
                        x = Integer.parseInt(leer.readLine());
                        System.out.println("Ingrese la posicion en y: ");
                        y = Integer.parseInt(leer.readLine());
                        System.out.println("Ingrese la posicion en z: ");
                        z = Integer.parseInt(leer.readLine());
                        System.out.println("Ingrese el lado: ");
                        lado = Integer.parseInt(leer.readLine());
                        System.out.println("Ingrese la altura: ");
                        alto = Integer.parseInt(leer.readLine());                       
                        Piramide nuevoP = new Piramide(x,y,z,lado,alto);
                        nuevoP.dibujar();
                        nuevoP.mover();
                        System.out.println("El volumen de la figura es de: " + nuevoP.volumen() +".");
                        break;
                case 0: 
                        System.out.println("**** HA SALIDO DEL SISTEMA ****");
                        break;
                default:
                        System.out.println("Número no reconocido. Solo de 0 a 6");break;
                }
                System.out.println("\n"); //Mostrar un salto de línea en Java
            }catch(Exception e){
                System.out.println("Uoops! Error!");
            }   
        }
    }
}