
package prog.modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Estadistica {
    private int ingresoGeneral;
    private int ingresoMenuDoctor;
    private int ingresoMenuClientes;
    private int ingresoMenuMascotas;
    private int ingresoMenuCursos;
    private int ingresoMenuRemedios;
    private int ingresoMenuConsultas;

    public int getIngresoGeneral() {
        return ingresoGeneral;
    }

    public int getIngresoMenuDoctor() {
        return ingresoMenuDoctor;
    }

    public int getIngresoMenuClientes() {
        return ingresoMenuClientes;
    }

    public int getIngresoMenuMascotas() {
        return ingresoMenuMascotas;
    }

    public int getIngresoMenuCursos() {
        return ingresoMenuCursos;
    }

    public int getIngresoMenuRemedios() {
        return ingresoMenuRemedios;
    }

    public int getIngresoMenuConsultas() {
        return ingresoMenuConsultas;
    }

    
    
    public void registrarIngresoGeneral() {
        ingresoGeneral++;
        guardarEstadisticas();
    }
    
    public void registrarIngresoMenuDoctor() {
        ingresoMenuDoctor++;
        guardarEstadisticas();
    }

    public void registrarIngresoMenuClientes() {
        ingresoMenuClientes++;
        guardarEstadisticas();
    }

    public void registrarIngresoMenuMascotas() {
        ingresoMenuMascotas++;
        guardarEstadisticas();
    }

    public void registrarIngresoMenuCursos() {
        ingresoMenuCursos++;
        guardarEstadisticas();
    }

    public void registrarIngresoMenuRemedios() {
        ingresoMenuRemedios++;
        guardarEstadisticas();
    }
    
    public void registrarIngresoMenuConsultas() {
        ingresoMenuConsultas++;
        guardarEstadisticas();
    }

    public void guardarEstadisticas() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("estadistica.txt"))) {
            writer.write("Ingresos a Aplicacion: " + ingresoGeneral);
            writer.newLine();
            writer.write("Ingresos a Menú Doctor: " + ingresoMenuDoctor);
            writer.newLine();
            writer.write("Ingresos a Menú Clientes: " + ingresoMenuClientes);
            writer.newLine();
            writer.write("Ingresos a Menú Mascotas: " + ingresoMenuMascotas);
            writer.newLine();
            writer.write("Ingresos a Menú Cursos: " + ingresoMenuCursos);
            writer.newLine();
            writer.write("Ingresos a Menú Remedios: " + ingresoMenuRemedios);
            writer.newLine();
            writer.write("Ingresos a Menú Consultas: " + ingresoMenuConsultas);
            System.out.println("Estadísticas guardadas en el archivo 'estadistica.txt'");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo 'estadistica.txt': " + e);
        }
    }
    
    public void leerEstadisticas() {
        try (BufferedReader reader = new BufferedReader(new FileReader("estadistica.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    String categoria = parts[0].trim();
                    int valor = Integer.parseInt(parts[1].trim());
                    
                    // Actualizar los valores de estadísticas según la categoría
                    switch (categoria) {
                        case "Ingresos a Aplicacion" -> ingresoGeneral = valor;
                        case "Ingresos a Menú Doctor" -> ingresoMenuDoctor = valor;
                        case "Ingresos a Menú Clientes" -> ingresoMenuClientes = valor;
                        case "Ingresos a Menú Mascotas" -> ingresoMenuMascotas = valor;
                        case "Ingresos a Menú Cursos" -> ingresoMenuCursos = valor;
                        case "Ingresos a Menú Remedios" -> ingresoMenuRemedios = valor;
                        case "Ingresos a Menú Consultas" -> ingresoMenuConsultas = valor;
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo 'estadistica.txt': " + e);
        }
    }
}