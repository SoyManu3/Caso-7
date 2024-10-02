public class Cajero extends Empleados {
    private String nombre;
    private Caja[] cajasAcceso;

    public Cajero(String nombre, Caja[] cajasAcceso) {
        this.nombre = nombre;
        this.cajasAcceso = cajasAcceso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   

    public Caja[] getCajasAcceso() {
        return cajasAcceso;
    }

    public void setCajasAcceso(Caja[] cajasAcceso) {
        this.cajasAcceso = cajasAcceso;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}