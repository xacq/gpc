package prog.juego_espe;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Jugador_Main {

    public static void main(String[] args) throws IOException{
        int puntaje = 0, adivina;
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        int numUser;         // Solicitar un número al usuario
        String nuevoNombre, nuevoNick, extra;
        int nuevoEdad;
        ArrayList<Jugador> Jugadores = new ArrayList();
        int contador_jugadores, i,j,control=0;
        FileInputStream entradaArchivo = null;
            try{
                entradaArchivo = new FileInputStream("data.txt");
                ObjectInputStream enlace = new ObjectInputStream(entradaArchivo);
                while (true) {
                    try { 
                        Jugador obj = (Jugador)enlace.readObject();
                        Jugadores.add(obj);
                        System.out.println(obj);
                    } catch (Exception ex) {
                        System.err.println("Archivo Cargando...");
                        break;
                    }
                }
            } catch (Exception ex) {
                System.err.println("failed to read data.txt, "+ ex);
            }    
        System.out.println("******** JUEGO PARA ADIVINAR UN NUMERO SECRETO **********\n");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        contador_jugadores = Jugadores.size();
        while(!salir){
           System.out.println("1. Crear Nuevo Usuario");
           System.out.println("2. Adivinar el Número Secreto");
           System.out.println("3. Mostrar Jugadores");
           System.out.println("4. Salir");
           System.out.println("Escribe una de las opciones");
           opcion = Integer.parseInt(br.readLine());
           switch(opcion){
               case 1:
                    do{
                        System.out.println("Ingresa el Nombre del Usuario: ");
                        nuevoNombre = br.readLine();
                        for (j = 0; j < nuevoNombre.length(); j++){
                            char caracter = nuevoNombre.toUpperCase().charAt(j);
                            int valorASCII = (int)caracter;
                            if (valorASCII != 165 && (valorASCII < 65 || valorASCII > 90)){
                                System.out.println("NOMBRE INCORRECTO");
                                control=-1;
                            }
                        }
                    }while(control == -1);
                    do{
                        System.out.println("Ingresa el Apodo del Usuario: ");
                        nuevoNick = br.readLine();
                        for (j = 0; j < nuevoNick.length(); j++){
                            char caracter = nuevoNick.toUpperCase().charAt(j);
                            int valorASCII = (int)caracter;
                            if (valorASCII != 165 && (valorASCII < 65 || valorASCII > 90)){
                                System.out.println("NICKNAME INCORRECTO");
                                control=-1;
                            }
                        }
                    }while(control == -1);
                    System.out.println("Ingresa la edad del Usuario: ");
                    nuevoEdad = Integer.parseInt(br.readLine());
                    Jugador nuevoJugador = new Jugador(nuevoNombre, nuevoNick, nuevoEdad);
                    System.out.println(nuevoJugador);
                    Jugadores.add(nuevoJugador);
                    contador_jugadores++;
                    break;
                case 2:
                    int player=0;
                    adivina = 1;
                    int numero = (int)Math.floor(Math.random()*(50-1+1)+1);
                    System.out.println("*********** ADIVINA EL NUMERO QUE EL PROGRAMA GENERA DEL 1 AL 50 ***********");
                    System.out.println("Ingresar Nickname de Usuario: ");
                    extra = br.readLine();
                    for (i=0;i<Jugadores.size();i++){
                        if (Jugadores.get(i).Nickname.equals(extra)){
                            System.out.println("Encontrado en el puesto: "+1);
                            player = i;
                            adivina = 0;
                            break;
                        }
                    }
                    if (adivina == 1){
                        System.out.println("*************** JUGADOR NO EXISTE ***************");
                    }
                    else {
                        while (adivina == 0){
                        do {
                            System.out.println("Ingresa tu respuesta: ");
                            extra = br.readLine();
                            numUser = Integer.parseInt(extra);
                                if (numero > numUser) {
                                    System.out.println("El número es mayor que el introducido.");
                                    puntaje++; //AUMENTA EL PUNTAJE DE INTENTOS Al ADIVINAR EL NUMERO CORRECTO
                                } else if (numero < numUser) {
                                    System.out.println("El número es menor que el introducido.");
                                    puntaje++;  //AUMENTA EL PUNTAJE DE INTENTOS Al ADIVINAR EL NUMERO CORRECTO
                                }
                                if (numero > numUser){
                                    adivina = 1;
                                }
                            } while (numero != numUser);                    
                        }
                    System.out.println("CORRECTO...!, Haz adivinado. Fue el: " + numero + ".  Lo hiciste en "+ puntaje + " intentos.");
                    Jugadores.get(player).setPuntaje(puntaje);
                    }
                    break;
                case 3:
                    for (i=0;i<Jugadores.size();i++){
                        System.out.println(Jugadores.get(i).toString());
                    }
                    break;
                case 4:
                    salir=true;
                    System.out.println("**** TE ESPERAMOS EN OTRA OPORTUNIDAD ******");
                    FileOutputStream archivo = null;
                    try{                        
                        archivo = new FileOutputStream("data.txt");
                        ObjectOutputStream vinculo = new ObjectOutputStream(archivo);
                        for (Jugador obj : Jugadores) {
                                vinculo.writeObject(obj);
                            }
                        vinculo.close();
                        archivo.close();
                    }catch(FileNotFoundException ex){
                        ex.printStackTrace();
                    }catch(IOException ex){
                        ex.printStackTrace();
                    }finally {
                            try{
                                archivo.close();
                            }catch (IOException ex){
                                ex.printStackTrace();
                            }
                        }
                    break;
                default:
                   System.out.println("Solo números entre 1 y 4");
           }
        }
    }
}
