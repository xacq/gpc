
package prog.modelo;

import java.io.Serializable;


public class Remedio implements Serializable{
    
    private String codigo;
    private String nombre;
    private String dosis;
    private int tiempo;

    public Remedio(String codigo, String nombre, String dosis, int tiempo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.dosis = dosis;
        this.tiempo = tiempo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDosis() {
        return dosis;
    }

    public int getTiempo() {
        return tiempo;
    }

    @Override
    public String toString(){
        return ("MEDICACION-> CODIGO: "+codigo+" - NOMBRE: "+nombre+" - DOSIS: "+ dosis + " - TIEMPO: " + tiempo);
    }
}
