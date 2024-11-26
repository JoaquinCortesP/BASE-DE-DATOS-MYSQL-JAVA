/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Joaqu
 */
public class Pokemon {
    private int id;
    private String nombre, especie, tipoPrincipal, tipoSecundario;
    private int nivel, idEntrenador;

    public Pokemon() {
    }

    public Pokemon(int id, String nombre, String especie, String tipoPrincipal, String tipoSecundario, int nivel, int idEntrenador) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.tipoPrincipal = tipoPrincipal;
        this.tipoSecundario = tipoSecundario;
        this.nivel = nivel;
        this.idEntrenador = idEntrenador;
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

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getTipoPrincipal() {
        return tipoPrincipal;
    }

    public void setTipoPrincipal(String tipoPrincipal) {
        this.tipoPrincipal = tipoPrincipal;
    }

    public String getTipoSecundario() {
        return tipoSecundario;
    }

    public void setTipoSecundario(String tipoSecundario) {
        this.tipoSecundario = tipoSecundario;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "id=" + id + ", nombre=" + nombre + ", especie=" + especie + ", tipoPrincipal=" + tipoPrincipal + ", tipoSecundario=" + tipoSecundario + ", nivel=" + nivel + ", idEntrenador=" + idEntrenador + '}';
    }
    
    
}
