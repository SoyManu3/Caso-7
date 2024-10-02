package Pedidos;

import java.util.ArrayList;

import Productos.Producto;
import Productos.Transaccion;

public class Pedido extends Transaccion{


   
    
    
    
    
    


    public void agregarProductosInventario(ArrayList<Producto> listaProductos) {
        
        for (Producto producto : productosTransaccion) {
            for (Producto listaProducto : listaProductos) {
                if (listaProducto.getCodigo().equals(producto.getCodigo())) {
                
                listaProducto.setCantidad(listaProducto.getCantidad() + producto.getCantidad());
                break;  
            }
        }
}

 }}
