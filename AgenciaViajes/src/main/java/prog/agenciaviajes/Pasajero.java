
package prog.agenciaviajes;

import java.io.Serializable;

public class Pasajero implements Serializable{
        //ATRIBUTOS
    private String cedula;
    private String nombre;
    private String genero;
    //CONSTRUSTOR
    Pasajero(String cedula, String nombre, String genero ){
        this.cedula = cedula;
        this.nombre = nombre;
        this.genero = genero;
    }
    //SETTERS Y GETTERS

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    //METODOS
    @Override
    public String toString () {
        return "DATOS-->"+ nombre + "->"+ cedula + "->" + genero + ".";
    }
}
