
package prog.modelo;

import java.io.Serializable;
import java.util.Comparator;


public class Persona implements Serializable{

    private String codigo;
    private String nombre;
    private String direccion;
    private String cedula;
    private String telefono;

    public Persona(String codigo, String nombre, String direccion, String cedula, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cedula = cedula;
        this.telefono = telefono;        
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCedula() {
        return cedula;
    }

    public String getTelefono() {
        return telefono;
    }
    
    public static boolean validarCedula(String cedula) {
            if (cedula.length() != 10) {// Verificar longitud de la cédula
                return false;
            }
            if (!cedula.matches("\\d+")) {// Verificar que la cédula contenga solo dígitos numéricos
                return false;
            }
            int digitoVerificador = Integer.parseInt(cedula.substring(9)); // Extraer los dígitos de la cédula
            int[] coeficientes = {2, 1, 2, 1, 2, 1, 2, 1, 2};  //Array para verificacion de numeros
            int[] digitos = new int[9];
            for (int i = 0; i < 9; i++) { 
                digitos[i] = Integer.parseInt(cedula.substring(i, i + 1)); //Carga el String al array
            }
            int suma = 0;// Realizar la validación del dígito verificador
            int resultado;
            for (int i = 0; i < 9; i++) {
                resultado = digitos[i] * coeficientes[i];
                if (resultado >= 10) {
                    resultado -= 9;
                }
                suma += resultado;
            }
            int residuo = suma % 10;
            int verificador;
            if (residuo == 0) {
                verificador = 0;
            } else {
                verificador = 10 - residuo;
            }
            return verificador == digitoVerificador;
        }
}

