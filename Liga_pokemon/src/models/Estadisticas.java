/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Joaqu
 */
public class Estadisticas {
    private int id_pokemones, victorias, derrotas, combatesTotales;

    public Estadisticas() {
    }

    public Estadisticas(int id_pokemones, int victorias, int derrotas, int combatesTotales) {
        this.id_pokemones = id_pokemones;
        this.victorias = victorias;
        this.derrotas = derrotas;
        this.combatesTotales = combatesTotales;
    }

    public int getId_pokemones() {
        return id_pokemones;
    }

    public void setId_pokemones(int id_pokemones) {
        this.id_pokemones = id_pokemones;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getCombatesTotales() {
        return combatesTotales;
    }

    public void setCombatesTotales(int combatesTotales) {
        this.combatesTotales = combatesTotales;
    }

    @Override
    public String toString() {
        return "Estadisticas{" + "id_pokemones=" + id_pokemones + ", victorias=" + victorias + ", derrotas=" + derrotas + ", combatesTotales=" + combatesTotales + '}';
    }
    
    
}
