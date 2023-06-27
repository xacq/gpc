
package prog.fracccion;

import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {

        int cantidad;
        double limite,nuevoLimite;
        Scanner leer =  new Scanner(System.in);
        System.out.println("********** BANCO REGALON LE DA LA BIENVENIDA**********");
        System.out.println("Averigue cual será su nuevo limite de crédito para su tarjeta VISA o MASTERCARD");
        System.out.println("por favor ingrese el numero de tarjetas que posea: ");
        cantidad =  leer.nextInt();
        if (cantidad > 1){
            System.out.println("Indique el limite de su tarjeta con mayor credito o de su preferencia para aplicar su aumento: ");
            limite = leer.nextDouble();
            if (limite <1000 ){
                nuevoLimite = (limite*0.25)+limite;
                System.out.println(" - LIMITE MENOR A 1000$ TIPO 1");
                System.out.println(" - EL PORCENTAJE SERA DE UN 25% DE AUMENTO");
                System.out.println(" - Su TARJETA POSEE UN LIMITE DE: "+nuevoLimite);
            }
            else if (limite >=1000 && limite <5000){
                nuevoLimite = (limite*0.35)+limite;
                System.out.println(" - LIMITE MAYOR A 1000$ y MENOR A 5000$ TIPO 2");
                System.out.println(" - EL PORCENTAJE SERA DE UN 35% DE AUMENTO");
                System.out.println(" - Su TARJETA POSEE UN LIMITE DE: "+nuevoLimite);
            }
            else if (limite >=5000 && limite <10000){
                nuevoLimite = (limite*0.40)+limite;
                System.out.println(" - LIMITE MAYOR A 5000$ y MENOR A 10000$ TIPO 3");
                System.out.println(" - EL PORCENTAJE SERA DE UN 40% DE AUMENTO");
                System.out.println(" - Su TARJETA POSEE UN LIMITE DE: "+nuevoLimite);
            }
            else if (limite >=10000){
                nuevoLimite = (limite*0.50)+limite;
                System.out.println(" - LIMITE MAYOR A 10000$ TIPO 4");
                System.out.println(" - EL PORCENTAJE SERA DE UN 50% DE AUMENTO");
                System.out.println(" - Su TARJETA POSEE UN LIMITE DE: "+nuevoLimite);
            }            
        }
        else {
            System.out.println("Indique el limite de su tarjeta= ");
            limite = leer.nextDouble();
            if (limite <1000 ){
                nuevoLimite = (limite*0.25)+limite;
                System.out.println(" - LIMITE MENOR A 1000$ TIPO 1");
                System.out.println(" - EL PORCENTAJE SERA DE UN 25% DE AUMENTO");
                System.out.println(" - Su TARJETA POSEE UN LIMITE DE: "+nuevoLimite);
            }
            else if (limite >=1000 && limite <5000){
                nuevoLimite = (limite*0.35)+limite;
                System.out.println(" - LIMITE MAYOR A 1000$ y MENOR A 5000$ TIPO 2");
                System.out.println(" - EL PORCENTAJE SERA DE UN 35% DE AUMENTO");
                System.out.println(" - Su TARJETA POSEE UN LIMITE DE: "+nuevoLimite);
            }
            else if (limite >=5000 && limite <10000){
                nuevoLimite = (limite*0.40)+limite;
                System.out.println(" - LIMITE MAYOR A 5000$ y MENOR A 10000$ TIPO 3");
                System.out.println(" - EL PORCENTAJE SERA DE UN 40% DE AUMENTO");
                System.out.println(" - Su TARJETA POSEE UN LIMITE DE: "+nuevoLimite);
            }
            else if (limite >=10000){
                nuevoLimite = (limite*0.50)+limite;
                System.out.println(" - LIMITE MAYOR A 10000$ TIPO 4");
                System.out.println(" - EL PORCENTAJE SERA DE UN 50% DE AUMENTO");
                System.out.println(" - Su TARJETA POSEE UN LIMITE DE: "+nuevoLimite);
            }            
        }
    }
}
