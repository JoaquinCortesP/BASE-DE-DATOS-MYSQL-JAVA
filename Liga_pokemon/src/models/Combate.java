/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Date;

/**
 *
 * @author Joaqu
 */
public class Combate {
    private int id_pokemon;
    private Date fecha;
    private String lugar;
    private int id_entrenador1, id_entrenador2, ganadorID;

    public Combate() {
    }

    public Combate(int id_pokemon, Date fecha, String lugar, int id_entrenador1, int id_entrenador2, int ganadorID) {
        this.id_pokemon = id_pokemon;
        this.fecha = fecha;
        this.lugar = lugar;
        this.id_entrenador1 = id_entrenador1;
        this.id_entrenador2 = id_entrenador2;
        this.ganadorID = ganadorID;
    }

    public int getId_pokemon() {
        return id_pokemon;
    }

    public void setId_pokemon(int id_pokemon) {
        this.id_pokemon = id_pokemon;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getId_entrenador1() {
        return id_entrenador1;
    }

    public void setId_entrenador1(int id_entrenador1) {
        this.id_entrenador1 = id_entrenador1;
    }

    public int getId_entrenador2() {
        return id_entrenador2;
    }

    public void setId_entrenador2(int id_entrenador2) {
        this.id_entrenador2 = id_entrenador2;
    }

    public int getGanadorID() {
        return ganadorID;
    }

    public void setGanadorID(int ganadorID) {
        this.ganadorID = ganadorID;
    }

    @Override
    public String toString() {
        return "Combate{" + "id_pokemon=" + id_pokemon + ", fecha=" + fecha + ", lugar=" + lugar + ", id_entrenador1=" + id_entrenador1 + ", id_entrenador2=" + id_entrenador2 + ", ganadorID=" + ganadorID + '}';
    }
    
    
    
}
