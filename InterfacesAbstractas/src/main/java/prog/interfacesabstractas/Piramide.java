
package prog.interfacesabstractas;

public class Piramide extends Figura3D{
    //ATRIBUTOS
    int lado;
    int altura;
    
    //CONSTRUCTOR
    Piramide(int x, int y, int z,int lado, int altura){
        super(x,y,z);
        this.altura= altura;
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public int getAltura() {
        return altura;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public double volumen() {
        return (Math.pow(this.lado,2)* this.altura)/3;
    }

    @Override
    public void dibujar() {
        for(int numBlancos = this.altura-1,numAsteriscos=1; numBlancos>=0; numBlancos--, numAsteriscos += 2){
            //Espacios en blanco
            for(int i=1;i<=numBlancos;i++){
                System.out.print(" ");
            }
              
            //Asteriscos
            for(int j=1;j<=numAsteriscos;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Se ha dibujado una piramide tridimensional de " + this.lado + " de lado y " +this.altura+ " de altura.");
    }
}
