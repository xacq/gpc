/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.controlador;

import prog.modelo.Cliente;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import static prog.modelo.Persona.validarCedula;


public class ControladorCliente  {
    //declaracion de variables para el sistema
    Scanner leer = new Scanner(System.in);
    String dosis, code, name, direccion, cedula, telefono;
    int i, tipo, genero, edad, horas, tiempo;
    boolean prueba=true, repetido=true;

    public void Controlador(String codigo, String name, String direccion, String cedula, String telefono,ArrayList <Cliente> clientes){
        try {
            this.cedula = cedula;

            if (!validarCedula(cedula)) {
                JOptionPane.showMessageDialog(null,
                        "CEDULA INCORRECTA",
                        "Mensaje Error", JOptionPane.ERROR_MESSAGE);
                repetido = false;
            }

            for (i = 0; i < clientes.size(); i++) {
                if (clientes.get(i).getCedula().equals(this.cedula)) {
                    JOptionPane.showMessageDialog(null,
                            "CEDULA REPETIDA",
                            "Mensaje Error", JOptionPane.ERROR_MESSAGE);
                    repetido = false;
                }
            }

            if (repetido) {
                this.code = codigo;
                this.name = name;
                this.direccion = direccion;
                this.telefono = telefono;
                clientes.add(new Cliente(code, name, direccion, cedula, telefono));
                JOptionPane.showMessageDialog(null,
                        "CLIENTE INGRESADO",
                        "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Ocurrió un error: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
