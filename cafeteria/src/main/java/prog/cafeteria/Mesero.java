/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.cafeteria;


public class Mesero {
    
    private String nombre;
    private String codMesero;

    public Mesero(String nombre, String codMesero) {
        this.nombre = nombre;
        this.codMesero = codMesero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodMesero() {
        return codMesero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodMesero(String codMesero) {
        this.codMesero = codMesero;
    }
    
    @Override
    public String toString(){
        return ("MESERO: "+nombre+" - "+ codMesero);
    }
}
