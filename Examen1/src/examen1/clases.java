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
public class clases {

    private String name;
    private ArrayList<metodos> metodos;  
    private ArrayList<String> atributos;
    private boolean toString;
    private String cons;
    private String emptycons;

    public clases(String name) {
        this.name = name;
        metodos = new ArrayList();
        atributos = new ArrayList();
    }

    public clases(String name, ArrayList metodos, ArrayList<String> atributos, boolean toString) {
        this.name = name;
        this.metodos = metodos;
        this.atributos = atributos;
        this.toString = toString;
    }

    public clases() {
    
    }

    public String getCons() {
        return cons;
    }

    public void setCons(String cons) {
        this.cons = cons;
    }

    public String getEmptycons() {
        return emptycons;
    }

    public void setEmptycons(String emptycons) {
        this.emptycons = emptycons;
    }

    public String getName() {
        return name;
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<metodos> getMetodos() {
        return metodos;
    }

    public void setMetodos(ArrayList<metodos> metodos) {
        this.metodos = metodos;
    }
    
    

    public ArrayList<String> getAtributos() {
        return atributos;
    }

    public void setAtributos(ArrayList<String> atributos) {
        this.atributos = atributos;
    }

    public boolean isToString() {
        return toString;
    }

    public void setToString(boolean toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return "clases{" + "name=" + name + ", metodos=" + metodos + ", atributos=" + atributos + ", toString=" + toString + '}';
    }

    
    

}
