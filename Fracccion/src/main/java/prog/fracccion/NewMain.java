
package prog.fracccion;

import java.util.Scanner;


public class NewMain {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("PROGRAMA QUE VERIFICA EL VALOR DE LA FORMULA F(X)=1-x^2/2-x^3/3 +x^4/4");
        System.out.println("Ingrese el valor de x= ");
        int x = leer.nextInt();
        double formula = 1 - ((x*x)/2) -((x*x*x)/3) + ((x*x*x*x)/4);
        System.out.println("Ingrese el valor de f(x)= " + String.valueOf(formula));
    }
}
