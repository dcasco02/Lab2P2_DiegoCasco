/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_diegocasco;

import java.util.ArrayList;

/**
 *
 * @author dcasc
 */
public class Personas {
    private String nombre;
    private ArrayList <String>Jugadas=new ArrayList();
    private int wins;

    public Personas() {
    }

    public Personas(String nombre, int wins) {
        this.nombre = nombre;
        this.wins = wins;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getJugadas() {
        return Jugadas;
    }

    public void setJugadas(ArrayList<String> Jugadas) {
        this.Jugadas = Jugadas;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", Jugadas=" + Jugadas + ", wins=" + wins + '}';
    }
    
    
    
}
