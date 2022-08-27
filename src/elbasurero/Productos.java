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
public class Productos {
    String productos;
    int cantidad;
    int precio;
    int precio_total;
    int id_inventario;
    int id_factura;

    public Productos(int id_factura) {
        this.id_factura = id_factura;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }
    
     public Productos() {
    }

    public Productos(String productos, int cantidad,int precio,int precio_total,int id_inventario ) {
        this.productos = productos;
        this.cantidad = cantidad;
        this.precio = precio;
        this.precio_total=precio_total;
        this.id_inventario= id_inventario;
       
    }

    
    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public int getPrecio_total() {
        return precio_total;
        
    }
    
    public void setPrecio_total() {
        this.precio_total = (this.precio * this.cantidad);
    }
    
   public int getId_inventario() {
        return id_inventario;
    }

    public void setId_inventario(int id_inventario) {
        this.id_inventario = id_inventario;
    }
    
    @Override
    public String toString() {
        return "Productos{" + "productos=" + productos + ", cantidad=" + cantidad + ", precio=" + precio +", precio_total=" + precio_total +",Id_inventario=" + id_inventario +'}';
    }

    
    

  
    
}
