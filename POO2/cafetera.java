
public class cafetera {
    
    // Atributos
    int capacidadMaxima;
    int cantidadActual;
    
    //Constructor A
    cafetera(){
        capacidadMaxima = 10000;
        cantidadActual = 0;
        System.out.println("La cafetera se ha creado con "+capacidadMaxima+" ml. ce capacidad");
    }
    
    //Constructor B   
    cafetera (int maxima){
        capacidadMaxima = maxima;
        cantidadActual = maxima;
        System.out.println("La cafetera se ha creado con "+capacidadMaxima+" ml. ce capacidad y esta llena");
    }
    
    //Constructor C
    cafetera (int maxima, int actual){
        if (actual > maxima){
            capacidadMaxima = maxima;
            cantidadActual = maxima;
            System.out.println("La cafetera se ha creado con "+capacidadMaxima+" ml. ce capacidad y esta llena");
        }
        else{
            capacidadMaxima = maxima;
            cantidadActual = actual;
            System.out.println("La cafetera se ha creado con "+capacidadMaxima+" ml. ce capacidad y esta tiene "+cantidadActual+" ml. de cafe.");
        }
    }
    
    //Metodos
    public void llenarCafetera(){
        cantidadActual = capacidadMaxima;
        System.out.println("La cafetera esta llena");
    }
    
    public void servirTazaCafe(int cantidadServir){
        if (cantidadActual > cantidadServir){ //Si lo que va a servir es menor de lo que hay en la cafetera
            cantidadActual -= cantidadServir;
            System.out.println("La cafetera ha servido una taza con " + cantidadServir +" ml. de cafe.");
        }
        else{
            System.out.println("La cafetera ha servido una taza con " + cantidadActual +" ml. de cafe.");
            cantidadActual = 0; //se iguala a cero y se sirve lo que hay
            System.out.println("La cafetera esta vacia");
        }
        
    }
    
    public void vaciarCafetera(){
        cantidadActual=0;
        System.out.println("La cafetera esta vacia");
    }
    
    public void agregarCafe(int cantidadAgregar){
        if (cantidadAgregar > capacidadMaxima){
            System.out.println("La cantidad a agregar supera la capacidad de la cafetera");
        }
        else {
            cantidadActual += cantidadAgregar;
            System.out.println("La cantidad en la cafetera es de "+cantidadActual+" ml.");
        }
    }
    
    public void mostrarCafetera(){
        System.out.println("La cantidad en la cafetera es de "+cantidadActual+" ml.");
    }
    
    
        public static void main(String[] args) {
        cafetera cafeRestaurante= new cafetera();
        cafeRestaurante.mostrarCafetera();
        cafeRestaurante.llenarCafetera();
        
        cafetera cafeBar = new cafetera(100000);
        cafeBar.mostrarCafetera();
        cafeBar.vaciarCafetera();
        
        cafetera cafeOficina = new cafetera (100000,500000);
        cafeOficina.mostrarCafetera();
        cafeOficina.servirTazaCafe(3);
    }
}
