
package prog.espe;
public class ejecutableVideoJUegos {

    public static void main(String[] args) {
        // TODO code application logic here
        videoJuego[] juegos = new videoJuego[5];
        int contador=0, i, j;
        String nombreJuego="";
        
        juegos[0] = new videoJuego();
        juegos[1] = new videoJuego("DOOM",500);
        juegos[2] = new videoJuego("FORTNITE", 425, "AVENTURA", "INTEL");
        juegos[3] = new videoJuego("ZOMBIES AND PLANTS", 250, "AVENTURA", "CUATERNIGHT");
        juegos[4] = new videoJuego("CHEES", 1225, "DE MESA", "TIMBRO");
        
        juegos[0].entrega();
        juegos[2].entrega();
        juegos[4].entrega();
        
        for (i = 0; i< juegos.length ; i++){
            if (juegos[i].entregado == true ){
                juegos[i].devolver();
                contador++;
            }
        }
        System.out.println("EXISTIERON "+contador+" JUEGOS PRESTADOS.  TODOS ESTAN DEVUELTOS");
        
        for (i=0; i<juegos.length; i++){
            for (j=i+1; j<juegos.length; j++)
                if (juegos[i].compareTo(juegos[j].horasEstimadas)){
                    nombreJuego = juegos[i].título;
                }
                else{
                    nombreJuego = juegos[j].título;
                }
        }
        System.out.println("EL JUEGO MAS EXTENSO ES " + nombreJuego +".");
        
        System.out.println("INFORMACION DE TODOS LOS JUEGOS");
        for (i = 0; i< juegos.length ; i++){
            System.out.println(juegos[i].toString());
        }
    }
    
}
