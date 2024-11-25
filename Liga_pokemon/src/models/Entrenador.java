/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Joaqu
 */
public class Entrenador {
    private int id;
    private String nombre, region;
    private int medallas, nivelDeExperiencia;

    public Entrenador() {
    }

    public Entrenador(int id, String nombre, String region, int medallas, int nivelDeExperiencia) {
        this.id = id;
        this.nombre = nombre;
        this.region = region;
        this.medallas = medallas;
        this.nivelDeExperiencia = nivelDeExperiencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getMedallas() {
        return medallas;
    }

    public void setMedallas(int medallas) {
        this.medallas = medallas;
    }

    public int getNivelDeExperiencia() {
        return nivelDeExperiencia;
    }

    public void setNivelDeExperiencia(int nivelDeExperiencia) {
        this.nivelDeExperiencia = nivelDeExperiencia;
    }

    @Override
    public String toString() {
        return "Entrenador{" + "id=" + id + ", nombre=" + nombre + ", region=" + region + ", medallas=" + medallas + ", nivelDeExperiencia=" + nivelDeExperiencia + '}';
    }
    
    
}
