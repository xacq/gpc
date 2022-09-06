
package prog.sseducativo;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class MainEstudiante {
    public static void main(String[] args) {
        int select = -1; //opción elegida del usuario
        int num1 = 0, num2 = 0; //Variables
        String nombre, cedula, materia, profesor, carrera; 
        String genero;
        float remuneracion;
        int carga, horas;
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        ListadoEstudiantes listaEstudiante = new  ListadoEstudiantes();
        while(select != 0){
        //Try catch para evitar que el programa termine si hay un error
            try{
                System.out.println("*************** SISTEMA EDUCACION LIBRE ***************\n"+
                                "Eliga opción:\n"+
                                "1-> INGRESO BECADO. \n" +
                                "2-> INGRESO BECADO PARCIAL. \n" +
                                "3-> INGRESO SIN BECA.\n" +
                                "4-> LISTADO de Estudiantes.\n" +
                                "5-> BUSCAR Estudiante.\n"+
                                "6-> CALCULO de gastos por becas.\n" +
                                "0-> Salir");
                //Recoger una variable por consola
                select = Integer.parseInt(leer.readLine()); 

                //Ejemplo de switch case en Java
                switch(select){
                case 1: 
                        System.out.println("**** INGRESO DE DATOS PARA ESTUDIANTE BECADO ****");
                        System.out.println("Ingrese la cedula del estudiante: ");
                        cedula = leer.readLine();
                        System.out.println("Ingrese el nombre del estudiante: ");
                        nombre = leer.readLine();
                        System.out.println("Ingrese el genero del estudiante: ");
                        genero = leer.readLine();
                        System.out.println("Carrera en la que trabajara: ");
                        carrera = leer.readLine();
                        EstudianteBecadoCompleto nuevoEstudianteBC =  new EstudianteBecadoCompleto(nombre, cedula, genero, carrera);
                        listaEstudiante.addEstudiante(nuevoEstudianteBC);
                        break;
                case 2: 
                        System.out.println("**** INGRESO DE DATOS PARA ESTUDIANTE CON BECA PARCIAL ****");
                        System.out.println("Ingrese la cedula del estudiante: ");
                        cedula = leer.readLine();
                        System.out.println("Ingrese el nombre del estudiante: ");
                        nombre = leer.readLine();
                        System.out.println("Ingrese el genero del estudiante: ");
                        genero = leer.readLine();
                        System.out.println("Profesor con el que trabajara: ");
                        profesor = leer.readLine();
                        System.out.println("Materia con la que colaborara: ");
                        materia = leer.readLine();
                        do{
                            System.out.println("Horas que trabajara semanalmente: ");
                            horas = Integer.parseInt(leer.readLine());
                            if (horas >40){
                                System.out.println("La cantidad de horas asignadas no pueden superar las 40 por semana.");
                            }
                        }while (horas>40);
                        EstudianteBecadoParcial nuevoEstudianteBP =  new EstudianteBecadoParcial(nombre, cedula, genero, profesor, materia, horas);
                        listaEstudiante.addEstudiante(nuevoEstudianteBP);
                        break;
                case 3: 
                        System.out.println("**** INGRESO DE DATOS PARA ESTUDIANTE SIN BECA ****");
                        System.out.println("Ingrese la cedula del estudiante: ");
                        cedula = leer.readLine();
                        System.out.println("Ingrese el nombre del estudiante: ");
                        nombre = leer.readLine();
                        System.out.println("Ingrese el genero del estudiante: ");
                        genero = leer.readLine();
                        EstudianteNoBecado nuevoEstudianteNB =  new EstudianteNoBecado(nombre, cedula, genero);
                        listaEstudiante.addEstudiante(nuevoEstudianteNB);
                        break;
                case 4: 
                        System.out.println("**** LISTADO DE ESTUDIANTES ****");
                        listaEstudiante.printEstudiantes();
                        break;
                case 5: 
                        System.out.println("**** BUSQUEDA DE ESTUDIANTE POR SU CEDULA ****");
                        System.out.println("Ingrese la cedula del estudiante a buscar: ");
                        cedula = leer.readLine();
                        listaEstudiante.buscarEstudiante(cedula);
                        break;
                case 6: 
                        System.out.println("**** CALCULO DE LOS GASTOS EN BECAS A ESTUDIANTES ****");
                        listaEstudiante.gastosEstudiantes();
                        break;
                case 0: 
                        System.out.println("**** HA SALIDO DEL SISTEMA DE EDUCACION LIBRE ****");
                        break;
                default:
                        System.out.println("Número no reconocido. Solo de 0 a 6");break;
                }
                System.out.println("\n"); //Mostrar un salto de línea en Java
            }catch(Exception e){
                System.out.println("Uoops! Error!");
            }   
        }
    }
}
    
