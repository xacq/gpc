/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog.cafeteria;

import java.util.ArrayList;
import java.util.Scanner;


public class CafePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        String code, coded, name, codigo, date;
        int price, cant, i;
        
        ArrayList<Cafe> cafes = new ArrayList();
        ArrayList<Mesero> meseros = new ArrayList();
        ArrayList<Pastel> pasteles = new ArrayList();
        ArrayList<Pedido> pedidos = new ArrayList();
        
        boolean salir = false;
       int opcion; //Guardaremos la opcion del usuario
        
       while(!salir){
            
           System.out.println("1. Ingresar un Tipo de Cafe");
           System.out.println("2. Ingresar un Tipo de Pastel");
           System.out.println("3. Ingresar un Mesero");
           System.out.println("4. Ingresar un Pedido");
           System.out.println("5. Lista de Cafes");
           System.out.println("6. Lista de Pasteles");
           System.out.println("7. Lista de Meseros");
           System.out.println("8. Lista de Pedidos");
           System.out.println("9. Salir");           
           System.out.println("Escribe una de las opciones");
           opcion = leer.nextInt();            
           switch(opcion){
               case 1 -> {
                   System.out.println("Ingrese el codigo: ");
                   code = leer.next();
                   System.out.println("Ingrese el tipo de cafe: ");
                   String type = leer.next();
                   System.out.println("Ingrese el precio: ");
                   price = leer.nextInt();
                   cafes.add(new Cafe(type, code, price));                 
                }
               case 2 -> {
                   System.out.println("Ingrese el codigo: ");
                   code = leer.next();
                   System.out.println("Ingrese el precio: ");
                   price = leer.nextInt();
                   System.out.println("Ingrese las porciones: ");
                   cant = leer.nextInt();
                   System.out.println("Ingrese el nombre: ");
                   name = leer.next();
                   pasteles.add(new Pastel(code, price, cant, name));
                }
                case 3 -> {
                    System.out.println("Ingrese el codigo: ");
                    code = leer.next();
                    System.out.println("Ingrese el nombre: ");
                    name = leer.next();
                    meseros.add(new Mesero(name, code));
                }
                case 4 -> {
                    System.out.println("Ingrese el codigo del cliente: ");
                    code = leer.next();
                    System.out.println("Ingrese la fecha: ");
                    date = leer.next();
                    System.out.println("Escoja el codigo del mesero de la lista: ");
                    for( i = 0; i < meseros.size(); i++) {
                        System.out.println(meseros.get(i));
                    } 
                    coded= leer.next();
                    boolean salire = false;
                    int opcione; //Guardaremos la opcion del usuario
                    while(!salire){
                        System.out.println("1. Ingrese un producto");
                        System.out.println("2. Salir");
                        System.out.println("Escribe una de las opciones para registrar productos");
                        opcione = leer.nextInt();
                        switch(opcione){
                            case 1 -> {
                                System.out.println("Seleccione el codigo del producto: ");
                                    for( i = 0; i < cafes.size(); i++) {
                                        System.out.println(cafes.get(i));
                                    }   
                                    for( i = 0; i < pasteles.size(); i++) {
                                        System.out.println(pasteles.get(i));
                                    } 
                                codigo = leer.next();
                                System.out.println("Ingrese la cantidad de este producto: ");
                                cant = leer.nextInt();
                                pedidos.add(new Pedido(code, date, coded, codigo, cant));
                            }
                            case 2 -> salir=true;
                            default -> System.out.println("Solo números entre 1 y 2");
                        }
                    }
                }
                case 5 ->{
                    for( i = 0; i < cafes.size(); i++) {
                        System.out.println(cafes.get(i));
                    }                 
                }
                case 6 ->{
                    for( i = 0; i < pasteles.size(); i++) {
                        System.out.println(pasteles.get(i));
                    } 
                }
                case 7 ->{
                    for( i = 0; i < meseros.size(); i++) {
                        System.out.println(meseros.get(i));
                    } 
                }
                case 8 ->{
                    for( i = 0; i < pedidos.size(); i++) {
                        System.out.println(pedidos.get(i));
                    } 
                }
                case 9 -> salir=true;
                default -> System.out.println("Solo números entre 1 y 5");
           }
            
       }
        
    }
    
}
