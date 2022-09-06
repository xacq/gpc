
package prog.interfacesabstractas;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cuadrado extends Figura2D{
    //ATRIBUTOS
    int ancho;
    int alto;
    //CONSTRUCTOR
    Cuadrado(int x, int y, int ancho, int alto){
        super(x,y);
        this.ancho = ancho;
        this.alto = alto;        
    }
    
    @Override
    public double area() {
        return ancho * alto;
    }

    @Override
    public void dibujar() {
        for (int fila = 1; fila <= this.ancho; fila++) {
            for (int columna = 1; columna <= this.alto; columna++){
                    System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println("Se ha dibujado una figura rectangular de " + this.ancho + " por " + this.alto + ".");
    }
} 