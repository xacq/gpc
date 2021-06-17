package aero_controller;

import java.util.Date;

import javax.swing.JOptionPane;

import aero_model.Aer_boleto;

// clase que emula una estacion desde donde se lanzara 50 boletos ejecutarlos desde thread
public class Aer_thr_ws1 extends Thread{

	String salida, llegada, puesto, nombre, contenido;
    int i;
    Date timed;
    
    @Override
    public void run() {
        Aer_boleto boleto_a = new Aer_boleto();
       
        for (i = 0; i<50; i++){ //50 boletos
        	timed = new Date();
            salida = boleto_a.gethorario_salida();
            llegada = boleto_a.gethorario_llegada();
            puesto = boleto_a.getpuesto(i);//primeros 50 puestos
            nombre = "pasajero_num"+i+".txt";
            contenido = salida+","+llegada+", POS: "+puesto;
            boleto_a.getcrea_archivo(nombre, contenido+", FEC: "+timed.toString());
            try{
            	Thread.sleep(50);
            	}
            catch(InterruptedException e){
            	JOptionPane.showMessageDialog(null, "Hay un error en la creacion de los archivos");
            	break;
            }
        }
    }
}
