
package prog.modelo;

import java.io.Serializable;

    public class Doctor extends Persona implements Serializable{

        public Doctor(String codigo, String nombre, String direccion, String cedula, String telefono) {
            super(codigo, nombre, direccion, cedula, telefono );
        }
        
        @Override
        public String toString(){
            return ("DOCTOR-> CODIGO: "+this.getCodigo()+" - NOMBRE: "+ this.getNombre() + " - DIRECCION: " + this.getDireccion()+ " - ID: " + this.getCedula()+ " - TELEFONO:" + this.getTelefono());
        }
    }
