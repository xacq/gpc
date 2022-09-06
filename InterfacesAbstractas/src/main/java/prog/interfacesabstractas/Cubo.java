
package prog.interfacesabstractas;

public class Cubo extends Figura3D{
    //ATRIBUTOS
    int ancho;
    int alto;
    int profundidad;
    //CONSTRUCTOR
    Cubo(int x, int y, int z, int ancho, int alto, int profundidad){
        super(x,y,z);
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
    }
    
    @Override
    public double volumen() {
        return this.ancho * this.alto * this.profundidad;
    }

    @Override
    public void dibujar() {
        for (int fila = 1; fila <= this.ancho; fila++) {
            for (int columna = 1; columna <= this.alto; columna++){
                    System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println("Se ha dibujado una figura tridimensional de " + this.ancho + " de ancho por " +this.alto+ " de alto y " +this.profundidad+ " de profundidad ");
    }
    
}
