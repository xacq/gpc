package cliser.clienteservidor;
//IMPORTACION DE LAS LIBRERIAS A UTILIZAR
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

//CLASE SERVIDOR PARA LA CONEXION
// Se genera tipo Runnable ya que tendra que mantenerse a la espera por llegada de informacion 
//de parte del cliente de manera asincrona
public class SERVIDOR extends javax.swing.JFrame implements Runnable{

    /**
     * Construstor de la clase SERVIDOR
     */
    public SERVIDOR() {
        initComponents();
        //generamos un objeto hilo que permitira la espera de informacion del cliente/ Multiprocesos
        Thread hilo = new Thread(this);
        //inicializamos el proceso de espera con el hilo generado
        hilo.start(); //iniciamos secionmultihilo para el proceso de espera continua
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area_mensajes = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel1.setText("APLICACION SERVIDOR");

        area_mensajes.setEditable(false);
        area_mensajes.setColumns(20);
        area_mensajes.setRows(5);
        jScrollPane1.setViewportView(area_mensajes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SERVIDOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SERVIDOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SERVIDOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SERVIDOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //instanciamos el constructor SERVIDOR
                new SERVIDOR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area_mensajes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
    //Generamos una funcion run que se ejecutara paralelamente a la instanciacion del constructor de la clase
    //SERVIDOR para generar las instrucciones a realizar el momento que por el socket se envie Data a traves
    //de un puerto por TCPIP
    @Override
    public void run() {
        try {
            //Iniciamos una variable Serversocket que empezara a escuchar peticiones a traves del puerto 9999
            ServerSocket servidor = new ServerSocket(9999);
            area_mensajes.append("\n Mensaje: Servidor inicializado......\n");
            while(true){// con este bucle infinito permitimos que se mantenga recurrente la expectativa de 
                        //recepcion de informacion a traves del socket
                Socket socket_recibo = servidor.accept();//mantiene en espera la acpetacion de informacion entrante
                //Usamos un Data para recibir la informacion que llega del socket cliente a un data INPUT
                DataInputStream dato_recibido = new DataInputStream(socket_recibo.getInputStream());
                //creamos una variable para guardar el valor que leamos del DATA INPUT receptado
                String mensaje = dato_recibido.readUTF();
                // convertimos en entero el string receptado
                int numero = Integer.parseInt(mensaje);
                //creamos una variable string para cargar el mensaje a presentar e iniciamos el valor en vacio
                String mensaje_equis="";
                    //el bucle repetira el proceso interno tantas veces como el numero receptado
                    for (int i=0; i<numero;i++){
                        //el string sera igual a si mismo mas una X 
                        mensaje_equis=mensaje_equis+"X ";
                    }
                area_mensajes.append("\n Mensaje: " + mensaje_equis); //mostramos en el area de texto el resultado
            }    
        }
        catch(IOException e){
        System.out.println(e);
        area_mensajes.append("\n Error: " + e);
        }
    }
}
