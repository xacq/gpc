/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.*;

public class PersonaDAO {
    
    private String archivo = "persona.dat";

    public void guardarPersona(Persona persona) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo, true))) {
            oos.writeObject(persona);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int obtenerDatosPersonaMayor() {
        int maxEdad = Integer.MIN_VALUE;
        long codigoMayor = 0;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            while (true) {
                Persona persona = (Persona) ois.readObject();
                if (persona.getEdad() > maxEdad) {
                    maxEdad = persona.getEdad();
                    codigoMayor = persona.getCodigo();
                }
            }
        } catch (EOFException e) {
            // Se alcanzó el final del archivo, se puede ignorar
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return (int) codigoMayor;
    }

    public double obtenerPromedioSueldo() {
        double sumSueldos = 0;
        int count = 0;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            while (true) {
                Persona persona = (Persona) ois.readObject();
                sumSueldos += persona.getSueldo();
                count++;
            }
        } catch (EOFException e) {
            // Se alcanzó el final del archivo, se puede ignorar
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return count == 0 ? 0 : sumSueldos / count;
    }
}
