/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import java.util.ArrayList;

/**
 *
 * @author wende
 */
public class Usuarios {
    private String nombre;
    private int edad;
    private String correo;
    private String user;
    private String pass;
    private ArrayList<clases> clases;

    public Usuarios(String nombre, int edad, String correo, String user, String pass, ArrayList<clases> clases) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.user = user;
        this.pass = pass;
        this.clases = clases;
    }

    
    public Usuarios() {
        clases = new ArrayList();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public ArrayList<clases> getClases() {
        return clases;
    }

    public void setClases(ArrayList<clases> clases) {
        this.clases = clases;
    }
    @Override
    public String toString() {
        return "Usuarios{" + "nombre=" + nombre + ", edad=" + edad + ", correo=" + correo + ", user=" + user + ", pass=" + pass + ", clases=" + clases + '}';
    }

}
