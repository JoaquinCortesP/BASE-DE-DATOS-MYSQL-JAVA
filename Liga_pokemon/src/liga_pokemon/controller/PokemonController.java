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
import models.Pokemon;

/**
 *
 * @author Joaqu
 */
public class PokemonController {
     HelperController helper = new HelperController();
     Conexion cx;
    
    public PokemonController() {
        cx = new Conexion();
        cx.conectar();
    }
    
    
    
    public List<Pokemon> obtenerPokemones(int id){
        List<Pokemon> pokemones = new ArrayList<>();
        String query = "SELECT * FROM POKEMON WHERE id_entrenador = "+ id + ";";
        
        
        try {
            ResultSet rs = cx.EjecutarQuery(query);
            
            while(rs.next()){
                pokemones.add(new Pokemon(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("especie"),
                        rs.getString("tipo principal"),
                        rs.getString("tipo secundario"),
                        rs.getInt("nivel"),
                        rs.getInt("id_entrenador")
                ));
                        }
            
            
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return pokemones;
    }
    
    
    
    
    
    public void agregarPokemones(String parNombre, String especie, String tipoPrincipal, String tipoSecundario, int nivel, int id_entrenador){
        String sql = "INSERT INTO `pokemon` (nombre,especie,tipo principal,tipo secundario, nivel,id_entrenador) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement st = cx.getConnection().prepareStatement(sql);
            st.setString(1, parNombre);
            st.setString(2, especie);
            st.setString(3, tipoPrincipal);
            st.setString(4, tipoSecundario);
            st.setInt(5, id_entrenador);
            
            st.executeUpdate();
            helper.showInformation("Pokemon agregado.");
        } catch (Exception e) {
            helper.showError(e.getMessage());
        }
    }
    
    
    
    public Pokemon buscarPokemonesPorId(int id){
        Pokemon PokemonEncontrado = null;
        String query = "SELECT * FROM pokemon WHERE id = " + id + ";";
        try {
            ResultSet rs = cx.EjecutarQuery(query);
            if(rs.next()){
                PokemonEncontrado = new Pokemon();
                PokemonEncontrado.setId(rs.getInt("id"));
                PokemonEncontrado.setNombre(rs.getString("nombre"));
                PokemonEncontrado.setEspecie(rs.getString("especie"));
                PokemonEncontrado.setTipoPrincipal(rs.getString("tipo principal"));
                PokemonEncontrado.setTipoSecundario(rs.getString("tipo secundario"));
                PokemonEncontrado.setNivel(rs.getInt("nivel"));
                PokemonEncontrado.setIdEntrenador(rs.getInt("id_entrenador"));
                
            }
        } catch (Exception e) {
            helper.showError(e.getMessage());
        }
        return PokemonEncontrado;
    }
    
    
    public boolean editarPokemon(int id, String nombre, String especie, String tipoPrincipal, String tipoSecundario, int nivel){
        String query = "UPDATE pokemon SET nombre = '" + nombre +
                        "', especie = " + especie + 
                        "', tipo principal = " + tipoPrincipal +
                        "', tipo secundario = " + tipoSecundario +
                         "', nivel = " + nivel +
               
                        " WHERE id = " + id + ";";
        
        System.out.println(query);
        
        try {
            Pokemon PokemonEncontrado = buscarPokemonesPorId(id);
            if(PokemonEncontrado != null){
                Statement st = cx.getConnection().createStatement();
                int filasAfectadas = st.executeUpdate(query);
                helper.showInformation("Pokemon actualizado.");
                return filasAfectadas > 0;
            }else{
                helper.showError("Pokemon no encontrado");
                return false;
            }
        } catch (Exception e) {
            helper.showError(e.getMessage());
        }
        return false;
        
    }
    
    
    public boolean eliminarPokemon(int id){
        String query = "DELETE FROM pokemon WHERE id = " + id + ";";
        try {
            Pokemon PokemonEncontrado = buscarPokemonesPorId(id);
            if(PokemonEncontrado != null){
                Statement st = cx.getConnection().createStatement();
                int filasAfectadas = st.executeUpdate(query);
                helper.showInformation("Pokemon eliminado");
                return filasAfectadas > 0;
            }else{
                helper.showError("Pokemon no eliminado.");
                return false;
            }
        } catch (Exception e) {
            helper.showError(e.getMessage());
        }
        return false;
    }

   
}
