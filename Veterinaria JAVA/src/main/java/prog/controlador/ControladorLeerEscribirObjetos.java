
package prog.controlador;
import java.io.*;
import java.util.ArrayList;

public class ControladorLeerEscribirObjetos<T> {
    private final String fileName;

    public ControladorLeerEscribirObjetos(String fileName) {
        this.fileName = fileName;
    }

    public ArrayList<T> leerObjetos() {
        ArrayList<T> objects = new ArrayList<>();
        FileInputStream entradaArchivo = null;
        ObjectInputStream enlace = null;

        try {
            entradaArchivo = new FileInputStream(fileName);
            enlace = new ObjectInputStream(entradaArchivo);
            while (true) {
                try {
                    T obj = (T) enlace.readObject();
                    objects.add(obj);
                    System.out.println(obj);
                } catch (EOFException e) {
                    System.out.println("Archivo de OBJETOS cargado completamente.");
                    break;
                } catch (ClassNotFoundException e) {
                    System.err.println("Error al leer el objeto desde el archivo de objetos: " + e);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("No se pudo encontrar el archivo de OBJETOS'" + fileName + "': " + e);
        } catch (IOException e) {
            System.err.println("Error al leer el archivo de OBJETOS'" + fileName + "': " + e);
        } finally {
            try {
                if (enlace != null) {
                    enlace.close();
                }
                if (entradaArchivo != null) {
                    entradaArchivo.close();
                }
            } catch (IOException e) {
                System.err.println("Error al cerrar los streams de archivo: " + e);
            }
        }

        return objects;
    }

    public void escribirObjetos(ArrayList<T> objects) {
        FileOutputStream salidaArchivo = null;
        ObjectOutputStream enlace = null;
        try {
            salidaArchivo = new FileOutputStream(fileName);
            enlace = new ObjectOutputStream(salidaArchivo);
            for (T obj : objects) {
                enlace.writeObject(obj);
            }
            System.out.println("Objetos escritos en el archivo: " + fileName);
        } catch (FileNotFoundException e) {
            System.err.println("No se pudo encontrar el archivo '" + fileName + "': " + e);
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo '" + fileName + "': " + e);
        } finally {
            try {
                if (enlace != null) {
                    enlace.close();
                }
                if (salidaArchivo != null) {
                    salidaArchivo.close();
                }
            } catch (IOException e) {
                System.err.println("Error al cerrar los streams de archivo: " + e);
            }
        }
    }
}
