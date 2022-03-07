/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipc1_proyecto1_201708550;

import java.awt.*;
import static java.awt.Font.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author miilo
 */
public class usuarioBasico extends JFrame implements ActionListener {

    private JPanel panelLogo, panelUsuario;
    private JButton logout, buscar, prestamos;
    private JTextField busqueda;
    private JLabel usuario;
    private JTable tabla;

    public usuarioBasico() {
        //USUARIO
        setLayout(null);
        panelLogo = new JPanel();
        panelLogo.setVisible(true);
        panelLogo.setLayout(null);
        panelLogo.setBounds(25, 25, 500, 150);
        panelLogo.setBorder(BorderFactory.createLineBorder(Color.gray));
        LogoFIUSAC logo = new LogoFIUSAC();
        panelLogo.add(logo);
        logo.setBounds(1, 1, 450, 150);
        add(panelLogo);
        //USUARIO
        panelUsuario = new JPanel();
        panelUsuario.setVisible(true);
        panelUsuario.setLayout(null);
        panelUsuario.setBounds(580, 25, 450, 90);
        panelUsuario.setBorder(BorderFactory.createLineBorder(Color.gray));
        LogoLogin kratos = new LogoLogin();
        panelUsuario.add(kratos, BorderLayout.CENTER);
        JPanel caja = new JPanel();
        caja.setBounds(40, 5, 81, 81);
        caja.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        caja.setVisible(true);
        caja.setLayout(null);
        caja.add(kratos, BorderLayout.CENTER);
        kratos.setBounds(1, 1, 78, 78);
        panelUsuario.add(caja);
        usuario = new JLabel("USUARIO");
        usuario.setVisible(true);
        usuario.setBounds(150, 30, 100, 30);
        panelUsuario.add(usuario);
        logout = new JButton("LOGOUT");
        logout.setBounds(300, 30, 100, 30);
        logout.addActionListener(this);
        panelUsuario.add(logout);
        add(panelUsuario);

        //busqueda
        buscar = new JButton("BUSCAR");
        buscar.setBounds(25, 235, 100, 30);
        buscar.addActionListener(this);
        buscar.setVisible(true);
        add(buscar);
        busqueda = new JTextField("");
        busqueda.setBounds(200, 240, 150, 20);
        busqueda.setVisible(true);
        add(busqueda);

        //prestamos
        prestamos = new JButton("Ver Prestamos");
        prestamos.setBounds(877, 235, 150, 30);
        prestamos.addActionListener(this);
        prestamos.setVisible(true);
        add(prestamos);

        //tabla
    }

    public void usuarioBasico() {
        usuarioBasico inicio = new usuarioBasico();
        inicio.setBounds(0, 0, 1100, 550);
        inicio.setVisible(true);
        inicio.setResizable(false);//quita la opcion de cambiar de tamaño la ventana
        inicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == logout) {
            dispose();
            Inicio inicio = new Inicio();
            inicio.Inicio();
        }
    }

}
