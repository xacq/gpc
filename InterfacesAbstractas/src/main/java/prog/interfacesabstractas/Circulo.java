
package prog.interfacesabstractas;

public class Circulo extends Figura2D{
    //ATRIBUTOS
    int radio;
    //CONSTRUCTOR
    Circulo(int x, int y, int radio){
        super(x,y);
        this.radio = radio;
    }
    
    @Override
    public double area() {
        return this.radio * Math.PI;
    }

    @Override
    public void dibujar() {
        System.out.println("Se ha dibujado una figura circular de " + this.radio + " de radio.");
    }
    
}
