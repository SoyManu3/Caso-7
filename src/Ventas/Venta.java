package Ventas;

import Productos.Producto;
import Productos.Transaccion;
import java.util.ArrayList;
import java.time.*;
import java.time.format.*;


public class Venta extends Transaccion {

    private float importeRecibido;
    private Empleado cajero;
    private boolean enLinea;

    public Venta(Empleado cajero, boolean enLinea) {
        this.cajero = cajero;
        this.enLinea = enLinea;
    }
    
    

    public float getImporteRecibido() {
        return importeRecibido;
    }

    public void setImporteRecibido(float importeRecibido) {
        this.importeRecibido = importeRecibido;
    }

    public Empleado getCajero() {
        return cajero;
    }

    public void setCajero(Empleado cajero) {
        this.cajero = cajero;
    }

    public ArrayList<Producto> getProductosTransaccion() {
        return productosTransaccion;
    }

    public void setProductosTransaccion(ArrayList<Producto> productosTransaccion) {
        this.productosTransaccion = productosTransaccion;
    }

    public boolean validarCanti() {
        boolean sa = false;
        if (importeRecibido < precioTotal()) {
            sa = true;
        }
        return sa;
    }

    public void DescuentoCantidad(ArrayList<Producto> productos) {
        for (Producto productoEnLista : productos) {
            for (Producto productoTransaccion : productosTransaccion) {
                if (productoTransaccion.getCodigo().equals(productoEnLista.getCodigo())) {
                    productoEnLista.setCantidad(productoEnLista.getCantidad() - productoTransaccion.getCantidad());
                    break;
                }
            }
        }

    }

    public float calcularCambio() {
        return  importeRecibido - precioTotal();
    }


    public String generarTicket() {
        String au = "";
        String ticket="";
        float cambio = calcularCambio();
        LocalDate ahora = LocalDate.now();
        if (enLinea==true) {
        ticket += "============================\n";
        ticket += "       TICKET DE VENTA       \n";
        ticket += "============================\n";
        ticket += "Fecha: " + ahora + "\n";
        ticket += "Caja N°:1 " + "\n";
        ticket += "Cajero: " + cajero.getNombre() + "\n";
        ticket += "----------------------------\n";
        ticket += "Productos:\n";
        ticket += toString() + " \n";
        ticket += "----------------------------\n";
        ticket += "Total: $" + String.format("%.2f", precioTotal()) + "\n";
        ticket += "Importe Recibido: $" + String.format("%.2f", importeRecibido) + "\n";
        ticket += "Cambio Devuelto: $" + String.format("%.2f", cambio) + "\n";
        ticket += "============================\n";
        ticket += "Gracias por su compra.\n";
        ticket += "============================";
        }
        else{
        ticket += "============================\n";
        ticket += "       TICKET DE VENTA       \n";
        ticket += "============================\n";
        ticket += "Fecha: " + ahora + "\n";
        ticket += "Caja N°:1 " + "\n";
        ticket += "Cajero: " + cajero.getNombre() + "\n";
        ticket += "----------------------------\n";
        ticket += "Productos:\n";
        ticket += toString()+ " \n";
        ticket += "----------------------------\n";
        ticket +="numero de cuenta: "+ "1234 5678 9123 4567" +"\n";
        ticket += "Total: $" + String.format("%.2f", precioTotal()) + "\n";
        ticket += "============================\n";
        ticket += "Gracias por su compra.\n";
        ticket += "============================";
        
        }

        return ticket;
    }

}
