
package prog.modelo;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Date;


public class Curso implements Serializable{
    
    private String codigo;
    private String codigovet;
    private String fecha;
    private int horas;
    private String nombre;
    private String descripcion;

    public Curso(String codigo, String codigovet, String fecha, int horas, String nombre, String descripcion) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.horas = horas;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigovet = codigovet;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCodigovet() {
        return codigovet;
    }

    public String getFecha() {
        return fecha;
    }

    public int getHoras() {
        return horas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCodigovet(String codigovet) {
        this.codigovet = codigovet;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString(){
        return ("CURSO -> CODIGO: "+codigo+" - DOCTOR: "+codigovet+" - NOMBRE: "+nombre+" - FECHA: "+fecha+ " - HORAS: " +horas+ " - DESCRIPCION: " +descripcion);
    }
    
}