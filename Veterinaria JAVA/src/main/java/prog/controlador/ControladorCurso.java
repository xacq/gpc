/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.controlador;


import prog.modelo.Curso;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControladorCurso  {
    //declaracion de variables para el sistema
    public void Controlador (String codigo, String doctor, String fecha, String horas, String nombre, String descripcion,  ArrayList<Curso> cursos){
        int hour = Integer.parseInt(horas);
        cursos.add(new Curso( codigo, doctor, fecha,  hour,  nombre,  descripcion));   
        JOptionPane.showMessageDialog(null,
        "CURSO INGRESADO",
        "Mensaje", JOptionPane.INFORMATION_MESSAGE);             
    }
}
