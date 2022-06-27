
package prog.poo;

public class maincafe {

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
