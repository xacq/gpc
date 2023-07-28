/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.controlador;

import prog.modelo.Consulta;
import prog.modelo.Doctor;
import prog.modelo.Cliente;
import prog.modelo.Animal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ControladorConsulta  {
    //declaracion de variables para el sistema
    Scanner leer = new Scanner(System.in);

    public void ControladorCons (String codigo, String veterinarios, String mascotas, String clientes, String texto, String fecha, ArrayList<Consulta> consultas){
        consultas.add(new Consulta( codigo,  veterinarios,  clientes,  mascotas,  texto,  fecha));
        JOptionPane.showMessageDialog(null,
        "CONSULTA INGRESADA",
        "Mensaje", JOptionPane.INFORMATION_MESSAGE);     
    }
}
