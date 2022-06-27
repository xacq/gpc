
import java.util.Scanner;

public class cuenta {
    
    //Atributos
    String nombreTitular;
    float cantidadCuenta;
    
    Scanner leer=new Scanner(System.in);
    
    //Constructor
    cuenta(){
        nombreTitular="";
        cantidadCuenta=0;
    }
    
    //Metodos getter y setter
    public String getNombreTitular(){
        return nombreTitular;
    }
    
    public void setNombreTitular(String nombre){
        this.nombreTitular= nombre;  
    }
    
    public float getCantidadCuenta(){
        return cantidadCuenta;
    }
    
    public void setCantidadCuenta(float cantidad){
        this.cantidadCuenta= cantidad;  
    }
    
    //Metodos generales
    public void nombreTitular(){
        System.out.println("Ingrese el nombre del titular de la cuenta");            
        setNombreTitular(leer.nextLine());
    }
    
    public void mostrarCuenta(){
        System.out.println("La cuenta de "+nombreTitular+" posee "+cantidadCuenta + " USD.");
    }
    
    public void ingresarCuenta(float ingCantidad){
        setCantidadCuenta(cantidadCuenta + ingCantidad);
        System.out.println("Se ha ingresado en la cuenta "+ingCantidad+" $.");
        System.out.println("El total de la cuenta es de "+cantidadCuenta+" $.");
    }
    
    public void retirarCuenta(float retCantidad){
        setCantidadCuenta(cantidadCuenta - retCantidad);
        System.out.println("Se ha retirado de la cuenta "+retCantidad+" $.");
        System.out.println("El total de la cuenta es de "+cantidadCuenta+" $.");
    }
    
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
