package prog.juego_espe;
import java.io.Serializable;

public class Jugador implements Serializable{
    
    //ATRIBUTOS
    String Nombre;
    String Nickname;
    int Edad;
    String Tipo;
    int Puntaje;
    
    //CONSTRUCTOR
    Jugador(String nombre, String nick, int edad, String tipo, int puntos){
        this.Nombre = nombre;
        this.Nickname = nick;
        this.Edad = edad;
        this.Tipo = tipo;
        this.Puntaje = puntos;
    }   
    
    Jugador(String nombre, String nick, int edad){
    this.Nombre = nombre;
    this.Nickname = nick;
    this.Edad = edad;
    this.Tipo = "Novato";
    this.Puntaje = 0;
    }   
    //SETTERS Y GETTERS

    public int getPuntaje() {
        return Puntaje;
    }

    public void setPuntaje(int Puntaje) {
        this.Puntaje = Puntaje;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getNickname() {
        return Nickname;
    }

    public int getEdad() {
        return Edad;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    @Override
    public String toString() {
        return "*********** USUARIO REGISTRADO ***********" + "\nNombre: "+ Nombre + ".\nNickname: "
                + Nickname + ".\nEdad: " + Edad + ".\nTipo: " + Tipo + "\nPuntaje: "+ Puntaje+ ".\n";
  }
}
