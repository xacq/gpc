
package prog.controlador;

import java.text.ParseException;
import java.util.ArrayList;
import prog.modelo.Animal;
import prog.modelo.Cliente;
import prog.modelo.Consulta;
import prog.modelo.Curso;
import prog.modelo.Doctor;
import prog.modelo.Remedio;

public class ControladorMenuPrincipal {

    public static void main(String[] args) throws ParseException {
        new ControladorMenu().setVisible(true);
    }
}
