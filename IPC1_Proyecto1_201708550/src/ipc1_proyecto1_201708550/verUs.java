/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipc1_proyecto1_201708550;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author miilo
 */
class verUs extends JFrame implements ActionListener {

    private JLabel a;
    private JButton volver;

    public verUs() {
        setLayout(null);
        a = new JLabel("Listado de usuarios");
        a.setBounds(25, 25, 200, 20);
        add(a);

        String[] head = {"ID", "Nombre", "Apellido", "Usuario", "Rol", "Contraseña"};
        String[][] body = recoleccion.recolectarDatos();
        DefaultTableModel a = new DefaultTableModel(body, head);
        JTable tabla = new JTable(a);
        JScrollPane deslizar = new JScrollPane(tabla);
        deslizar.setBounds(40, 60, 600, 200);
        add(deslizar);

        volver = new JButton("VOLVER");
        volver.setBounds(540, 300, 100, 30);
        volver.addActionListener(this);
        add(volver);
    }

    public void verUs() {
        verUs inicio = new verUs();
        inicio.setBounds(0, 0, 680, 400);
        inicio.setVisible(true);
        inicio.setResizable(false);//quita la opcion de cambiar de tamaño la ventana
        inicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == volver) {
            dispose();
            Admin back = new Admin();
            back.Admin();
        }
    }
}
