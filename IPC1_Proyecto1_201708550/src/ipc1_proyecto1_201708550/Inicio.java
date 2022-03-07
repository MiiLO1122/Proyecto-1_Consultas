/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipc1_proyecto1_201708550;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 *
 * @author miilo
 */
public class Inicio extends JFrame implements ActionListener {

    JPanel caja = new JPanel();
    JPanel texto = new JPanel();
    JButton login, about;
    LogoLogin kratos = new LogoLogin();
    JTextArea txt = new JTextArea("Ser la unidad de informacion especializada y téctina, con" + "\n"
            + "estándares de Biblioteca Universitario, en beneficio del" + "\n"
            + "desarrollo de la ciencia y la tecnologia del país");

    public Inicio() {
        setTitle("BIBLIOTECA");
        setLayout(null);
        caja.setBorder(BorderFactory.createLineBorder(Color.gray));
        caja.setBounds(10, 10, 963, 100);
        caja.setVisible(true);
        login = new JButton("Login");
        /*DENTRO DEL PANEL*/
        caja.setLayout(null);//elimina formato por defecto del panel
        caja.add(login);//agraga el boton al panel
        login.setBounds(800, 33, 100, 30);//posicion y tamaño del boton dentro del panel
        login.addActionListener(this);
        caja.add(kratos, BorderLayout.CENTER);
        kratos.setBounds(5, 5, 90, 90);
        add(caja);
        /*FUERA DEL PANEL*/
        JLabel vision = new JLabel("VISION");
        vision.setVisible(true);
        add(vision);
        vision.setBounds(627, 160, 100, 50);

        //texto
        texto.setBounds(627, 200, 313, 100);
        texto.setVisible(true);
        texto.add(txt);
        txt.setEditable(false);
        txt.setOpaque(false);
        add(texto);
        //logo FIUSAC
        JPanel fiusac = new JPanel();
        fiusac.setVisible(true);
        fiusac.setLayout(null);
        fiusac.setBounds(10, 130, 600, 200);
        LogoFIUSAC logo = new LogoFIUSAC();
        fiusac.add(logo);
        logo.setBounds(0, 0, 600, 200);
        add(fiusac);
        //about
        about = new JButton("ABOUT");
        about.setBounds(50, 400, 100, 30);
        about.addActionListener(this);
        add(about);
    }

    public void Inicio() {
        Inicio inicio = new Inicio();
        inicio.setBounds(0, 0, 1000, 500);
        inicio.setVisible(true);
        inicio.setResizable(false);//quita la opcion de cambiar de tamaño la ventana
        inicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            dispose();
            Login usuario = new Login();
            usuario.Login();
        }
    }

}
