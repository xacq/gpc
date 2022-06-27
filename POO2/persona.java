
package prog.espe;

import static java.lang.System.in;
import java.util.Scanner;

public class persona {
    
    //ATRIBUTOS DE LA CLASE PERSONA
    protected String nombre;
    protected int edad;
    protected String dni;
    protected char sexo;
    protected float peso;
    protected float altura;
    
    //CONSTRUCTOR DE LA CLASE PERSONA
    persona(){
        this.nombre = "";
        this.edad = 0;
        this.dni = generaDNI();
        this.sexo = 'H';
        this.peso = 0;
        this.altura = 0;  
    } 
    
    //CONSTRUCTOR DE LA CLASE PERSONA CON NOMBRE, EDAD Y SEXO
    persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generaDNI();
        this.sexo = comprobarSexo(sexo);
        this.peso = 0;
        this.altura = 0;  
    } 
    
    //CONSTRUCTOR DE LA CLASE PERSONA CON TODOS LOS DATOS COMO PARAMETRO
    persona(String nombre, int edad, char sexo, float peso, float altura){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generaDNI();
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;  
    } 
    
    //METODOS SET DE LOS ATRIBUTOS DE ESTA CLASE
    public void setNombre(String nuevoNombre) {this.nombre = nuevoNombre;}    
    public void setEdad(int nuevoEdad) {this.edad = nuevoEdad;}    
    public void setSexo(char nuevoSexo) {this.sexo = nuevoSexo;}
    public void setPeso(float nuevoPeso) {this.peso = nuevoPeso;}       
    public void setAltura(float nuevoAltura) {this.peso = nuevoAltura;}       
    
    
    //METODOS DE LA CLASE PERSONA    
    private String generaDNI (){ // es un metodo privado por que solo se usa en la clase
        int data;
        int i;
        String cadena = "";
        for (i=0; i<8; i++){
            data= (int) (Math.random()*255); //GENERA DATOS NUMEROS ALEATORIOS
            cadena = cadena + (char)data;
        }
        return cadena;
    }
    
    public int calcularIMC(){
        float pesoIdeal;
        pesoIdeal = (float)(this.peso/ Math.pow(this.altura,2));
        if (pesoIdeal < 20)return -1;
        else if (pesoIdeal >= 20 && pesoIdeal <= 25) return 0;    
        else return -1;
    }
    
   public boolean mayorDeEdad(){
        return this.edad >= 18;
   }
    
   private char comprobarSexo(char sexo){
       char varSexo;
        if (sexo == 'H' || sexo =='M'){
            varSexo = sexo;}
        else {
            varSexo = 'H';}
        return varSexo;
   }
   
   //No se puede usar el metodo toString ya que es una palabra reservada de Java
    @Override
   public String toString(){
       return "INFORMACION DE LA PERSONA:" + "\nNOMBRE: " + this.nombre +"\nEDAD: " 
               + this.edad + "\nSEXO:" + this.sexo + "\nDNI: " + this.dni + "\nPESO: " + this.peso + "\nALTURA: " + this.altura;

   }
   
    public static void main(String[] args) {

        Scanner ingreso = new Scanner(in);
        int calculoPeso;
        
        persona personaUno = new persona();
        System.out.println("-----------Ingrese los datos del primer objeto generado------------");
        
        System.out.println("Ingrese el nombre: ");
        personaUno.nombre = ingreso.next();
        System.out.println("Ingrese la edad: ");
        personaUno.edad = ingreso.nextInt();
        System.out.println("Ingrese el peso: ");
        personaUno.peso = ingreso.nextFloat();
        System.out.println("Ingrese la altura: ");
        personaUno.altura = ingreso.nextFloat();
        calculoPeso = personaUno.calcularIMC();
        if (calculoPeso < 0){System.out.println("Persona bajo de su peso ideal.");}
        else if (calculoPeso == 0){System.out.println("Persona con su peso ideal.");}
        else if (calculoPeso > 0){System.out.println("Persona con sobrepeso.");}
        if (personaUno.mayorDeEdad()){System.out.println("La persona es mayor de edad");}
        else {System.out.println("La persona no es mayor de edad");}
        personaUno.toString();
        
        System.out.println("------------Ingrese los datos del segundo objeto generado------------");
        System.out.println("-Ingrese el nombre: ");
        String nombreObjeto = ingreso.next();
        
        System.out.println("-Ingrese la edad: ");
        int edadObjeto = ingreso.nextInt();
        
        System.out.println("Ingrese sexo: ");
        String sexoObjeto = ingreso.next();
        char sexCambio = sexoObjeto.charAt(0);
        
        persona personaDos = new persona(nombreObjeto, edadObjeto, sexCambio);
        calculoPeso = personaDos.calcularIMC();
        if (calculoPeso < 0){System.out.println("Persona bajo de su peso ideal.");}
        else if (calculoPeso == 0){System.out.println("Persona con su peso ideal.");}
        else if (calculoPeso > 0){System.out.println("Persona con sobrepeso.");}
        if (personaDos.mayorDeEdad()){System.out.println("La persona es mayor de edad");}
        else {System.out.println("La persona no es mayor de edad");}
        personaDos.toString();
        
        System.out.println("------------Ingrese los datos del tercer objeto generado------------");
        persona personaTres = new persona();
        personaTres.setNombre("Angela Dias");
        personaTres.setEdad(24);
        personaTres.setSexo('M');
        personaTres.setPeso((float) 190.03);
        personaTres.setAltura((float) 1.821);
        calculoPeso = personaTres.calcularIMC();
        if (calculoPeso < 0){System.out.println("Persona bajo de su peso ideal.");}
        else if (calculoPeso == 0){System.out.println("Persona con su peso ideal.");}
        else if (calculoPeso > 0){System.out.println("Persona con sobrepeso.");}
        if (personaTres.mayorDeEdad()){System.out.println("La persona es mayor de edad");}
        else {System.out.println("La persona no es mayor de edad");}
        personaTres.toString();
        
    }
}
