
package prog.sseducativo;

import java.util.ArrayList;

public class ListadoEstudiantes {
    
    private final ArrayList<Estudiante> listaEstudiantes; 

    public ListadoEstudiantes () {  
        listaEstudiantes = new ArrayList<> ();  
    } 

    public void addEstudiante (Estudiante alumno) {  
        listaEstudiantes.add(alumno);  
    }

    public void printEstudiantes() {
        int contador = 0;
        for (Estudiante tmp: listaEstudiantes) {
            contador++;
            System.out.print("***************** Estudiante -> " + contador + " *****************");
            System.out.println (tmp.toString () );
            if (tmp instanceof EstudianteBecadoCompleto) { 
                System.out.println("Tipo de Beca: ToTal.\n");
            } 
            else if (tmp instanceof EstudianteBecadoParcial) {
                System.out.println("Tipo de Beca: Parcial.\n");
            } 
            else if (tmp instanceof EstudianteNoBecado){
                System.out.println("Tipo de Beca: Sin Beca.\n");
            } 
        }
        if (contador == 0){
                System.out.println("********** No existen Estudiantes registrados **********");
        }
    }
    
    public void gastosEstudiantes(){
        float totalGastos = 0;
        for (Estudiante tmp: listaEstudiantes) { 
            totalGastos= totalGastos + tmp.calcularBeca();            
        }
        System.out.println("Los gastos SEMANALES por becas ascienden a: " + totalGastos + ".");
        totalGastos = totalGastos*4;
        System.out.println("Los gastos MENSUALES por becas ascienden a: " + totalGastos + ".");
    }
    
    public void buscarEstudiante(String cedula){
        int control = 0;
        for (Estudiante tmp: listaEstudiantes) { 
            if (cedula == null ? tmp.getCedula() == null : cedula.equals(tmp.getCedula())){
                control = 1;
                System.out.println (tmp.toString () );
                if (tmp instanceof EstudianteBecadoCompleto) { 
                    System.out.print("Tipo de Beca: ToTal.\n");
                } 
                else if (tmp instanceof EstudianteBecadoParcial) {
                    System.out.print("Tipo de Beca: Parcial.\n");
                } 
                else if (tmp instanceof EstudianteNoBecado){
                    System.out.print("Tipo de Beca: Sin Beca.\n");
                }  
            }            
        }
        if (control == 0){
            System.out.println("Estudiante no registrado.\n");
        }
    }
        
     //Cierre método imprimirListin

} //Cierre de la clase ejemplo aprenderaprogramar.com

