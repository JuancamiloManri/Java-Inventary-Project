/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elbasurero;

import java.sql.Connection;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author jukama999
 */
public class ModeloProductos {

    /**
     *
     * @return
     * @throws SQLException
     */
    public ArrayList<Productos> getProductos() throws SQLException
    {
        Connection con = Conexion.getConexion();
        Statement stmt;
        ResultSet rs;
        ArrayList<Productos> listaProductos = new ArrayList<>();
      
      try {
            stmt = con.createStatement();
           rs = stmt.executeQuery("SELECT * FROM inventario");
          
           
           while(rs.next()){
               Productos producto = new Productos();
               producto.setProductos(rs.getString("Producto"));
               producto.setPrecio(rs.getInt("Precio"));
               producto.setId_inventario(rs.getInt("Id_Inventario"));
               listaProductos.add(producto);
           }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloProductos.class.getName()).log(Level.SEVERE, null, ex);
     
       }
     return listaProductos;
    }
}
        
             
