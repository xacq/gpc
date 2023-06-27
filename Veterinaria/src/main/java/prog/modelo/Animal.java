
package prog.modelo;

import java.util.Date;

public class Animal {
    
    private String codigo;
    private String nombre;
    private int tipo;
    private float peso;
    private int genero;
    private int edad;

    public Animal(String codigo, String nombre, int tipo, float peso, int genero, int edad ) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.tipo = tipo;
        this.peso = peso;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public void setFechaNacimiento(int edad) {
        this.edad = edad;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public float getPeso() {
        return peso;
    }

    public int getGenero() {
        return genero;
    }

    public int getedad() {
        return edad;
    }
    
    @Override
    public String toString(){
        return ("ANIMAL: "+codigo+" - "+nombre+" - "+tipo+" - "+peso+" - "+genero+" - "+edad);
    }
}
