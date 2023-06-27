
package prog.controlador;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import prog.modelo.Animal;
import prog.modelo.Cliente;
import prog.modelo.Consulta;
import prog.modelo.Curso;
import prog.modelo.Doctor;
import prog.modelo.Remedio;
import prog.vista.VistaAnimalJF;
import prog.vista.VistaClienteJF;
import prog.vista.VistaConsultaJF;
import prog.vista.VistaCursoJF;
import prog.vista.VistaDoctorJF;
import prog.vista.VistaRemedioJF;

public class ControladorMenu extends javax.swing.JFrame {

    ArrayList<Doctor> doctores = new ArrayList();
    ArrayList<Animal> mascotas = new ArrayList();
    ArrayList<Curso> cursos = new ArrayList();
    ArrayList<Consulta> consultas = new ArrayList();
    ArrayList<Cliente> clientes = new ArrayList();      
    ArrayList<Remedio> remedios = new ArrayList(); 
        
    public JMenuBar menuBar;
    public JMenu menuDoctor, menuCliente, menuMascota, menuCurso, menuConsulta, menuRemedio, menuLista, menuSalir;
    public JMenuItem listDoctor, itemDoctor, listCliente, itemCliente, listMascota, itemMascota, listCurso, itemCurso, listConsulta, itemConsulta, itemInfo, itemSalir, listRemedio, itemRemedio; 
    
    public ControladorMenu() {
        setTitle("Menú Principal");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        menuBar = new JMenuBar();
        menuDoctor = new JMenu("Doctor");
        itemDoctor = new JMenuItem("Nuevo");
        itemDoctor.addActionListener((ActionEvent e) -> {
            new VistaDoctorJF(doctores).setVisible(true);
        });
        listDoctor = new JMenuItem("Lista");
        listDoctor.addActionListener((ActionEvent e) -> {
            StringBuilder mensaje = new StringBuilder();
            mensaje.append("Lista de Doctores\n");
            for (Doctor elemento : doctores) {
                mensaje.append(elemento.toString()).append("\n");
            }
            JOptionPane.showMessageDialog(null, mensaje.toString(), "Información", JOptionPane.INFORMATION_MESSAGE);
        });
        
        menuCliente = new JMenu("Cliente");
        itemCliente = new JMenuItem("Nuevo");
        itemCliente.addActionListener((ActionEvent e) -> {
            new VistaClienteJF(clientes).setVisible(true);
        });
        listCliente = new JMenuItem("Lista");
        listCliente.addActionListener((ActionEvent e) -> {
            StringBuilder mensaje = new StringBuilder();
            mensaje.append("Lista de Clientes\n");
            for (Cliente elemento : clientes) {
                mensaje.append(elemento.toString()).append("\n");
            }
            JOptionPane.showMessageDialog(null, mensaje.toString(), "Información", JOptionPane.INFORMATION_MESSAGE);
        });
        
        menuMascota = new JMenu("Mascota");
        itemMascota = new JMenuItem("Nuevo");
        itemMascota.addActionListener((ActionEvent e) -> {
            new VistaAnimalJF(mascotas).setVisible(true);
        });
        listMascota = new JMenuItem("Lista");
        listMascota.addActionListener((ActionEvent e) -> {
            /// Crear el mensaje con la información del ArrayList
            StringBuilder mensaje = new StringBuilder();
            mensaje.append("Lista de Mascotas\n");
            for (Animal elemento : mascotas) {
                mensaje.append(elemento.toString()).append("\n");
            }
            // Mostrar la ventana de mensaje con la información del ArrayList
            JOptionPane.showMessageDialog(null, mensaje.toString(), "Información", JOptionPane.INFORMATION_MESSAGE);
        });
        
        menuConsulta = new JMenu("Consulta");
        itemConsulta = new JMenuItem("Nuevo");
        itemConsulta.addActionListener((ActionEvent e) -> {
            new VistaConsultaJF(consultas, doctores, clientes, mascotas).setVisible(true);
        });
        listConsulta = new JMenuItem("Lista");
        listConsulta.addActionListener((ActionEvent e) -> {
            /// Crear el mensaje con la información del ArrayList
            StringBuilder mensaje = new StringBuilder();
            mensaje.append("Lista de Consultas\n");
            for (Consulta elemento : consultas) {
                mensaje.append(elemento.toString()).append("\n");
            }
            // Mostrar la ventana de mensaje con la información del ArrayList
            JOptionPane.showMessageDialog(null, mensaje.toString(), "Información", JOptionPane.INFORMATION_MESSAGE);
        });
        
        menuCurso = new JMenu("Curso");
        itemCurso = new JMenuItem("Nuevo");
        itemCurso.addActionListener((ActionEvent e) -> {
            new VistaCursoJF(cursos, doctores).setVisible(true);
        });
        listCurso = new JMenuItem("Lista");
        listCurso.addActionListener((ActionEvent e) -> {
            /// Crear el mensaje con la información del ArrayList
            StringBuilder mensaje = new StringBuilder();
            mensaje.append("Lista de Cursos\n");
            for (Curso elemento : cursos) {
                mensaje.append(elemento.toString()).append("\n");
            }
            // Mostrar la ventana de mensaje con la información del ArrayList
            JOptionPane.showMessageDialog(null, mensaje.toString(), "Información", JOptionPane.INFORMATION_MESSAGE);
        });
        
        menuRemedio = new JMenu("Remedio");
        itemRemedio = new JMenuItem("Nuevo");
        itemRemedio.addActionListener((ActionEvent e) -> {
            new VistaRemedioJF(remedios).setVisible(true);
        });
        listRemedio = new JMenuItem("Lista");
        listRemedio.addActionListener((ActionEvent e) -> {
            /// Crear el mensaje con la información del ArrayList
            StringBuilder mensaje = new StringBuilder();
            mensaje.append("Lista de Remedios\n");
            for (Remedio elemento : remedios) {
                mensaje.append(elemento.toString()).append("\n");
            }
            // Mostrar la ventana de mensaje con la información del ArrayList
            JOptionPane.showMessageDialog(null, mensaje.toString(), "Información", JOptionPane.INFORMATION_MESSAGE);
        });
        
        menuDoctor.add(itemDoctor);
        menuDoctor.add(listDoctor);
        menuCliente.add(itemCliente);
        menuCliente.add(listCliente);
        menuMascota.add(itemMascota);
        menuMascota.add(listMascota);
        menuConsulta.add(itemConsulta);
        menuConsulta.add(listConsulta);
        menuCurso.add(itemCurso);
        menuCurso.add(listCurso);
        menuRemedio.add(itemRemedio);
        menuRemedio.add(listRemedio);
        // Menú Salir
        menuSalir = new JMenu("Salir");
        itemSalir = new JMenuItem("Salir");
        menuSalir.add(itemSalir);
        itemSalir.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
        // Agregar los menús a la barra de menú
        menuBar.add(menuDoctor);
        menuBar.add(menuCliente);
        menuBar.add(menuMascota);
        menuBar.add(menuConsulta);
        menuBar.add(menuCurso);
        menuBar.add(menuRemedio);        
        menuBar.add(menuSalir);
        // Establecer la barra de menú en el JFrame
        setJMenuBar(menuBar);
        initComponents();  // Configurar el JFrame
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 647, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    
}
