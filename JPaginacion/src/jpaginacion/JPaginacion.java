
package jpaginacion;

import java.util.Scanner;

public class JPaginacion {
/*FUNCION PRINCIPAL*/
    public static void main(String[] args) {
        Memoria nuevaMem;
        nuevaMem = new Memoria();
        Cola nuevaCola;
        nuevaCola = new Cola();
        int mem=-1, frame=-1, proceso,procesocola, frameproceso=0;
        int menu=0, acola, espacio, posicionencola;
        Scanner lector = new Scanner (System.in);
        while (menu != 7){/*IMPRESION DEL MENU PARA EL SISTEMA*/
            System.out.println("""
                               Seleccione una opcion:
                               1.Ingreso tamaño de Memoria y calculo del tamano de cada Frame
                               2.Ingreso Procesos
                               3.Cola de espera
                               4.Finalizar Procesos
                               5.Mostrar procesos
                               6.Mostrar Cola
                               7.Salir""");

        menu = lector.nextInt();/*ingreso de opcion del menu*/
            switch (menu) {
                case 1 -> {/*opcion que ingresa memoria maximo a 100bytes*/
                    mem = nuevaMem.ingresoMemoria();
                    frame = nuevaMem.definirFrame();
                }     
                case 2 -> {/*ingreso de procesos a memoria*/
                    proceso = nuevaMem.ingresoProceso();
                    if (proceso != -1){/*proceso a ingresar a memoria*/
                        frameproceso = nuevaMem.dividirFramesproceso();
                        acola = nuevaMem.ingresoprocesomemoria();
                        if (acola==-1){/*la condicion indica que el proceso debe ir a la cola de espera*/
                            nuevaCola.ingresarCola(nuevaMem.proceso,nuevaMem.task);
                        }
                    }
                }
                case 3 -> nuevaCola.mostrarCola();/*muestra la cola en la pantalla*/
                case 4 -> {
                    nuevaMem.finalizarProceso();/*funcion que finaliza procesos */
                    espacio = nuevaMem.rastrearframeingresoproceso();/*verifica espacios en memoria*/
                    posicionencola=nuevaCola.sacartareaCola(10-espacio, frame);/*se saca el proceso de la cola*/
                    if (posicionencola == 1){
                        nuevaMem.task++; /*asignan variables de sring tipo tarea en memoria*/
                        procesocola = nuevaCola.task[0];/*asigna variable al proceso desde cola*/
                        frameproceso = nuevaMem.dividirFramesprocesocola(procesocola);/*ingresa proceso en memoria*/ 
                        nuevaMem.ingresoprocesomemoriacola(procesocola,frameproceso);/*ingresa proceso en memoria*/
                        nuevaCola.eliminarprocesoCola(); /*se elimina el espacio en la cola del proceso retirado*/
                        System.out.println("Se ha movido el proceso "+procesocola+" a Memoria");
                        nuevaMem.mostrarprocesos();
                    }
                }
                case 5 -> nuevaMem.mostrarprocesos();/*muestra proceso en memoria*/
                case 6 -> nuevaCola.mostrarCola();/*muestra proceso en la cola de espera*/
                default -> {break;}
            };
        }
    }
    
}
