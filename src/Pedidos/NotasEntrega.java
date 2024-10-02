package Pedidos;

import java.util.ArrayList;

public class NotasEntrega {
    private  ArrayList<Pedido> notasEntrega = new ArrayList<Pedido>();
    private float importeUnidad;
    private float importeTotal;
    private String banco;
    private String cuentaCorriente;
    
    
    public NotasEntrega(int notasEntrega, float importeUnidad, float importeTotal, String banco, String cuentaCorriente) {
        this.importeUnidad = importeUnidad;
        this.importeTotal = importeTotal;
        this.banco = banco;
        this.cuentaCorriente = cuentaCorriente;
    }
    
    public NotasEntrega() {
        this.banco = "Banamex";
        this.cuentaCorriente = "1322123";
    }

     
    public void añadirPedido(Pedido nuevoPedido) {
        this.notasEntrega.add(nuevoPedido);
    }


 

    public String getBanco() {
        return banco;
    }


    public void setBanco(String banco) {
        this.banco = banco;
    }


    public String getCuentaCorriente() {
        return cuentaCorriente;
    }


    public void setCuentaCorriente(String cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Notas de Entrega:\n");

        for (Pedido pedido : notasEntrega) {
            sb.append("Pedido:\n")
              .append(pedido.toString())
              .append("\n");
        }

         
        float totalGeneral = 0;
        for (Pedido pedido : notasEntrega) {
            totalGeneral += pedido.precioTotal();  
        }
        
        sb.append("Banco: ").append(banco).append("\n")
          .append("Cuenta Corriente: ").append(cuentaCorriente).append("\n")
          .append("Importe Total de Todos los Pedidos: ").append(totalGeneral).append("\n");

        return sb.toString();
    }



    

    
}
