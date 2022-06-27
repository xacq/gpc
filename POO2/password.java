package prog.espe;

import static java.lang.System.in;
import java.util.Scanner;

public class password {
    
    //ATRIBUTOS
    int longitud;
    String contrasena;
   
    char[] caracteres = {'0','1','2','3','4','5','6','7','8','9',
                         'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
                         'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    
    //CONSTRUCTORES
    password(){
        this.longitud = 8;
        contrasena = generaPassword(8);
    }
    //CONSTRUCTORES SECUNDARIOS PARAEMETRIZADOS
    password(int largo){
        this.longitud = largo;
        contrasena = generaPassword(largo);
    }
    
    //METODOS SETTER _ GETTER
    public int getLongitud() {
        return longitud;
    }

    public String getContrasena() {
        return contrasena;
    }
    
    
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    //METODOS DE LA CLASE
    private String generaPassword(int largo){
        char data;
        int i;
        String cadena = "";
        for (i=0; i<largo; i++){
            data= caracteres[(int) (Math.random()*(caracteres.length))]; //GENERA DATOS NUMEROS ALEATORIOS
            cadena = cadena + data;
        }
        return cadena;
    }
    
    public boolean esFuerte(){
        char[] aCadena = this.contrasena.toCharArray();  // CONTRASEÑA = 0nido  aCadena = ['0','n','i','d','o']
        int i, j, numeros=0, minusculas=0, mayusculas = 0;
        for (i = 0; i < aCadena.length; i++){  // VA A RECORRER LA CADENA DE CONTRASEÑA
            for (j=0;j < caracteres.length; j++) // VA A RECORRER EL ARRAY DE CARACTERES
                if (j<=9){
                    if (aCadena[i] == caracteres[j]){
                        numeros++;
                        break;
                    }
                }
                else if (j>9 && j<36){
                    if (aCadena[i] == caracteres[j]){
                        minusculas++;
                        break;
                    }
                }
                else if (j>=36){
                    if (aCadena[i] == caracteres[j]){
                        mayusculas++;
                        break;
                    }
                }
        }
            return numeros>5 && minusculas >1 && mayusculas >2;
        }
   
        
}
