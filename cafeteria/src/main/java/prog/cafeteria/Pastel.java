/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.cafeteria;


public class Pastel extends Producto{
    
    int nroPorciones;
    String nombre;

    public Pastel(String codigo,int precio,int nroPorciones, String nombre) {
        super(codigo,precio);
        this.nroPorciones = nroPorciones;
        this.nombre = nombre;
    }

    public int getNroPorciones() {
        return nroPorciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNroPorciones(int nroPorciones) {
        this.nroPorciones = nroPorciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        
    @Override
    public String toString(){
        return ("PASTEL: "+nombre+" - "+ nroPorciones + " - " + precio);
    }
}
