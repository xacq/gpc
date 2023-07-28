
package prog.modelo;

import java.io.Serializable;

public class Cliente extends Persona implements Serializable{
    
    public Cliente(String codigo, String nombre, String direccion, String cedula, String telefono) {
        super(codigo, nombre, direccion, cedula, telefono );
    }
    
    
    @Override
    public String toString(){
        return ("CLIENTE-> CODIGO: "+this.getCodigo()+" - NOMBRE: "+ this.getNombre()+ " - DIRECCION: " + this.getDireccion()+ " - CEDULA: " + this.getCedula()+ " - TELEFONO: " + this.getTelefono());
    }
}
