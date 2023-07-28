
package prog.modelo;

import java.io.Serializable;
import java.util.Date;

public class Consulta implements Serializable{
    private String codigo;
    private String codigoDoctor;
    private String codigoCliente;
    private String codigoMascota;
    private String diagnostico;
    private String fechaDeConsulta;

    public Consulta(String codigo, String codigoDoctor, String codigoCliente, String codigoMascota, String diagnostico, String fechaDeConsulta) {
        this.codigo = codigo;
        this.codigoDoctor = codigoDoctor;
        this.codigoCliente = codigoCliente;
        this.codigoMascota = codigoMascota;
        this.diagnostico = diagnostico;
        this.fechaDeConsulta = fechaDeConsulta;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCodigoDoctor() {
        return codigoDoctor;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public String getCodigoMascota() {
        return codigoMascota;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getFechaDeConsulta() {
        return fechaDeConsulta;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCodigoDoctor(String codigoDoctor) {
        this.codigoDoctor = codigoDoctor;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public void setCodigoMascota(String codigoMascota) {
        this.codigoMascota = codigoMascota;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void setFechaDeConsulta(String fechaDeConsulta) {
        this.fechaDeConsulta = fechaDeConsulta;
    }

    @Override
    public String toString(){
        return ("CONSULTA-> CODIGO: "+codigo+" - DOCTOR: "+codigoDoctor+" - CLIENTE: "+codigoCliente+" - MASCOTA: "+codigoMascota+" - DIAGNOSTICO"+diagnostico+" - FECHA: "+fechaDeConsulta);
    }
}
