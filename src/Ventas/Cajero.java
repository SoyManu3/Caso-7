package Ventas;

import java.util.ArrayList;



public class Cajero {

   
    private ArrayList<Empleado> cajeros = new ArrayList<Empleado>();




 
        public ArrayList<Empleado> getCajeros() {
        return cajeros;
          }

    public void setCajeros(ArrayList<Empleado> cajeros) {
        this.cajeros = cajeros;
    }
    
    
    public Empleado busquedaExist(String cont,String nom){
        Empleado em=null;
        for (int i = 0; i < cajeros.size(); i++) {
            if (cajeros.get(i).getPassword().equals(cont)&&cajeros.get(i).getNombre().equals(nom)) {
              em=cajeros.get(i);  
              break;
            }
        }
     return em;
    }



}