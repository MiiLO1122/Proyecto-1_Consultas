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
public class EliminarUsuario extends JFrame implements ActionListener {

    private JLabel Nombre, Apellido, Usuario, Rol;
    private JTextField buscar, nombre, apellido, usuario, rol;
    private JButton eliminar, cancelar, Buscar;
    private String ID;

    public EliminarUsuario() {
        setLayout(null);
        setTitle("Eliminar Usuario");
        /*buscar*/
        Buscar = new JButton("Buscar");
        Buscar.setBounds(50, 80, 80, 30);
        add(Buscar);
        buscar = new JTextField("");
        buscar.setBounds(180, 85, 150, 20);
        add(buscar);
        /*datos*/
        Nombre = new JLabel("Nombre");
        Nombre.setBounds(50, 130, 80, 30);
        add(Nombre);
        nombre = new JTextField("");
        nombre.setBounds(180, 135, 150, 20);
        nombre.setEditable(false);
        add(nombre);

        Apellido = new JLabel("Apellido");
        Apellido.setBounds(50, 160, 80, 30);
        add(Apellido);
        apellido = new JTextField("");
        apellido.setBounds(180, 165, 150, 20);
        apellido.setEditable(false);
        add(apellido);

        Usuario = new JLabel("Usuario");
        Usuario.setBounds(50, 190, 80, 30);
        add(Usuario);
        usuario = new JTextField("");
        usuario.setBounds(180, 195, 150, 20);
        usuario.setEditable(false);
        add(usuario);

        Rol = new JLabel("Rol");
        Rol.setBounds(50, 220, 80, 30);
        add(Rol);
        rol = new JTextField("");
        rol.setBounds(180, 225, 150, 20);
        rol.setEditable(false);
        add(rol);

        eliminar = new JButton("Eliminar");
        eliminar.setBounds(20, 300, 100, 30);
        add(eliminar);
        eliminar.addActionListener(this);

        cancelar = new JButton("CANCELAR");
        cancelar.setBounds(250, 300, 100, 30);
        add(cancelar);
        cancelar.addActionListener(this);
    }

    public void EliminarUsuario() {
        EliminarUsuario botones = new EliminarUsuario();
        botones.setBounds(0, 0, 400, 500);
        botones.setVisible(true);
        botones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void buscar(String ID) {
        this.ID = ID;
        System.out.println(this.ID);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == cancelar) {
            dispose();
            Admin user = new Admin();
            user.Admin();
        } else if (e.getSource() == buscar) {
            String ID = "";
            recoleccion a = new recoleccion();
            recoleccion.busqueda(buscar.getText());
        }

    }
}
