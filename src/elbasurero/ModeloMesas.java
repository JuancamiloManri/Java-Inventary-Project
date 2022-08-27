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
public class ModeloMesas {

    /**
     *
     * @return
     * @throws SQLException
     */
    public ArrayList<Mesa> getMesas() throws SQLException
    {
        Connection con = Conexion.getConexion();
        Statement stmt;
//         Statement stmt1;
        ResultSet rs;
//        ResultSet rs1;
        ArrayList<Mesa> listaMesas = new ArrayList<>();
        
      try {
           
            stmt = con.createStatement();
//            stmt1 = con.createStatement();
           rs = stmt.executeQuery("SELECT * FROM Mesas");
//           rs1= stmt1.executeQuery("SELECT * FROM factura");
                   
           while(rs.next()){
               Mesa mesa = new Mesa();
               mesa.setName(rs.getString("Nombre_mesa"));
               mesa.setId(rs.getInt("Id_Mesas"));

               listaMesas.add(mesa);
           

           
//            while(rs1.next()){
//             Mesa factura =new Mesa();
//             factura.setId_factura(rs1.getInt("Id_Factura"));
//             listaMesas.add(factura);
//           }
           }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloMesas.class.getName()).log(Level.SEVERE, null, ex);
     
       }
     return listaMesas;
    }
}
        
       
