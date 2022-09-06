
package prog.sseducativo;

public abstract class Estudiante {
    //ATRIBUTOS
    private String nombre;
    private String cedula;
    private String genero;
    
    //CONSTRUCTORES
    Estudiante(String nombre, String cedula, String genero){
        this.nombre = nombre;
        this.cedula = cedula;
        this.genero = genero;
    }
    
    //METODOS SETTER Y GETTER
    public String getNombre() {
        return this.nombre;
    }

    public String getCedula() {
        return this.cedula;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    //METODOS
    @Override
    public String toString () {
        return "\nNombre: "+ nombre + ".\nCédula: "+ cedula + ".\nGénero: " + genero + ".\n";
    }
    //METODO ABSTRACTO
    abstract public float calcularBeca (); 
}
