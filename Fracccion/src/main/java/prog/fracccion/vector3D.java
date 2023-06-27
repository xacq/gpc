
package prog.fracccion;

import java.util.Random;
import java.util.Scanner;

public class vector3D {

    public static void main(String[] args) {
        int x,y,z;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("\nIntroduce la primera dimensión: ");
            x = entrada.nextInt();
            if(x<=0){
                System.out.println("La dimensión de la matriz debe ser mayor que 0.\n");
            }
        } while (x<=0);
        do {
            System.out.println("\nIntroduce la segunda dimensión: ");
            y = entrada.nextInt();
            if(y<=0){
                System.out.println("La dimensión de la matriz debe ser mayor que 0.\n");
            }
        } while (y<=0);
        do {
            System.out.println("\nIntroduce la tercera dimensión: ");
            z = entrada.nextInt();
            if(z<=0){
                System.out.println("La dimensión de la matriz debe ser mayor que 0.\n");
            }
        } while (z<=0);      
        
        int array3D[][][] = new int[x][y][z];
        
        inicializarArray3D(array3D);
        
        visualizar(array3D);
    }
    
    
    static void visualizar(int[][][] pArray){
        int numElementos = 0, sumaElementos = 0;
        int i,j,k;
        for(i=0;i<pArray.length;i++){
            for( j=0;j<pArray[i].length;j++){
                for(k=0;k<pArray[i][j].length;k++){
                    System.out.printf("\t " + pArray[i][j][k]);
                    numElementos++;
                    sumaElementos += pArray[i][j][k];
                    }
                System.out.printf("\n");
                }
            System.out.printf("\n\n");
            }
        System.out.printf("La media de los elementos es %.2f", (double)sumaElementos/numElementos);
    }
    
    static void inicializarArray3D(int[][][] pArray){
        Random r = new Random();
        int i, j, k;
        for(i=0;i<pArray.length;i++){
            for(j=0;j<pArray[i].length;j++){
                for(k=0;k<pArray[i][j].length;k++){
                    pArray[i][j][k] = r.nextInt(11);
                }
            }
        }
    }
    
}
