
package prog.fracccion;

public class Raices {
    
    // ATRIBUTOS
    double a;
    double b;
    double c;
    
    //CONSTRUCTORES
    Raices( double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    void obtenerRaices(){
        double soluciones[];
        soluciones = new double[2];
        soluciones[0] = ((-this.b) + Math.sqrt(Math.pow(this.b, 2) - (4 * this.a * this.c))) / (2 * this.a);
        soluciones[1] = ((-this.b) - Math.sqrt(Math.pow(this.b, 2) - (4 * this.a * this.c))) / (2 * this.a);
        System.out.println("La primera solución es = " + soluciones[0]);
        System.out.println("La segunda solución es = " + soluciones[1]);
    }
    
    void obtenerRaiz(){
        double soluciones[];
        soluciones = new double[1];
        soluciones[0] = ((-this.b) - (4 * this.a * this.c)) / (2 * this.a);
    }
    
    double getDiscriminante(){
        return Math.pow(this.b,2) - (4*this.a*this.c);
    }    
    
    Boolean tieneRaices(){
        double discriminarValor = getDiscriminante();
        return discriminarValor >0;
    }
    
    Boolean tieneRaiz(){
        double discriminarValor = getDiscriminante();
        return discriminarValor ==0;
    }
    
    void calcular(){
        double discriminante = getDiscriminante();
        if (discriminante >= 0) {
            if(discriminante == 0){
                this.obtenerRaices();
            }else{
                this.obtenerRaices();
            }
        }
        else{
            System.out.println("La ecuacion no posee solución");
        }
    }
}
