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
          protected ArrayList<Producto> productosTransaccion = new ArrayList<Producto>();

    
     public void añadir(Producto prod){
         productosTransaccion.add(prod);
     }
     
     public String toString(){
         String lista = "";
         
         for (int i = 0; i < productosTransaccion.size(); i++) {
             lista = lista + productosTransaccion.get(i).getNombre() + " -- " + productosTransaccion.get(i).getPrecio() + " -- " + productosTransaccion.get(i).getCantidad()  + "\n";
         }
         
         return lista;
     }
     
     public float precioTotal(){
         float precio = 0;
         
         for (int i = 0; i < productosTransaccion.size(); i++) {
             precio = precio + productosTransaccion.get(i).getPrecio();
         }
         
         return precio;
     }
}
