
package prog.modelo;

import java.io.Serializable;

    public class User implements Serializable{

        private String codigo;
        private String nombre;
        
        public User(String codigo, String nombre) {
            this.codigo = codigo;
            this.nombre = nombre;
        }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        
    @Override
    public String toString(){
        return ("USUARIO ->" +" NOMBRE: "+ this.getCodigo());
    }

}
