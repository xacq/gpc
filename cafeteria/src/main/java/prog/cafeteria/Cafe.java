/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.cafeteria;


public class Cafe extends Producto{
    
    private String tipo;

    public Cafe(String tipo, String codigo, int precio) {
        super(codigo, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }   
       
    @Override
    public String toString(){
        return ("CAFE: "+tipo+" - "+ codigo + " - " + precio);
    }
}
