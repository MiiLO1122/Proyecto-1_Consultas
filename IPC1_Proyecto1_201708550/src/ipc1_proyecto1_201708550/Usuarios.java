/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipc1_proyecto1_201708550;

/**
 *
 * @author miilo
 */
public class Usuarios {

    public String id, nombre, apellido, usuario, rol, contraseña;
    public static Usuarios[] credenciales = new Usuarios[100];

    public Usuarios(String id, String nombre, String apellido, String usuario, String rol, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.rol = rol;
        this.contraseña = contraseña;
    }

/*getters*/
    public String getid() {
        return id;
    }

    public String getnombre() {
        return nombre;
    }

    public String getapellido() {
        return apellido;
    }

    public String getusuario() {
        return usuario;
    }

    public String getrol() {
        return rol;
    }

    public String getcontraseña() {
        return contraseña;
    }

/*setters*/
    public void setid(String Id) {
        id = Id;
    }

    public void setnombre(String Nombre) {
        nombre = Nombre;
    }

    public void setapellido(String Apellido) {
        apellido = Apellido;
    }

    public void setusuario(String Usuario) {
        usuario = Usuario;

    }

    public void setrold(String Rol) {
        rol = Rol;
    }

    public void setcontraseña(String Contraseña) {
        contraseña = Contraseña;
    }
}
