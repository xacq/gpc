
package prog.espe;

import static java.lang.System.in;
import java.util.Scanner;

public class ejecutablePassword {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ingreso = new Scanner(in);

        int totalPassword;
        int i, largoPassword;
        
        System.out.println("INGRESE UN NUMERO DE CONTRASEÑAS A GENERAR: ");   
        
        totalPassword = ingreso.nextInt();
        
        //CREAMOS EL ARRAY DE CONTRASEÑAS CON EL NUMERO INGRESADO COMO PARAMETRO
        password[] contrasenas = new password[totalPassword];
        
        boolean[] fuertePassword = new boolean [totalPassword];
        
        System.out.println("INGRESE EL LARGO DE LAS CONTRASEÑAS A GENERAR: ");        
        largoPassword = ingreso.nextInt();
              
        for (i=0;i < contrasenas.length; i++){
            contrasenas[i]= new password(largoPassword);        
        }
        
        for (i=0;i < totalPassword; i++){
            fuertePassword[i]=contrasenas[i].esFuerte();
        }
        
        System.out.println ("COMPROBACION DE FORTALEZA DE CONTRASEÑAS");
        for (i=0;i < totalPassword; i++){
            System.out.println("Contraseña es: "+ contrasenas[i].getContrasena()+ " - Estado= "+ fuertePassword[i]);
        }
    }
}
