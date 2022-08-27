/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elbasurero;



import java.util.ArrayList;

public class Mesa {

    @Override
    public String toString() {
        return "Mesa{" + "listProductos=" + listProductos + ", name=" + name + ",id=" + id +  '}';
    }

    public Mesa(ArrayList<Productos> listProductos, String name, int id) {
        this.listProductos = listProductos;
        this.name = name;
        this.id = id;
    }
    
    public Mesa(){
        
    }
 ArrayList<Productos> listProductos;

  

    public ArrayList<Productos> getListProductos() {
        return listProductos;
    }

    public void setListProductos(ArrayList<Productos> listProductos) {
        this.listProductos = listProductos;
    }
 String name;   
 
 int id;

 
 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Mesa(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mesa(String name) {
        this.name = name;
    }
}
