/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.controlador;

import prog.modelo.Remedio;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ControladorRemedio  {
    //declaracion de variables para el sistema
    Scanner leer = new Scanner(System.in);
    String dosis, code, name, direccion, fechacur, data;
    int i, tipo, genero, edad, horas, tiempo;
    boolean prueba=true, repetido=true;
    
    public void Controlador (String code, String name, String dosis, String tiempo, ArrayList <Remedio> remedios){
        int time = Integer.parseInt(tiempo);
        remedios.add(new Remedio( code,  name,  dosis,  time));     
        JOptionPane.showMessageDialog(null,
        "REMEDIO INGRESADO",
        "Mensaje", JOptionPane.INFORMATION_MESSAGE);     
    }
}
