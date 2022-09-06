
package prog.agenciaviajes;

import java.io.Serializable;

public class AsientoPasajero implements Serializable, Comparable<AsientoPasajero>{
        //ATRIBUTOS
    public int asiento;
    public String nombre;
    
    //CONSTRUSTOR
    AsientoPasajero(int asiento, String nombre){
        this.asiento = asiento;
        this.nombre = nombre;
    }
    //SETTERS Y GETTERS

    public int getAsiento() {
        return asiento;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(AsientoPasajero o) {
        String a=String.valueOf(this.getAsiento())+this.getNombre();
        String b=String.valueOf(o.getAsiento())+o.getNombre();
        return a.compareTo(b);
    }
    
    //METODOS
    @Override
    public String toString () {
        return "ASIENTO ->"+ asiento + " NOMBRE ->"+ nombre + ".";
    }
}
