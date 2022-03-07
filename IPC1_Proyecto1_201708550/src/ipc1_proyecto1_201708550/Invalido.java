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
public class Invalido extends JFrame implements ActionListener {

    private JLabel error1;
    private JPanel cuadrito;

    public Invalido() {
        setTitle("ERROR");
        error1 = new JLabel("Credenciales inválidas, por favor intente nuevamente");
        error1.setBounds(160, 70, 500, 20);
        add(error1);
        cuadrito = new JPanel();
        cuadrito.setBounds(10, 20, 130, 130);
        cuadrito.setVisible(true);
        cuadrito.setLayout(null);
        Advertencia advertencia = new Advertencia();
        cuadrito.add(advertencia, BorderLayout.CENTER);
        advertencia.setBounds(30, 30, 120, 120);
        add(cuadrito);
    }

    public void incorrecto() {
        Invalido botones = new Invalido();
        botones.setBounds(100, 100, 532, 250);
        botones.setVisible(true);
        botones.setAlwaysOnTop(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
