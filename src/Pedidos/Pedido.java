package Pedidos;

import java.util.ArrayList;

import Productos.Producto;
import Productos.Transaccion;

public class Pedido extends Transaccion{


   
    
    public float calcularPrecio() {
        return 0;
    }
    
    public void elegirCantidad(  Producto p, int cantidad){
        
          boolean productoEncontrado = false;
    

    for (Producto producto : productosTransaccion) {
        if (producto.getCodigo().equals(p.getCodigo())) {
        
            producto.setCantidad(cantidad);
            productoEncontrado = true;
            break;
        }
    }
    
    
    if (!productoEncontrado) {
        productosTransaccion.add(new Producto(p.getNombre(), p.getCodigo(), p.getPrecio(), cantidad, p.getProvedor()));
        
    } else {
        System.out.println("Cantidad actualizada.");
    }
    }
    
    


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
