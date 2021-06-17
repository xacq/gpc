package aero_model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Aer_boleto{
    
//Declaration variables y constants
	
    public static String horas, minutos, horasalida, horallegada;
    public static int numero, i;
	private String [] puestos;
    private static String minuto_cero;

//Constructor class Aer_boleto sin args ya que el proceso es automatico
    public Aer_boleto(){
    		minuto_cero = "00";
            puestos = new String[] {
                    " AVI "," API ",  " ACI "," ACC "," ACD ",  " APD "," AVD ",
                    " BVI "," BPI ",  " BCI "," BCC "," BCD ",  " BPD "," BVD ",
                    " CVI "," CPI ",  " CCI "," CCC "," CCD ",  " CPD "," CVD ",
                    " DVI "," DPI ",  " DCI "," DCC "," DCD ",  " DPD "," DVD ",
                    " EVI "," EPI ",  " ECI "," ECC "," ECD ",  " EPD "," EVD ",
                    " FVI "," FPI ",  " FCI "," FCC "," FCD ",  " FPD "," FVD ",
                    " GVI "," GPI ",  " GCI "," GCC "," GCD ",  " GPD "," GVD ",
                    " HVI "," HPI ",  " HCI "," HCC "," HCD ",  " HPD "," HVD ",
                    " IVI "," IPI ",  " ICI "," ICC "," ICD ",  " IPD "," IVD ",
                    " JVI "," JPI ",  " JCI "," JCC "," JCD ",  " JPD "," JVD ",
                    " KVI "," KPI ",  " KCI "," KCC "," KCD ",  " KPD "," KVD ",
                    " LVI "," LPI ",  " LCI "," LCC "," LCD ",  " LPD "," LVD ",
                    " MVI "," MPI ",  " MCI "," MCC "," MCD ",  " MPD "," MVD ",
                    " NVI "," NPI ",          " NCC ",          " NPD "," NVD ",
                    " OVI "," OPI ",        			        " OPD "," OVD "
                    };
        	
    }
    
    //Methods for class
    //function generate numbers for hours & minutes    
    public static int generar_auto(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

    //function corrige minutos para cada 15 minutos y horas hasta las 19horas
    public static String corrige(int control){
    	if (control == 0) {
            numero = generar_auto(0,45);
	      	if (numero>=0 && numero<15) numero=0;
	        else if (numero>=15 && numero < 30) numero= 15;
	        else if (numero>=30 && numero < 45) numero= 30;
	        else if (numero>=45) numero = 45;
	      	
	      	if (numero==0) return String.valueOf(minuto_cero);
	    }
        else if (control == 1) {
            numero = generar_auto(7, 19);
        }
        return String.valueOf(numero);
    }

    //function que consigue horario de salida devolviendo string    
    public String gethorario_salida() {
    	horas = corrige(1); 
        minutos = corrige(0);
        return " SAL: "+horas +":"+ minutos;
    }

    //function que consigue horario de llegada devolviendo string y setea los minutos cada 15 minutos desde 0 hasta 45   
    public String gethorario_llegada() {
        int minu=0, hora=0;
        hora = Integer.valueOf(horas);
        minu = Integer.valueOf(minutos);
        
        switch (minu) {
                case 0 -> minu+=45;
                case 15 -> {
                    minu=0;
                    hora++;
                }
                case 30 -> {
                    minu=15;
                    if (hora == 19) {hora--;}
                    hora++;
                }
                case 45 -> {
                    minu=30;
                    if (hora == 19) {hora--;}
                }
                default -> {
                }
            }
        
        if (minu == 0) {
        	return " LLE: " + String.valueOf(hora)+":"+minuto_cero;
        }
        else {	
        return " LLE: " + String.valueOf(hora)+":"+String.valueOf(minu);
        }
    }          
    
    // consigue un puesto del array segun la configuracion especificada en la declaracion
    public String getpuesto(int i){
        return puestos[i];
    }

    // consigue crear archivos con el nombre del archivo y el contenido    
    public void getcrea_archivo (String nombre, String contenido) {
            try {
            	
                File file = new File(nombre);
                        if (!file.exists()) {
                            file.createNewFile();
                        }
                FileWriter fw = new FileWriter(file);
                try (BufferedWriter bw = new BufferedWriter(fw)) {
                    bw.write(contenido);
                }
            } 
            catch (IOException e) {e.printStackTrace();  }  
            }    

}
