/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.controlador;

import prog.modelo.Animal;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControladorMascota  {

    public void Controlador (String code, String name, int tipo, float peso, int genero, int edad, ArrayList <Animal> mascotas){
        mascotas.add(new Animal(code, name, tipo, peso, genero, edad));
        JOptionPane.showMessageDialog(null,
        "MASCOTA INGRESADA",
        "Mensaje", JOptionPane.INFORMATION_MESSAGE);             
        }
    }
