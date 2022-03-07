/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipc1_proyecto1_201708550;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author miilo
 */
public class ModificarUsuario extends JFrame implements ActionListener {

    private JLabel buscar, nombre, apellido, usuario, rol, contraseña, confirmarcontraseña;
    private JTextField BUSCAR, NOMBRE, APELLIDO, USUARIO;
    private JComboBox<String> ROL;
    private JPasswordField CONTRASEÑA, CONFIRMARCONTRASEÑA;
    private JButton modificar, cancelar, Buscar;

    public ModificarUsuario() {
        setLayout(null);
        setTitle("Modificar Usuario");
        Buscar = new JButton("BUSCAR");
        Buscar.setBounds(50, 25, 110, 30);
        add(Buscar);
        BUSCAR = new JTextField("");
        BUSCAR.setBounds(180, 30, 100, 20);
        add(BUSCAR);
        
        nombre = new JLabel("Nombre");
        nombre.setBounds(50, 75, 100, 20);
        add(nombre);
        NOMBRE = new JTextField("");
        NOMBRE.setBounds(180, 75, 100, 20);
        add(NOMBRE);

        apellido = new JLabel("Apellido");
        apellido.setBounds(50, 105, 100, 20);
        add(apellido);
        APELLIDO = new JTextField("");
        APELLIDO.setBounds(180, 105, 100, 20);
        add(APELLIDO);

        usuario = new JLabel("Usuario");
        usuario.setBounds(50, 135, 100, 20);
        add(usuario);
        USUARIO = new JTextField("");
        USUARIO.setBounds(180, 135, 100, 20);
        add(USUARIO);

        rol = new JLabel("Rol");
        rol.setBounds(50, 165, 100, 20);
        add(rol);
        ROL = new JComboBox<String>();
        ROL.setBounds(180, 165, 100, 20);
        add(ROL);
        ROL.addItem("Estudiante");
        ROL.addItem("Catedrático");

        contraseña = new JLabel("Contraseña");
        contraseña.setBounds(50, 195, 100, 20);
        add(contraseña);
        CONTRASEÑA = new JPasswordField("");
        CONTRASEÑA.setBounds(180, 195, 100, 20);
        add(CONTRASEÑA);

        confirmarcontraseña = new JLabel("Conf. Contraseña");
        confirmarcontraseña.setBounds(50, 225, 100, 20);
        add(confirmarcontraseña);
        CONFIRMARCONTRASEÑA = new JPasswordField("");
        CONFIRMARCONTRASEÑA.setBounds(180, 225, 100, 20);
        add(CONFIRMARCONTRASEÑA);

        modificar = new JButton("MODIFICAR");
        modificar.setBounds(20, 300, 100, 30);
        add(modificar);
        modificar.addActionListener(this);

        cancelar = new JButton("CANCELAR");
        cancelar.setBounds(250, 300, 100, 30);
        add(cancelar);
        cancelar.addActionListener(this);
    }

    public void ModificarUsuario() {
        ModificarUsuario botones = new ModificarUsuario();
        botones.setBounds(0, 0, 400, 400);
        botones.setVisible(true);
        botones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        botones.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == modificar) {

        } else if (e.getSource() == cancelar) {
            dispose();
            Admin user = new Admin();
            user.Admin();
        }
    }

}
