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
public class CargaIndividual extends JFrame implements ActionListener {

    private JLabel tipo, autor, titulo, edicion, descripcion, temas, frecuencia, ejemplares, copias, disponibles;
    private JTextField Autor, Titulo, Edicion, Descripcion, Temas, Frecuencia, Ejemplares, Copias, Disponibles;
    private JComboBox<String> Tipo;
    private JButton atras, crear;

    public CargaIndividual() {
        setLayout(null);
        setTitle("Carga Individual");
        tipo = new JLabel("Tipo");
        tipo.setBounds(100, 25, 100, 20);
        add(tipo);

        Tipo = new JComboBox<String>();
        Tipo.setBounds(180, 25, 100, 20);
        Tipo.addItem("Libro");
        Tipo.addItem("Revista");
        Tipo.addItem("Tesis");
        add(Tipo);

        autor = new JLabel("Autor");
        autor.setBounds(100, 100, 175, 20);
        add(autor);
        Autor = new JTextField("");
        Autor.setBounds(180, 100, 175, 20);
        add(Autor);

        titulo = new JLabel("Titulo");
        titulo.setBounds(100, 130, 175, 20);
        add(titulo);
        Titulo = new JTextField("");
        Titulo.setBounds(180, 130, 175, 20);
        add(Titulo);

        edicion = new JLabel("Edición");
        edicion.setBounds(100, 160, 175, 20);
        add(edicion);
        Edicion = new JTextField("");
        Edicion.setBounds(180, 160, 175, 20);
        add(Edicion);

        descripcion = new JLabel("Descripcion");
        descripcion.setBounds(100, 190, 175, 20);
        add(descripcion);
        Descripcion = new JTextField("");
        Descripcion.setBounds(180, 190, 175, 20);
        add(Descripcion);

        temas = new JLabel("Temas");
        temas.setBounds(100, 220, 175, 20);
        add(temas);
        Temas = new JTextField("");
        Temas.setBounds(180, 220, 175, 20);
        add(Temas);

        frecuencia = new JLabel("Frecuencia");
        frecuencia.setBounds(420, 100, 175, 20);
        add(frecuencia);
        Frecuencia = new JTextField("");
        Frecuencia.setBounds(510, 100, 175, 20);
        add(Frecuencia);

        ejemplares = new JLabel("Ejemplares");
        ejemplares.setBounds(420, 130, 175, 20);
        add(ejemplares);
        Ejemplares = new JTextField("");
        Ejemplares.setBounds(510, 130, 175, 20);
        add(Ejemplares);

        copias = new JLabel("Copias");
        copias.setBounds(420, 160, 175, 20);
        add(copias);
        Copias = new JTextField("");
        Copias.setBounds(510, 160, 175, 20);
        add(Copias);

        disponibles = new JLabel("Disponibles");
        disponibles.setBounds(420, 190, 175, 20);
        add(disponibles);
        Disponibles = new JTextField("");
        Disponibles.setBounds(510, 190, 175, 20);
        add(Disponibles);

        crear = new JButton("CREAR");
        crear.setBounds(150, 300, 100, 30);
        add(crear);
        crear.addActionListener(this);

        atras = new JButton("CANCELAR");
        atras.setBounds(500, 300, 100, 30);
        add(atras);
        atras.addActionListener(this);

    }

    public void CargaIndividual() {
        CargaIndividual inicio = new CargaIndividual();
        inicio.setBounds(0, 0, 800, 450);
        inicio.setVisible(true);
        inicio.setResizable(false);//quita la opcion de cambiar de tamaño la ventana
        inicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == atras) {
            dispose();
            CrearB volver = new CrearB();
            volver.CrearB();
        }
    }

}
