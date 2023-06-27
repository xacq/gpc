/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.cafeteria;


public class Pedido {
    
    private String nitCliente;
    private String fecha;
    private String codMesero;
    private String codProducto;
    private int cantProductos;

    public Pedido(String nitCliente, String fecha, String codMesero, String codProducto, int cantProductos) {
        this.nitCliente = nitCliente;
        this.fecha = fecha;
        this.codMesero = codMesero;
        this.codProducto = codProducto;
        this.cantProductos = cantProductos;
    }
    
    @Override
    public String toString(){
        return ("PEDIDO: "+nitCliente+" - "+ fecha + " - " + codMesero + " - " + codProducto + " - " + cantProductos);
    }
}
