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




    public float getImporteUnidad() {
        return importeUnidad;
    }


    public void setImporteUnidad(float importeUnidad) {
        this.importeUnidad = importeUnidad;
    }


    public float getImporteTotal() {
        return importeTotal;
    }


    public void setImporteTotal(float importeTotal) {
        this.importeTotal = importeTotal;
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



    

    
}
