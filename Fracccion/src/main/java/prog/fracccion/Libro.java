
package prog.fracccion;

import java.util.Scanner;

public class Libro {
        
    //ATRIBUTOS
    String isbn;
    String nombre;
    String autor;
    double precio;
    //CONSTRUCTOR
    Libro(String isbn, String nombre, String autor, double precio){
    this.autor = autor;
    this.isbn = isbn;
    this.nombre = nombre;
    this.precio = precio;
}        
    //METODO PARA VISUALIZAR UN LIBRO
    void mostrar(){
       System.out.println("\nEl libro " + this.nombre + " tiene por autor a "
                        + this.nombre  +" y su ISBN es " +  this.isbn
                        + ".  Su precio es" + String.valueOf(this.precio));
    }
   
    public static void main(String args[]){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de libros a ingresar: ");
        int cantidad = leer.nextInt();
        double promedio = 0;
        int i;
        double max=0.0, min=0.0;
        Libro arregloLibros[] = new Libro[cantidad];
        for (i = 0; i<cantidad; i++){
            System.out.println("Ingrese el libro numero "+i+".");
            System.out.println("AUTOR: ");
            arregloLibros[i].autor = leer.nextLine();
            System.out.println("NOMBRE: ");
            arregloLibros[i].nombre = leer.nextLine();
            System.out.println("ISBN: ");
            arregloLibros[i].isbn = leer.nextLine();
            System.out.println("PRECIO: ");
            arregloLibros[i].precio = leer.nextDouble();
            promedio = promedio + arregloLibros[i].precio;
        }
        
        System.out.println("LOS LIBROS INGRESADOS SON LOS SIGUIENTES: ");
        for (i=0;i<cantidad;i++){
            arregloLibros[i].mostrar();
        }
                
        promedio= promedio / cantidad;
        System.out.println("\nEL PROMEDIO DE PRECIOS DE LOS LIBROS INGRESADOS ES " + String.valueOf(promedio));
        
        for (i=0;i<cantidad;i++){
            if (arregloLibros[i].precio > max){
                max = arregloLibros[i].precio;
            }
            else min = arregloLibros[i].precio;
        }
        
        System.out.println("EL MAXIMO PRECIO DE LOS LIBROS INGRESADOS ES = "+ String.valueOf(max));
        System.out.println("EL MINIMO PRECIO DE LOS LIBROS INGRESADOS ES = "+ String.valueOf(min));

        
    }
}
