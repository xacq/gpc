/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.modelo;

/**
 *
 * @author xacq
 */
public class Cliente extends Persona{
    
    public Cliente(String codigo, String nombre, String direccion, String cedula, String telefono) {
        super(codigo, nombre, direccion, cedula, telefono );
    }
    
    @Override
    public String toString(){
        return ("CLIENTE: "+this.getCodigo()+" - "+ this.getNombre()+ " - " + this.getDireccion()+ " - " + this.getCedula()+ " - " + this.getTelefono());
    }
}
