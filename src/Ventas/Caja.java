public class Caja {
    private int IdCaja;
    private int NumCaja;

  

    public int getIdCaja() {
        return IdCaja;
    }

    public void setIdCaja(int IdCaja) {
        this.IdCaja = IdCaja;
    }

    public int getNumCaja() {
        return NumCaja;
    }

    public void setNumCaja(int NumCaja) {
        this.NumCaja = NumCaja;
    }
    public boolean comprobacion(Cajero[] cajPermitidos,String cont){
      
        boolean sali=false;
        for (Cajero cajeros: cajPermitidos) {
            if (cajeros.password.equals(cont)) {
                sali=true;
            }
            
        }
            return sali;
    
    }
}
