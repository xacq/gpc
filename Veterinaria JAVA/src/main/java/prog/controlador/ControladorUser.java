
package prog.controlador;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import prog.modelo.User;


public class ControladorUser  {


    public void Controlador (String codigo, String name, ArrayList<User> usuarios){        

        String code = codigo;
        String nombre = name;
        usuarios.add(new User(code, nombre));
        JOptionPane.showMessageDialog(null,
                "USUARIO INGRESADO",
                "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        
    }
}
