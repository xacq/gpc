
public class futbolista {
    
    //Atributos 
    String nombreFutbolista;
    int edadFutbolista;
    String nacionalidadFutbolista;
    int numeroFutbolista;
    String posicionFutbolista;
    
    //Constructor A
    futbolista(){
        nombreFutbolista = "Diego Armando Maradona";
        edadFutbolista = 30;
        nacionalidadFutbolista = "Argentina";
        numeroFutbolista = 10;
        posicionFutbolista = "delantero";
    }
    //Constructor B
    futbolista(String nombre, int edad, String nacion, int numero, String posicion ){
        nombreFutbolista = nombre;
        edadFutbolista = edad;
        nacionalidadFutbolista = nacion;
        numeroFutbolista = numero;
        if ("arquero".equals(posicion) || "delantero".equals(posicion) || "defensa".equals(posicion)){
            posicionFutbolista = posicion;
        }   
        else{
            posicionFutbolista = "";
        }
    }
    
    //Metodos
    public void correrFutbolista(){
        System.out.println("El jugador "+nombreFutbolista+ " esta corriendo.");
    }
    
    public void driblarFutbolista(){
        System.out.println("El jugador "+nombreFutbolista+ " esta driblando.");
    }
    
    public void regatearFutbolista(){
        System.out.println("El jugador "+nombreFutbolista+ " esta regateando.");
    }
    
    public void lanzarFutbolista(){
        System.out.println("El jugador "+nombreFutbolista+ " esta lanzando.");
    }
    
    public void mostrarFutbolista(){
        System.out.println("\nDATOS DEL JUGADOR:");
        System.out.println("Nombre: "+nombreFutbolista);
        System.out.println("Nacionalidad: "+nacionalidadFutbolista);
        System.out.println("Edad: "+edadFutbolista);
        System.out.println("Numero: "+numeroFutbolista);
        System.out.println("Posicion: "+posicionFutbolista+"\n");
        
    }
        
        public static void main(String[] args) {
        futbolista maradona = new futbolista();
        maradona.mostrarFutbolista();

        futbolista messi = new futbolista("Leonel Messi", 35, "Argentina", 9, "delantero");
        messi.mostrarFutbolista();
        messi.correrFutbolista();
        messi.driblarFutbolista();
        messi.lanzarFutbolista();
        messi.regatearFutbolista();
    }
}
