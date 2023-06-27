/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.controlador;

import prog.modelo.Animal;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ControladorMascota  {
    //declaracion de variables para el sistema
    Scanner leer = new Scanner(System.in);
    String dosis, code, name, direccion, cedula, telefono, data;
    int i, tipo, genero, edad, horas, tiempo;
    float peso, pesoinicio;
    boolean prueba=true, repetido=true;

    public void Controlador (String code, String name, int tipo, float peso, int genero, int edad, ArrayList <Animal> mascotas){
        mascotas.add(new Animal(code, name, tipo, peso, genero, edad));
        JOptionPane.showMessageDialog(null,
        "MASCOTA INGRESADA",
        "Mensaje", JOptionPane.INFORMATION_MESSAGE);             
        }
    }
