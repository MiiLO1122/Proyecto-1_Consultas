
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipc1_proyecto1_201708550;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author miilo
 */
public class CrearUsuario extends JFrame implements ActionListener {

    private JLabel i, nn, ap, us, r, c, cc;
    private JTextField ID, NOMBRE, APELLIDO, USUARIO;
    private JComboBox<String> ROL;
    private JPasswordField CONTRASEÑA, CONFIRMARCONTRASEÑA;
    private JButton crear, cancelar;
    String id;
    String nombre;
    String apellido;
    String usuario;
    String rol;
    String contraseña;

    public CrearUsuario() {
        setLayout(null);
        setTitle("CREAR USUARIO");
        i = new JLabel("ID");
        i.setBounds(50, 20, 100, 20);
        add(i);
        ID = new JTextField("");
        ID.setBounds(180, 20, 100, 20);
        add(ID);
        nn = new JLabel("Nombre");
        nn.setBounds(50, 50, 100, 20);
        add(nn);
        NOMBRE = new JTextField("");
        NOMBRE.setBounds(180, 50, 100, 20);
        add(NOMBRE);

        ap = new JLabel("Apellido");
        ap.setBounds(50, 80, 100, 20);
        add(ap);
        APELLIDO = new JTextField("");
        APELLIDO.setBounds(180, 80, 100, 20);
        add(APELLIDO);

        us = new JLabel("Usuario");
        us.setBounds(50, 110, 100, 20);
        add(us);
        USUARIO = new JTextField("");
        USUARIO.setBounds(180, 110, 100, 20);
        add(USUARIO);

        r = new JLabel("Rol");
        r.setBounds(50, 140, 100, 20);
        add(r);
        ROL = new JComboBox<String>();
        ROL.setBounds(180, 140, 100, 20);
        add(ROL);
        ROL.addItem("Estudiante");
        ROL.addItem("Catedrático");

        c = new JLabel("Contraseña");
        c.setBounds(50, 170, 100, 20);
        add(c);
        CONTRASEÑA = new JPasswordField("");
        CONTRASEÑA.setBounds(180, 170, 100, 20);
        add(CONTRASEÑA);

        cc = new JLabel("Conf. Contraseña");
        cc.setBounds(50, 200, 100, 20);
        add(cc);
        CONFIRMARCONTRASEÑA = new JPasswordField("");
        CONFIRMARCONTRASEÑA.setBounds(180, 200, 100, 20);
        add(CONFIRMARCONTRASEÑA);

        crear = new JButton("CREAR");
        crear.setBounds(20, 300, 100, 30);
        add(crear);
        crear.addActionListener(this);

        cancelar = new JButton("SALIR");
        cancelar.setBounds(250, 300, 100, 30);
        add(cancelar);
        cancelar.addActionListener(this);
    }

    public void CrearUsuario() {
        CrearUsuario botones = new CrearUsuario();
        botones.setBounds(0, 0, 400, 400);
        botones.setVisible(true);
        botones.setResizable(false);
        botones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void crear() {
        Usuarios user = new Usuarios (ID.getText(), NOMBRE.getText(), APELLIDO.getText(), USUARIO.getText(), ROL.getSelectedItem().toString(), CONTRASEÑA.getText());
        recoleccion.guardarUsuario(user);
        Admin back = new Admin();
        back.Admin();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cancelar) {
            dispose();
            Admin user = new Admin();
            user.Admin();
        } else if (e.getSource() == crear) {
            dispose();
            crear();
        }
    }
}
