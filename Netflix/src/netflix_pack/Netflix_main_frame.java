package netflix_pack;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Netflix_main_frame extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    String [] dato = new String[10];
    int i,col;
 
    private TableRowSorter trsfiltro;
    String filtro;
    
    public Netflix_main_frame() {
        initComponents();
            jTextField2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {
            String cadena = (jTextField2.getText());
            jTextField2.setText(cadena);
            repaint();
            filtro();
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Movies/Peliculas");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Genre/Genero");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("SQL:");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jLabel1.setText("Filtro");

        jButton2.setText("Genero");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Pelicula");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(39, 39, 39)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton3)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
    	jTextField1.setEnabled(false);
    	modelo.setColumnCount(0);
     	modelo.setRowCount(0);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jTextField1.setEnabled(false);
    	modelo.setColumnCount(0);
     	modelo.setRowCount(0);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
 	jTextField1.setEnabled(true);
    	modelo.setColumnCount(0);
     	modelo.setRowCount(0);    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jRadioButton1.isSelected()== true) {
            Connection cxion = null;
            Statement sentence = null;
            ResultSet result_sql = null;
            Netflix_coneccion conectando = new Netflix_coneccion();
              	try {
		    		cxion = conectando.getConectar();
		    		sentence = cxion.createStatement();
		    		result_sql = sentence.executeQuery("SELECT * FROM movie");
		    		modelo.addColumn("Id");
		    		modelo.addColumn("Genero");
		    		modelo.addColumn("Titulo");
		    		modelo.addColumn("Resumen");
		    		modelo.addColumn("Año");
		    		modelo.addColumn("Duracion");
		    		jTable1.setModel(modelo);
		    		while (result_sql.next()){
		    			dato[0] = result_sql.getString(1);
		    			dato[1] = result_sql.getString(2);
		    			dato[2] = result_sql.getString(3);
		    			dato[3] = result_sql.getString(4);
		    			dato[4] = result_sql.getString(5);
		    			dato[5] = result_sql.getString(6);
		    			modelo.addRow(dato);
		    		}
		       	} catch (SQLException e){
		       		JOptionPane.showMessageDialog(null, "Error en seleccion Peliculas: " + e);
		       	} finally {
		       		try {
		       			if (result_sql !=null) result_sql.close();
		       			if (sentence != null) sentence.close();
		       			if (cxion != null) cxion.close();
		       		}catch (SQLException e) {
		       			JOptionPane.showMessageDialog(null, "Error en seleccion Peliculas" + e);
		       		}
		       	}
        }
        else if (jRadioButton2.isSelected()== true) {   

        	modelo.setColumnCount(0);
         	modelo.setRowCount(0);
        	Connection cxion = null;
        	Statement sentence = null;
        	ResultSet result_sql = null;
        	Netflix_coneccion conectando = new Netflix_coneccion();
		    	try {
		    		cxion = conectando.getConectar();
		    		sentence = cxion.createStatement();
		    		result_sql = sentence.executeQuery("SELECT * FROM genre");
		    		modelo.addColumn("Id");
		    		modelo.addColumn("Nombre");
		    		jTable1.setModel(modelo);
		    		while (result_sql.next()){
		    			dato[0] = result_sql.getString(1);
		    			dato[1] = result_sql.getString(2);
		    			modelo.addRow(dato);
		    		}
		       	} catch (SQLException e){
		       		
		       	} finally {
		       		try {
		       			if (result_sql !=null) result_sql.close();
		       			if (sentence != null) sentence.close();
		       			if (cxion != null) cxion.close();
		       		}catch (SQLException e) {
		       			JOptionPane.showMessageDialog(null, "Error en seleccion Genre/Genero" + e);
		       		}
		       	}
        }
        else if (jRadioButton3.isSelected() == true) {
        	modelo.setColumnCount(0);
         	modelo.setRowCount(0);
     		         	
        	Netflix_coneccion conectando = new Netflix_coneccion();
         	
        	Connection cxion = null;
         	Statement sentence = null;
         	ResultSet result_sql = null;
         	ResultSetMetaData result_data = null;
         	
        	try {
        		cxion = conectando.getConectar();
        		sentence = cxion.createStatement();
        		result_sql = sentence.executeQuery(jTextField1.getText());
        		result_data = result_sql.getMetaData();
        		col = result_data.getColumnCount();
        		String [] etiquetas = new String[col];
        		for (i=0;i<col;i++) {
        			etiquetas [i]=result_data.getColumnLabel(i+1);
        		}
        		modelo.setColumnIdentifiers(etiquetas);
        		
        		while (result_sql.next()){
        			for (i=0;i<col;i++) {
        					dato[i] = result_sql.getString(i+1);
        			}
        				modelo.addRow(dato);
        		}
           	} catch (SQLException e){
           			JOptionPane.showMessageDialog(null, "Error en SQL: " + e);
           	} finally {
           		try {
           			if (result_sql !=null) result_sql.close();
           			if (sentence != null) sentence.close();
           			if (cxion != null) cxion.close();
           		}catch (Exception e) {
           			JOptionPane.showMessageDialog(null, "Error en SQL: " + e);
           		}
           	}
        }
        else {
        	JOptionPane.showMessageDialog(null, "Debe seleccionar una opcion (Movies/Genres/SQL)");
        }    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     	
        Netflix_genre fra_genre = new Netflix_genre();
    	fra_genre.setVisible(true);
    	this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     	
        Netflix_movie fra_movie = new Netflix_movie();
    	fra_movie.setVisible(true);
    	this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
           trsfiltro = new TableRowSorter(jTable1.getModel());
            jTable1.setRowSorter(trsfiltro);        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2KeyTyped

    public void filtro() {
        filtro = jTextField2.getText();
        trsfiltro.setRowFilter(RowFilter.regexFilter(jTextField2.getText(), 0));
    }
    public static void main(String args[]) {
        Netflix_main_frame principal = new Netflix_main_frame();
        principal.setVisible(true);        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
