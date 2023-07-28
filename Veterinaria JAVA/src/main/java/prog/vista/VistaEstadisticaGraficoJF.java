
package prog.vista;

import javax.swing.JFrame;
import prog.controlador.ControladorGraficaBarras;
import prog.modelo.Estadistica;

public class VistaEstadisticaGraficoJF extends javax.swing.JFrame {

    private Estadistica estadistica = new Estadistica();
    public VistaEstadisticaGraficoJF() {
            // Crear una instancia de la clase Estadistica
        estadistica = new Estadistica();
        estadistica.leerEstadisticas();
        double[] ingresos = {estadistica.getIngresoGeneral(), 
                             estadistica.getIngresoMenuDoctor(),
                             estadistica.getIngresoMenuClientes(),
                             estadistica.getIngresoMenuMascotas(),
                             estadistica.getIngresoMenuConsultas(), 
                             estadistica.getIngresoMenuCursos(),
                             estadistica.getIngresoMenuRemedios()}; // Ejemplo de datos de ingresos
        ControladorGraficaBarras graficaBarras = new ControladorGraficaBarras(ingresos);
        add(graficaBarras);
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(335, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(317, 317, 317))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(486, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose(); // Cerrar el JFrame        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables

}
