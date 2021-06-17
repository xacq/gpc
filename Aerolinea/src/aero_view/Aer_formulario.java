package aero_view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

import aero_controller.Aer_thr_ws1;
import aero_controller.Aer_thr_ws2;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Aer_formulario extends javax.swing.JFrame {

	JButton jButton1 = new JButton();
    JComboBox<Object> jComboBox1 = new JComboBox<>();
    JButton jButton2 = new JButton();
    JButton jButton3 = new JButton();
    JLabel jLabel1 = new JLabel();
    
    //Constructor del Frame
	public Aer_formulario() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Aerolinea - Generacion Automatica de Boletos");

        jLabel1.setText("Click en Generar Boletos y ESPERE (50 milisegundos por archivo)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap())
        );
        
        jButton1.setText("Generar boletos de avion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cargar Datos desde los Archivos");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Borrar Archivos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButton3ActionPerformed(evt);
				} catch (IOException e) {
					e.printStackTrace();
				}
            }
        });

        pack();
    }
	
    //Accion al ejecutar el boton de creacion de archivos
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	Aer_thr_ws1 boleto_ws1 = new Aer_thr_ws1(); // instancias del objeto ws1
    	Aer_thr_ws2 boleto_ws2 = new Aer_thr_ws2(); // instancias del objeto ws2
    	
    	boleto_ws1.start();//hilo 1 inicia
    	boleto_ws2.start();//hilo 2 inicia
    	    	    	
    	jButton2.setEnabled(true);// habilita el boton para cargar archivos en combo
    }      
    
    //Accion al ejecutar el boton de cargado de valores al Combobox
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	File archivo;
        FileReader fr;
        BufferedReader br;
        int i =0;
        for (i = 0; i<100; i++){
            try{
                archivo = new File ("pasajero_num"+i+".txt");
                fr = new FileReader (archivo);
                br = new BufferedReader(fr);

                String linea;
                while ((linea = br.readLine())!= null){
                    jComboBox1.addItem(archivo + " = " + linea);
                }
                br.close();
                fr.close();    
                if (i==99) {
                	JOptionPane.showMessageDialog(null, "Los Archivos han sido cargados");
                	}
            }catch (IOException e){
                JOptionPane.showMessageDialog(null, "Hubo un problema al cargar los archivos");
                break;
            }
        }
    }  
    
    //Accion al ejecutar el boton borra todos los archivos generados
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {                                         
        int i =0;
        for (i = 0; i<100; i++){
            File archivo1 = new File("pasajero_num"+i+".txt");
            archivo1.delete();
            if (i==99) {
            	jComboBox1.removeAllItems();
            	JOptionPane.showMessageDialog(null, "Se borraron los archivos");
            	jButton2.setEnabled(false); // desabilita boton para carga de archivos
            	}
        }  
    }
}
