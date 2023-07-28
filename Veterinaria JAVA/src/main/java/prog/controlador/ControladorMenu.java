
package prog.controlador;


import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.*;
import prog.modelo.Animal;
import prog.modelo.Cliente;
import prog.modelo.Consulta;
import prog.modelo.Curso;
import prog.modelo.Doctor;
import prog.modelo.Estadistica;
import prog.modelo.Remedio;
import prog.modelo.User;
import prog.vista.VistaAnimalJF;
import prog.vista.VistaClienteJF;
import prog.vista.VistaConsultaJF;
import prog.vista.VistaCursoJF;
import prog.vista.VistaDelAnimalJF;
import prog.vista.VistaDelClienteJF;
import prog.vista.VistaDelConsultaJF;
import prog.vista.VistaDelCursoJF;
import prog.vista.VistaDelDoctorJF;
import prog.vista.VistaDelRemedioJF;
import prog.vista.VistaDelUserJF;
import prog.vista.VistaDoctorJF;
import prog.vista.VistaEditAnimalJF;
import prog.vista.VistaEditClienteJF;
import prog.vista.VistaEditConsultaJF;
import prog.vista.VistaEditCursoJF;
import prog.vista.VistaEditDoctorJF;
import prog.vista.VistaEditRemedioJF;
import prog.vista.VistaEstadisticaGraficoJF;
import prog.vista.VistaRemedioJF;
import prog.vista.VistaEstadisticaJF;
import prog.vista.VistaListAnimalJF;
import prog.vista.VistaListClienteJF;
import prog.vista.VistaListConsultaJF;
import prog.vista.VistaListCursoJF;
import prog.vista.VistaListDoctorJF;
import prog.vista.VistaListRemedioJF;
import prog.vista.VistaRegistroJF;

public class ControladorMenu extends javax.swing.JFrame {

    ControladorLeerArchivo<Doctor> doctorFileReader = new ControladorLeerArchivo<>("doctor.txt");
    ArrayList<Doctor> doctores = doctorFileReader.leerObjetos();

    ControladorLeerArchivo<Cliente> clienteFileReader = new ControladorLeerArchivo<>("cliente.txt");
    ArrayList<Cliente> clientes = clienteFileReader.leerObjetos();

    ControladorLeerArchivo<Animal> mascotaFileReader = new ControladorLeerArchivo<>("mascota.txt");
    ArrayList<Animal> mascotas = mascotaFileReader.leerObjetos();

    ControladorLeerArchivo<Consulta> consultaFileReader = new ControladorLeerArchivo<>("consulta.txt");
    ArrayList<Consulta> consultas = consultaFileReader.leerObjetos();

    /*ControladorLeerArchivo<Curso> cursoFileReader = new ControladorLeerArchivo<>("curso.txt");
    ArrayList<Curso> cursos = cursoFileReader.leerObjetos();*/
    
    ControladorLeerEscribirObjetos<Curso> cursoArchivoObjeto = new ControladorLeerEscribirObjetos<>("curso.obj");
    ArrayList<Curso> cursos = cursoArchivoObjeto.leerObjetos();
    
    ControladorLeerEscribirBinario<Remedio> remedioArchivoBinario = new ControladorLeerEscribirBinario<>("remedio.bin");
    ArrayList<Remedio> remedios = remedioArchivoBinario.leerObjetos();
    
    ControladorLeerArchivo<User> userFileReader = new ControladorLeerArchivo<>("login.txt");
    ArrayList<User> usuarios = userFileReader.leerObjetos();
        
    public JMenuBar menuBar;
    public JMenu menuUser, menuEstadistica, menuDoctor, menuCliente, menuMascota, menuCurso, menuConsulta, menuRemedio, menuLista, menuSalir;
    public JMenuItem deleteUser, registroUser, grafEstadistica,itemEstadistica, deleteRemedio, editRemedio, deleteCurso, editCurso, deleteConsulta, editConsulta, deleteMascota, editMascota, 
            deleteCliente,editCliente,deleteDoctor, editDoctor, listDoctor, itemDoctor, listCliente, itemCliente, 
            listMascota, itemMascota, listCurso, itemCurso, listConsulta, itemConsulta, itemInfo, itemSalir, listRemedio, itemRemedio; 
    
    public ControladorMenu() {
        
        Estadistica aplicacion = new Estadistica();
        aplicacion.leerEstadisticas();
        aplicacion.registrarIngresoGeneral();
        
        ImageIcon icon = new ImageIcon("Img/ico.png"); // Ruta de la imagen del icono
        this.setIconImage(icon.getImage());
        setTitle("Menú Principal");
        setSize(400, 400);
        setLocationRelativeTo(null);
        // Crear la barra de menú
        menuBar = new JMenuBar();
        // Menú Nuevo
        menuDoctor = new JMenu("Doctor");
        
        itemDoctor = new JMenuItem("Nuevo");
        itemDoctor.addActionListener((ActionEvent e) -> {
            aplicacion.registrarIngresoMenuDoctor();
            new VistaDoctorJF(doctores).setVisible(true);
        });
        listDoctor = new JMenuItem("Lista");
        listDoctor.addActionListener((ActionEvent e) -> {
            /// Crear el mensaje con la información del ArrayList
            aplicacion.registrarIngresoMenuDoctor();
            new VistaListDoctorJF(doctores).setVisible(true);
        });
        editDoctor = new JMenuItem("Editar");
        editDoctor.addActionListener((ActionEvent e) -> {
            aplicacion.registrarIngresoMenuDoctor();
            new VistaEditDoctorJF(doctores).setVisible(true);
        });
        deleteDoctor = new JMenuItem("Eliminar");
        deleteDoctor.addActionListener((ActionEvent e) -> {
            aplicacion.registrarIngresoMenuDoctor();
            new VistaDelDoctorJF(doctores).setVisible(true);
        });
        
        menuCliente = new JMenu("Cliente");
        itemCliente = new JMenuItem("Nuevo");
        itemCliente.addActionListener((ActionEvent e) -> {
            aplicacion.registrarIngresoMenuClientes();
            new VistaClienteJF(clientes).setVisible(true);
        });
        listCliente = new JMenuItem("Lista");
        listCliente.addActionListener((ActionEvent e) -> {
            /// Crear el mensaje con la información del ArrayList
            aplicacion.registrarIngresoMenuClientes();
            new VistaListClienteJF(clientes).setVisible(true);
        });
        editCliente = new JMenuItem("Editar");
        editCliente.addActionListener((ActionEvent e) -> {
            aplicacion.registrarIngresoMenuDoctor();
            new VistaEditClienteJF(clientes).setVisible(true);
        });
        deleteCliente = new JMenuItem("Eliminar");
        deleteCliente.addActionListener((ActionEvent e) -> {
            aplicacion.registrarIngresoMenuDoctor();
            new VistaDelClienteJF(clientes).setVisible(true);
        });
        
        menuMascota = new JMenu("Mascota");
        itemMascota = new JMenuItem("Nuevo");
        itemMascota.addActionListener((ActionEvent e) -> {
            aplicacion.registrarIngresoMenuMascotas();
            new VistaAnimalJF(mascotas).setVisible(true);
        });
        listMascota = new JMenuItem("Lista");
        listMascota.addActionListener((ActionEvent e) -> {
            /// Crear el mensaje con la información del ArrayList
            aplicacion.registrarIngresoMenuMascotas();
            new VistaListAnimalJF(mascotas).setVisible(true);
        });
        editMascota = new JMenuItem("Editar");
        editMascota.addActionListener((ActionEvent e) -> {
            aplicacion.registrarIngresoMenuMascotas();
            new VistaEditAnimalJF(mascotas).setVisible(true);
        });
        deleteMascota = new JMenuItem("Eliminar");
        deleteMascota.addActionListener((ActionEvent e) -> {
            aplicacion.registrarIngresoMenuMascotas();
            new VistaDelAnimalJF(mascotas).setVisible(true);
        });
        
        menuConsulta = new JMenu("Consulta");
        itemConsulta = new JMenuItem("Nuevo");
        itemConsulta.addActionListener((ActionEvent e) -> {
            aplicacion.registrarIngresoMenuConsultas();
            new VistaConsultaJF(consultas, doctores, clientes, mascotas).setVisible(true);
        });
        listConsulta = new JMenuItem("Lista");
        listConsulta.addActionListener((ActionEvent e) -> {
            /// Crear el mensaje con la información del ArrayList
            aplicacion.registrarIngresoMenuConsultas();
            new VistaListConsultaJF(consultas).setVisible(true);
        });
        editConsulta = new JMenuItem("Editar");
        editConsulta.addActionListener((ActionEvent e) -> {
            aplicacion.registrarIngresoMenuConsultas();
            new VistaEditConsultaJF(consultas, doctores, clientes, mascotas).setVisible(true);
        });
        deleteConsulta = new JMenuItem("Eliminar");
        deleteConsulta.addActionListener((ActionEvent e) -> {
            aplicacion.registrarIngresoMenuConsultas();
            new VistaDelConsultaJF(consultas, doctores, clientes, mascotas).setVisible(true);
        });
        
        menuCurso = new JMenu("Curso");
        itemCurso = new JMenuItem("Nuevo");
        itemCurso.addActionListener((ActionEvent e) -> {
            aplicacion.registrarIngresoMenuCursos();
            new VistaCursoJF(cursos, doctores).setVisible(true);
        });
        listCurso = new JMenuItem("Lista");
        listCurso.addActionListener((ActionEvent e) -> {
            /// Crear el mensaje con la información del ArrayList
            aplicacion.registrarIngresoMenuCursos();
            new VistaListCursoJF(cursos).setVisible(true);
        });
        editCurso = new JMenuItem("Editar");
        editCurso.addActionListener((ActionEvent e) -> {
            aplicacion.registrarIngresoMenuConsultas();
            new VistaEditCursoJF(cursos,doctores).setVisible(true);
        });
        deleteCurso = new JMenuItem("Eliminar");
        deleteCurso.addActionListener((ActionEvent e) -> {
            aplicacion.registrarIngresoMenuConsultas();
            new VistaDelCursoJF(cursos).setVisible(true);
        });
        
        menuRemedio = new JMenu("Remedio");
        itemRemedio = new JMenuItem("Nuevo");
        itemRemedio.addActionListener((ActionEvent e) -> {
            aplicacion.registrarIngresoMenuRemedios();
            new VistaRemedioJF(remedios).setVisible(true);
        });
        listRemedio = new JMenuItem("Lista");
        listRemedio.addActionListener((ActionEvent e) -> {
            /// Crear el mensaje con la información del ArrayList
            aplicacion.registrarIngresoMenuRemedios();
            new VistaListRemedioJF(remedios).setVisible(true);
        });
        editRemedio = new JMenuItem("Editar");
        editRemedio.addActionListener((ActionEvent e) -> {
            aplicacion.registrarIngresoMenuConsultas();
            new VistaEditRemedioJF(remedios).setVisible(true);
        });
        deleteRemedio = new JMenuItem("Eliminar");
        deleteRemedio.addActionListener((ActionEvent e) -> {
            aplicacion.registrarIngresoMenuConsultas();
            new VistaDelRemedioJF(remedios).setVisible(true);
        });
        
        menuEstadistica = new JMenu("Estadistica");
        itemEstadistica = new JMenuItem("Cuadro");
        itemEstadistica.addActionListener((ActionEvent e) -> {
            new VistaEstadisticaJF().setVisible(true);
        });
        grafEstadistica = new JMenuItem("Gráfica");
        grafEstadistica.addActionListener((ActionEvent e) -> {
            new VistaEstadisticaGraficoJF().setVisible(true);
        });
        
        menuUser = new JMenu("Usuario");
        registroUser = new JMenuItem("Registro");
        registroUser.addActionListener((ActionEvent e) -> {
        new VistaRegistroJF(usuarios).setVisible(true);
        });
        deleteUser = new JMenuItem("Eliminar");
        deleteUser.addActionListener((ActionEvent e) -> {
            new VistaDelUserJF(usuarios).setVisible(true);
        });
        
        
        menuDoctor.add(itemDoctor);
        menuDoctor.add(listDoctor);
        menuDoctor.add(editDoctor);
        menuDoctor.add(deleteDoctor);
        
        menuCliente.add(itemCliente);
        menuCliente.add(listCliente);
        menuCliente.add(editCliente);
        menuCliente.add(deleteCliente);
        
        menuMascota.add(itemMascota);
        menuMascota.add(listMascota);
        menuMascota.add(editMascota);
        menuMascota.add(deleteMascota);
                
        menuConsulta.add(itemConsulta);
        menuConsulta.add(listConsulta);
        menuConsulta.add(editConsulta);
        menuConsulta.add(deleteConsulta);
        
        menuCurso.add(itemCurso);
        menuCurso.add(listCurso);
        menuCurso.add(editCurso);
        menuCurso.add(deleteCurso);
        
        menuRemedio.add(itemRemedio);
        menuRemedio.add(listRemedio);
        menuRemedio.add(editRemedio);
        menuRemedio.add(deleteRemedio);
        
        menuEstadistica.add(itemEstadistica);
        menuEstadistica.add(grafEstadistica);   
        
        menuUser.add(registroUser);
        menuUser.add(deleteUser);

        // Menú Salir
        menuSalir = new JMenu("Salir");
        itemSalir = new JMenuItem("Salir");
        
        menuSalir.add(itemSalir);
        itemSalir.addActionListener((ActionEvent e) -> {
            ControladorLeerArchivo<Doctor> doctorFileReader = new ControladorLeerArchivo<>("doctor.txt");
            doctorFileReader.escribirObjetos(doctores);
            
            ControladorLeerArchivo<Cliente> clienteFileReader = new ControladorLeerArchivo<>("cliente.txt");
            clienteFileReader.escribirObjetos(clientes);
            
            ControladorLeerArchivo<Animal> mascotaFileReader = new ControladorLeerArchivo<>("mascota.txt");
            mascotaFileReader.escribirObjetos(mascotas);
            
            ControladorLeerArchivo<Consulta> consultaFileReader = new ControladorLeerArchivo<>("consulta.txt");
            consultaFileReader.escribirObjetos(consultas);
            
            /*ControladorLeerArchivo<Curso> cursoFileReader = new ControladorLeerArchivo<>("curso.txt");
            cursoFileReader.escribirObjetos(cursos);  */
            
            ControladorLeerEscribirObjetos<Curso> cursoArchivoObjeto = new ControladorLeerEscribirObjetos<>("curso.obj");
            cursoArchivoObjeto.escribirObjetos(cursos);
            
            ControladorLeerEscribirBinario<Remedio> remedioArchivo = new ControladorLeerEscribirBinario<>("remedio.bin");
            remedioArchivo.escribirObjetos(remedios);
            
            ControladorLeerArchivo<User> usuarioFileReader = new ControladorLeerArchivo<>("login.txt");
            usuarioFileReader.escribirObjetos(usuarios);
            
            aplicacion.guardarEstadisticas();
            
            System.exit(0);
        });
        // Agregar los menús a la barra de menú
        menuBar.add(menuDoctor);
        menuBar.add(menuCliente);
        menuBar.add(menuMascota);
        menuBar.add(menuConsulta);
        menuBar.add(menuCurso);
        menuBar.add(menuRemedio);  
        menuBar.add(menuEstadistica);
        menuBar.add(menuUser);
        menuBar.add(menuSalir);
        // Establecer la barra de menú en el JFrame
        setJMenuBar(menuBar);
        initComponents();  // Configurar el JFrame
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Veterinaria PATITAS");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(getIconImage());
        setIconImages(null);
        setLocation(new java.awt.Point(0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\xacq\\OneDrive\\Documents\\Santiago\\Veterinaria v2\\src\\main\\java\\Img\\logo.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
