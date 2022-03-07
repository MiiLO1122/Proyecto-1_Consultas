/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipc1_proyecto1_201708550;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author miilo
 */
class Admin extends JFrame implements ActionListener {
    
    private JPanel panelLogo, panelUsuario, panelReportes, panelUsuarios, panelBibliografias;
    private JLabel reportes, usuarios, bibligrafias;
    //botones reportes
    private JButton usuario, Bibliografias, prestamos;
    //botones usuarios
    private JButton crearUs, verUs, modificarUs, eliminarUs;
    // botones Bibliografia
    private JButton crearB, verB, modificarB, eliminarB;
    //logout
    private JButton logout;
    
    public Admin() {
        setTitle("PANEL DE ADMINISTRADOR");
        //SECCION LOGO
        setLayout(null);
        panelLogo = new JPanel();
        panelLogo.setVisible(true);
        panelLogo.setLayout(null);
        panelLogo.setBounds(50, 40, 450, 175);
        panelLogo.setBorder(BorderFactory.createLineBorder(Color.gray));
        LogoFIUSAC logo = new LogoFIUSAC();
        panelLogo.add(logo);
        logo.setBounds(1, 1, 450, 175);
        add(panelLogo);
        //SECCION USUARIO
        panelLogo = new JPanel();
        panelLogo.setVisible(true);
        panelLogo.setLayout(null);
        panelLogo.setBounds(580, 40, 450, 90);
        panelLogo.setBorder(BorderFactory.createLineBorder(Color.gray));
        LogoLogin kratos = new LogoLogin();
        panelLogo.add(kratos, BorderLayout.CENTER);
        JPanel caja = new JPanel();
        caja.setBounds(60, 5, 81, 81);
        caja.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        caja.setVisible(true);
        caja.setLayout(null);
        caja.add(kratos, BorderLayout.CENTER);
        kratos.setBounds(1, 1, 78, 78);
        panelLogo.add(caja);
        
        logout = new JButton("LOGOUT");
        logout.setBounds(300, 30, 100, 30);
        logout.addActionListener(this);
        panelLogo.add(logout);
        add(panelLogo);
        //SECCION REPORTES
        panelReportes = new JPanel();
        panelReportes.setVisible(true);
        panelReportes.setLayout(null);
        panelReportes.setBounds(580, 140, 450, 90);
        panelReportes.setBorder(BorderFactory.createLineBorder(Color.gray));
        
        reportes = new JLabel("Reportes");
        panelReportes.add(reportes);
        reportes.setBounds(10, 5, 100, 20);
        
        usuario = new JButton("USUARIOS");
        usuario.setBounds(25, 40, 100, 30);
        usuario.addActionListener(this);
        panelReportes.add(usuario);
        
        Bibliografias = new JButton("BIBLIOGRAFIAS");
        Bibliografias.setBounds(160, 40, 125, 30);
        Bibliografias.addActionListener(this);
        panelReportes.add(Bibliografias);
        
        prestamos = new JButton("PRESTAMOS");
        prestamos.setBounds(315, 40, 110, 30);
        prestamos.addActionListener(this);
        panelReportes.add(prestamos);
        
        add(panelReportes);
        //SECCION USUARIOS
        panelUsuarios = new JPanel();
        panelUsuarios.setVisible(true);
        panelUsuarios.setLayout(null);
        panelUsuarios.setBounds(50, 290, 450, 250);
        panelUsuarios.setBorder(BorderFactory.createLineBorder(Color.gray));
        
        usuarios = new JLabel("Usuarios");
        panelUsuarios.add(usuarios);
        usuarios.setBounds(10, 5, 100, 20);
        
        crearUs = new JButton("CREAR");
        crearUs.setBounds(60, 75, 100, 30);
        crearUs.addActionListener(this);
        panelUsuarios.add(crearUs);
        
        verUs = new JButton("VER");
        verUs.setBounds(290, 75, 100, 30);
        verUs.addActionListener(this);
        panelUsuarios.add(verUs);
        
        modificarUs = new JButton("MODIFICAR");
        modificarUs.setBounds(60, 175, 100, 30);
        modificarUs.addActionListener(this);
        panelUsuarios.add(modificarUs);
        
        eliminarUs = new JButton("ELIMINAR");
        eliminarUs.setBounds(290, 175, 100, 30);
        eliminarUs.addActionListener(this);
        panelUsuarios.add(eliminarUs);
        
        add(panelUsuarios);
        //SECCION BIBLIOGRAFIAS
        panelBibliografias = new JPanel();
        panelBibliografias.setVisible(true);
        panelBibliografias.setLayout(null);
        panelBibliografias.setBounds(580, 290, 450, 250);
        panelBibliografias.setBorder(BorderFactory.createLineBorder(Color.gray));
        
        bibligrafias = new JLabel("Bibliografías");
        panelBibliografias.add(bibligrafias);
        bibligrafias.setBounds(10, 5, 100, 20);
        
        crearB = new JButton("CREAR");
        crearB.setBounds(60, 75, 100, 30);
        crearB.addActionListener(this);
        panelBibliografias.add(crearB);
        
        verB = new JButton("VER");
        verB.setBounds(290, 75, 100, 30);
        verB.addActionListener(this);
        panelBibliografias.add(verB);
        
        modificarB = new JButton("MODIFICAR");
        modificarB.setBounds(60, 175, 100, 30);
        modificarB.addActionListener(this);
        panelBibliografias.add(modificarB);
        
        eliminarB = new JButton("ELIMINAR");
        eliminarB.setBounds(290, 175, 100, 30);
        eliminarB.addActionListener(this);
        panelBibliografias.add(eliminarB);
        
        add(panelBibliografias);
    }
    
    public void Admin() {
        Admin inicio = new Admin();
        inicio.setBounds(0, 0, 1100, 625);
        inicio.setVisible(true);
        inicio.setResizable(false);//quita la opcion de cambiar de tamaño la ventana
        inicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == logout) {
            dispose();
            Login salir = new Login();
            salir.Login();
        } else if (e.getSource() == crearUs) {
            dispose();
            CrearUsuario inicio = new CrearUsuario();
            inicio.CrearUsuario();
        } else if (e.getSource() == modificarUs) {
            dispose();
            ModificarUsuario inicio = new ModificarUsuario();
            inicio.ModificarUsuario();
        } else if (e.getSource() == eliminarUs) {
            dispose();
            EliminarUsuario inicio = new EliminarUsuario();
            inicio.EliminarUsuario();
        } else if (e.getSource() == verUs) {
            dispose();
            verUs ver = new verUs();
            ver.verUs();
        }else if (e.getSource()==crearB) {
            dispose();
            CrearB a = new CrearB();
            a.CrearB();
        }
    }
}
