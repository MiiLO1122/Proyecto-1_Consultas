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
public class inexistente extends JFrame implements ActionListener {

    private JTextArea texto;
    private JPanel cuadrito, t1;

    public inexistente() {

        setTitle("ERROR");
        t1 = new JPanel();
        t1.setVisible(true);
        t1.setBounds(160, 70, 300, 50);
        add(t1);
        texto = new JTextArea("El usuario ingresado no existe, por favor contacte" + "\n"
                + "el administrador del sistema para efectuar su registro.");
        texto.setEditable(false);
        texto.setOpaque(false);
        t1.add(texto);

        cuadrito = new JPanel();
        cuadrito.setBounds(10, 20, 130, 130);
        cuadrito.setVisible(true);
        cuadrito.setLayout(null);
        Advertencia advertencia = new Advertencia();
        cuadrito.add(advertencia, BorderLayout.CENTER);
        advertencia.setBounds(30, 30, 120, 120);
        add(cuadrito);
    }

    public void Noexiste() {
        inexistente botones = new inexistente();
        botones.setBounds(100, 100, 532, 250);
        botones.setVisible(true);
        botones.setAlwaysOnTop(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
