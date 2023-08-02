/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Persona;
import Modelo.PersonaDAO;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class PersonaControlador {
    private PersonaDAO personaDAO = new PersonaDAO();
    private Scanner scanner = new Scanner(System.in);

    public void guardarPersona(long codigo, int edad, double sueldo) {

        Persona persona = new Persona(codigo, edad, sueldo);
        personaDAO.guardarPersona(persona);

        System.out.println("Persona guardada exitosamente.");
    }

    public void obtenerDatosPersonaMayor() {
        int codigoMayor = personaDAO.obtenerDatosPersonaMayor();
        JOptionPane.showMessageDialog(null, "EL CODIGO DE LA PERSONA MAYOR ES: "+ codigoMayor);
    }

    public void obtenerPromedioSueldo() {
        double promedioSueldo = personaDAO.obtenerPromedioSueldo();
        JOptionPane.showMessageDialog(null, "EL CODIGO DE LA PERSONA MAYOR ES: "+ promedioSueldo);
    }
}