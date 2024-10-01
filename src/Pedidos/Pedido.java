package Pedidos;

import java.util.ArrayList;

import Productos.Producto;
import Productos.Transaccion;

public class Pedido extends Transaccion{
    private int cantidad;
    private Producto productos;
   
   
    
   
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return productos;
    }

    public void setProducto(Producto producto) {
        this.productos = producto;
    }


    public void agregarProductos(ArrayList<Producto> listaProductos) {
        boolean encontrado = false;

        for (Producto producto : listaProductos) {
            if (producto.getCodigo().equals(this.productos.getCodigo())) {
                producto.setCantidad(producto.getCantidad() + this.cantidad);
                encontrado = true;
                break;  
            }
        }

         
        if (!encontrado) {
            System.out.println("El producto no se maneja en tienda.");
        }
    }

}
