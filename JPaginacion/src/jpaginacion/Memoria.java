/*OBJETO QUE CREA LOS ARRAYS PARA EL ALMACENAMIENTO DE PROCESOS EN MEMORIA*/
package jpaginacion;

import java.util.Scanner;
/*CLASE TIPO PUBLICA DE MEMORIA*/
public class Memoria {
    int idmem [] = new int[10];
    String frame[]= new String[10];
    int tarea[] = new int[10];
    public Scanner leer = new Scanner (System.in);
    int procesoaeliminar;
    int tamanoframemoria;
    int cantidadframes;
    int cantidadframesproceso;
    int mem=0;
    int cola=0;
    int proceso = -1;
    int h,i,j,k=0;
    int task=-1;
/*CONSTRUCTOR DE LA CLASE*/    
    Memoria(){
        for (i=0;i<frame.length;i++){
            idmem[i]=i;
            frame[i]="vacio";
            tarea[i]=0;            
        }
    }
/*FUNCION DE LA CLASE QUE INGRESA Y VERIFICA EL TAMANO DE MEMORIA*/
/*TAMBIEN CONTROLA QUE YA ESTE ASIGNADO MEMORIA SEGUN LA SESION*/
    public int ingresoMemoria(){
        if (mem>0){
            System.out.println ("Existe una asignacion de memoria en proceso");
            return mem;
        }
        else {
            while (k == 0){
                System.out.println ("Ingrese el tamaño de la memoria (menor o iguala 100 bytes): ");
                mem = leer.nextInt();
                if (mem > 100 || mem <= 0){
                    System.out.println("Tamaño de memoria ingresado incorrecto (de 1 a 100 bytes)).");
                    k = 0;
                }
                else k = -1;
            }
            System.out.println("La capacidad de memoria ingresada es de "+mem+" bytes");
            return mem;
        }
    }
/*FUNCION DE LA CLASE QUE DEFINE EL TAMANO DE LOS FRAMES SEGUN LA MEMORIA INGRESADA*/
    public int definirFrame(){
        tamanoframemoria = mem/10; /*dividimos para 10 y se calcula el tamano del frame*/
        System.out.println("El tamano actual de cada frame es de "+tamanoframemoria+" bytes");     
        return tamanoframemoria;
    }
/*FUNCION DE LA CLASE QUE MUESTRA EL FRAME Y LA POSICION DEL MISMO*/    
    public void mostrarMemoria(){
    for (i=0; i< idmem.length ;i++){/*estructura de control para recorrer arrays*/
        System.out.println("Se muestra la posicion: "+i + " y el frame: "+frame[i]+".");                
        }
    }
/*FUNCION DE LA CLASE QUE RASTREA POSICION VACIA EN LA MEMORIA*/    
    public int rastrearframeingresoproceso (){
        for (i=0;i<10;i++){
            if ("vacio".equals(frame[i]))/*recorre array verificando cual es vacio*/ 
                break;
        }
        return i;
    }
/*FUNCION DE LA CLASE QUE PERMITE INGRESAR PROCESOS EN MEMORIA Y CONTROLA SU TAMANO 
    CON REFERENCIA A LA MEMORIA*/    
    public int ingresoProceso(){
        System.out.println("Ingrese el tamano del proceso en bytes: ");
        proceso = leer.nextInt(); 
            if (proceso<= mem){/*condicion que verifica que el proceso ingresado
                sea menor a la memoria establecida*/
                System.out.println("Tamano del proceso es de :"+proceso+" bytes.");
                task++;
                }
            else {/*caso contrario no se puede ingresar */
                System.out.println("No puede ingresar este proceso con este tamano de bytes en memoria");
                proceso=-1;/*variable de control que indica la necesidad de llevar el proceso a la cola*/
            }
        return proceso;
    }
/*FUNCION DE LA CLASE QUE DIVIDE EN FRAMES EL PROCESO INGRESADO SEGUN EL TAMA
    NO DEL PROCESO*/   
    public int dividirFramesproceso(){
        cantidadframesproceso = proceso/tamanoframemoria;/*se calcula el numero de frames que ocupara el proceso*/  
        if (cantidadframesproceso * tamanoframemoria < proceso){ 
            cantidadframesproceso++;/*si el proceso no cumple con la condicion se aumenta en uno el frame para contener todo el proceso*/
        }
        System.out.println("El proceso se ha dividido en "+cantidadframesproceso + " frames");
        return cantidadframesproceso;
    }
/*FUNCION DE LA CLASE QUE DIVIDE EN FRAMES EL PROCESO SACADO DESDE COLA*/    
    public int dividirFramesprocesocola(int procesocola){
        cantidadframesproceso = procesocola/tamanoframemoria; /*se calcula el numero de frames que ocupara el proceso*/  
        if (cantidadframesproceso * tamanoframemoria < procesocola){
            cantidadframesproceso++;/*si el proceso no cumple con la condicion se aumenta en uno el frame para contener todo el proceso*/
        }
        System.out.println("El proceso se ha dividido en "+cantidadframesproceso + " frames");/*indica la cantidad de los frames a usar 
        por el proceso*/
        return cantidadframesproceso;
    }
/*FUNCION DE LA CLASE QUE INGRESA EN MEMORIA UN PROCESO*/    
    public int ingresoprocesomemoria(){
        int rfi= rastrearframeingresoproceso();
        int espacioframe = 10-rfi;/*verfica el numero de frames vacios existentes*/
            if (cantidadframesproceso <= espacioframe){/*condicion que verifica si se puede guardar en memoria el proceso actual*/
                for (i=rfi;i<cantidadframesproceso+rfi;i++){
                    frame[i] = "T"+task+"P"+i;
                    tarea[i] = proceso;
                }
            }
            else {
                System.out.println("No hay espacion suficiente para almacenar en memoria.  Proceso a cola de espera.");
                return -1;/*retorna valor de control para ingresar el proceso en cola de espera*/
            }
            return 0;
    }
/*FUNCION DE LA CLASE QUE IMPRIME LOS PROCESOS*/    
    public void mostrarprocesos(){
        for (i=0;i<10;i++){
                System.out.println("Proceso: "+tarea[i]+ " - Frame= " + frame[i] + " - Posicion: "+ idmem[i]);
        }
    }
/*FUNCION DE LA CLASE QUE ELIMINA UNO O UN GRUPO DE PROCESOS EN MEMORIA*/    
    public void finalizarProceso(){
        mostrarprocesos();/*muestra los proceso en la memoria para guiar al usuario*/
        System.out.println("Ingrese el proceso a eliminar:");
        procesoaeliminar = leer.nextInt();/*ingresa un proceso a ser eliminado*/
        for (i=0;i<10;i++){/*estructura de control para eliminar los frames con el proceso a eliminar de memoria*/
            if (tarea[i] == procesoaeliminar){
                idmem[i]=i;
                frame[i]="vacio";
                tarea[i]=0; 
            }       
        }
        h=0;
        for (i=0;i<10;i++){/*estructura de control para llenar con los frames existentes los frames eliminados*/
            if (frame[h] == "vacio"){
                for (j=h;j<10;j++){
                    if (frame[j] != "vacio"){
                        tarea[j-1] = tarea[j];
                        frame[j-1] = frame[j];
                            if (frame[j+1] == "vacio"){
                                tarea[j] = 0;
                                frame[j] = "vacio";
                            }
                       }
                }
            }
            else {
                h++;
            }
            }
        }       
/*FUNCION DE LA CLASE QUE PERMITE EL INGRESO DE UN PROCESO DESDE LA COLA DE ESPERA*/    
    public void ingresoprocesomemoriacola(int procesocola, int frameprocesocola){
        int rfi= rastrearframeingresoproceso();/*se rastrea inicio de frames vacios*/
        int espacioframe = 10-rfi; /*verifica cuantos frames vacios existen*/
            if (cantidadframesproceso <= espacioframe){/*verifica si los frames existentes contendran los fframes del proceso en cola*/
                for (i=rfi;i<frameprocesocola+rfi;i++){
                    frame[i] = "T"+task+"P"+i;
                    tarea[i] = procesocola;
                }
            }
    }
}




     