/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso.pkg7;

import Productos.Producto;
import Pedidos.NotasEntrega;
import Pedidos.Pedido;
import Pedidos.Provedor;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Caso7 {
    
    
    public static String imprimir( ArrayList<Producto> listaProductos){
        String lista = "";
         
         for (int i = 0; i < listaProductos.size(); i++) {
             lista = lista + listaProductos.get(i).getNombre() + " -- " + listaProductos.get(i).getPrecio() + " -- " + listaProductos.get(i).getCantidad()  + "\n";
         }
         
         return lista;
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //provedores
        Provedor provedor1 = new Provedor("Proveedor A", "001");
        Provedor provedor2 = new Provedor("Proveedor B", "002");
        Provedor provedor3 = new Provedor("Proveedor C", "003");
        ArrayList<Producto> inventario = new ArrayList<Producto>();
        //inventario
        inventario.add(new Producto("Producto 1", "P001", 10.99f, 50, provedor1));
        inventario.add(new Producto("Producto 2", "P002", 25.50f, 30, provedor2));
        inventario.add(new Producto("Producto 3", "P003", 15.75f, 20, provedor3));
        inventario.add(new Producto("Producto 4", "P004", 8.99f, 60, provedor1));
        inventario.add(new Producto("Producto 5", "P005", 99.99f, 10, provedor2));
        inventario.add(new Producto("Producto 6", "P006", 49.99f, 15, provedor3));
        inventario.add(new Producto("Producto 7", "P007", 5.50f, 100, provedor1));
        inventario.add(new Producto("Producto 8", "P008", 20.00f, 25, provedor2));
        inventario.add(new Producto("Producto 9", "P009", 30.75f, 40, provedor3));
        inventario.add(new Producto("Producto 10", "P010", 12.99f, 70, provedor1));


        ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
        //menu
        Scanner scanner = new Scanner(System.in);
        int option, prod, cant;

        do {
            System.out.println("===== Menú Principal =====");
            System.out.println("1. Hacer Pedido");
            System.out.println("2. Confirmar Peididos");
            System.out.println("3. ");
            System.out.print("Elige una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    Pedido p = new Pedido();
                    pedidos.add(p);
                    System.out.println(imprimir(inventario));
                    do{
                    
                    System.out.println("Elige el producto");
                    prod = scanner.nextInt();
                    
                      
                    if ((prod > 0 && prod <= inventario.size())) {
                        System.out.println("Elige la cantidad");
                        cant = scanner.nextInt();
                        pedidos.get(pedidos.size() - 1 ).elegirCantidad(inventario.get(prod-1), cant);
                        System.out.println(pedidos.size());
                     }
                    
                     
                    }while(prod > 0 && prod <= inventario.size());
  
                    pedidos.get(pedidos.size() - 1 ).agregarProductosInventario(inventario);  
                    
                    
                    break;
                    
                    
                    
                case 2:
                    System.out.println("\n \n");
                    for (int i = 0; i < pedidos.size(); i++) {
                        System.out.println("---------");
                        System.out.println("Pedido " + (i+1));
                        System.out.println(pedidos.get(i).toString());
                        System.out.println("---------");
                    }
                    
                    
                    break;
                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida, por favor intenta de nuevo.");
            }
        } while (option != 3);

        scanner.close();
       
    }
    
    
    
}
