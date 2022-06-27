
package prog.poo;

public class mainfutbol {


    public static void main(String[] args) {
        futbolista maradona = new futbolista();
        maradona.mostrarFutbolista();

        futbolista messi = new futbolista("Leonel Messi", 35, "Argentina", 9, "delantero");
        messi.mostrarFutbolista();
        messi.correrFutbolista();
        messi.driblarFutbolista();
        messi.lanzarFutbolista();
        messi.regatearFutbolista();
    }
    
}
