/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package liga_pokemon;

import Bd.Conexion;
import java.awt.Menu;
import liga_pokemon.controller.EntrenadorController;
import views.MenuPrincipal;

/**
 *
 * @author Joaqu
 */
public class Liga_pokemon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion cx = new Conexion();
        cx.conectar();
        
        MenuPrincipal m = new MenuPrincipal();
        
        m.setVisible(true);
        
        
        
       
    }
    
    
    
   
    
    
}
