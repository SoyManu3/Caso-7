/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pedidos;

/**
 *
 * @author USER
 */
public class Provedor {
    private String nombre;
    private String domicilioBancario;

    public Provedor(String nombre, String domicilioBancario) {
        this.nombre = nombre;
        this.domicilioBancario = domicilioBancario;
    }
    
    
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDomicilioBancario() {
        return domicilioBancario;
    }
    public void setDomicilioBancario(String domicilioBancario) {
        this.domicilioBancario = domicilioBancario;
    }
      
}
