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
public class CrearB extends JFrame implements ActionListener {

    private JButton cancelar, cargaIndividual, cargaMasiva;

    public CrearB() {
        setLayout(null);
        setTitle("Crear Bibliograía");

        cargaIndividual = new JButton("Carga Individual");
        cargaIndividual.setBounds(39, 50, 125, 30);
        add(cargaIndividual);
        cargaIndividual.addActionListener(this);

        cargaMasiva = new JButton("Carga Masiva");
        cargaMasiva.setBounds(39, 100, 125, 30);
        add(cargaMasiva);
        cargaMasiva.addActionListener(this);

        cancelar = new JButton("Cancelar");
        cancelar.setBounds(39, 150, 125, 30);
        add(cancelar);
        cancelar.addActionListener(this);
    }

    public void CrearB() {
        CrearB inicio = new CrearB();
        inicio.setBounds(0, 0, 220, 300);
        inicio.setVisible(true);
        inicio.setResizable(false);//quita la opcion de cambiar de tamaño la ventana
        inicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cargaIndividual) {
            dispose();
            CargaIndividual bibliografia = new CargaIndividual();
            bibliografia.CargaIndividual();
        } else if (e.getSource() == cancelar) {
            dispose();
            Admin volver = new Admin();
            volver.Admin();
        }
    }
}
