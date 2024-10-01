/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Productos;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Transaccion {
      private ArrayList<Producto> listaProductos = new ArrayList<Producto>();

    
     public void añadir(Producto prod){
         listaProductos.add(prod);
     }
     
     public String toString(){
         String lista = "";
         
         for (int i = 0; i < listaProductos.size(); i++) {
             lista = lista + listaProductos.get(i).getNombre() + " -- " + listaProductos.get(i).getPrecio() + " -- " + listaProductos.get(i).getCantidad()  + "\n";
         }
         
         return lista;
     }
     
     public float precioTotal(){
         float precio = 0;
         
         for (int i = 0; i < listaProductos.size(); i++) {
             precio = precio + listaProductos.get(i).getPrecio();
         }
         
         return precio;
     }
}
