
package prog.fracccion;


public class Fraccion {

    // ATRIBUTOS
    String nombre;
    int edad;
    String sexo;
    double fraccionA;
    double fraccionB;
    //CONTRUCTORES POR DEFECTO
    Fraccion(){
        this.nombre="";
        this.edad = 0;
        this.sexo = "";
        this.fraccionA = 0.0;
        this.fraccionB = 0.0;        
    }
    //CONSTRUCTORES CON PARAMETROS
    Fraccion(String nombre, int edad, String sexo){
        this.nombre=nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.fraccionA = 0.0;
        this.fraccionB = 0.0;        
    }
    //CONSTRUCTOR CON TODOS COMO PARAMETROS
    Fraccion(String nombre, int edad, String sexo, double fraccionA, double fraccionB){
        this.nombre=nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.fraccionA = fraccionA;
        this.fraccionB = fraccionB;        
    }
    //METODOS DE LA CLASE
    double sumarFraccion(){
        return this.fraccionA + this.fraccionB;
    }
    
    double restarFraccion(){
        return this.fraccionA - this.fraccionB;
    }
    
    double multiplicarFraccion(){
        return this.fraccionA * this.fraccionB;
    }
    
    double dividirFraccion(){
        if (fraccionB != 0) {
            return this.fraccionA / this.fraccionB;
        }
        else return 0.0;
    }
    
    void Mostrar(){
        System.out.println("El nombre ingresado es: " + this.nombre);
        System.out.println("La edad ingresada es: " + String.valueOf(this.edad));
        System.out.println("El sexo ingresado es: " + this.sexo);
        System.out.println("La fraccion A ingresada es: " + this.fraccionA);
        System.out.println("La fraccion B ingresada es: " + this.fraccionB);
    }
}
