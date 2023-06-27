/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.modelo;

import java.util.Date;

public class Consulta {
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

    @Override
    public String toString(){
        return ("CONSULTA: "+codigo+" - "+codigoDoctor+" - "+codigoCliente+" - "+codigoMascota+" - "+diagnostico+" - "+fechaDeConsulta);
    }
}
