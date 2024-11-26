/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package liga_pokemon.controller;

import Bd.Conexion;
import java.util.ArrayList;
import java.util.List;
import models.Entrenador;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 *
 * @author Joaqu
 */
public class EntrenadorController {
     HelperController helper = new HelperController();
     Conexion cx;
    
    public EntrenadorController() {
        cx = new Conexion();
        cx.conectar();
    }
    
    
    
    public List<Entrenador> obtenerEntrenadores(int id){
        List<Entrenador> entrenadores = new ArrayList<>();
        //String query = "SELECT * FROM ENTRENADOR";
            String query = "SELECT * FROM ENTRENADOR;";
        
        try {
            ResultSet rs = cx.EjecutarQuery(query);
            
            while(rs.next()){
                entrenadores.add(new Entrenador(
                        rs.getInt("id"),
                        rs.getString("Nombre"),
                        rs.getString("Region"),
                        rs.getInt("MedallasGanadas"),
                        rs.getInt("nivelDeExperiencia")));
                        }
            
            
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return entrenadores;
    }
    
    
    
    
    
    public void agregarEntrenador(String parNombre, String region, int medallas, int nivelDeExperiencia){
        String sql = "INSERT INTO `Entrenador` (nombre,region,medallas,nivelDeExperiencia) VALUES (?,?,?,?)";
        try {
            PreparedStatement st = cx.getConnection().prepareStatement(sql);
            st.setString(1, parNombre);
            st.setString(2, region);
            st.setInt(3, medallas);
            st.setInt(4, nivelDeExperiencia);
            st.executeUpdate();
            helper.showInformation("Entrenador agregado.");
        } catch (Exception e) {
            helper.showError(e.getMessage());
        }
    }
    
    
    
    public Entrenador buscarEntrenadorPorId(int id){
        Entrenador EntrenadorEncontrado = null;
        String query = "SELECT * FROM Entrenador WHERE id = " + id + ";";
        try {
            ResultSet rs = cx.EjecutarQuery(query);
            if(rs.next()){
                EntrenadorEncontrado = new Entrenador();
                EntrenadorEncontrado.setId(rs.getInt("id"));
                EntrenadorEncontrado.setNombre(rs.getString("nombre"));
                EntrenadorEncontrado.setRegion(rs.getString("Region"));
                EntrenadorEncontrado.setMedallas(rs.getInt("medallas"));
                EntrenadorEncontrado.setNivelDeExperiencia(rs.getInt("NivelDeExperiencia"));
                
            }
        } catch (Exception e) {
            helper.showError(e.getMessage());
        }
        return EntrenadorEncontrado;
    }
    
    
    public boolean editarEntrenador(int id, String nombre, String region, int medallas, int nivelDeExperiencia){
        String query = "UPDATE libro SET nombre = '" + nombre +
                        "', region = " + region + 
                        "', medallas = " + medallas +
                        "', NivelDeExperiencia = " + nivelDeExperiencia +
                        " WHERE id = " + id + ";";
        
        System.out.println(query);
        
        try {
            Entrenador EntrenadorEncontrado = buscarEntrenadorPorId(id);
            if(EntrenadorEncontrado != null){
                Statement st = cx.getConnection().createStatement();
                int filasAfectadas = st.executeUpdate(query);
                helper.showInformation("Entrenador actualizado.");
                return filasAfectadas > 0;
            }else{
                helper.showError("Entrenador no encontrado");
                return false;
            }
        } catch (Exception e) {
            helper.showError(e.getMessage());
        }
        return false;
        
    }
    
    
    public boolean eliminarLibro(int id){
        String query = "DELETE FROM libro WHERE id = " + id + ";";
        try {
            Entrenador EntrenadorEncontrado = buscarEntrenadorPorId(id);
            if(EntrenadorEncontrado != null){
                Statement st = cx.getConnection().createStatement();
                int filasAfectadas = st.executeUpdate(query);
                helper.showInformation("Entrenador eliminado");
                return filasAfectadas > 0;
            }else{
                helper.showError("Entrenador no eliminado.");
                return false;
            }
        } catch (Exception e) {
            helper.showError(e.getMessage());
        }
        return false;
    }

   
}
