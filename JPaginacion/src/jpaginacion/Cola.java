/*OBJETO QUE CREA LOS ARRAYS PARA EL ALMACENAMIENTO DE PROCESOS EN COLA DE 
ESPERA*/
package jpaginacion;

public class Cola {
    int i;
    int identificador [] = new int[10];
    int task[]= new int[10];
    String nombre [] = new String [10];
    int posicioncola =0;
/*CONSTRUCTOR DE LA CLASE*/    
    Cola(){
        for (i=0;i<identificador.length;i++){
            identificador[i]=i;
            task[i]= 0;
            nombre[i]= "vacio";
        }
    }
/*FUNCION DE LA CLASE QUE INGRESA Y VERIFICA EL TAMANO DE MEMORIA*/    
    public void ingresarCola (int proceso, int tarea){
        posicioncola = ubicarenCola();
        System.out.println("Ingresando proceso a la posicion de cola # "+posicioncola+".");
        identificador[posicioncola] = posicioncola;
        task[posicioncola] = proceso;
        nombre[posicioncola] = "T"+tarea;
        mostrarCola();
    }
/*FUNCION DE LA CLASE QUE UBICA UNA POSICION VACIA EN EL ARRAY DE LA COLA*/    
    public int ubicarenCola(){
        for (i=0;i<10;i++){
            if ("vacio".equals(nombre[i])) 
        break;
        }
        return i;
    }
/*FUNCION DE LA CLASE QUE IMPRIME LA COLA EN SI*/    
    public void mostrarCola(){
        for (i=0; i< identificador.length ;i++){
            System.out.println("Cola - Tarea "+ i + " - Proceso: ["+nombre[i]+"] de "+task[i]+" bytes.");                
            }
    }  
/*FUNCION DE LA CLASE QUE SACAMOS EL PRIMER PROCESO DE LA COLA PARA COLOCARLO
    EN LA MEMORIA LUEGO DE ELIMINAR PROCESOS*/ 
    public int sacartareaCola(int tamanoproceso, int frame){
        int temporal = (task[0]/frame);
        if (tamanoproceso >= temporal){
            return 1;
        }
        else {return 0;}
    }
/*FUNCION DE LA CLASE QUE ELIMINA LA UBICACION DEL PROCESO EN LA COLA*/    
    public void eliminarprocesoCola(){
        for (i=1;i<10;i++){
            identificador[i-1]=identificador[i];
            task[i-1]= task[i];
            nombre[i-1]= nombre[i];
            }
    }       
    
}