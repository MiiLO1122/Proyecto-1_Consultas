/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipc1_proyecto1_201708550;

import java.awt.Component;
import javax.swing.*;

/**
 *
 * @author miilo
 */
public class recoleccion {

    public static Usuarios[] credenciales = new Usuarios[100];
    public static int cant = 0;

    public static void guardarUsuario(Usuarios nuevo) {
        for (int i = 0; i < credenciales.length; i++) {
            if (credenciales[i] == null) {
                credenciales[i] = nuevo;
                JOptionPane.showMessageDialog(null, "¡Usuario Creado Exitosamente!");
                cant++;
                break;
            } else {
                JOptionPane.showMessageDialog(null, "¡Creacion de usuario fallida!");
            }
        }
    }

    public static String[][] recolectarDatos() {
        String informacion[][] = new String[cant][6];
        int i = 0;
        for (Usuarios usuario : credenciales) {
            if (usuario != null) {
                String[] filas = {
                    usuario.getid(),
                    usuario.getnombre(),
                    usuario.getapellido(),
                    usuario.getusuario(),
                    usuario.getrol(),
                    usuario.getcontraseña()
                };
                informacion[i] = filas;
                i++;
            }
        }
        return informacion;

    }

    public static Usuarios busqueda(String ID) {
        for (int i = 0; i < credenciales.length; i++) {
            if (credenciales[i].getid().equals(ID)) {
                ID = credenciales[i].getid();
                EliminarUsuario a = new EliminarUsuario();
                a.buscar(ID);
                return credenciales[i];
            }
        }
        return null;

    }

    public static void Check(String usuario, String contraseña) {
        for (int i = 0; i < credenciales.length; i++) {
            if (credenciales[i] != null) {
                if (credenciales[i].getusuario().equals(usuario) && credenciales[i].getcontraseña().equals(contraseña)) {
                    usuarioBasico basic = new usuarioBasico();
                    basic.usuarioBasico();
                } else {
                    JOptionPane.showMessageDialog(null, "Credenciales invalidas");
                }
            }
        }
    }

}
