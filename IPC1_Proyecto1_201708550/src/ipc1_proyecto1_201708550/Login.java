/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipc1_proyecto1_201708550;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author miilo
 */
class Login extends JFrame implements ActionListener {

    private JTextField user;
    private JPasswordField password;
    private JLabel usuario, contraseña;
    private JButton ingresar, cancelar;
    private JPanel caja;
    int contador;

    public Login() {
        setTitle("LOGIN");
        //imagen login
        caja = new JPanel();
        caja.setBounds(230, 40, 100, 100);
        caja.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        caja.setVisible(true);
        caja.setLayout(null);
        LogoLogin kratos = new LogoLogin();
        caja.add(kratos, BorderLayout.CENTER);
        kratos.setBounds(1, 1, 98, 98);
        add(caja);
        //elementos formulario login
        setLayout(null);
        setTitle("LOGIN");
        /*labels*/
        usuario = new JLabel("Usuario");
        contraseña = new JLabel("Contraseña");
        usuario.setBounds(100, 200, 100, 20);
        contraseña.setBounds(100, 259, 100, 20);
        add(usuario);
        add(contraseña);
        /*fields*/
        user = new JTextField();
        password = new JPasswordField();
        password.setBounds(200, 260, 250, 20);
        user.setBounds(200, 200, 250, 20);
        add(user);
        add(password);
        //botones
        ingresar = new JButton("INGRESO");
        cancelar = new JButton("VOLVER");
        ingresar.setBounds(150, 350, 100, 30);
        cancelar.setBounds(325, 350, 100, 30);
        add(ingresar);
        add(cancelar);

        cancelar.addActionListener(this);
        ingresar.addActionListener(this);
    }

    public void Login() {
        Login sesion = new Login();
        sesion.setBounds(0, 0, 550, 500);
        sesion.setVisible(true);
        sesion.setResizable(false);
        sesion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cancelar) {
            dispose();
            Inicio inicio = new Inicio();
            inicio.Inicio();
        } else if (e.getSource() == ingresar) {
            if (user.getText().equals("1") && password.getText().equals("1")) {
                Admin a = new Admin();
                a.Admin();
                dispose();
            } else {
                recoleccion ir = new recoleccion();
                ir.Check(user.getText(), password.getText());
                dispose();
            }

        }

    }
}
