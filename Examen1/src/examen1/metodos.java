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
public class metodos {

    private String name;
    private ArrayList<String> atributos;
    private String cuerpo;

    public metodos(String name) {
        this.name = name;
        atributos = new ArrayList();
    }

    public metodos(String name, ArrayList<String> atributos, String cuerpo) {
        this.name = name;
        this.atributos = atributos;
        this.cuerpo = cuerpo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getAtributos() {
        return atributos;
    }

    public void setAtributos(ArrayList<String> atributos) {
        this.atributos = atributos;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    @Override
    public String toString() {
        return "metodos{" + "name=" + name + ", atributos=" + atributos + ", cuerpo=" + cuerpo + '}';
    }

}
