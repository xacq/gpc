/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.controlador;

import java.awt.HeadlessException;
import prog.modelo.Doctor;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import static prog.modelo.Persona.validarCedula;


public class ControladorDoctor  {
    //declaracion de variables para el sistema
    Scanner leer = new Scanner(System.in);
    String dosis, code, name, direccion, cedula, telefono;
    int i, tipo, genero, edad, horas, tiempo;
    boolean repetido=true;

    public void Controlador (String codigo, String name, String direccion, String cedula, String telefono, ArrayList<Doctor> doctores){        
        this.cedula = cedula;
        try {
            if (!validarCedula(cedula)) {
                JOptionPane.showMessageDialog(null,
                        "CEDULA INCORRECTA",
                        "Mensaje Error", JOptionPane.ERROR_MESSAGE);
                repetido = false;
            }

            for (i = 0; i < doctores.size(); i++) {
                if (doctores.get(i).getCedula().equals(this.cedula)) {
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
                doctores.add(new Doctor(code, name, direccion, cedula, telefono));
                JOptionPane.showMessageDialog(null,
                        "DOCTOR INGRESADO",
                        "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null,
                    "Ocurrió un error: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
