package Pedidos;

public class NotasEntrega {
    private int notasEntrega;
    private float importeUnidad;
    private float importeTotal;
    private String banco;
    private String cuentaCorriente;
    
    
    public NotasEntrega(int notasEntrega, float importeUnidad, float importeTotal, String banco, String cuentaCorriente) {
        this.notasEntrega = notasEntrega;
        this.importeUnidad = importeUnidad;
        this.importeTotal = importeTotal;
        this.banco = banco;
        this.cuentaCorriente = cuentaCorriente;
    }


    public int getNotasEntrega() {
        return notasEntrega;
    }


    public void setNotasEntrega(int notasEntrega) {
        this.notasEntrega = notasEntrega;
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
