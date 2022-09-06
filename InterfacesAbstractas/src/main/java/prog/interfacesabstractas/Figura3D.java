
package prog.interfacesabstractas;

public abstract class Figura3D extends FiguraGeometrica{
    //ATRIBUTOS
    private int x;
    private int y;
    private int z;
    //CONSTRUCTOR
    Figura3D( int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
  
    //METODOS ABSTRACTOS
    abstract public double volumen();
    
    @Override
    public void mover(){
        System.out.println ("La Figura se encuentra en la posicion: " + this.x + " hacia la derecha y en la posicion " + this.y + " hacia la izquierda y en la posicion " + this.z + " en profundidad.");
    }
}
