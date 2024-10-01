package Pedidos;

import java.util.ArrayList;

import Productos.Producto;
import Productos.Transaccion;

public class Pedido extends Transaccion{
    private  ArrayList<Producto> productos = new ArrayList<Producto>();
   
   
    
   
    
    public ArrayList<Producto> getProducto() {
        return productos;
    }

   
    
    public float calcularPrecio() {
        return 0;
    }
    
    public void elegirCantidad(  Producto p, int cantidad){
        productos.add(new Producto(p.getNombre(),p.getCodigo(),p.getPrecio(), cantidad, p.getProvedor()));
    }


    public void agregarProductosInventario(ArrayList<Producto> listaProductos) {
        
        for (Producto producto : productos) {
            for (Producto listaProducto : listaProductos) {
                if (listaProducto.getCodigo().equals(producto.getCodigo())) {
                
                listaProducto.setCantidad(listaProducto.getCantidad() + producto.getCantidad());
                break;  
            }
        }
}

 }}
