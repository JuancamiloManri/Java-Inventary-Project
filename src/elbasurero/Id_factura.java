/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elbasurero;

/**
 *
 * @author jukama999
 */
public class Id_factura {
    
   int id_factu;

    Id_factura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Id_factura{" + "id_factu=" + id_factu + '}';
    }

    public int getId_factu() {
        return id_factu;
    }

    public void setId_factu(int id_factu) {
        this.id_factu = id_factu;
    }

    public Id_factura(int id_factu) {
        this.id_factu = id_factu;
    }
}
