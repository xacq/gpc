
package prog.poo;

public class maincuenta {

    public static void main(String[] args) {
        cuenta ctaAhorros = new cuenta();
        ctaAhorros.setNombreTitular("Freddy Marcos");
        ctaAhorros.mostrarCuenta();
        ctaAhorros.ingresarCuenta(100);
        ctaAhorros.mostrarCuenta();
        ctaAhorros.retirarCuenta(50);
        ctaAhorros.mostrarCuenta();
    }
    
}
