
package prog.interfacesabstractas;

import java.awt.Graphics;

public abstract class Figura2D extends FiguraGeometrica {
    //ATRIBUTOS PARA MOVIMIENTO
    private int x;
    private int y;
    //CONSTRUCTOR
    public Figura2D(int derecha, int abajo) {
        this.x = derecha;
        this.y = abajo;
    }
    //CONSTRUCTOR
    public Figura2D() {
        this.x = 0;
        this.y = 0;
    }
    // GETTERS Y SETTERS
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
   
    //METODOS ABSTRACTOS
    abstract public double area();
    
    @Override
    public void mover(){
        System.out.println ("La Figura se encuentra en la posicion: " + this.x + " hacia la derecha y en la posicion " + this.y + " hacia la izquierda.");
    }

    void paintComponent(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
