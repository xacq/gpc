
package prog.agenciaviajes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class FRBoletos extends javax.swing.JFrame {

    ArrayList<Pasajero> listaP = new ArrayList();
    
    ArrayList<AsientoPasajero> puestos = new ArrayList();
    
    public int[] Asientos = {2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44};
   
    public FRBoletos() {
        initComponents();
        FileInputStream entradaArchivo = null;
            try{
                entradaArchivo = new FileInputStream("data.txt");
                ObjectInputStream enlace = new ObjectInputStream(entradaArchivo);
                while (true) {
                    Pasajero obj = (Pasajero)enlace.readObject();
                    listaP.add(obj);
                    System.out.println(obj);
                }
            } catch (IOException | ClassNotFoundException ex) {
                System.err.println("Error: "+ ex);
            }

        DefaultListModel listModel = new DefaultListModel();
        for(int i=0; i<listaP.size(); i++) {
            listModel.add(i, listaP.get(i));
        }
        jList1.setModel(listModel);
        
        FileInputStream entradaBoletos = null;
            try{
                entradaBoletos = new FileInputStream("boletos.txt");
                ObjectInputStream enlace = new ObjectInputStream(entradaBoletos);
                while (true) {
                    AsientoPasajero obj = (AsientoPasajero)enlace.readObject();
                    puestos.add(obj);
                }
            } catch (IOException | ClassNotFoundException ex) {}   
            
        jTextField1.setText(jTextField1.getText().substring(0, jTextField1.getText().length()-jTextField1.getText().length()));
        DefaultListModel liAsig = new DefaultListModel();
        for(int j=0; j<puestos.size(); j++) {
            liAsig.add(j, puestos.get(j));
        }
        jList2.setModel(liAsig);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRO DE ASIENTOS");
        setIconImages(null);
        setResizable(false);

        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jList1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(jList1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("LISTA DE CLIENTES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(399, 399, 399))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("INGRESE NOMBRE DEL CLIENTE");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Asignar Boleto a Cliente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 51, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jList2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(jList2);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("LISTA DE CLIENTES CON BOLETO ASIGNADO");

        jButton4.setBackground(new java.awt.Color(255, 153, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("Eliminar un Cliente con boleto asignado");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 153, 204));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setText("Ordenar la lista de Clientes con boletos");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Random randomGenerator = new Random();
        String nombre;
        int control = 0, numeroAsiento;
        if (jTextField1.getText().length()==0){
            JOptionPane.showMessageDialog(null,"No ha ingresado un Cliente","PopUp Dialog",JOptionPane.INFORMATION_MESSAGE);
        }
        else if (puestos.size()== 22){
            JOptionPane.showMessageDialog(null,"No se pueden ingresar mas Clientes.","PopUp Dialog",JOptionPane.INFORMATION_MESSAGE);
            jTextField1.setText(jTextField1.getText().substring(0, jTextField1.getText().length()-jTextField1.getText().length()));
        }
        else{
            nombre = jTextField1.getText();
            for (Pasajero tmp : listaP){
                if (nombre.equals(tmp.getNombre())){
                    control=1;
                    }
            }
            for (AsientoPasajero nomAsiento : puestos){
                if (nomAsiento.getNombre().equals(nombre)){
                    control=2;
                    }    
                }
            switch (control) {
                case 0:
                    JOptionPane.showMessageDialog(null,"Por favor ingrese este cliente primero.","PopUp Dialog",JOptionPane.INFORMATION_MESSAGE);
                    jTextField1.setText(jTextField1.getText().substring(0, jTextField1.getText().length()-jTextField1.getText().length()));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"Por favor escoja otro cliente.  Este ya tiene Asiento.","PopUp Dialog",JOptionPane.INFORMATION_MESSAGE);
                    jTextField1.setText(jTextField1.getText().substring(0, jTextField1.getText().length()-jTextField1.getText().length()));
                    break;
                case 1:
                    if (puestos.isEmpty()){
                        numeroAsiento = randomGenerator.nextInt(Asientos.length);
                        AsientoPasajero nuevo = new AsientoPasajero(Asientos[numeroAsiento],nombre);
                        puestos.add(nuevo);
                    }
                    else{
                        int verify = 0;
                        do{
                            numeroAsiento = randomGenerator.nextInt(Asientos.length);
                            for (AsientoPasajero ver : puestos){
                                int verificar = ver.getAsiento();
                                if (verificar == Asientos[numeroAsiento]){
                                    verify = 0;
                                }
                                else{
                                    verify = 1;
                                }
                            }
                        }while (verify == 0);
                        AsientoPasajero nuevo = new AsientoPasajero(Asientos[numeroAsiento],nombre);
                        puestos.add(nuevo);
                    }   
                    DefaultListModel liAsig = new DefaultListModel();
                    for(int j=0; j<puestos.size(); j++) {
                        liAsig.add(j, puestos.get(j));
                    }   jList2.setModel(liAsig);
                    jTextField1.setText(jTextField1.getText().substring(0, jTextField1.getText().length()-jTextField1.getText().length()));
                    break;
                default:
                    break;
            }
        }        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean espacio = key == 32;

         if (!(mayusculas || espacio))
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        FileOutputStream archivo = null;
        ObjectOutputStream vinculo = null;
        try{                        
            archivo = new FileOutputStream("boletos.txt");
            vinculo = new ObjectOutputStream(archivo);
            for (AsientoPasajero obj : puestos) {
                    vinculo.writeObject(obj);
                }
            vinculo.close();
            archivo.close();
        }catch(FileNotFoundException ex){
        }catch(IOException ex){}
        FRInicio FRI = new FRInicio();
        FRI.setVisible(true);
        dispose(); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String respuesta = JOptionPane.showInputDialog("Escribe el asiento a eliminar");
        int asientoBorrar = Integer.parseInt(respuesta);
        int verify = 0,index=0;
        for (AsientoPasajero ver : puestos){
            int verificar;
            verificar = ver.getAsiento();
            if (verificar == asientoBorrar){
                puestos.remove(index);
                JOptionPane.showMessageDialog(null,"El asiento "+verificar+" ya esta disponible.","PopUp Dialog",JOptionPane.INFORMATION_MESSAGE);
                DefaultListModel liAsig = new DefaultListModel();
                for(int j=0; j<puestos.size(); j++) {
                    liAsig.add(j, puestos.get(j));
                }
                jList2.setModel(liAsig);
            } 
            else index++;
        }
        
        
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Collections.sort(puestos);
        DefaultListModel liAsig = new DefaultListModel();
            for(int j=0; j<puestos.size(); j++) {
                liAsig.add(j, puestos.get(j));
            }
        jList2.setModel(liAsig);
        JOptionPane.showMessageDialog(null,"Lista de Asientos asignados ordenada.","PopUp Dialog",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
